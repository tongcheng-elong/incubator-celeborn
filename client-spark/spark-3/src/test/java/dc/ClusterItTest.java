package dc;

import org.apache.spark.sql.SparkSession;

public class ClusterItTest {
    public static void main(String[] args) {
        SparkSession sparkSession = SparkSession.builder()
                .appName("test")
                .config("spark.master", "local[1]")
                .config("hive.metastore.uris","thrift://hive-meta-duanhao.hive.svc.datacloudqa.17usoft.com:9083")
                .config("hive.metastore.client.socket.timeout","60s")
//                .config("spark.sql.session.timeZone", "Asia/Shanghai")
//                .config("spark.sql.parquet.int96TimestampConversion","true")
                .config("spark.sql.parquet.writeLegacyFormat","true")
                .config("spark.sql.orderByOrdinal","false")
                .config("spark.sql.optimizer.windowfuncationenable","false")
                .config("spark.files.ignoreMissingFiles","true")
                .config("spark.sql.filesourceTableRelationCacheSize","0")
                .config("spark.hadoopRDD.ignoreEmptySplits","true")
//                .config("spark.sql.legacy.allowCreatingManagedTableUsingNonemptyLocation","true")
                .config("spark.sql.crossJoin.enabled","true")
                .config("spark.serializer", "org.apache.spark.serializer.KryoSerializer")
                .config("hoodie.datasource.query.type","read_optimized")
                .config("spark.sql.hive.convertMetastoreParquet","false")
                .config("spark.files.overwrite","true")
                .config("spark.shuffle.manager","org.apache.spark.shuffle.celeborn.SparkShuffleManager")
                .config("spark.celeborn.master.endpoints","localhost:19097")
//                .config("spark.celeborn.master.endpoints","celeborn-master-test.celeborn.svc.datacloudqa.17usoft.com:9097")
                .config("spark.shuffle.service.enabled","false")
                .config("spark.celeborn.client.spark.shuffle.writer","hash")
                .config("spark.celeborn.client.push.replicate.enabled","false")
                .config("spark.sql.adaptive.enabled","true")
                .config("spark.sql.adaptive.skewJoin.enabled","true")

//                .config("spark.sql.hive.metastorePartitionPruning","false")
                .enableHiveSupport()
                .getOrCreate();

//        sparkSession.sql("show databases").show();
        sparkSession.sql("use test_p2140").show();
//        sparkSession.sql("create table if not exists order").show();
        // 创建订单信息表并写入数据
//        sparkSession.sql("create table if not exists order_info (order_id string, order_status string, order_amount double) partitioned by (dt string) stored as parquet").show();
//        sparkSession.sql("insert into order_info partition(dt='2020-01-01') values ('1001','success',1000.0),('1002','success',2000.0),('1003','success',3000.0)").show();
//        sparkSession.sql("insert into order_info partition(dt='2020-01-02') values ('1004','success',4000.0),('1005','success',5000.0),('1006','success',6000.0)").show();
//        sparkSession.sql("insert into order_info partition(dt='2020-01-03') values ('1007','success',7000.0),('1008','success',8000.0),('1009','success',9000.0)").show();
//        // 创建订单扩展表并写入数据
//        sparkSession.sql("create table if not exists order_detail (order_id string, order_status string, order_amount double) partitioned by (dt string) stored as parquet").show();
//        sparkSession.sql("insert into order_detail partition(dt='2020-01-01') values ('1001','success',1000.0),('1002','success',2000.0),('1003','success',3000.0)").show();
//        sparkSession.sql("insert into order_detail partition(dt='2020-01-02') values ('1004','success',4000.0),('1005','success',5000.0),('1006','success',6000.0)").show();

        sparkSession.sql("select * from order_info left join order_detail on order_info.order_id = order_detail.order_id where order_info.order_id='1001'").show(false);

    }
}

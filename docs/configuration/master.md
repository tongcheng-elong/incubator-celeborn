---
license: |
  Licensed to the Apache Software Foundation (ASF) under one or more
  contributor license agreements.  See the NOTICE file distributed with
  this work for additional information regarding copyright ownership.
  The ASF licenses this file to You under the Apache License, Version 2.0
  (the "License"); you may not use this file except in compliance with
  the License.  You may obtain a copy of the License at

      https://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
---

<!--begin-include-->
| Key | Default | isDynamic | Description | Since | Deprecated |
| --- | ------- | --------- | ----------- | ----- | ---------- |
| celeborn.cluster.name | default | false | Celeborn cluster name. | 0.5.0 |  | 
| celeborn.dynamicConfig.refresh.interval | 120s | false | Interval for refreshing the corresponding dynamic config periodically. | 0.4.0 |  | 
| celeborn.dynamicConfig.store.backend | &lt;undefined&gt; | false | Store backend for dynamic config service. Available options: FS, DB. If not provided, it means that dynamic configuration is disabled. | 0.4.0 |  | 
| celeborn.dynamicConfig.store.db.fetch.pageSize | 1000 | false | The page size for db store to query configurations. | 0.5.0 |  | 
| celeborn.dynamicConfig.store.db.hikari.connectionTimeout | 30s | false | The connection timeout that a client will wait for a connection from the pool for db store backend. | 0.5.0 |  | 
| celeborn.dynamicConfig.store.db.hikari.driverClassName |  | false | The jdbc driver class name of db store backend. | 0.5.0 |  | 
| celeborn.dynamicConfig.store.db.hikari.idleTimeout | 600s | false | The idle timeout that a connection is allowed to sit idle in the pool for db store backend. | 0.5.0 |  | 
| celeborn.dynamicConfig.store.db.hikari.jdbcUrl |  | false | The jdbc url of db store backend. | 0.5.0 |  | 
| celeborn.dynamicConfig.store.db.hikari.maxLifetime | 1800s | false | The maximum lifetime of a connection in the pool for db store backend. | 0.5.0 |  | 
| celeborn.dynamicConfig.store.db.hikari.maximumPoolSize | 2 | false | The maximum pool size of db store backend. | 0.5.0 |  | 
| celeborn.dynamicConfig.store.db.hikari.password |  | false | The password of db store backend. | 0.5.0 |  | 
| celeborn.dynamicConfig.store.db.hikari.username |  | false | The username of db store backend. | 0.5.0 |  | 
| celeborn.dynamicConfig.store.fs.path | &lt;undefined&gt; | false | The path of dynamic config file for fs store backend. The file format should be yaml. The default path is `${CELEBORN_CONF_DIR}/dynamicConfig.yaml`. | 0.5.0 |  | 
| celeborn.internal.port.enabled | false | false | Whether to create a internal port on Masters/Workers for inter-Masters/Workers communication. This is beneficial when SASL authentication is enforced for all interactions between clients and Celeborn Services, but the services can exchange messages without being subject to SASL authentication. | 0.5.0 |  | 
| celeborn.master.estimatedPartitionSize.initialSize | 64mb | false | Initial partition size for estimation, it will change according to runtime stats. | 0.3.0 | celeborn.shuffle.initialEstimatedPartitionSize | 
| celeborn.master.estimatedPartitionSize.update.initialDelay | 5min | false | Initial delay time before start updating partition size for estimation. | 0.3.0 | celeborn.shuffle.estimatedPartitionSize.update.initialDelay | 
| celeborn.master.estimatedPartitionSize.update.interval | 10min | false | Interval of updating partition size for estimation. | 0.3.0 | celeborn.shuffle.estimatedPartitionSize.update.interval | 
| celeborn.master.hdfs.expireDirs.timeout | 1h | false | The timeout for a expire dirs to be deleted on HDFS. | 0.3.0 |  | 
| celeborn.master.heartbeat.application.timeout | 300s | false | Application heartbeat timeout. | 0.3.0 | celeborn.application.heartbeat.timeout | 
| celeborn.master.heartbeat.worker.timeout | 120s | false | Worker heartbeat timeout. | 0.3.0 | celeborn.worker.heartbeat.timeout | 
| celeborn.master.host | &lt;localhost&gt; | false | Hostname for master to bind. | 0.2.0 |  | 
| celeborn.master.http.host | &lt;localhost&gt; | false | Master's http host. | 0.4.0 | celeborn.metrics.master.prometheus.host,celeborn.master.metrics.prometheus.host | 
| celeborn.master.http.port | 9098 | false | Master's http port. | 0.4.0 | celeborn.metrics.master.prometheus.port,celeborn.master.metrics.prometheus.port | 
| celeborn.master.internal.port | 8097 | false | Internal port on the master where both workers and other master nodes connect. | 0.5.0 |  | 
| celeborn.master.port | 9097 | false | Port for master to bind. | 0.2.0 |  | 
| celeborn.master.rackResolver.refresh.interval | 30s | false | Interval for refreshing the node rack information periodically. | 0.5.0 |  | 
| celeborn.master.slot.assign.extraSlots | 2 | false | Extra slots number when master assign slots. | 0.3.0 | celeborn.slots.assign.extraSlots | 
| celeborn.master.slot.assign.loadAware.diskGroupGradient | 0.1 | false | This value means how many more workload will be placed into a faster disk group than a slower group. | 0.3.0 | celeborn.slots.assign.loadAware.diskGroupGradient | 
| celeborn.master.slot.assign.loadAware.fetchTimeWeight | 1.0 | false | Weight of average fetch time when calculating ordering in load-aware assignment strategy | 0.3.0 | celeborn.slots.assign.loadAware.fetchTimeWeight | 
| celeborn.master.slot.assign.loadAware.flushTimeWeight | 0.0 | false | Weight of average flush time when calculating ordering in load-aware assignment strategy | 0.3.0 | celeborn.slots.assign.loadAware.flushTimeWeight | 
| celeborn.master.slot.assign.loadAware.numDiskGroups | 5 | false | This configuration is a guidance for load-aware slot allocation algorithm. This value is control how many disk groups will be created. | 0.3.0 | celeborn.slots.assign.loadAware.numDiskGroups | 
| celeborn.master.slot.assign.maxWorkers | 10000 | false | Max workers that slots of one shuffle can be allocated on. Will choose the smaller positive one from Master side and Client side, see `celeborn.client.slot.assign.maxWorkers`. | 0.3.1 |  | 
| celeborn.master.slot.assign.policy | ROUNDROBIN | false | Policy for master to assign slots, Celeborn supports two types of policy: roundrobin and loadaware. Loadaware policy will be ignored when `HDFS` is enabled in `celeborn.storage.activeTypes` | 0.3.0 | celeborn.slots.assign.policy | 
| celeborn.master.userResourceConsumption.update.interval | 30s | false | Time length for a window about compute user resource consumption. | 0.3.0 |  | 
| celeborn.master.workerUnavailableInfo.expireTimeout | 1800s | false | Worker unavailable info would be cleared when the retention period is expired | 0.3.1 |  | 
| celeborn.quota.enabled | true | false | When Master side sets to true, the master will enable to check the quota via QuotaManager. When Client side sets to true, LifecycleManager will request Master side to check whether the current user has enough quota before registration of shuffle. Fallback to the default shuffle service of Spark when Master side checks that there is no enough quota for current user. | 0.2.0 |  | 
| celeborn.storage.availableTypes | HDD | false | Enabled storages. Available options: MEMORY,HDD,SSD,HDFS. Note: HDD and SSD would be treated as identical. | 0.3.0 | celeborn.storage.activeTypes | 
| celeborn.storage.hdfs.dir | &lt;undefined&gt; | false | HDFS base directory for Celeborn to store shuffle data. | 0.2.0 |  | 
| celeborn.storage.hdfs.kerberos.keytab | &lt;undefined&gt; | false | Kerberos keytab file path for HDFS storage connection. | 0.3.2 |  | 
| celeborn.storage.hdfs.kerberos.principal | &lt;undefined&gt; | false | Kerberos principal for HDFS storage connection. | 0.3.2 |  | 
<!--end-include-->

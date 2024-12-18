/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.apache.celeborn.rest.v1.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * RatisPeerSetPriorityRequest
 */
@JsonPropertyOrder({
  RatisPeerSetPriorityRequest.JSON_PROPERTY_ADDRESS_PRIORITIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class RatisPeerSetPriorityRequest {
  public static final String JSON_PROPERTY_ADDRESS_PRIORITIES = "addressPriorities";
  private Map<String, Integer> addressPriorities = new HashMap<>();

  public RatisPeerSetPriorityRequest() {
  }

  public RatisPeerSetPriorityRequest addressPriorities(Map<String, Integer> addressPriorities) {
    
    this.addressPriorities = addressPriorities;
    return this;
  }

  public RatisPeerSetPriorityRequest putAddressPrioritiesItem(String key, Integer addressPrioritiesItem) {
    if (this.addressPriorities == null) {
      this.addressPriorities = new HashMap<>();
    }
    this.addressPriorities.put(key, addressPrioritiesItem);
    return this;
  }

  /**
   * The peer address and priority of the peer.
   * @return addressPriorities
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS_PRIORITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Integer> getAddressPriorities() {
    return addressPriorities;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_PRIORITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressPriorities(Map<String, Integer> addressPriorities) {
    this.addressPriorities = addressPriorities;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RatisPeerSetPriorityRequest ratisPeerSetPriorityRequest = (RatisPeerSetPriorityRequest) o;
    return Objects.equals(this.addressPriorities, ratisPeerSetPriorityRequest.addressPriorities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressPriorities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RatisPeerSetPriorityRequest {\n");
    sb.append("    addressPriorities: ").append(toIndentedString(addressPriorities)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


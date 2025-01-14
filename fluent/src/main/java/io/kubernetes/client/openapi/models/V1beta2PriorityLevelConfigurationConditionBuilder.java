package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1beta2PriorityLevelConfigurationConditionBuilder extends io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationConditionFluentImpl<io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationConditionBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationCondition,io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationConditionBuilder>{
  public V1beta2PriorityLevelConfigurationConditionBuilder() {
    this(false);
  }
  public V1beta2PriorityLevelConfigurationConditionBuilder(java.lang.Boolean validationEnabled) {
    this(new V1beta2PriorityLevelConfigurationCondition(), validationEnabled);
  }
  public V1beta2PriorityLevelConfigurationConditionBuilder(io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationConditionFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta2PriorityLevelConfigurationConditionBuilder(io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationConditionFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta2PriorityLevelConfigurationCondition(), validationEnabled);
  }
  public V1beta2PriorityLevelConfigurationConditionBuilder(io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationConditionFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationCondition instance) {
    this(fluent, instance, false);
  }
  public V1beta2PriorityLevelConfigurationConditionBuilder(io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationConditionFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationCondition instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withLastTransitionTime(instance.getLastTransitionTime());

    fluent.withMessage(instance.getMessage());

    fluent.withReason(instance.getReason());

    fluent.withStatus(instance.getStatus());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta2PriorityLevelConfigurationConditionBuilder(io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationCondition instance) {
    this(instance,false);
  }
  public V1beta2PriorityLevelConfigurationConditionBuilder(io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationCondition instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withLastTransitionTime(instance.getLastTransitionTime());

    this.withMessage(instance.getMessage());

    this.withReason(instance.getReason());

    this.withStatus(instance.getStatus());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationConditionFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1beta2PriorityLevelConfigurationCondition build() {
    V1beta2PriorityLevelConfigurationCondition buildable = new V1beta2PriorityLevelConfigurationCondition();
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta2PriorityLevelConfigurationConditionBuilder that = (V1beta2PriorityLevelConfigurationConditionBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}
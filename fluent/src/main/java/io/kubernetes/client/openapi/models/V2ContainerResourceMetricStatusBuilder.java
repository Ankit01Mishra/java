package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V2ContainerResourceMetricStatusBuilder extends io.kubernetes.client.openapi.models.V2ContainerResourceMetricStatusFluentImpl<io.kubernetes.client.openapi.models.V2ContainerResourceMetricStatusBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V2ContainerResourceMetricStatus,io.kubernetes.client.openapi.models.V2ContainerResourceMetricStatusBuilder>{
  public V2ContainerResourceMetricStatusBuilder() {
    this(false);
  }
  public V2ContainerResourceMetricStatusBuilder(java.lang.Boolean validationEnabled) {
    this(new V2ContainerResourceMetricStatus(), validationEnabled);
  }
  public V2ContainerResourceMetricStatusBuilder(io.kubernetes.client.openapi.models.V2ContainerResourceMetricStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V2ContainerResourceMetricStatusBuilder(io.kubernetes.client.openapi.models.V2ContainerResourceMetricStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V2ContainerResourceMetricStatus(), validationEnabled);
  }
  public V2ContainerResourceMetricStatusBuilder(io.kubernetes.client.openapi.models.V2ContainerResourceMetricStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V2ContainerResourceMetricStatus instance) {
    this(fluent, instance, false);
  }
  public V2ContainerResourceMetricStatusBuilder(io.kubernetes.client.openapi.models.V2ContainerResourceMetricStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V2ContainerResourceMetricStatus instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withContainer(instance.getContainer());

    fluent.withCurrent(instance.getCurrent());

    fluent.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  public V2ContainerResourceMetricStatusBuilder(io.kubernetes.client.openapi.models.V2ContainerResourceMetricStatus instance) {
    this(instance,false);
  }
  public V2ContainerResourceMetricStatusBuilder(io.kubernetes.client.openapi.models.V2ContainerResourceMetricStatus instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withContainer(instance.getContainer());

    this.withCurrent(instance.getCurrent());

    this.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V2ContainerResourceMetricStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V2ContainerResourceMetricStatus build() {
    V2ContainerResourceMetricStatus buildable = new V2ContainerResourceMetricStatus();
    buildable.setContainer(fluent.getContainer());
    buildable.setCurrent(fluent.getCurrent());
    buildable.setName(fluent.getName());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V2ContainerResourceMetricStatusBuilder that = (V2ContainerResourceMetricStatusBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}
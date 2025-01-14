package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V2HorizontalPodAutoscalerSpecBuilder extends io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerSpecFluentImpl<io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerSpecBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerSpec,io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerSpecBuilder>{
  public V2HorizontalPodAutoscalerSpecBuilder() {
    this(false);
  }
  public V2HorizontalPodAutoscalerSpecBuilder(java.lang.Boolean validationEnabled) {
    this(new V2HorizontalPodAutoscalerSpec(), validationEnabled);
  }
  public V2HorizontalPodAutoscalerSpecBuilder(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V2HorizontalPodAutoscalerSpecBuilder(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerSpecFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V2HorizontalPodAutoscalerSpec(), validationEnabled);
  }
  public V2HorizontalPodAutoscalerSpecBuilder(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerSpec instance) {
    this(fluent, instance, false);
  }
  public V2HorizontalPodAutoscalerSpecBuilder(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerSpec instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withBehavior(instance.getBehavior());

    fluent.withMaxReplicas(instance.getMaxReplicas());

    fluent.withMetrics(instance.getMetrics());

    fluent.withMinReplicas(instance.getMinReplicas());

    fluent.withScaleTargetRef(instance.getScaleTargetRef());

    this.validationEnabled = validationEnabled; 
  }
  public V2HorizontalPodAutoscalerSpecBuilder(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerSpec instance) {
    this(instance,false);
  }
  public V2HorizontalPodAutoscalerSpecBuilder(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerSpec instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withBehavior(instance.getBehavior());

    this.withMaxReplicas(instance.getMaxReplicas());

    this.withMetrics(instance.getMetrics());

    this.withMinReplicas(instance.getMinReplicas());

    this.withScaleTargetRef(instance.getScaleTargetRef());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerSpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerSpec build() {
    V2HorizontalPodAutoscalerSpec buildable = new V2HorizontalPodAutoscalerSpec();
    buildable.setBehavior(fluent.getBehavior());
    buildable.setMaxReplicas(fluent.getMaxReplicas());
    buildable.setMetrics(fluent.getMetrics());
    buildable.setMinReplicas(fluent.getMinReplicas());
    buildable.setScaleTargetRef(fluent.getScaleTargetRef());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V2HorizontalPodAutoscalerSpecBuilder that = (V2HorizontalPodAutoscalerSpecBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BaseObject;
import org.openapitools.model.InheritanceSampleAllOf;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InheritanceSample
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-10T17:14:02.142903+09:00[Asia/Tokyo]")

public class InheritanceSample   {
  @JsonProperty("foo")
  private String foo;

  @JsonProperty("bar")
  private String bar;

  public InheritanceSample foo(String foo) {
    this.foo = foo;
    return this;
  }

  /**
   * Get foo
   * @return foo
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getFoo() {
    return foo;
  }

  public void setFoo(String foo) {
    this.foo = foo;
  }

  public InheritanceSample bar(String bar) {
    this.bar = bar;
    return this;
  }

  /**
   * Get bar
   * @return bar
  */
  @ApiModelProperty(value = "")


  public String getBar() {
    return bar;
  }

  public void setBar(String bar) {
    this.bar = bar;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InheritanceSample inheritanceSample = (InheritanceSample) o;
    return Objects.equals(this.foo, inheritanceSample.foo) &&
        Objects.equals(this.bar, inheritanceSample.bar);
  }

  @Override
  public int hashCode() {
    return Objects.hash(foo, bar);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InheritanceSample {\n");
    
    sb.append("    foo: ").append(toIndentedString(foo)).append("\n");
    sb.append("    bar: ").append(toIndentedString(bar)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


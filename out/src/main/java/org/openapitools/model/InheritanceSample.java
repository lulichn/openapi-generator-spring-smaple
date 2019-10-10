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

public class InheritanceSample extends BaseObject  {
  @JsonProperty("bar")
  private String bar;

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
    return Objects.equals(this.bar, inheritanceSample.bar) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bar, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InheritanceSample {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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


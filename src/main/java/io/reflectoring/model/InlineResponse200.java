package io.reflectoring.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse200
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-09-10T17:37:19.958+02:00[Europe/Berlin]")

public class InlineResponse200   {
  @JsonProperty("count")
  private Integer count = 10;

  @JsonProperty("limit")
  private Integer limit = 10;

  @JsonProperty("offset")
  private UUID offset;

  @JsonProperty("items")
  @Valid
  private List<Item> items = new ArrayList<>();

  public InlineResponse200 count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * minimum: 1
   * maximum: 100
   * @return count
  */
  @ApiModelProperty(example = "10", required = true, value = "")
  @NotNull

@Min(1) @Max(100) 
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public InlineResponse200 limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Get limit
   * minimum: 1
   * maximum: 100
   * @return limit
  */
  @ApiModelProperty(example = "10", required = true, value = "")
  @NotNull

@Min(1) @Max(100) 
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public InlineResponse200 offset(UUID offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Get offset
   * @return offset
  */
  @ApiModelProperty(value = "")

  @Valid

  public UUID getOffset() {
    return offset;
  }

  public void setOffset(UUID offset) {
    this.offset = offset;
  }

  public InlineResponse200 items(List<Item> items) {
    this.items = items;
    return this;
  }

  public InlineResponse200 addItemsItem(Item itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
@Size(max=100) 
  public List<Item> getItems() {
    return items;
  }

  public void setItems(List<Item> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.count, inlineResponse200.count) &&
        Objects.equals(this.limit, inlineResponse200.limit) &&
        Objects.equals(this.offset, inlineResponse200.offset) &&
        Objects.equals(this.items, inlineResponse200.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, limit, offset, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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


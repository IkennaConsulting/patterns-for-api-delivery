package com.museum.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Request payload for updating an existing special event. Only included fields are updated in the event.
 */

@Schema(name = "UpdateSpecialEventRequest", description = "Request payload for updating an existing special event. Only included fields are updated in the event.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-08T19:39:03.127433+01:00[Europe/London]", comments = "Generator version: 7.4.0")
public class UpdateSpecialEventRequest {

  private String name;

  private String location;

  private String eventDescription;

  @Valid
  private List<LocalDate> dates;

  private Float price;

  public UpdateSpecialEventRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the special event.
   * @return name
  */
  
  @Schema(name = "name", example = "Pirate Coding Workshop", description = "Name of the special event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateSpecialEventRequest location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Location where the special event is held.
   * @return location
  */
  
  @Schema(name = "location", example = "Computer Room", description = "Location where the special event is held.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public UpdateSpecialEventRequest eventDescription(String eventDescription) {
    this.eventDescription = eventDescription;
    return this;
  }

  /**
   * Description of the special event.
   * @return eventDescription
  */
  
  @Schema(name = "eventDescription", example = "Captain Blackbeard shares his love of the C...language. And possibly Arrrrr (R lang).", description = "Description of the special event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventDescription")
  public String getEventDescription() {
    return eventDescription;
  }

  public void setEventDescription(String eventDescription) {
    this.eventDescription = eventDescription;
  }

  public UpdateSpecialEventRequest dates(List<LocalDate> dates) {
    this.dates = dates;
    return this;
  }

  public UpdateSpecialEventRequest addDatesItem(LocalDate datesItem) {
    if (this.dates == null) {
      this.dates = new ArrayList<>();
    }
    this.dates.add(datesItem);
    return this;
  }

  /**
   * List of planned dates for the special event.
   * @return dates
  */
  @Valid 
  @Schema(name = "dates", description = "List of planned dates for the special event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dates")
  public List<LocalDate> getDates() {
    return dates;
  }

  public void setDates(List<LocalDate> dates) {
    this.dates = dates;
  }

  public UpdateSpecialEventRequest price(Float price) {
    this.price = price;
    return this;
  }

  /**
   * Price of a ticket for the special event.
   * @return price
  */
  
  @Schema(name = "price", example = "25", description = "Price of a ticket for the special event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("price")
  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSpecialEventRequest updateSpecialEventRequest = (UpdateSpecialEventRequest) o;
    return Objects.equals(this.name, updateSpecialEventRequest.name) &&
        Objects.equals(this.location, updateSpecialEventRequest.location) &&
        Objects.equals(this.eventDescription, updateSpecialEventRequest.eventDescription) &&
        Objects.equals(this.dates, updateSpecialEventRequest.dates) &&
        Objects.equals(this.price, updateSpecialEventRequest.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, location, eventDescription, dates, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSpecialEventRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    eventDescription: ").append(toIndentedString(eventDescription)).append("\n");
    sb.append("    dates: ").append(toIndentedString(dates)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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


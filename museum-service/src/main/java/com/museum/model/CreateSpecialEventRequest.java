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
 * Request payload for creating new special events at the museum.
 */

@Schema(name = "CreateSpecialEventRequest", description = "Request payload for creating new special events at the museum.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-08T19:39:03.127433+01:00[Europe/London]", comments = "Generator version: 7.4.0")
public class CreateSpecialEventRequest {

  private String name;

  private String location;

  private String eventDescription;

  @Valid
  private List<LocalDate> dates = new ArrayList<>();

  private Float price;

  private String info;

  public CreateSpecialEventRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateSpecialEventRequest(String name, String location, String eventDescription, List<LocalDate> dates, Float price, String info) {
    this.name = name;
    this.location = location;
    this.eventDescription = eventDescription;
    this.dates = dates;
    this.price = price;
    this.info = info;
  }

  public CreateSpecialEventRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the special event.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", example = "Pirate Coding Workshop", description = "Name of the special event.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateSpecialEventRequest location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Location where the special event is held.
   * @return location
  */
  @NotNull 
  @Schema(name = "location", example = "Computer Room", description = "Location where the special event is held.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public CreateSpecialEventRequest eventDescription(String eventDescription) {
    this.eventDescription = eventDescription;
    return this;
  }

  /**
   * Description of the special event.
   * @return eventDescription
  */
  @NotNull 
  @Schema(name = "eventDescription", example = "Captain Blackbeard shares his love of the C...language. And possibly Arrrrr (R lang).", description = "Description of the special event.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("eventDescription")
  public String getEventDescription() {
    return eventDescription;
  }

  public void setEventDescription(String eventDescription) {
    this.eventDescription = eventDescription;
  }

  public CreateSpecialEventRequest dates(List<LocalDate> dates) {
    this.dates = dates;
    return this;
  }

  public CreateSpecialEventRequest addDatesItem(LocalDate datesItem) {
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
  @NotNull @Valid 
  @Schema(name = "dates", description = "List of planned dates for the special event.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("dates")
  public List<LocalDate> getDates() {
    return dates;
  }

  public void setDates(List<LocalDate> dates) {
    this.dates = dates;
  }

  public CreateSpecialEventRequest price(Float price) {
    this.price = price;
    return this;
  }

  /**
   * Price of a ticket for the special event.
   * @return price
  */
  @NotNull 
  @Schema(name = "price", example = "25", description = "Price of a ticket for the special event.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("price")
  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  public CreateSpecialEventRequest info(String info) {
    this.info = info;
    return this;
  }

  /**
   * Additional information about the event.
   * @return info
  */
  @NotNull 
  @Schema(name = "info", description = "Additional information about the event.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("info")
  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSpecialEventRequest createSpecialEventRequest = (CreateSpecialEventRequest) o;
    return Objects.equals(this.name, createSpecialEventRequest.name) &&
        Objects.equals(this.location, createSpecialEventRequest.location) &&
        Objects.equals(this.eventDescription, createSpecialEventRequest.eventDescription) &&
        Objects.equals(this.dates, createSpecialEventRequest.dates) &&
        Objects.equals(this.price, createSpecialEventRequest.price) &&
        Objects.equals(this.info, createSpecialEventRequest.info);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, location, eventDescription, dates, price, info);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSpecialEventRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    eventDescription: ").append(toIndentedString(eventDescription)).append("\n");
    sb.append("    dates: ").append(toIndentedString(dates)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
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


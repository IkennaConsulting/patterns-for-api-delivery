package com.museum.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Information about a special event.
 */

@Schema(name = "SpecialEventResponse", description = "Information about a special event.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-08T19:39:03.127433+01:00[Europe/London]", comments = "Generator version: 7.4.0")
public class SpecialEventResponse {

  private UUID eventId;

  private String name;

  private String location;

  private String eventDescription;

  @Valid
  private List<LocalDate> dates = new ArrayList<>();

  private Float price;

  public SpecialEventResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SpecialEventResponse(UUID eventId, String name, String location, String eventDescription, List<LocalDate> dates, Float price) {
    this.eventId = eventId;
    this.name = name;
    this.location = location;
    this.eventDescription = eventDescription;
    this.dates = dates;
    this.price = price;
  }

  public SpecialEventResponse eventId(UUID eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * Identifier for a special event.
   * @return eventId
  */
  @NotNull @Valid 
  @Schema(name = "eventId", example = "3be6453c-03eb-4357-ae5a-984a0e574a54", description = "Identifier for a special event.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("eventId")
  public UUID getEventId() {
    return eventId;
  }

  public void setEventId(UUID eventId) {
    this.eventId = eventId;
  }

  public SpecialEventResponse name(String name) {
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

  public SpecialEventResponse location(String location) {
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

  public SpecialEventResponse eventDescription(String eventDescription) {
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

  public SpecialEventResponse dates(List<LocalDate> dates) {
    this.dates = dates;
    return this;
  }

  public SpecialEventResponse addDatesItem(LocalDate datesItem) {
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

  public SpecialEventResponse price(Float price) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecialEventResponse specialEventResponse = (SpecialEventResponse) o;
    return Objects.equals(this.eventId, specialEventResponse.eventId) &&
        Objects.equals(this.name, specialEventResponse.name) &&
        Objects.equals(this.location, specialEventResponse.location) &&
        Objects.equals(this.eventDescription, specialEventResponse.eventDescription) &&
        Objects.equals(this.dates, specialEventResponse.dates) &&
        Objects.equals(this.price, specialEventResponse.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, name, location, eventDescription, dates, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecialEventResponse {\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
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


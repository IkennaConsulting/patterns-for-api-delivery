package com.museum.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Daily operating hours for the museum.
 */

@Schema(name = "MuseumDailyHours", description = "Daily operating hours for the museum.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-08T19:39:03.127433+01:00[Europe/London]", comments = "Generator version: 7.4.0")
public class MuseumDailyHours {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate date;

  private String timeOpen;

  private String timeClose;

  public MuseumDailyHours() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MuseumDailyHours(LocalDate date, String timeOpen, String timeClose) {
    this.date = date;
    this.timeOpen = timeOpen;
    this.timeClose = timeClose;
  }

  public MuseumDailyHours date(LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  */
  @NotNull @Valid 
  @Schema(name = "date", example = "2023-10-29", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("date")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public MuseumDailyHours timeOpen(String timeOpen) {
    this.timeOpen = timeOpen;
    return this;
  }

  /**
   * Time the museum opens on a specific date. Uses 24 hour time format (`HH:mm`).
   * @return timeOpen
  */
  @NotNull @Pattern(regexp = "^([01]\\d|2[0-3]):?([0-5]\\d)$") 
  @Schema(name = "timeOpen", example = "09:00", description = "Time the museum opens on a specific date. Uses 24 hour time format (`HH:mm`).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("timeOpen")
  public String getTimeOpen() {
    return timeOpen;
  }

  public void setTimeOpen(String timeOpen) {
    this.timeOpen = timeOpen;
  }

  public MuseumDailyHours timeClose(String timeClose) {
    this.timeClose = timeClose;
    return this;
  }

  /**
   * Time the museum closes on a specific date. Uses 24 hour time format (`HH:mm`).
   * @return timeClose
  */
  @NotNull @Pattern(regexp = "^([01]\\d|2[0-3]):?([0-5]\\d)$") 
  @Schema(name = "timeClose", example = "18:00", description = "Time the museum closes on a specific date. Uses 24 hour time format (`HH:mm`).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("timeClose")
  public String getTimeClose() {
    return timeClose;
  }

  public void setTimeClose(String timeClose) {
    this.timeClose = timeClose;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MuseumDailyHours museumDailyHours = (MuseumDailyHours) o;
    return Objects.equals(this.date, museumDailyHours.date) &&
        Objects.equals(this.timeOpen, museumDailyHours.timeOpen) &&
        Objects.equals(this.timeClose, museumDailyHours.timeClose);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, timeOpen, timeClose);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MuseumDailyHours {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    timeOpen: ").append(toIndentedString(timeOpen)).append("\n");
    sb.append("    timeClose: ").append(toIndentedString(timeClose)).append("\n");
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


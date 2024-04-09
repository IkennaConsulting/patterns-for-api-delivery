package com.museum.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.museum.model.TicketType;
import java.time.LocalDate;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Request payload used for purchasing museum tickets.
 */

@Schema(name = "BuyMuseumTicketsRequest", description = "Request payload used for purchasing museum tickets.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-08T19:39:03.127433+01:00[Europe/London]", comments = "Generator version: 7.4.0")
public class BuyMuseumTicketsRequest {

  private TicketType ticketType;

  private UUID eventId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate ticketDate;

  private String email;

  private String phone;

  public BuyMuseumTicketsRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BuyMuseumTicketsRequest(TicketType ticketType, LocalDate ticketDate, String email) {
    this.ticketType = ticketType;
    this.ticketDate = ticketDate;
    this.email = email;
  }

  public BuyMuseumTicketsRequest ticketType(TicketType ticketType) {
    this.ticketType = ticketType;
    return this;
  }

  /**
   * Get ticketType
   * @return ticketType
  */
  @NotNull @Valid 
  @Schema(name = "ticketType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ticketType")
  public TicketType getTicketType() {
    return ticketType;
  }

  public void setTicketType(TicketType ticketType) {
    this.ticketType = ticketType;
  }

  public BuyMuseumTicketsRequest eventId(UUID eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * Identifier for a special event.
   * @return eventId
  */
  @Valid 
  @Schema(name = "eventId", example = "3be6453c-03eb-4357-ae5a-984a0e574a54", description = "Identifier for a special event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventId")
  public UUID getEventId() {
    return eventId;
  }

  public void setEventId(UUID eventId) {
    this.eventId = eventId;
  }

  public BuyMuseumTicketsRequest ticketDate(LocalDate ticketDate) {
    this.ticketDate = ticketDate;
    return this;
  }

  /**
   * Get ticketDate
   * @return ticketDate
  */
  @NotNull @Valid 
  @Schema(name = "ticketDate", example = "2023-10-29", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ticketDate")
  public LocalDate getTicketDate() {
    return ticketDate;
  }

  public void setTicketDate(LocalDate ticketDate) {
    this.ticketDate = ticketDate;
  }

  public BuyMuseumTicketsRequest email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Email address for ticket purchaser.
   * @return email
  */
  @NotNull @javax.validation.constraints.Email 
  @Schema(name = "email", example = "museum-lover@example.com", description = "Email address for ticket purchaser.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public BuyMuseumTicketsRequest phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Phone number for the ticket purchaser (optional).
   * @return phone
  */
  
  @Schema(name = "phone", example = "+1(234)-567-8910", description = "Phone number for the ticket purchaser (optional).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuyMuseumTicketsRequest buyMuseumTicketsRequest = (BuyMuseumTicketsRequest) o;
    return Objects.equals(this.ticketType, buyMuseumTicketsRequest.ticketType) &&
        Objects.equals(this.eventId, buyMuseumTicketsRequest.eventId) &&
        Objects.equals(this.ticketDate, buyMuseumTicketsRequest.ticketDate) &&
        Objects.equals(this.email, buyMuseumTicketsRequest.email) &&
        Objects.equals(this.phone, buyMuseumTicketsRequest.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ticketType, eventId, ticketDate, email, phone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuyMuseumTicketsRequest {\n");
    sb.append("    ticketType: ").append(toIndentedString(ticketType)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    ticketDate: ").append(toIndentedString(ticketDate)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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


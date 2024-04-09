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
 * Details for a museum ticket after a successful purchase.
 */

@Schema(name = "BuyMuseumTicketsResponse", description = "Details for a museum ticket after a successful purchase.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-08T19:39:03.127433+01:00[Europe/London]", comments = "Generator version: 7.4.0")
public class BuyMuseumTicketsResponse {

  private String message;

  private String eventName;

  private UUID ticketId;

  private TicketType ticketType;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate ticketDate;

  private String confirmationCode;

  public BuyMuseumTicketsResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BuyMuseumTicketsResponse(String message, UUID ticketId, TicketType ticketType, LocalDate ticketDate, String confirmationCode) {
    this.message = message;
    this.ticketId = ticketId;
    this.ticketType = ticketType;
    this.ticketDate = ticketDate;
    this.confirmationCode = confirmationCode;
  }

  public BuyMuseumTicketsResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Confirmation message after a ticket purchase.
   * @return message
  */
  @NotNull 
  @Schema(name = "message", example = "Museum general entry ticket purchased", description = "Confirmation message after a ticket purchase.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public BuyMuseumTicketsResponse eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }

  /**
   * Name of the special event.
   * @return eventName
  */
  
  @Schema(name = "eventName", example = "Pirate Coding Workshop", description = "Name of the special event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventName")
  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public BuyMuseumTicketsResponse ticketId(UUID ticketId) {
    this.ticketId = ticketId;
    return this;
  }

  /**
   * Unique identifier for museum ticket. Generated when purchased.
   * @return ticketId
  */
  @NotNull @Valid 
  @Schema(name = "ticketId", example = "a54a57ca-36f8-421b-a6b4-2e8f26858a4c", description = "Unique identifier for museum ticket. Generated when purchased.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ticketId")
  public UUID getTicketId() {
    return ticketId;
  }

  public void setTicketId(UUID ticketId) {
    this.ticketId = ticketId;
  }

  public BuyMuseumTicketsResponse ticketType(TicketType ticketType) {
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

  public BuyMuseumTicketsResponse ticketDate(LocalDate ticketDate) {
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

  public BuyMuseumTicketsResponse confirmationCode(String confirmationCode) {
    this.confirmationCode = confirmationCode;
    return this;
  }

  /**
   * Unique confirmation code used to verify ticket purchase.
   * @return confirmationCode
  */
  @NotNull 
  @Schema(name = "confirmationCode", example = "ticket-event-a98c8f-7eb12", description = "Unique confirmation code used to verify ticket purchase.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("confirmationCode")
  public String getConfirmationCode() {
    return confirmationCode;
  }

  public void setConfirmationCode(String confirmationCode) {
    this.confirmationCode = confirmationCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuyMuseumTicketsResponse buyMuseumTicketsResponse = (BuyMuseumTicketsResponse) o;
    return Objects.equals(this.message, buyMuseumTicketsResponse.message) &&
        Objects.equals(this.eventName, buyMuseumTicketsResponse.eventName) &&
        Objects.equals(this.ticketId, buyMuseumTicketsResponse.ticketId) &&
        Objects.equals(this.ticketType, buyMuseumTicketsResponse.ticketType) &&
        Objects.equals(this.ticketDate, buyMuseumTicketsResponse.ticketDate) &&
        Objects.equals(this.confirmationCode, buyMuseumTicketsResponse.confirmationCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, eventName, ticketId, ticketType, ticketDate, confirmationCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuyMuseumTicketsResponse {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    ticketId: ").append(toIndentedString(ticketId)).append("\n");
    sb.append("    ticketType: ").append(toIndentedString(ticketType)).append("\n");
    sb.append("    ticketDate: ").append(toIndentedString(ticketDate)).append("\n");
    sb.append("    confirmationCode: ").append(toIndentedString(confirmationCode)).append("\n");
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


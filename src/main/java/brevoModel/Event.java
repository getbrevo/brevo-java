/*
 * Brevo API
 * Brevo provide a RESTFul API that can be used with any languages. With this API, you will be able to :   - Manage your campaigns and get the statistics   - Manage your contacts   - Send transactional Emails and SMS   - and much more...  You can download our wrappers at https://github.com/orgs/brevo  **Possible responses**   | Code | Message |   | :-------------: | ------------- |   | 200  | OK. Successful Request  |   | 201  | OK. Successful Creation |   | 202  | OK. Request accepted |   | 204  | OK. Successful Update/Deletion  |   | 400  | Error. Bad Request  |   | 401  | Error. Authentication Needed  |   | 402  | Error. Not enough credit, plan upgrade needed  |   | 403  | Error. Permission denied  |   | 404  | Error. Object does not exist |   | 405  | Error. Method not allowed  |   | 406  | Error. Not Acceptable  |
 *
 * OpenAPI spec version: 3.0.0
 * Contact: contact@brevo.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package brevoModel;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.ObjectUtils;

/**
 * Event
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-17T12:57:43.398+05:30")
public class Event {
  @SerializedName("event_name")
  private String eventName = null;

  @SerializedName("event_date")
  private String eventDate = null;

  @SerializedName("identifiers")
  private EventIdentifiers identifiers = null;

  @SerializedName("contact_properties")
  private Object contactProperties = null;

  @SerializedName("event_properties")
  private Object eventProperties = null;

  public Event eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }

   /**
   * The name of the event that occurred. This is how you will find your event in Brevo. Limited to 255 characters, alphanumerical characters and - _ only.
   * @return eventName
  **/
  @ApiModelProperty(example = "video_played", required = true, value = "The name of the event that occurred. This is how you will find your event in Brevo. Limited to 255 characters, alphanumerical characters and - _ only.")
  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public Event eventDate(String eventDate) {
    this.eventDate = eventDate;
    return this;
  }

   /**
   * Timestamp of when the event occurred (e.g. \&quot;2024-01-24T17:39:57+01:00\&quot;). If no value is passed, the timestamp of the event creation is used.
   * @return eventDate
  **/
  @ApiModelProperty(example = "2024-02-06T20:59:23.383Z", value = "Timestamp of when the event occurred (e.g. \"2024-01-24T17:39:57+01:00\"). If no value is passed, the timestamp of the event creation is used.")
  public String getEventDate() {
    return eventDate;
  }

  public void setEventDate(String eventDate) {
    this.eventDate = eventDate;
  }

  public Event identifiers(EventIdentifiers identifiers) {
    this.identifiers = identifiers;
    return this;
  }

   /**
   * Get identifiers
   * @return identifiers
  **/
  @ApiModelProperty(required = true, value = "")
  public EventIdentifiers getIdentifiers() {
    return identifiers;
  }

  public void setIdentifiers(EventIdentifiers identifiers) {
    this.identifiers = identifiers;
  }

  public Event contactProperties(Object contactProperties) {
    this.contactProperties = contactProperties;
    return this;
  }

   /**
   * Properties defining the state of the contact associated to this event. Useful to update contact attributes defined in your contacts database while passing the event. For example: **\&quot;FIRSTNAME\&quot;: \&quot;Jane\&quot; , \&quot;AGE\&quot;: 37**
   * @return contactProperties
  **/
  @ApiModelProperty(example = "{\"AGE\":32,\"GENDER\":\"FEMALE\"}", value = "Properties defining the state of the contact associated to this event. Useful to update contact attributes defined in your contacts database while passing the event. For example: **\"FIRSTNAME\": \"Jane\" , \"AGE\": 37**")
  public Object getContactProperties() {
    return contactProperties;
  }

  public void setContactProperties(Object contactProperties) {
    this.contactProperties = contactProperties;
  }

  public Event eventProperties(Object eventProperties) {
    this.eventProperties = eventProperties;
    return this;
  }

   /**
   * Properties of the event. Top level properties and nested properties can be used to better segment contacts and personalise workflow conditions. The following field type are supported: string, number, boolean (true/false), date (Timestamp e.g. \&quot;2024-01-24T17:39:57+01:00\&quot;). Keys are limited to 255 characters, alphanumerical characters and - _ only. Size is limited to 50Kb.
   * @return eventProperties
  **/
  @ApiModelProperty(example = "{\"video_title\":\"Brevo — The most approachable CRM suite\",\"vide_description\":\"Create your free account today!\",\"duration\":142,\"autoplayed\":false,\"upload_date\":\"2023-11-24T12:09:10+01:00\"}", value = "Properties of the event. Top level properties and nested properties can be used to better segment contacts and personalise workflow conditions. The following field type are supported: string, number, boolean (true/false), date (Timestamp e.g. \"2024-01-24T17:39:57+01:00\"). Keys are limited to 255 characters, alphanumerical characters and - _ only. Size is limited to 50Kb.")
  public Object getEventProperties() {
    return eventProperties;
  }

  public void setEventProperties(Object eventProperties) {
    this.eventProperties = eventProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    Event event = (Event) o;
    return ObjectUtils.equals(this.eventName, event.eventName) &&
    ObjectUtils.equals(this.eventDate, event.eventDate) &&
    ObjectUtils.equals(this.identifiers, event.identifiers) &&
    ObjectUtils.equals(this.contactProperties, event.contactProperties) &&
    ObjectUtils.equals(this.eventProperties, event.eventProperties);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(eventName, eventDate, identifiers, contactProperties, eventProperties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
    sb.append("    contactProperties: ").append(toIndentedString(contactProperties)).append("\n");
    sb.append("    eventProperties: ").append(toIndentedString(eventProperties)).append("\n");
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


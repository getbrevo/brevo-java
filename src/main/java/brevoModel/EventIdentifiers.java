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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.ObjectUtils;

/**
 * Identifies the contact associated with the event. At least one identifier is required.
 */
@ApiModel(description = "Identifies the contact associated with the event. At least one identifier is required.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-17T12:57:43.398+05:30")
public class EventIdentifiers {
  @SerializedName("email_id")
  private String emailId = null;

  @SerializedName("sms")
  private String sms = null;

  @SerializedName("whatsapp")
  private String whatsapp = null;

  @SerializedName("landline_number")
  private String landlineNumber = null;

  @SerializedName("ext_id")
  private String extId = null;

  public EventIdentifiers emailId(String emailId) {
    this.emailId = emailId;
    return this;
  }

   /**
   * Email Id associated with the event
   * @return emailId
  **/
  @ApiModelProperty(example = "jane.doe@example.com", value = "Email Id associated with the event")
  public String getEmailId() {
    return emailId;
  }

  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }

  public EventIdentifiers sms(String sms) {
    this.sms = sms;
    return this;
  }

   /**
   * SMS associated with the event
   * @return sms
  **/
  @ApiModelProperty(example = "+91xxxxxxxxxx", value = "SMS associated with the event")
  public String getSms() {
    return sms;
  }

  public void setSms(String sms) {
    this.sms = sms;
  }

  public EventIdentifiers whatsapp(String whatsapp) {
    this.whatsapp = whatsapp;
    return this;
  }

   /**
   * whatsapp associated with the event
   * @return whatsapp
  **/
  @ApiModelProperty(example = "+91xxxxxxxxxx", value = "whatsapp associated with the event")
  public String getWhatsapp() {
    return whatsapp;
  }

  public void setWhatsapp(String whatsapp) {
    this.whatsapp = whatsapp;
  }

  public EventIdentifiers landlineNumber(String landlineNumber) {
    this.landlineNumber = landlineNumber;
    return this;
  }

   /**
   * landline_number associated with the event
   * @return landlineNumber
  **/
  @ApiModelProperty(example = "+91xxxxxxxxxx", value = "landline_number associated with the event")
  public String getLandlineNumber() {
    return landlineNumber;
  }

  public void setLandlineNumber(String landlineNumber) {
    this.landlineNumber = landlineNumber;
  }

  public EventIdentifiers extId(String extId) {
    this.extId = extId;
    return this;
  }

   /**
   * ext_id associated with the event
   * @return extId
  **/
  @ApiModelProperty(example = "abc123", value = "ext_id associated with the event")
  public String getExtId() {
    return extId;
  }

  public void setExtId(String extId) {
    this.extId = extId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    EventIdentifiers eventIdentifiers = (EventIdentifiers) o;
    return ObjectUtils.equals(this.emailId, eventIdentifiers.emailId) &&
    ObjectUtils.equals(this.sms, eventIdentifiers.sms) &&
    ObjectUtils.equals(this.whatsapp, eventIdentifiers.whatsapp) &&
    ObjectUtils.equals(this.landlineNumber, eventIdentifiers.landlineNumber) &&
    ObjectUtils.equals(this.extId, eventIdentifiers.extId);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(emailId, sms, whatsapp, landlineNumber, extId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventIdentifiers {\n");
    
    sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
    sb.append("    sms: ").append(toIndentedString(sms)).append("\n");
    sb.append("    whatsapp: ").append(toIndentedString(whatsapp)).append("\n");
    sb.append("    landlineNumber: ").append(toIndentedString(landlineNumber)).append("\n");
    sb.append("    extId: ").append(toIndentedString(extId)).append("\n");
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


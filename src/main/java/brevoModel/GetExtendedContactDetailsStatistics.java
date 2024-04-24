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

import java.util.ArrayList;
import java.util.List;

/**
 * Campaign statistics of the contact
 */
@ApiModel(description = "Campaign statistics of the contact")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-17T12:57:43.398+05:30")
public class GetExtendedContactDetailsStatistics {
  @SerializedName("messagesSent")
  private List<GetExtendedContactDetailsStatisticsMessagesSent> messagesSent = null;

  @SerializedName("hardBounces")
  private List<GetExtendedContactDetailsStatisticsMessagesSent> hardBounces = null;

  @SerializedName("softBounces")
  private List<GetExtendedContactDetailsStatisticsMessagesSent> softBounces = null;

  @SerializedName("complaints")
  private List<GetExtendedContactDetailsStatisticsMessagesSent> complaints = null;

  @SerializedName("unsubscriptions")
  private GetExtendedContactDetailsStatisticsUnsubscriptions unsubscriptions = null;

  @SerializedName("opened")
  private List<GetExtendedContactDetailsStatisticsOpened> opened = null;

  @SerializedName("clicked")
  private List<GetExtendedContactDetailsStatisticsClicked> clicked = null;

  @SerializedName("transacAttributes")
  private List<Object> transacAttributes = null;

  @SerializedName("delivered")
  private List<GetExtendedContactDetailsStatisticsDelivered> delivered = null;

  public GetExtendedContactDetailsStatistics messagesSent(List<GetExtendedContactDetailsStatisticsMessagesSent> messagesSent) {
    this.messagesSent = messagesSent;
    return this;
  }

  public GetExtendedContactDetailsStatistics addMessagesSentItem(GetExtendedContactDetailsStatisticsMessagesSent messagesSentItem) {
    if (this.messagesSent == null) {
      this.messagesSent = new ArrayList<GetExtendedContactDetailsStatisticsMessagesSent>();
    }
    this.messagesSent.add(messagesSentItem);
    return this;
  }

   /**
   * Listing of the sent campaign for the contact
   * @return messagesSent
  **/
  @ApiModelProperty(value = "Listing of the sent campaign for the contact")
  public List<GetExtendedContactDetailsStatisticsMessagesSent> getMessagesSent() {
    return messagesSent;
  }

  public void setMessagesSent(List<GetExtendedContactDetailsStatisticsMessagesSent> messagesSent) {
    this.messagesSent = messagesSent;
  }

  public GetExtendedContactDetailsStatistics hardBounces(List<GetExtendedContactDetailsStatisticsMessagesSent> hardBounces) {
    this.hardBounces = hardBounces;
    return this;
  }

  public GetExtendedContactDetailsStatistics addHardBouncesItem(GetExtendedContactDetailsStatisticsMessagesSent hardBouncesItem) {
    if (this.hardBounces == null) {
      this.hardBounces = new ArrayList<GetExtendedContactDetailsStatisticsMessagesSent>();
    }
    this.hardBounces.add(hardBouncesItem);
    return this;
  }

   /**
   * Listing of the hardbounes generated by the contact
   * @return hardBounces
  **/
  @ApiModelProperty(value = "Listing of the hardbounes generated by the contact")
  public List<GetExtendedContactDetailsStatisticsMessagesSent> getHardBounces() {
    return hardBounces;
  }

  public void setHardBounces(List<GetExtendedContactDetailsStatisticsMessagesSent> hardBounces) {
    this.hardBounces = hardBounces;
  }

  public GetExtendedContactDetailsStatistics softBounces(List<GetExtendedContactDetailsStatisticsMessagesSent> softBounces) {
    this.softBounces = softBounces;
    return this;
  }

  public GetExtendedContactDetailsStatistics addSoftBouncesItem(GetExtendedContactDetailsStatisticsMessagesSent softBouncesItem) {
    if (this.softBounces == null) {
      this.softBounces = new ArrayList<GetExtendedContactDetailsStatisticsMessagesSent>();
    }
    this.softBounces.add(softBouncesItem);
    return this;
  }

   /**
   * Listing of the softbounes generated by the contact
   * @return softBounces
  **/
  @ApiModelProperty(value = "Listing of the softbounes generated by the contact")
  public List<GetExtendedContactDetailsStatisticsMessagesSent> getSoftBounces() {
    return softBounces;
  }

  public void setSoftBounces(List<GetExtendedContactDetailsStatisticsMessagesSent> softBounces) {
    this.softBounces = softBounces;
  }

  public GetExtendedContactDetailsStatistics complaints(List<GetExtendedContactDetailsStatisticsMessagesSent> complaints) {
    this.complaints = complaints;
    return this;
  }

  public GetExtendedContactDetailsStatistics addComplaintsItem(GetExtendedContactDetailsStatisticsMessagesSent complaintsItem) {
    if (this.complaints == null) {
      this.complaints = new ArrayList<GetExtendedContactDetailsStatisticsMessagesSent>();
    }
    this.complaints.add(complaintsItem);
    return this;
  }

   /**
   * Listing of the complaints generated by the contact
   * @return complaints
  **/
  @ApiModelProperty(value = "Listing of the complaints generated by the contact")
  public List<GetExtendedContactDetailsStatisticsMessagesSent> getComplaints() {
    return complaints;
  }

  public void setComplaints(List<GetExtendedContactDetailsStatisticsMessagesSent> complaints) {
    this.complaints = complaints;
  }

  public GetExtendedContactDetailsStatistics unsubscriptions(GetExtendedContactDetailsStatisticsUnsubscriptions unsubscriptions) {
    this.unsubscriptions = unsubscriptions;
    return this;
  }

   /**
   * Get unsubscriptions
   * @return unsubscriptions
  **/
  @ApiModelProperty(value = "")
  public GetExtendedContactDetailsStatisticsUnsubscriptions getUnsubscriptions() {
    return unsubscriptions;
  }

  public void setUnsubscriptions(GetExtendedContactDetailsStatisticsUnsubscriptions unsubscriptions) {
    this.unsubscriptions = unsubscriptions;
  }

  public GetExtendedContactDetailsStatistics opened(List<GetExtendedContactDetailsStatisticsOpened> opened) {
    this.opened = opened;
    return this;
  }

  public GetExtendedContactDetailsStatistics addOpenedItem(GetExtendedContactDetailsStatisticsOpened openedItem) {
    if (this.opened == null) {
      this.opened = new ArrayList<GetExtendedContactDetailsStatisticsOpened>();
    }
    this.opened.add(openedItem);
    return this;
  }

   /**
   * Listing of the openings generated by the contact
   * @return opened
  **/
  @ApiModelProperty(value = "Listing of the openings generated by the contact")
  public List<GetExtendedContactDetailsStatisticsOpened> getOpened() {
    return opened;
  }

  public void setOpened(List<GetExtendedContactDetailsStatisticsOpened> opened) {
    this.opened = opened;
  }

  public GetExtendedContactDetailsStatistics clicked(List<GetExtendedContactDetailsStatisticsClicked> clicked) {
    this.clicked = clicked;
    return this;
  }

  public GetExtendedContactDetailsStatistics addClickedItem(GetExtendedContactDetailsStatisticsClicked clickedItem) {
    if (this.clicked == null) {
      this.clicked = new ArrayList<GetExtendedContactDetailsStatisticsClicked>();
    }
    this.clicked.add(clickedItem);
    return this;
  }

   /**
   * Listing of the clicks generated by the contact
   * @return clicked
  **/
  @ApiModelProperty(value = "Listing of the clicks generated by the contact")
  public List<GetExtendedContactDetailsStatisticsClicked> getClicked() {
    return clicked;
  }

  public void setClicked(List<GetExtendedContactDetailsStatisticsClicked> clicked) {
    this.clicked = clicked;
  }

  public GetExtendedContactDetailsStatistics transacAttributes(List<Object> transacAttributes) {
    this.transacAttributes = transacAttributes;
    return this;
  }

  public GetExtendedContactDetailsStatistics addTransacAttributesItem(Object transacAttributesItem) {
    if (this.transacAttributes == null) {
      this.transacAttributes = new ArrayList<Object>();
    }
    this.transacAttributes.add(transacAttributesItem);
    return this;
  }

   /**
   * Listing of the transactional attributes for the contact
   * @return transacAttributes
  **/
  @ApiModelProperty(value = "Listing of the transactional attributes for the contact")
  public List<Object> getTransacAttributes() {
    return transacAttributes;
  }

  public void setTransacAttributes(List<Object> transacAttributes) {
    this.transacAttributes = transacAttributes;
  }

  public GetExtendedContactDetailsStatistics delivered(List<GetExtendedContactDetailsStatisticsDelivered> delivered) {
    this.delivered = delivered;
    return this;
  }

  public GetExtendedContactDetailsStatistics addDeliveredItem(GetExtendedContactDetailsStatisticsDelivered deliveredItem) {
    if (this.delivered == null) {
      this.delivered = new ArrayList<GetExtendedContactDetailsStatisticsDelivered>();
    }
    this.delivered.add(deliveredItem);
    return this;
  }

   /**
   * Listing of the delivered campaign for the contact
   * @return delivered
  **/
  @ApiModelProperty(value = "Listing of the delivered campaign for the contact")
  public List<GetExtendedContactDetailsStatisticsDelivered> getDelivered() {
    return delivered;
  }

  public void setDelivered(List<GetExtendedContactDetailsStatisticsDelivered> delivered) {
    this.delivered = delivered;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    GetExtendedContactDetailsStatistics getExtendedContactDetailsStatistics = (GetExtendedContactDetailsStatistics) o;
    return ObjectUtils.equals(this.messagesSent, getExtendedContactDetailsStatistics.messagesSent) &&
    ObjectUtils.equals(this.hardBounces, getExtendedContactDetailsStatistics.hardBounces) &&
    ObjectUtils.equals(this.softBounces, getExtendedContactDetailsStatistics.softBounces) &&
    ObjectUtils.equals(this.complaints, getExtendedContactDetailsStatistics.complaints) &&
    ObjectUtils.equals(this.unsubscriptions, getExtendedContactDetailsStatistics.unsubscriptions) &&
    ObjectUtils.equals(this.opened, getExtendedContactDetailsStatistics.opened) &&
    ObjectUtils.equals(this.clicked, getExtendedContactDetailsStatistics.clicked) &&
    ObjectUtils.equals(this.transacAttributes, getExtendedContactDetailsStatistics.transacAttributes) &&
    ObjectUtils.equals(this.delivered, getExtendedContactDetailsStatistics.delivered);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(messagesSent, hardBounces, softBounces, complaints, unsubscriptions, opened, clicked, transacAttributes, delivered);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetExtendedContactDetailsStatistics {\n");
    
    sb.append("    messagesSent: ").append(toIndentedString(messagesSent)).append("\n");
    sb.append("    hardBounces: ").append(toIndentedString(hardBounces)).append("\n");
    sb.append("    softBounces: ").append(toIndentedString(softBounces)).append("\n");
    sb.append("    complaints: ").append(toIndentedString(complaints)).append("\n");
    sb.append("    unsubscriptions: ").append(toIndentedString(unsubscriptions)).append("\n");
    sb.append("    opened: ").append(toIndentedString(opened)).append("\n");
    sb.append("    clicked: ").append(toIndentedString(clicked)).append("\n");
    sb.append("    transacAttributes: ").append(toIndentedString(transacAttributes)).append("\n");
    sb.append("    delivered: ").append(toIndentedString(delivered)).append("\n");
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


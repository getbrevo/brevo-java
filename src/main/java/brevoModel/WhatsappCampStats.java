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
 * WhatsappCampStats
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-17T12:57:43.398+05:30")
public class WhatsappCampStats {
  @SerializedName("sent")
  private Integer sent = null;

  @SerializedName("delivered")
  private Integer delivered = null;

  @SerializedName("read")
  private Integer read = null;

  @SerializedName("unsubscribe")
  private Integer unsubscribe = null;

  @SerializedName("not_sent")
  private Integer notSent = null;

  public WhatsappCampStats sent(Integer sent) {
    this.sent = sent;
    return this;
  }

   /**
   * Get sent
   * @return sent
  **/
  @ApiModelProperty(example = "3", required = true, value = "")
  public Integer getSent() {
    return sent;
  }

  public void setSent(Integer sent) {
    this.sent = sent;
  }

  public WhatsappCampStats delivered(Integer delivered) {
    this.delivered = delivered;
    return this;
  }

   /**
   * Get delivered
   * @return delivered
  **/
  @ApiModelProperty(example = "3", required = true, value = "")
  public Integer getDelivered() {
    return delivered;
  }

  public void setDelivered(Integer delivered) {
    this.delivered = delivered;
  }

  public WhatsappCampStats read(Integer read) {
    this.read = read;
    return this;
  }

   /**
   * Get read
   * @return read
  **/
  @ApiModelProperty(example = "2", required = true, value = "")
  public Integer getRead() {
    return read;
  }

  public void setRead(Integer read) {
    this.read = read;
  }

  public WhatsappCampStats unsubscribe(Integer unsubscribe) {
    this.unsubscribe = unsubscribe;
    return this;
  }

   /**
   * Get unsubscribe
   * @return unsubscribe
  **/
  @ApiModelProperty(example = "0", required = true, value = "")
  public Integer getUnsubscribe() {
    return unsubscribe;
  }

  public void setUnsubscribe(Integer unsubscribe) {
    this.unsubscribe = unsubscribe;
  }

  public WhatsappCampStats notSent(Integer notSent) {
    this.notSent = notSent;
    return this;
  }

   /**
   * Get notSent
   * @return notSent
  **/
  @ApiModelProperty(example = "4", required = true, value = "")
  public Integer getNotSent() {
    return notSent;
  }

  public void setNotSent(Integer notSent) {
    this.notSent = notSent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    WhatsappCampStats whatsappCampStats = (WhatsappCampStats) o;
    return ObjectUtils.equals(this.sent, whatsappCampStats.sent) &&
    ObjectUtils.equals(this.delivered, whatsappCampStats.delivered) &&
    ObjectUtils.equals(this.read, whatsappCampStats.read) &&
    ObjectUtils.equals(this.unsubscribe, whatsappCampStats.unsubscribe) &&
    ObjectUtils.equals(this.notSent, whatsappCampStats.notSent);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(sent, delivered, read, unsubscribe, notSent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsappCampStats {\n");
    
    sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
    sb.append("    delivered: ").append(toIndentedString(delivered)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
    sb.append("    unsubscribe: ").append(toIndentedString(unsubscribe)).append("\n");
    sb.append("    notSent: ").append(toIndentedString(notSent)).append("\n");
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


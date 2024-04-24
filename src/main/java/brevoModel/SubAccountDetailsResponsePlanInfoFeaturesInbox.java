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
 * Inbox details / Not available on ENTv2
 */
@ApiModel(description = "Inbox details / Not available on ENTv2")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-17T12:57:43.398+05:30")
public class SubAccountDetailsResponsePlanInfoFeaturesInbox {
  @SerializedName("quantity")
  private Long quantity = null;

  @SerializedName("remaining")
  private Long remaining = null;

  public SubAccountDetailsResponsePlanInfoFeaturesInbox quantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Quantity of inbox provided
   * @return quantity
  **/
  @ApiModelProperty(value = "Quantity of inbox provided")
  public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  public SubAccountDetailsResponsePlanInfoFeaturesInbox remaining(Long remaining) {
    this.remaining = remaining;
    return this;
  }

   /**
   * Available inboxes for use
   * @return remaining
  **/
  @ApiModelProperty(value = "Available inboxes for use")
  public Long getRemaining() {
    return remaining;
  }

  public void setRemaining(Long remaining) {
    this.remaining = remaining;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    SubAccountDetailsResponsePlanInfoFeaturesInbox subAccountDetailsResponsePlanInfoFeaturesInbox = (SubAccountDetailsResponsePlanInfoFeaturesInbox) o;
    return ObjectUtils.equals(this.quantity, subAccountDetailsResponsePlanInfoFeaturesInbox.quantity) &&
    ObjectUtils.equals(this.remaining, subAccountDetailsResponsePlanInfoFeaturesInbox.remaining);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(quantity, remaining);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubAccountDetailsResponsePlanInfoFeaturesInbox {\n");
    
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    remaining: ").append(toIndentedString(remaining)).append("\n");
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


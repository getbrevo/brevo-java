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
import org.threeten.bp.LocalDate;

/**
 * GetContactCampaignStatsTransacAttributes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-17T12:57:43.398+05:30")
public class GetContactCampaignStatsTransacAttributes {
  @SerializedName("orderDate")
  private LocalDate orderDate = null;

  @SerializedName("orderPrice")
  private Float orderPrice = null;

  @SerializedName("orderId")
  private Long orderId = null;

  public GetContactCampaignStatsTransacAttributes orderDate(LocalDate orderDate) {
    this.orderDate = orderDate;
    return this;
  }

   /**
   * Date of the order
   * @return orderDate
  **/
  @ApiModelProperty(example = "2017-03-12", required = true, value = "Date of the order")
  public LocalDate getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(LocalDate orderDate) {
    this.orderDate = orderDate;
  }

  public GetContactCampaignStatsTransacAttributes orderPrice(Float orderPrice) {
    this.orderPrice = orderPrice;
    return this;
  }

   /**
   * Price of the order
   * @return orderPrice
  **/
  @ApiModelProperty(example = "24.99", required = true, value = "Price of the order")
  public Float getOrderPrice() {
    return orderPrice;
  }

  public void setOrderPrice(Float orderPrice) {
    this.orderPrice = orderPrice;
  }

  public GetContactCampaignStatsTransacAttributes orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * ID of the order
   * @return orderId
  **/
  @ApiModelProperty(example = "248", required = true, value = "ID of the order")
  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    GetContactCampaignStatsTransacAttributes getContactCampaignStatsTransacAttributes = (GetContactCampaignStatsTransacAttributes) o;
    return ObjectUtils.equals(this.orderDate, getContactCampaignStatsTransacAttributes.orderDate) &&
    ObjectUtils.equals(this.orderPrice, getContactCampaignStatsTransacAttributes.orderPrice) &&
    ObjectUtils.equals(this.orderId, getContactCampaignStatsTransacAttributes.orderId);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(orderDate, orderPrice, orderId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetContactCampaignStatsTransacAttributes {\n");
    
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
    sb.append("    orderPrice: ").append(toIndentedString(orderPrice)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
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


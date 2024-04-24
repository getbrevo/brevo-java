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
 * Billing address of master account
 */
@ApiModel(description = "Billing address of master account")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-17T12:57:43.398+05:30")
public class MasterDetailsResponseBillingInfoAddress {
  @SerializedName("streetAddress")
  private String streetAddress = null;

  @SerializedName("locality")
  private String locality = null;

  @SerializedName("postalCode")
  private String postalCode = null;

  @SerializedName("stateCode")
  private String stateCode = null;

  @SerializedName("countryCode")
  private String countryCode = null;

  public MasterDetailsResponseBillingInfoAddress streetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

   /**
   * Street address
   * @return streetAddress
  **/
  @ApiModelProperty(value = "Street address")
  public String getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }

  public MasterDetailsResponseBillingInfoAddress locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * Locality
   * @return locality
  **/
  @ApiModelProperty(value = "Locality")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public MasterDetailsResponseBillingInfoAddress postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal code
   * @return postalCode
  **/
  @ApiModelProperty(value = "Postal code")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public MasterDetailsResponseBillingInfoAddress stateCode(String stateCode) {
    this.stateCode = stateCode;
    return this;
  }

   /**
   * State code
   * @return stateCode
  **/
  @ApiModelProperty(value = "State code")
  public String getStateCode() {
    return stateCode;
  }

  public void setStateCode(String stateCode) {
    this.stateCode = stateCode;
  }

  public MasterDetailsResponseBillingInfoAddress countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Country code
   * @return countryCode
  **/
  @ApiModelProperty(value = "Country code")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    MasterDetailsResponseBillingInfoAddress masterDetailsResponseBillingInfoAddress = (MasterDetailsResponseBillingInfoAddress) o;
    return ObjectUtils.equals(this.streetAddress, masterDetailsResponseBillingInfoAddress.streetAddress) &&
    ObjectUtils.equals(this.locality, masterDetailsResponseBillingInfoAddress.locality) &&
    ObjectUtils.equals(this.postalCode, masterDetailsResponseBillingInfoAddress.postalCode) &&
    ObjectUtils.equals(this.stateCode, masterDetailsResponseBillingInfoAddress.stateCode) &&
    ObjectUtils.equals(this.countryCode, masterDetailsResponseBillingInfoAddress.countryCode);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(streetAddress, locality, postalCode, stateCode, countryCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MasterDetailsResponseBillingInfoAddress {\n");
    
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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


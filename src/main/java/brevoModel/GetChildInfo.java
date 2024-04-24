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

import java.util.ArrayList;
import java.util.List;

/**
 * GetChildInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-17T12:57:43.398+05:30")
public class GetChildInfo {
  @SerializedName("email")
  private String email = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("companyName")
  private String companyName = null;

  @SerializedName("credits")
  private GetChildInfoCredits credits = null;

  @SerializedName("statistics")
  private GetChildInfoStatistics statistics = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("ips")
  private List<String> ips = null;

  @SerializedName("apiKeys")
  private GetChildInfoApiKeys apiKeys = null;

  public GetChildInfo email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Login Email
   * @return email
  **/
  @ApiModelProperty(example = "john.smith@example.com", required = true, value = "Login Email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public GetChildInfo firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * First Name
   * @return firstName
  **/
  @ApiModelProperty(example = "John", required = true, value = "First Name")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public GetChildInfo lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Last Name
   * @return lastName
  **/
  @ApiModelProperty(example = "Smith", required = true, value = "Last Name")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public GetChildInfo companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Name of the company
   * @return companyName
  **/
  @ApiModelProperty(example = "MyCompany", required = true, value = "Name of the company")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public GetChildInfo credits(GetChildInfoCredits credits) {
    this.credits = credits;
    return this;
  }

   /**
   * Get credits
   * @return credits
  **/
  @ApiModelProperty(value = "")
  public GetChildInfoCredits getCredits() {
    return credits;
  }

  public void setCredits(GetChildInfoCredits credits) {
    this.credits = credits;
  }

  public GetChildInfo statistics(GetChildInfoStatistics statistics) {
    this.statistics = statistics;
    return this;
  }

   /**
   * Get statistics
   * @return statistics
  **/
  @ApiModelProperty(value = "")
  public GetChildInfoStatistics getStatistics() {
    return statistics;
  }

  public void setStatistics(GetChildInfoStatistics statistics) {
    this.statistics = statistics;
  }

  public GetChildInfo password(String password) {
    this.password = password;
    return this;
  }

   /**
   * The encrypted password of child account
   * @return password
  **/
  @ApiModelProperty(example = "abC01De2fGHI3jkL", required = true, value = "The encrypted password of child account")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public GetChildInfo ips(List<String> ips) {
    this.ips = ips;
    return this;
  }

  public GetChildInfo addIpsItem(String ipsItem) {
    if (this.ips == null) {
      this.ips = new ArrayList<String>();
    }
    this.ips.add(ipsItem);
    return this;
  }

   /**
   * IP(s) associated to a child account user
   * @return ips
  **/
  @ApiModelProperty(value = "IP(s) associated to a child account user")
  public List<String> getIps() {
    return ips;
  }

  public void setIps(List<String> ips) {
    this.ips = ips;
  }

  public GetChildInfo apiKeys(GetChildInfoApiKeys apiKeys) {
    this.apiKeys = apiKeys;
    return this;
  }

   /**
   * Get apiKeys
   * @return apiKeys
  **/
  @ApiModelProperty(value = "")
  public GetChildInfoApiKeys getApiKeys() {
    return apiKeys;
  }

  public void setApiKeys(GetChildInfoApiKeys apiKeys) {
    this.apiKeys = apiKeys;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    GetChildInfo getChildInfo = (GetChildInfo) o;
    return ObjectUtils.equals(this.email, getChildInfo.email) &&
    ObjectUtils.equals(this.firstName, getChildInfo.firstName) &&
    ObjectUtils.equals(this.lastName, getChildInfo.lastName) &&
    ObjectUtils.equals(this.companyName, getChildInfo.companyName) &&
    ObjectUtils.equals(this.credits, getChildInfo.credits) &&
    ObjectUtils.equals(this.statistics, getChildInfo.statistics) &&
    ObjectUtils.equals(this.password, getChildInfo.password) &&
    ObjectUtils.equals(this.ips, getChildInfo.ips) &&
    ObjectUtils.equals(this.apiKeys, getChildInfo.apiKeys);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(email, firstName, lastName, companyName, credits, statistics, password, ips, apiKeys);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetChildInfo {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    credits: ").append(toIndentedString(credits)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    ips: ").append(toIndentedString(ips)).append("\n");
    sb.append("    apiKeys: ").append(toIndentedString(apiKeys)).append("\n");
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


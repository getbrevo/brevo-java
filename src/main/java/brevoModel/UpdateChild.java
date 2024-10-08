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
 * UpdateChild
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-17T12:57:43.398+05:30")
public class UpdateChild {
  @SerializedName("email")
  private String email = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("companyName")
  private String companyName = null;

  @SerializedName("password")
  private String password = null;

  public UpdateChild email(String email) {
    this.email = email;
    return this;
  }

   /**
   * New Email address to update the child account
   * @return email
  **/
  @ApiModelProperty(example = "josh.cruise@example.com", value = "New Email address to update the child account")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UpdateChild firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * New First name to use to update the child account
   * @return firstName
  **/
  @ApiModelProperty(example = "Josh", value = "New First name to use to update the child account")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UpdateChild lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * New Last name to use to update the child account
   * @return lastName
  **/
  @ApiModelProperty(example = "Cruise", value = "New Last name to use to update the child account")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UpdateChild companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * New Company name to use to update the child account
   * @return companyName
  **/
  @ApiModelProperty(example = "Your Company", value = "New Company name to use to update the child account")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public UpdateChild password(String password) {
    this.password = password;
    return this;
  }

   /**
   * New password for the child account to login
   * @return password
  **/
  @ApiModelProperty(example = "Pa55w0rd65", value = "New password for the child account to login")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    UpdateChild updateChild = (UpdateChild) o;
    return ObjectUtils.equals(this.email, updateChild.email) &&
    ObjectUtils.equals(this.firstName, updateChild.firstName) &&
    ObjectUtils.equals(this.lastName, updateChild.lastName) &&
    ObjectUtils.equals(this.companyName, updateChild.companyName) &&
    ObjectUtils.equals(this.password, updateChild.password);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(email, firstName, lastName, companyName, password);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateChild {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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


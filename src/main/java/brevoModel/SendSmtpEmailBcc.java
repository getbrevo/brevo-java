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
 * SendSmtpEmailBcc
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-17T12:57:43.398+05:30")
public class SendSmtpEmailBcc {
  @SerializedName("email")
  private String email = null;

  @SerializedName("name")
  private String name = null;

  public SendSmtpEmailBcc email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email address of the recipient in bcc
   * @return email
  **/
  @ApiModelProperty(example = "helen9766@example.com", required = true, value = "Email address of the recipient in bcc")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public SendSmtpEmailBcc name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the recipient in bcc. Maximum allowed characters are 70.
   * @return name
  **/
  @ApiModelProperty(example = "Helen", value = "Name of the recipient in bcc. Maximum allowed characters are 70.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    SendSmtpEmailBcc sendSmtpEmailBcc = (SendSmtpEmailBcc) o;
    return ObjectUtils.equals(this.email, sendSmtpEmailBcc.email) &&
    ObjectUtils.equals(this.name, sendSmtpEmailBcc.name);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(email, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendSmtpEmailBcc {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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


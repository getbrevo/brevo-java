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
 * Optional. Redirect contact to a custom success page once payment is successful. If empty the default Brevo page will be displayed once a payment is validated 
 */
@ApiModel(description = "Optional. Redirect contact to a custom success page once payment is successful. If empty the default Brevo page will be displayed once a payment is validated ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-17T12:57:43.398+05:30")
public class ModelConfiguration {
  @SerializedName("customSuccessUrl")
  private String customSuccessUrl = null;

  public ModelConfiguration customSuccessUrl(String customSuccessUrl) {
    this.customSuccessUrl = customSuccessUrl;
    return this;
  }

   /**
   * Absolute URL of the custom success page. 
   * @return customSuccessUrl
  **/
  @ApiModelProperty(example = "https://my-company.com/payment-success", required = true, value = "Absolute URL of the custom success page. ")
  public String getCustomSuccessUrl() {
    return customSuccessUrl;
  }

  public void setCustomSuccessUrl(String customSuccessUrl) {
    this.customSuccessUrl = customSuccessUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    ModelConfiguration _configuration = (ModelConfiguration) o;
    return ObjectUtils.equals(this.customSuccessUrl, _configuration.customSuccessUrl);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(customSuccessUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelConfiguration {\n");
    
    sb.append("    customSuccessUrl: ").append(toIndentedString(customSuccessUrl)).append("\n");
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


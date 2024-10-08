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
 * GetChildInfoApiKeysV2
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-17T12:57:43.398+05:30")
public class GetChildInfoApiKeysV2 {
  @SerializedName("name")
  private String name = null;

  @SerializedName("key")
  private String key = null;

  public GetChildInfoApiKeysV2 name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the key for version 2
   * @return name
  **/
  @ApiModelProperty(example = "N˚2", required = true, value = "Name of the key for version 2")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetChildInfoApiKeysV2 key(String key) {
    this.key = key;
    return this;
  }

   /**
   * API Key for version 2
   * @return key
  **/
  @ApiModelProperty(example = "nOpxxxxxy7z", required = true, value = "API Key for version 2")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    GetChildInfoApiKeysV2 getChildInfoApiKeysV2 = (GetChildInfoApiKeysV2) o;
    return ObjectUtils.equals(this.name, getChildInfoApiKeysV2.name) &&
    ObjectUtils.equals(this.key, getChildInfoApiKeysV2.key);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(name, key);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetChildInfoApiKeysV2 {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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


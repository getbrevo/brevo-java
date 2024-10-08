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
 * GetWATemplatesTemplates
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-17T12:57:43.398+05:30")
public class GetWATemplatesTemplates {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("language")
  private String language = null;

  @SerializedName("category")
  private String category = null;

  @SerializedName("errorReason")
  private String errorReason = null;

  @SerializedName("createdAt")
  private String createdAt = null;

  @SerializedName("modifiedAt")
  private String modifiedAt = null;

  public GetWATemplatesTemplates id(String id) {
    this.id = id;
    return this;
  }

   /**
   * id of the template
   * @return id
  **/
  @ApiModelProperty(example = "235", required = true, value = "id of the template")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public GetWATemplatesTemplates name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the WhatsApp template
   * @return name
  **/
  @ApiModelProperty(example = "Test template", required = true, value = "Name of the WhatsApp template")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetWATemplatesTemplates status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the WhatsApp template
   * @return status
  **/
  @ApiModelProperty(example = "approved", required = true, value = "Status of the WhatsApp template")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public GetWATemplatesTemplates language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Language in which template exists
   * @return language
  **/
  @ApiModelProperty(example = "en", required = true, value = "Language in which template exists")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public GetWATemplatesTemplates category(String category) {
    this.category = category;
    return this;
  }

   /**
   * category of the template
   * @return category
  **/
  @ApiModelProperty(example = "MARKETING", required = true, value = "category of the template")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public GetWATemplatesTemplates errorReason(String errorReason) {
    this.errorReason = errorReason;
    return this;
  }

   /**
   * Error reason in the template creation
   * @return errorReason
  **/
  @ApiModelProperty(example = "NONE", value = "Error reason in the template creation")
  public String getErrorReason() {
    return errorReason;
  }

  public void setErrorReason(String errorReason) {
    this.errorReason = errorReason;
  }

  public GetWATemplatesTemplates createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Creation UTC date-time of the whatsApp template (YYYY-MM-DDTHH:mm:ss.SSSZ)
   * @return createdAt
  **/
  @ApiModelProperty(example = "2017-06-01T12:30:00.000+0000", required = true, value = "Creation UTC date-time of the whatsApp template (YYYY-MM-DDTHH:mm:ss.SSSZ)")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public GetWATemplatesTemplates modifiedAt(String modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

   /**
   * UTC date-time of last modification of the whatsApp template (YYYY-MM-DDTHH:mm:ss.SSSZ)
   * @return modifiedAt
  **/
  @ApiModelProperty(example = "2017-05-01T12:30:00.000+0000", required = true, value = "UTC date-time of last modification of the whatsApp template (YYYY-MM-DDTHH:mm:ss.SSSZ)")
  public String getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(String modifiedAt) {
    this.modifiedAt = modifiedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    GetWATemplatesTemplates getWATemplatesTemplates = (GetWATemplatesTemplates) o;
    return ObjectUtils.equals(this.id, getWATemplatesTemplates.id) &&
    ObjectUtils.equals(this.name, getWATemplatesTemplates.name) &&
    ObjectUtils.equals(this.status, getWATemplatesTemplates.status) &&
    ObjectUtils.equals(this.language, getWATemplatesTemplates.language) &&
    ObjectUtils.equals(this.category, getWATemplatesTemplates.category) &&
    ObjectUtils.equals(this.errorReason, getWATemplatesTemplates.errorReason) &&
    ObjectUtils.equals(this.createdAt, getWATemplatesTemplates.createdAt) &&
    ObjectUtils.equals(this.modifiedAt, getWATemplatesTemplates.modifiedAt);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(id, name, status, language, category, errorReason, createdAt, modifiedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetWATemplatesTemplates {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    errorReason: ").append(toIndentedString(errorReason)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
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


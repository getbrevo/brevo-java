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
 * GetWATemplates
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-17T12:57:43.398+05:30")
public class GetWATemplates {
  @SerializedName("templates")
  private List<GetWATemplatesTemplates> templates = new ArrayList<GetWATemplatesTemplates>();

  @SerializedName("count")
  private Long count = null;

  public GetWATemplates templates(List<GetWATemplatesTemplates> templates) {
    this.templates = templates;
    return this;
  }

  public GetWATemplates addTemplatesItem(GetWATemplatesTemplates templatesItem) {
    this.templates.add(templatesItem);
    return this;
  }

   /**
   * Get templates
   * @return templates
  **/
  @ApiModelProperty(required = true, value = "")
  public List<GetWATemplatesTemplates> getTemplates() {
    return templates;
  }

  public void setTemplates(List<GetWATemplatesTemplates> templates) {
    this.templates = templates;
  }

  public GetWATemplates count(Long count) {
    this.count = count;
    return this;
  }

   /**
   * Number of whatsApp templates retrived
   * @return count
  **/
  @ApiModelProperty(example = "24", required = true, value = "Number of whatsApp templates retrived")
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    GetWATemplates getWATemplates = (GetWATemplates) o;
    return ObjectUtils.equals(this.templates, getWATemplates.templates) &&
    ObjectUtils.equals(this.count, getWATemplates.count);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(templates, count);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetWATemplates {\n");
    
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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


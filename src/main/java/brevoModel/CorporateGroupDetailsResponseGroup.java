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
 * CorporateGroupDetailsResponseGroup
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-17T12:57:43.398+05:30")
public class CorporateGroupDetailsResponseGroup {
  @SerializedName("id")
  private String id = null;

  @SerializedName("groupName")
  private String groupName = null;

  @SerializedName("createdAt")
  private String createdAt = null;

  public CorporateGroupDetailsResponseGroup id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Group id
   * @return id
  **/
  @ApiModelProperty(value = "Group id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CorporateGroupDetailsResponseGroup groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

   /**
   * Name of the group
   * @return groupName
  **/
  @ApiModelProperty(value = "Name of the group")
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public CorporateGroupDetailsResponseGroup createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Group creation date
   * @return createdAt
  **/
  @ApiModelProperty(value = "Group creation date")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    CorporateGroupDetailsResponseGroup corporateGroupDetailsResponseGroup = (CorporateGroupDetailsResponseGroup) o;
    return ObjectUtils.equals(this.id, corporateGroupDetailsResponseGroup.id) &&
    ObjectUtils.equals(this.groupName, corporateGroupDetailsResponseGroup.groupName) &&
    ObjectUtils.equals(this.createdAt, corporateGroupDetailsResponseGroup.createdAt);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(id, groupName, createdAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorporateGroupDetailsResponseGroup {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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


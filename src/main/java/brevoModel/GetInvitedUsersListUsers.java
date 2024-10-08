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
 * GetInvitedUsersListUsers
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-17T12:57:43.398+05:30")
public class GetInvitedUsersListUsers {
  @SerializedName("email")
  private String email = null;

  @SerializedName("is_owner")
  private String isOwner = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("feature_access")
  private GetInvitedUsersListFeatureAccess featureAccess = null;

  public GetInvitedUsersListUsers email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email address of the user.
   * @return email
  **/
  @ApiModelProperty(example = "pendingInvitedUser@company.com", required = true, value = "Email address of the user.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public GetInvitedUsersListUsers isOwner(String isOwner) {
    this.isOwner = isOwner;
    return this;
  }

   /**
   * Flag for indicating is user owner of the organization.
   * @return isOwner
  **/
  @ApiModelProperty(example = "true", required = true, value = "Flag for indicating is user owner of the organization.")
  public String getIsOwner() {
    return isOwner;
  }

  public void setIsOwner(String isOwner) {
    this.isOwner = isOwner;
  }

  public GetInvitedUsersListUsers status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the invited user.
   * @return status
  **/
  @ApiModelProperty(example = "active", required = true, value = "Status of the invited user.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public GetInvitedUsersListUsers featureAccess(GetInvitedUsersListFeatureAccess featureAccess) {
    this.featureAccess = featureAccess;
    return this;
  }

   /**
   * Get featureAccess
   * @return featureAccess
  **/
  @ApiModelProperty(required = true, value = "")
  public GetInvitedUsersListFeatureAccess getFeatureAccess() {
    return featureAccess;
  }

  public void setFeatureAccess(GetInvitedUsersListFeatureAccess featureAccess) {
    this.featureAccess = featureAccess;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    GetInvitedUsersListUsers getInvitedUsersListUsers = (GetInvitedUsersListUsers) o;
    return ObjectUtils.equals(this.email, getInvitedUsersListUsers.email) &&
    ObjectUtils.equals(this.isOwner, getInvitedUsersListUsers.isOwner) &&
    ObjectUtils.equals(this.status, getInvitedUsersListUsers.status) &&
    ObjectUtils.equals(this.featureAccess, getInvitedUsersListUsers.featureAccess);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(email, isOwner, status, featureAccess);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetInvitedUsersListUsers {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    isOwner: ").append(toIndentedString(isOwner)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    featureAccess: ").append(toIndentedString(featureAccess)).append("\n");
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


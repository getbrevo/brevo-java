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

import java.util.ArrayList;
import java.util.List;

/**
 * Granular feature permissions given to the user.
 */
@ApiModel(description = "Granular feature permissions given to the user.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-17T12:57:43.398+05:30")
public class GetCorporateUserPermissionFeatureAccess {
  @SerializedName("api_keys")
  private List<String> apiKeys = null;

  @SerializedName("my_plan")
  private List<String> myPlan = null;

  @SerializedName("user_management")
  private List<String> userManagement = null;

  @SerializedName("apps_management")
  private List<String> appsManagement = null;

  public GetCorporateUserPermissionFeatureAccess apiKeys(List<String> apiKeys) {
    this.apiKeys = apiKeys;
    return this;
  }

  public GetCorporateUserPermissionFeatureAccess addApiKeysItem(String apiKeysItem) {
    if (this.apiKeys == null) {
      this.apiKeys = new ArrayList<String>();
    }
    this.apiKeys.add(apiKeysItem);
    return this;
  }

   /**
   * Permission on api keys
   * @return apiKeys
  **/
  @ApiModelProperty(value = "Permission on api keys")
  public List<String> getApiKeys() {
    return apiKeys;
  }

  public void setApiKeys(List<String> apiKeys) {
    this.apiKeys = apiKeys;
  }

  public GetCorporateUserPermissionFeatureAccess myPlan(List<String> myPlan) {
    this.myPlan = myPlan;
    return this;
  }

  public GetCorporateUserPermissionFeatureAccess addMyPlanItem(String myPlanItem) {
    if (this.myPlan == null) {
      this.myPlan = new ArrayList<String>();
    }
    this.myPlan.add(myPlanItem);
    return this;
  }

   /**
   * Permission on my plan
   * @return myPlan
  **/
  @ApiModelProperty(value = "Permission on my plan")
  public List<String> getMyPlan() {
    return myPlan;
  }

  public void setMyPlan(List<String> myPlan) {
    this.myPlan = myPlan;
  }

  public GetCorporateUserPermissionFeatureAccess userManagement(List<String> userManagement) {
    this.userManagement = userManagement;
    return this;
  }

  public GetCorporateUserPermissionFeatureAccess addUserManagementItem(String userManagementItem) {
    if (this.userManagement == null) {
      this.userManagement = new ArrayList<String>();
    }
    this.userManagement.add(userManagementItem);
    return this;
  }

   /**
   * Permission on user management
   * @return userManagement
  **/
  @ApiModelProperty(value = "Permission on user management")
  public List<String> getUserManagement() {
    return userManagement;
  }

  public void setUserManagement(List<String> userManagement) {
    this.userManagement = userManagement;
  }

  public GetCorporateUserPermissionFeatureAccess appsManagement(List<String> appsManagement) {
    this.appsManagement = appsManagement;
    return this;
  }

  public GetCorporateUserPermissionFeatureAccess addAppsManagementItem(String appsManagementItem) {
    if (this.appsManagement == null) {
      this.appsManagement = new ArrayList<String>();
    }
    this.appsManagement.add(appsManagementItem);
    return this;
  }

   /**
   * Permission on apps management
   * @return appsManagement
  **/
  @ApiModelProperty(value = "Permission on apps management")
  public List<String> getAppsManagement() {
    return appsManagement;
  }

  public void setAppsManagement(List<String> appsManagement) {
    this.appsManagement = appsManagement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    GetCorporateUserPermissionFeatureAccess getCorporateUserPermissionFeatureAccess = (GetCorporateUserPermissionFeatureAccess) o;
    return ObjectUtils.equals(this.apiKeys, getCorporateUserPermissionFeatureAccess.apiKeys) &&
    ObjectUtils.equals(this.myPlan, getCorporateUserPermissionFeatureAccess.myPlan) &&
    ObjectUtils.equals(this.userManagement, getCorporateUserPermissionFeatureAccess.userManagement) &&
    ObjectUtils.equals(this.appsManagement, getCorporateUserPermissionFeatureAccess.appsManagement);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(apiKeys, myPlan, userManagement, appsManagement);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporateUserPermissionFeatureAccess {\n");
    
    sb.append("    apiKeys: ").append(toIndentedString(apiKeys)).append("\n");
    sb.append("    myPlan: ").append(toIndentedString(myPlan)).append("\n");
    sb.append("    userManagement: ").append(toIndentedString(userManagement)).append("\n");
    sb.append("    appsManagement: ").append(toIndentedString(appsManagement)).append("\n");
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


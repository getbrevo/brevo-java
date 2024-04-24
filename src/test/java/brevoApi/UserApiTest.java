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


package brevoApi;

import brevo.ApiException;
import brevoModel.*;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for UserApi
 */
@Ignore
public class UserApiTest {

    private final UserApi api = new UserApi();

    
    /**
     * Update permission for a user
     *
     * &#x60;Feature&#x60; - A Feature represents a specific functionality like Email campaign, Deals, Calls, Automations, etc. on Brevo. While inviting a user, determine which feature you want to manage access to. You must specify the feature accurately to avoid errors.  &#x60;Permission&#x60; - A Permission defines the level of access or control a user has over a specific feature. While inviting user, decide on the permission level required for the selected feature. Make sure the chosen permission is related to the selected feature.  Features and their respective permissions are as below:  - &#x60;email_campaigns&#x60;:   - \&quot;create_edit_delete\&quot;   - \&quot;send_schedule_suspend\&quot; - &#x60;sms_campaigns&#x60;:   - \&quot;create_edit_delete\&quot;   - \&quot;send_schedule_suspend\&quot; - &#x60;contacts&#x60;:   - \&quot;view\&quot;   - \&quot;create_edit_delete\&quot;   - \&quot;import\&quot;   - \&quot;export\&quot;   - \&quot;list_and_attributes\&quot;   - \&quot;forms\&quot; - &#x60;templates&#x60;:   - \&quot;create_edit_delete\&quot;   - \&quot;activate_deactivate\&quot; - &#x60;workflows&#x60;:   - \&quot;create_edit_delete\&quot;   - \&quot;activate_deactivate_pause\&quot;   - \&quot;settings\&quot; - &#x60;facebook_ads&#x60;:   - \&quot;create_edit_delete\&quot;   - \&quot;schedule_pause\&quot; - &#x60;landing_pages&#x60;:   - \&quot;all\&quot; - &#x60;transactional_emails&#x60;:   - \&quot;settings\&quot;   - \&quot;logs\&quot; - &#x60;smtp_api&#x60;:   - \&quot;smtp\&quot;   - \&quot;api_keys\&quot;   - \&quot;authorized_ips\&quot; - &#x60;user_management&#x60;:   - \&quot;all\&quot; - &#x60;sales_platform&#x60;:   - \&quot;manage_owned_deals_tasks_companies\&quot;   - \&quot;manage_others_deals_tasks_companies\&quot;   - \&quot;reports\&quot;   - \&quot;settings\&quot; - &#x60;phone&#x60;:   - \&quot;all\&quot; - &#x60;conversations&#x60;:   - \&quot;access\&quot;   - \&quot;assign\&quot;   - \&quot;configure\&quot; - &#x60;senders_domains_dedicated_ips&#x60;:   - \&quot;senders_management\&quot;   - \&quot;domains_management\&quot;   - \&quot;dedicated_ips_management\&quot; - &#x60;push_notifications&#x60;:   - \&quot;view\&quot;   - \&quot;create_edit_delete\&quot;   - \&quot;send\&quot;   - \&quot;settings\&quot;  **Note**: - The privileges array remains the same as in the send invitation; the user simply needs to provide the permissions that need to be updated. - The availability of feature and its permission depends on your current plan. Please select the features and permissions accordingly. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editUserPermissionTest() throws ApiException {
        Inviteuser updatePermissions = null;
        Inviteuser response = api.editUserPermission(updatePermissions);

        // TODO: test validations
    }
    
    /**
     * Get the list of all your users
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInvitedUsersListTest() throws ApiException {
        GetInvitedUsersList response = api.getInvitedUsersList();

        // TODO: test validations
    }
    
    /**
     * Check user permission
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserPermissionTest() throws ApiException {
        String email = null;
        GetUserPermission response = api.getUserPermission(email);

        // TODO: test validations
    }
    
    /**
     * Send invitation to user
     *
     * &#x60;Feature&#x60; - A Feature represents a specific functionality like Email campaign, Deals, Calls, Automations, etc. on Brevo. While inviting a user, determine which feature you want to manage access to. You must specify the feature accurately to avoid errors.  &#x60;Permission&#x60; - A Permission defines the level of access or control a user has over a specific feature. While inviting user, decide on the permission level required for the selected feature. Make sure the chosen permission is related to the selected feature.  Features and their respective permissions are as below:  - &#x60;email_campaigns&#x60;:   - \&quot;create_edit_delete\&quot;   - \&quot;send_schedule_suspend\&quot; - &#x60;sms_campaigns&#x60;:   - \&quot;create_edit_delete\&quot;   - \&quot;send_schedule_suspend\&quot; - &#x60;contacts&#x60;:   - \&quot;view\&quot;   - \&quot;create_edit_delete\&quot;   - \&quot;import\&quot;   - \&quot;export\&quot;   - \&quot;list_and_attributes\&quot;   - \&quot;forms\&quot; - &#x60;templates&#x60;:   - \&quot;create_edit_delete\&quot;   - \&quot;activate_deactivate\&quot; - &#x60;workflows&#x60;:   - \&quot;create_edit_delete\&quot;   - \&quot;activate_deactivate_pause\&quot;   - \&quot;settings\&quot; - &#x60;facebook_ads&#x60;:   - \&quot;create_edit_delete\&quot;   - \&quot;schedule_pause\&quot; - &#x60;landing_pages&#x60;:   - \&quot;all\&quot; - &#x60;transactional_emails&#x60;:   - \&quot;settings\&quot;   - \&quot;logs\&quot; - &#x60;smtp_api&#x60;:   - \&quot;smtp\&quot;   - \&quot;api_keys\&quot;   - \&quot;authorized_ips\&quot; - &#x60;user_management&#x60;:   - \&quot;all\&quot; - &#x60;sales_platform&#x60;:   - \&quot;manage_owned_deals_tasks_companies\&quot;   - \&quot;manage_others_deals_tasks_companies\&quot;   - \&quot;reports\&quot;   - \&quot;settings\&quot; - &#x60;phone&#x60;:   - \&quot;all\&quot; - &#x60;conversations&#x60;:   - \&quot;access\&quot;   - \&quot;assign\&quot;   - \&quot;configure\&quot; - &#x60;senders_domains_dedicated_ips&#x60;:   - \&quot;senders_management\&quot;   - \&quot;domains_management\&quot;   - \&quot;dedicated_ips_management\&quot; - &#x60;push_notifications&#x60;:   - \&quot;view\&quot;   - \&quot;create_edit_delete\&quot;   - \&quot;send\&quot;   - \&quot;settings\&quot;  **Note**: - If &#x60;all_features_access: false&#x60; then only privileges are required otherwise if &#x60;true&#x60; then it&#39;s assumed that all permissions will be there for the invited user. - The availability of feature and its permission depends on your current plan. Please select the features and permissions accordingly. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void inviteuserTest() throws ApiException {
        Inviteuser sendInvitation = null;
        Inviteuser response = api.inviteuser(sendInvitation);

        // TODO: test validations
    }
    
    /**
     * Revoke user permission
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putRevokeUserPermissionTest() throws ApiException {
        String email = null;
        PutRevokeUserPermission response = api.putRevokeUserPermission(email);

        // TODO: test validations
    }
    
    /**
     * Resend / Cancel invitation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putresendcancelinvitationTest() throws ApiException {
        String action = null;
        String email = null;
        Putresendcancelinvitation response = api.putresendcancelinvitation(action, email);

        // TODO: test validations
    }
    
}

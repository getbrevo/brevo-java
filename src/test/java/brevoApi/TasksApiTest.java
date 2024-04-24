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
 * API tests for TasksApi
 */
@Ignore
public class TasksApiTest {

    private final TasksApi api = new TasksApi();

    
    /**
     * Get all tasks
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void crmTasksGetTest() throws ApiException {
        String filterType = null;
        String filterStatus = null;
        String filterDate = null;
        String filterAssignTo = null;
        String filterContacts = null;
        String filterDeals = null;
        String filterCompanies = null;
        Integer dateFrom = null;
        Integer dateTo = null;
        Long offset = null;
        Long limit = null;
        String sort = null;
        String sortBy = null;
        TaskList response = api.crmTasksGet(filterType, filterStatus, filterDate, filterAssignTo, filterContacts, filterDeals, filterCompanies, dateFrom, dateTo, offset, limit, sort, sortBy);

        // TODO: test validations
    }
    
    /**
     * Delete a task
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void crmTasksIdDeleteTest() throws ApiException {
        String id = null;
        api.crmTasksIdDelete(id);

        // TODO: test validations
    }
    
    /**
     * Get a task
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void crmTasksIdGetTest() throws ApiException {
        String id = null;
        Task response = api.crmTasksIdGet(id);

        // TODO: test validations
    }
    
    /**
     * Update a task
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void crmTasksIdPatchTest() throws ApiException {
        String id = null;
        Body10 body = null;
        api.crmTasksIdPatch(id, body);

        // TODO: test validations
    }
    
    /**
     * Create a task
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void crmTasksPostTest() throws ApiException {
        Body9 body = null;
        InlineResponse2012 response = api.crmTasksPost(body);

        // TODO: test validations
    }
    
    /**
     * Get all task types
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void crmTasktypesGetTest() throws ApiException {
        TaskTypes response = api.crmTasktypesGet();

        // TODO: test validations
    }
    
}

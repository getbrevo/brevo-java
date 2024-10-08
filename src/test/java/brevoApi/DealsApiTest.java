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
 * API tests for DealsApi
 */
@Ignore
public class DealsApiTest {

    private final DealsApi api = new DealsApi();

    
    /**
     * Get deal attributes
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void crmAttributesDealsGetTest() throws ApiException {
        DealAttributes response = api.crmAttributesDealsGet();

        // TODO: test validations
    }
    
    /**
     * Get all deals
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void crmDealsGetTest() throws ApiException {
        String filtersAttributesDealName = null;
        String filtersLinkedCompaniesIds = null;
        String filtersLinkedContactsIds = null;
        Long offset = null;
        Long limit = null;
        String sort = null;
        String sortBy = null;
        DealsList response = api.crmDealsGet(filtersAttributesDealName, filtersLinkedCompaniesIds, filtersLinkedContactsIds, offset, limit, sort, sortBy);

        // TODO: test validations
    }
    
    /**
     * Delete a deal
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void crmDealsIdDeleteTest() throws ApiException {
        String id = null;
        api.crmDealsIdDelete(id);

        // TODO: test validations
    }
    
    /**
     * Get a deal
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void crmDealsIdGetTest() throws ApiException {
        String id = null;
        Deal response = api.crmDealsIdGet(id);

        // TODO: test validations
    }
    
    /**
     * Update a deal
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void crmDealsIdPatchTest() throws ApiException {
        String id = null;
        Body7 body = null;
        api.crmDealsIdPatch(id, body);

        // TODO: test validations
    }
    
    /**
     * Link and Unlink a deal with contacts and companies
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void crmDealsLinkUnlinkIdPatchTest() throws ApiException {
        String id = null;
        Body8 body = null;
        api.crmDealsLinkUnlinkIdPatch(id, body);

        // TODO: test validations
    }
    
    /**
     * Create a deal
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void crmDealsPostTest() throws ApiException {
        Body6 body = null;
        InlineResponse2011 response = api.crmDealsPost(body);

        // TODO: test validations
    }
    
    /**
     * Get all pipelines
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void crmPipelineDetailsAllGetTest() throws ApiException {
        Pipelines response = api.crmPipelineDetailsAllGet();

        // TODO: test validations
    }
    
    /**
     * Get pipeline stages
     *
     * This endpoint is deprecated. Prefer /crm/pipeline/details/{pipelineID} instead.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void crmPipelineDetailsGetTest() throws ApiException {
        Pipeline response = api.crmPipelineDetailsGet();

        // TODO: test validations
    }
    
    /**
     * Get a pipeline
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void crmPipelineDetailsPipelineIDGetTest() throws ApiException {
        String pipelineID = null;
        Pipelines response = api.crmPipelineDetailsPipelineIDGet(pipelineID);

        // TODO: test validations
    }
    
}

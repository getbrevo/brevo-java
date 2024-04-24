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
 * API tests for CompaniesApi
 */
@Ignore
public class CompaniesApiTest {

    private final CompaniesApi api = new CompaniesApi();

    
    /**
     * Get company attributes
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void companiesAttributesGetTest() throws ApiException {
        CompanyAttributes response = api.companiesAttributesGet();

        // TODO: test validations
    }
    
    /**
     * Get all companies
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void companiesGetTest() throws ApiException {
        String filters = null;
        Long linkedContactsIds = null;
        String linkedDealsIds = null;
        Long page = null;
        Long limit = null;
        String sort = null;
        String sortBy = null;
        CompaniesList response = api.companiesGet(filters, linkedContactsIds, linkedDealsIds, page, limit, sort, sortBy);

        // TODO: test validations
    }
    
    /**
     * Delete a company
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void companiesIdDeleteTest() throws ApiException {
        String id = null;
        api.companiesIdDelete(id);

        // TODO: test validations
    }
    
    /**
     * Get a company
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void companiesIdGetTest() throws ApiException {
        String id = null;
        Company response = api.companiesIdGet(id);

        // TODO: test validations
    }
    
    /**
     * Update a company
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void companiesIdPatchTest() throws ApiException {
        String id = null;
        Body4 body = null;
        Company response = api.companiesIdPatch(id, body);

        // TODO: test validations
    }
    
    /**
     * Link and Unlink company with contacts and deals
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void companiesLinkUnlinkIdPatchTest() throws ApiException {
        String id = null;
        Body5 body = null;
        api.companiesLinkUnlinkIdPatch(id, body);

        // TODO: test validations
    }
    
    /**
     * Create a company
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void companiesPostTest() throws ApiException {
        Body3 body = null;
        InlineResponse2002 response = api.companiesPost(body);

        // TODO: test validations
    }
    
}

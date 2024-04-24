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
import brevoModel.GetProcess;
import brevoModel.GetProcesses;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for ProcessApi
 */
@Ignore
public class ProcessApiTest {

    private final ProcessApi api = new ProcessApi();

    
    /**
     * Return the informations for a process
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProcessTest() throws ApiException {
        Long processId = null;
        GetProcess response = api.getProcess(processId);

        // TODO: test validations
    }
    
    /**
     * Return all the processes for your account
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProcessesTest() throws ApiException {
        Long limit = null;
        Long offset = null;
        String sort = null;
        GetProcesses response = api.getProcesses(limit, offset, sort);

        // TODO: test validations
    }
    
}

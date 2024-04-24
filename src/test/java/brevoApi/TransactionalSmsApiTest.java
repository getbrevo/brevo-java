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
 * API tests for TransactionalSmsApi
 */
@Ignore
public class TransactionalSmsApiTest {

    private final TransactionalSmsApi api = new TransactionalSmsApi();

    
    /**
     * Get all your SMS activity (unaggregated events)
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSmsEventsTest() throws ApiException {
        Long limit = null;
        String startDate = null;
        String endDate = null;
        Long offset = null;
        Long days = null;
        String phoneNumber = null;
        String event = null;
        String tags = null;
        String sort = null;
        GetSmsEventReport response = api.getSmsEvents(limit, startDate, endDate, offset, days, phoneNumber, event, tags, sort);

        // TODO: test validations
    }
    
    /**
     * Get your SMS activity aggregated over a period of time
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTransacAggregatedSmsReportTest() throws ApiException {
        String startDate = null;
        String endDate = null;
        Long days = null;
        String tag = null;
        GetTransacAggregatedSmsReport response = api.getTransacAggregatedSmsReport(startDate, endDate, days, tag);

        // TODO: test validations
    }
    
    /**
     * Get your SMS activity aggregated per day
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTransacSmsReportTest() throws ApiException {
        String startDate = null;
        String endDate = null;
        Long days = null;
        String tag = null;
        String sort = null;
        GetTransacSmsReport response = api.getTransacSmsReport(startDate, endDate, days, tag, sort);

        // TODO: test validations
    }
    
    /**
     * Send SMS message to a mobile number
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendTransacSmsTest() throws ApiException {
        SendTransacSms sendTransacSms = null;
        SendSms response = api.sendTransacSms(sendTransacSms);

        // TODO: test validations
    }
    
}

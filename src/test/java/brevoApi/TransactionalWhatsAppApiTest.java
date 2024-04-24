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
import brevoModel.GetWhatsappEventReport;
import brevoModel.InlineResponse2014;
import brevoModel.SendWhatsappMessage;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for TransactionalWhatsAppApi
 */
@Ignore
public class TransactionalWhatsAppApiTest {

    private final TransactionalWhatsAppApi api = new TransactionalWhatsAppApi();

    
    /**
     * Get all your WhatsApp activity (unaggregated events)
     *
     * This endpoint will show the unaggregated statistics for WhatsApp activity (30 days by default if &#x60;startDate&#x60; and &#x60;endDate&#x60; or &#x60;days&#x60; is not passed. The date range can not exceed 90 days)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWhatsappEventReportTest() throws ApiException {
        Long limit = null;
        Long offset = null;
        String startDate = null;
        String endDate = null;
        Long days = null;
        String contactNumber = null;
        String event = null;
        String sort = null;
        GetWhatsappEventReport response = api.getWhatsappEventReport(limit, offset, startDate, endDate, days, contactNumber, event, sort);

        // TODO: test validations
    }
    
    /**
     * Send a WhatsApp message
     *
     * This endpoint is used to send a WhatsApp message. &lt;br/&gt;(**The first message you send using the API must contain a Template ID. You must create a template on WhatsApp on the Brevo platform to fetch the Template ID.**)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendWhatsappMessageTest() throws ApiException {
        SendWhatsappMessage sendWhatsappMessage = null;
        InlineResponse2014 response = api.sendWhatsappMessage(sendWhatsappMessage);

        // TODO: test validations
    }
    
}

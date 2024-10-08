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
import brevoModel.Note;
import brevoModel.NoteData;
import brevoModel.NoteId;
import brevoModel.NoteList;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for NotesApi
 */
@Ignore
public class NotesApiTest {

    private final NotesApi api = new NotesApi();

    
    /**
     * Get all notes
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void crmNotesGetTest() throws ApiException {
        String entity = null;
        String entityIds = null;
        Integer dateFrom = null;
        Integer dateTo = null;
        Long offset = null;
        Long limit = null;
        String sort = null;
        NoteList response = api.crmNotesGet(entity, entityIds, dateFrom, dateTo, offset, limit, sort);

        // TODO: test validations
    }
    
    /**
     * Delete a note
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void crmNotesIdDeleteTest() throws ApiException {
        String id = null;
        api.crmNotesIdDelete(id);

        // TODO: test validations
    }
    
    /**
     * Get a note
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void crmNotesIdGetTest() throws ApiException {
        String id = null;
        Note response = api.crmNotesIdGet(id);

        // TODO: test validations
    }
    
    /**
     * Update a note
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void crmNotesIdPatchTest() throws ApiException {
        String id = null;
        NoteData body = null;
        api.crmNotesIdPatch(id, body);

        // TODO: test validations
    }
    
    /**
     * Create a note
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void crmNotesPostTest() throws ApiException {
        NoteData body = null;
        NoteId response = api.crmNotesPost(body);

        // TODO: test validations
    }
    
}

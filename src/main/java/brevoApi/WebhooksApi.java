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

import brevo.*;
import brevoModel.*;
import com.google.gson.reflect.TypeToken;
import okhttp3.Call;
import okhttp3.Interceptor;
import okhttp3.Response;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebhooksApi {
    private ApiClient apiClient;

    public WebhooksApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WebhooksApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createWebhook
     * @param createWebhook Values to create a webhook (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call createWebhookCall(CreateWebhook createWebhook, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createWebhook;

        // create path and map variables
        String localVarPath = "/webhooks";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(Interceptor.Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api-key", "partner-key" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private Call createWebhookValidateBeforeCall(CreateWebhook createWebhook, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'createWebhook' is set
        if (createWebhook == null) {
            throw new ApiException("Missing the required parameter 'createWebhook' when calling createWebhook(Async)");
        }
        

        Call call = createWebhookCall(createWebhook, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create a webhook
     * 
     * @param createWebhook Values to create a webhook (required)
     * @return CreateModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateModel createWebhook(CreateWebhook createWebhook) throws ApiException {
        ApiResponse<CreateModel> resp = createWebhookWithHttpInfo(createWebhook);
        return resp.getData();
    }

    /**
     * Create a webhook
     * 
     * @param createWebhook Values to create a webhook (required)
     * @return ApiResponse&lt;CreateModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateModel> createWebhookWithHttpInfo(CreateWebhook createWebhook) throws ApiException {
        Call call = createWebhookValidateBeforeCall(createWebhook, null, null);
        Type localVarReturnType = new TypeToken<CreateModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create a webhook (asynchronously)
     * 
     * @param createWebhook Values to create a webhook (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call createWebhookAsync(CreateWebhook createWebhook, final ApiCallback<CreateModel> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        Call call = createWebhookValidateBeforeCall(createWebhook, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteWebhook
     * @param webhookId Id of the webhook (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call deleteWebhookCall(Long webhookId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/webhooks/{webhookId}"
            .replaceAll("\\{" + "webhookId" + "\\}", apiClient.escapeString(webhookId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(Interceptor.Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api-key", "partner-key" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private Call deleteWebhookValidateBeforeCall(Long webhookId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'webhookId' is set
        if (webhookId == null) {
            throw new ApiException("Missing the required parameter 'webhookId' when calling deleteWebhook(Async)");
        }
        

        Call call = deleteWebhookCall(webhookId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete a webhook
     * 
     * @param webhookId Id of the webhook (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteWebhook(Long webhookId) throws ApiException {
        deleteWebhookWithHttpInfo(webhookId);
    }

    /**
     * Delete a webhook
     * 
     * @param webhookId Id of the webhook (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteWebhookWithHttpInfo(Long webhookId) throws ApiException {
        Call call = deleteWebhookValidateBeforeCall(webhookId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete a webhook (asynchronously)
     * 
     * @param webhookId Id of the webhook (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call deleteWebhookAsync(Long webhookId, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        Call call = deleteWebhookValidateBeforeCall(webhookId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for exportWebhooksHistory
     * @param exportWebhookHistory Values to submit for webhooks history (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call exportWebhooksHistoryCall(ExportWebhooksHistory exportWebhookHistory, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = exportWebhookHistory;

        // create path and map variables
        String localVarPath = "/webhooks/export";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(Interceptor.Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api-key", "partner-key" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private Call exportWebhooksHistoryValidateBeforeCall(ExportWebhooksHistory exportWebhookHistory, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'exportWebhookHistory' is set
        if (exportWebhookHistory == null) {
            throw new ApiException("Missing the required parameter 'exportWebhookHistory' when calling exportWebhooksHistory(Async)");
        }
        

        Call call = exportWebhooksHistoryCall(exportWebhookHistory, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Export all webhook events
     * This endpoint will submit a request to get the history of webhooks in the CSV file. The link to download the CSV file will be sent to the webhook that was provided in the notifyURL.
     * @param exportWebhookHistory Values to submit for webhooks history (required)
     * @return CreatedProcessId
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreatedProcessId exportWebhooksHistory(ExportWebhooksHistory exportWebhookHistory) throws ApiException {
        ApiResponse<CreatedProcessId> resp = exportWebhooksHistoryWithHttpInfo(exportWebhookHistory);
        return resp.getData();
    }

    /**
     * Export all webhook events
     * This endpoint will submit a request to get the history of webhooks in the CSV file. The link to download the CSV file will be sent to the webhook that was provided in the notifyURL.
     * @param exportWebhookHistory Values to submit for webhooks history (required)
     * @return ApiResponse&lt;CreatedProcessId&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreatedProcessId> exportWebhooksHistoryWithHttpInfo(ExportWebhooksHistory exportWebhookHistory) throws ApiException {
        Call call = exportWebhooksHistoryValidateBeforeCall(exportWebhookHistory, null, null);
        Type localVarReturnType = new TypeToken<CreatedProcessId>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Export all webhook events (asynchronously)
     * This endpoint will submit a request to get the history of webhooks in the CSV file. The link to download the CSV file will be sent to the webhook that was provided in the notifyURL.
     * @param exportWebhookHistory Values to submit for webhooks history (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call exportWebhooksHistoryAsync(ExportWebhooksHistory exportWebhookHistory, final ApiCallback<CreatedProcessId> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        Call call = exportWebhooksHistoryValidateBeforeCall(exportWebhookHistory, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreatedProcessId>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getWebhook
     * @param webhookId Id of the webhook (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call getWebhookCall(Long webhookId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/webhooks/{webhookId}"
            .replaceAll("\\{" + "webhookId" + "\\}", apiClient.escapeString(webhookId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(Interceptor.Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api-key", "partner-key" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private Call getWebhookValidateBeforeCall(Long webhookId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'webhookId' is set
        if (webhookId == null) {
            throw new ApiException("Missing the required parameter 'webhookId' when calling getWebhook(Async)");
        }
        

        Call call = getWebhookCall(webhookId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a webhook details
     * 
     * @param webhookId Id of the webhook (required)
     * @return GetWebhook
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetWebhook getWebhook(Long webhookId) throws ApiException {
        ApiResponse<GetWebhook> resp = getWebhookWithHttpInfo(webhookId);
        return resp.getData();
    }

    /**
     * Get a webhook details
     * 
     * @param webhookId Id of the webhook (required)
     * @return ApiResponse&lt;GetWebhook&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetWebhook> getWebhookWithHttpInfo(Long webhookId) throws ApiException {
        Call call = getWebhookValidateBeforeCall(webhookId, null, null);
        Type localVarReturnType = new TypeToken<GetWebhook>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a webhook details (asynchronously)
     * 
     * @param webhookId Id of the webhook (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call getWebhookAsync(Long webhookId, final ApiCallback<GetWebhook> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        Call call = getWebhookValidateBeforeCall(webhookId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetWebhook>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getWebhooks
     * @param type Filter on webhook type (optional, default to transactional)
     * @param sort Sort the results in the ascending/descending order of webhook creation (optional, default to desc)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call getWebhooksCall(String type, String sort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/webhooks";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (type != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("type", type));
        if (sort != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sort", sort));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(Interceptor.Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api-key", "partner-key" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private Call getWebhooksValidateBeforeCall(String type, String sort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        Call call = getWebhooksCall(type, sort, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get all webhooks
     * 
     * @param type Filter on webhook type (optional, default to transactional)
     * @param sort Sort the results in the ascending/descending order of webhook creation (optional, default to desc)
     * @return GetWebhooks
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetWebhooks getWebhooks(String type, String sort) throws ApiException {
        ApiResponse<GetWebhooks> resp = getWebhooksWithHttpInfo(type, sort);
        return resp.getData();
    }

    /**
     * Get all webhooks
     * 
     * @param type Filter on webhook type (optional, default to transactional)
     * @param sort Sort the results in the ascending/descending order of webhook creation (optional, default to desc)
     * @return ApiResponse&lt;GetWebhooks&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetWebhooks> getWebhooksWithHttpInfo(String type, String sort) throws ApiException {
        Call call = getWebhooksValidateBeforeCall(type, sort, null, null);
        Type localVarReturnType = new TypeToken<GetWebhooks>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all webhooks (asynchronously)
     * 
     * @param type Filter on webhook type (optional, default to transactional)
     * @param sort Sort the results in the ascending/descending order of webhook creation (optional, default to desc)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call getWebhooksAsync(String type, String sort, final ApiCallback<GetWebhooks> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        Call call = getWebhooksValidateBeforeCall(type, sort, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetWebhooks>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateWebhook
     * @param webhookId Id of the webhook (required)
     * @param updateWebhook Values to update a webhook (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call updateWebhookCall(Long webhookId, UpdateWebhook updateWebhook, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = updateWebhook;

        // create path and map variables
        String localVarPath = "/webhooks/{webhookId}"
            .replaceAll("\\{" + "webhookId" + "\\}", apiClient.escapeString(webhookId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(Interceptor.Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api-key", "partner-key" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private Call updateWebhookValidateBeforeCall(Long webhookId, UpdateWebhook updateWebhook, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'webhookId' is set
        if (webhookId == null) {
            throw new ApiException("Missing the required parameter 'webhookId' when calling updateWebhook(Async)");
        }
        
        // verify the required parameter 'updateWebhook' is set
        if (updateWebhook == null) {
            throw new ApiException("Missing the required parameter 'updateWebhook' when calling updateWebhook(Async)");
        }
        

        Call call = updateWebhookCall(webhookId, updateWebhook, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update a webhook
     * 
     * @param webhookId Id of the webhook (required)
     * @param updateWebhook Values to update a webhook (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void updateWebhook(Long webhookId, UpdateWebhook updateWebhook) throws ApiException {
        updateWebhookWithHttpInfo(webhookId, updateWebhook);
    }

    /**
     * Update a webhook
     * 
     * @param webhookId Id of the webhook (required)
     * @param updateWebhook Values to update a webhook (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> updateWebhookWithHttpInfo(Long webhookId, UpdateWebhook updateWebhook) throws ApiException {
        Call call = updateWebhookValidateBeforeCall(webhookId, updateWebhook, null, null);
        return apiClient.execute(call);
    }

    /**
     * Update a webhook (asynchronously)
     * 
     * @param webhookId Id of the webhook (required)
     * @param updateWebhook Values to update a webhook (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call updateWebhookAsync(Long webhookId, UpdateWebhook updateWebhook, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        Call call = updateWebhookValidateBeforeCall(webhookId, updateWebhook, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}

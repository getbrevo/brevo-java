
# OrderBatch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orders** | [**List&lt;Order&gt;**](Order.md) | array of order objects | 
**notifyUrl** | **String** | Notify Url provided by client to get the status of batch request |  [optional]
**historical** | **Boolean** | Defines wether you want your orders to be considered as live data or as historical data (import of past data, synchronising data). True: orders will not trigger any automation workflows. False: orders will trigger workflows as usual. |  [optional]




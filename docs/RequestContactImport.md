
# RequestContactImport

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fileUrl** | **String** | Mandatory if fileBody or jsonBody is not defined. URL of the file to be imported (no local file). Possible file formats: .txt, .csv, .json |  [optional]
**fileBody** | **String** | Mandatory if fileUrl and jsonBody is not defined. CSV content to be imported. Use semicolon to separate multiple attributes. Maximum allowed file body size is 10MB . However we recommend a safe limit of around 8 MB to avoid the issues caused due to increase of file body size while parsing. Please use fileUrl instead to import bigger files. |  [optional]
**jsonBody** | [**List&lt;RequestContactImportJsonBody&gt;**](RequestContactImportJsonBody.md) | **Mandatory if fileUrl and fileBody is not defined.** JSON content to be imported. **Maximum allowed json body size is 10MB** . However we recommend a safe limit of around 8 MB to avoid the issues caused due to increase of json body size while parsing. Please use fileUrl instead to import bigger files.  |  [optional]
**listIds** | **List&lt;Long&gt;** | Mandatory if newList is not defined. Ids of the lists in which the contacts shall be imported. For example, [2, 4, 7]. |  [optional]
**notifyUrl** | **String** | URL that will be called once the import process is finished. For reference, https://help.brevo.com/hc/en-us/articles/360007666479 |  [optional]
**newList** | [**RequestContactImportNewList**](RequestContactImportNewList.md) |  |  [optional]
**emailBlacklist** | **Boolean** | To blacklist all the contacts for email |  [optional]
**disableNotification** | **Boolean** | To disable email notification |  [optional]
**smsBlacklist** | **Boolean** | To blacklist all the contacts for sms |  [optional]
**updateExistingContacts** | **Boolean** | To facilitate the choice to update the existing contacts |  [optional]
**emptyContactsAttributes** | **Boolean** | To facilitate the choice to erase any attribute of the existing contacts with empty value. emptyContactsAttributes &#x3D; true means the empty fields in your import will erase any attribute that currently contain data in Brevo, &amp; emptyContactsAttributes &#x3D; false means the empty fields will not affect your existing data ( only available if &#x60;updateExistingContacts&#x60; set to true ) |  [optional]




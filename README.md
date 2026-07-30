# Brevo's API v3 Java Library

Brevo's API exposes the entire SendinBlue features via a standardized programmatic interface. Please refer to the full [documentation](https://developers.brevo.com) to learn more.

This is the wrapper for the API. It implements all the features of the API v3.

Brevo's API matches the [OpenAPI v2 definition](https://www.openapis.org/). The specification can be downloaded [here](https://api.brevo.com/v3/swagger_definition.yml).

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.brevo</groupId>
  <artifactId>brevo</artifactId>
  <version>1.1.10</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.brevo:brevo:1.1.10"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/brevo-1.1.10.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import brevo.*;
import okhttp3.*;
import brevo.auth.*;
import brevoModel.*;
import brevoApi.AccountApi;

import java.io.File;
import java.util.*;

public class AccountApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: api-key
        ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("api-key");
        apiKey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKey.setApiKeyPrefix("Token");

        // Configure API key authorization: partner-key
        ApiKeyAuth partnerKey = (ApiKeyAuth) defaultClient.getAuthentication("partner-key");
        partnerKey.setApiKey("YOUR PARTNER KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //partnerKey.setApiKeyPrefix("Token");

        AccountApi apiInstance = new AccountApi();
        try {
            GetAccount result = apiInstance.getAccount();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#getAccount");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.brevo.com/v3*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountApi* | [**getAccount**](docs/AccountApi.md#getAccount) | **GET** /account | Get your account information, plan and credits details
*AccountApi* | [**getAccountActivity**](docs/AccountApi.md#getAccountActivity) | **GET** /organization/activities | Get user activity logs
*BalanceApi* | [**beginTransaction**](docs/BalanceApi.md#beginTransaction) | **POST** /loyalty/balance/programs/{pid}/transactions | Create new transaction
*BalanceApi* | [**cancelTransaction**](docs/BalanceApi.md#cancelTransaction) | **POST** /loyalty/balance/programs/{pid}/transactions/{tid}/cancel | Cancel transaction
*BalanceApi* | [**completeTransaction**](docs/BalanceApi.md#completeTransaction) | **POST** /loyalty/balance/programs/{pid}/transactions/{tid}/complete | Complete transaction
*BalanceApi* | [**createBalanceLimit**](docs/BalanceApi.md#createBalanceLimit) | **POST** /loyalty/balance/programs/{pid}/balance-definitions/{bdid}/limits | Create balance limits
*BalanceApi* | [**createBalanceOrder**](docs/BalanceApi.md#createBalanceOrder) | **POST** /loyalty/balance/programs/{pid}/create-order | Create balance order
*BalanceApi* | [**deleteBalanceDefinition**](docs/BalanceApi.md#deleteBalanceDefinition) | **DELETE** /loyalty/balance/programs/{pid}/balance-definitions/{bdid} | Delete balance definition
*BalanceApi* | [**deleteBalanceLimit**](docs/BalanceApi.md#deleteBalanceLimit) | **DELETE** /loyalty/balance/programs/{pid}/balance-definitions/{bdid}/limits/{blid} | Delete balance limit
*BalanceApi* | [**getBalanceDefinition**](docs/BalanceApi.md#getBalanceDefinition) | **GET** /loyalty/balance/programs/{pid}/balance-definitions/{bdid} | Get balance definition
*BalanceApi* | [**getBalanceDefinitionList**](docs/BalanceApi.md#getBalanceDefinitionList) | **GET** /loyalty/balance/programs/{pid}/balance-definitions | Get balance definition list
*BalanceApi* | [**getBalanceLimit**](docs/BalanceApi.md#getBalanceLimit) | **GET** /loyalty/balance/programs/{pid}/balance-definitions/{bdid}/limits/{blid} | Get balance limits
*BalanceApi* | [**getContactBalances**](docs/BalanceApi.md#getContactBalances) | **GET** /loyalty/balance/programs/{pid}/contact-balances | Get balance list
*BalanceApi* | [**getSubscriptionBalances**](docs/BalanceApi.md#getSubscriptionBalances) | **GET** /loyalty/balance/programs/{pid}/subscriptions/{cid}/balances | Get subscription balances
*BalanceApi* | [**loyaltyBalanceProgramsPidActiveBalanceGet**](docs/BalanceApi.md#loyaltyBalanceProgramsPidActiveBalanceGet) | **GET** /loyalty/balance/programs/{pid}/active-balance | Get Active Balances API
*BalanceApi* | [**loyaltyBalanceProgramsPidBalanceDefinitionsPost**](docs/BalanceApi.md#loyaltyBalanceProgramsPidBalanceDefinitionsPost) | **POST** /loyalty/balance/programs/{pid}/balance-definitions | Create balance definition
*BalanceApi* | [**loyaltyBalanceProgramsPidSubscriptionsCidBalancesPost**](docs/BalanceApi.md#loyaltyBalanceProgramsPidSubscriptionsCidBalancesPost) | **POST** /loyalty/balance/programs/{pid}/subscriptions/{cid}/balances | Create subscription balances
*BalanceApi* | [**loyaltyBalanceProgramsPidTransactionHistoryGet**](docs/BalanceApi.md#loyaltyBalanceProgramsPidTransactionHistoryGet) | **GET** /loyalty/balance/programs/{pid}/transaction-history | Get Transaction History API
*BalanceApi* | [**updateBalanceDefinition**](docs/BalanceApi.md#updateBalanceDefinition) | **PUT** /loyalty/balance/programs/{pid}/balance-definitions/{bdid} | Update balance definition
*BalanceApi* | [**updateBalanceLimit**](docs/BalanceApi.md#updateBalanceLimit) | **PUT** /loyalty/balance/programs/{pid}/balance-definitions/{bdid}/limits/{blid} | Updates balance limit
*CompaniesApi* | [**companiesGet**](docs/CompaniesApi.md#companiesGet) | **GET** /companies | Get all companies
*CompaniesApi* | [**companiesIdDelete**](docs/CompaniesApi.md#companiesIdDelete) | **DELETE** /companies/{id} | Delete a company
*CompaniesApi* | [**companiesIdGet**](docs/CompaniesApi.md#companiesIdGet) | **GET** /companies/{id} | Get a company
*CompaniesApi* | [**companiesIdPatch**](docs/CompaniesApi.md#companiesIdPatch) | **PATCH** /companies/{id} | Update a company
*CompaniesApi* | [**companiesImportPost**](docs/CompaniesApi.md#companiesImportPost) | **POST** /companies/import | Import companies(creation and updation)
*CompaniesApi* | [**companiesLinkUnlinkIdPatch**](docs/CompaniesApi.md#companiesLinkUnlinkIdPatch) | **PATCH** /companies/link-unlink/{id} | Link and Unlink company with contacts and deals
*CompaniesApi* | [**companiesPost**](docs/CompaniesApi.md#companiesPost) | **POST** /companies | Create a company
*CompaniesApi* | [**crmAttributesCompaniesGet**](docs/CompaniesApi.md#crmAttributesCompaniesGet) | **GET** /crm/attributes/companies | Get company attributes
*CompaniesApi* | [**crmAttributesPost**](docs/CompaniesApi.md#crmAttributesPost) | **POST** /crm/attributes | Create a deal/company attribute
*ContactsApi* | [**addContactToList**](docs/ContactsApi.md#addContactToList) | **POST** /contacts/lists/{listId}/contacts/add | Add existing contacts to a list
*ContactsApi* | [**createAttribute**](docs/ContactsApi.md#createAttribute) | **POST** /contacts/attributes/{attributeCategory}/{attributeName} | Create contact attribute
*ContactsApi* | [**createContact**](docs/ContactsApi.md#createContact) | **POST** /contacts | Create a contact
*ContactsApi* | [**createDoiContact**](docs/ContactsApi.md#createDoiContact) | **POST** /contacts/doubleOptinConfirmation | Create Contact via DOI (Double-Opt-In) Flow
*ContactsApi* | [**createFolder**](docs/ContactsApi.md#createFolder) | **POST** /contacts/folders | Create a folder
*ContactsApi* | [**createList**](docs/ContactsApi.md#createList) | **POST** /contacts/lists | Create a list
*ContactsApi* | [**deleteAttribute**](docs/ContactsApi.md#deleteAttribute) | **DELETE** /contacts/attributes/{attributeCategory}/{attributeName} | Delete an attribute
*ContactsApi* | [**deleteContact**](docs/ContactsApi.md#deleteContact) | **DELETE** /contacts/{identifier} | Delete a contact
*ContactsApi* | [**deleteFolder**](docs/ContactsApi.md#deleteFolder) | **DELETE** /contacts/folders/{folderId} | Delete a folder (and all its lists)
*ContactsApi* | [**deleteList**](docs/ContactsApi.md#deleteList) | **DELETE** /contacts/lists/{listId} | Delete a list
*ContactsApi* | [**deleteMultiAttributeOptions**](docs/ContactsApi.md#deleteMultiAttributeOptions) | **DELETE** /contacts/attributes/{attributeType}/{multipleChoiceAttribute}/{multipleChoiceAttributeOption} | Delete a multiple-choice attribute option
*ContactsApi* | [**getAttributes**](docs/ContactsApi.md#getAttributes) | **GET** /contacts/attributes | List all attributes
*ContactsApi* | [**getContactInfo**](docs/ContactsApi.md#getContactInfo) | **GET** /contacts/{identifier} | Get a contact&#39;s details
*ContactsApi* | [**getContactStats**](docs/ContactsApi.md#getContactStats) | **GET** /contacts/{identifier}/campaignStats | Get email campaigns&#39; statistics for a contact
*ContactsApi* | [**getContacts**](docs/ContactsApi.md#getContacts) | **GET** /contacts | Get all the contacts
*ContactsApi* | [**getContactsFromList**](docs/ContactsApi.md#getContactsFromList) | **GET** /contacts/lists/{listId}/contacts | Get contacts in a list
*ContactsApi* | [**getFolder**](docs/ContactsApi.md#getFolder) | **GET** /contacts/folders/{folderId} | Returns a folder&#39;s details
*ContactsApi* | [**getFolderLists**](docs/ContactsApi.md#getFolderLists) | **GET** /contacts/folders/{folderId}/lists | Get lists in a folder
*ContactsApi* | [**getFolders**](docs/ContactsApi.md#getFolders) | **GET** /contacts/folders | Get all folders
*ContactsApi* | [**getList**](docs/ContactsApi.md#getList) | **GET** /contacts/lists/{listId} | Get a list&#39;s details
*ContactsApi* | [**getLists**](docs/ContactsApi.md#getLists) | **GET** /contacts/lists | Get all the lists
*ContactsApi* | [**getSegments**](docs/ContactsApi.md#getSegments) | **GET** /contacts/segments | Get all the Segments
*ContactsApi* | [**importContacts**](docs/ContactsApi.md#importContacts) | **POST** /contacts/import | Import contacts
*ContactsApi* | [**removeContactFromList**](docs/ContactsApi.md#removeContactFromList) | **POST** /contacts/lists/{listId}/contacts/remove | Delete a contact from a list
*ContactsApi* | [**requestContactExport**](docs/ContactsApi.md#requestContactExport) | **POST** /contacts/export | Export contacts
*ContactsApi* | [**updateAttribute**](docs/ContactsApi.md#updateAttribute) | **PUT** /contacts/attributes/{attributeCategory}/{attributeName} | Update contact attribute
*ContactsApi* | [**updateBatchContacts**](docs/ContactsApi.md#updateBatchContacts) | **POST** /contacts/batch | Update multiple contacts
*ContactsApi* | [**updateContact**](docs/ContactsApi.md#updateContact) | **PUT** /contacts/{identifier} | Update a contact
*ContactsApi* | [**updateFolder**](docs/ContactsApi.md#updateFolder) | **PUT** /contacts/folders/{folderId} | Update a folder
*ContactsApi* | [**updateList**](docs/ContactsApi.md#updateList) | **PUT** /contacts/lists/{listId} | Update a list
*ConversationsApi* | [**conversationsAgentOnlinePingPost**](docs/ConversationsApi.md#conversationsAgentOnlinePingPost) | **POST** /conversations/agentOnlinePing | Sets agent’s status to online for 2-3 minutes
*ConversationsApi* | [**conversationsMessagesIdDelete**](docs/ConversationsApi.md#conversationsMessagesIdDelete) | **DELETE** /conversations/messages/{id} | Delete a message sent by an agent
*ConversationsApi* | [**conversationsMessagesIdGet**](docs/ConversationsApi.md#conversationsMessagesIdGet) | **GET** /conversations/messages/{id} | Get a message
*ConversationsApi* | [**conversationsMessagesIdPut**](docs/ConversationsApi.md#conversationsMessagesIdPut) | **PUT** /conversations/messages/{id} | Update a message sent by an agent
*ConversationsApi* | [**conversationsMessagesPost**](docs/ConversationsApi.md#conversationsMessagesPost) | **POST** /conversations/messages | Send a message as an agent
*ConversationsApi* | [**conversationsPushedMessagesIdDelete**](docs/ConversationsApi.md#conversationsPushedMessagesIdDelete) | **DELETE** /conversations/pushedMessages/{id} | Delete an automated message
*ConversationsApi* | [**conversationsPushedMessagesIdGet**](docs/ConversationsApi.md#conversationsPushedMessagesIdGet) | **GET** /conversations/pushedMessages/{id} | Get an automated message
*ConversationsApi* | [**conversationsPushedMessagesIdPut**](docs/ConversationsApi.md#conversationsPushedMessagesIdPut) | **PUT** /conversations/pushedMessages/{id} | Update an automated message
*ConversationsApi* | [**conversationsPushedMessagesPost**](docs/ConversationsApi.md#conversationsPushedMessagesPost) | **POST** /conversations/pushedMessages | Send an automated message to a visitor
*CouponsApi* | [**createCouponCollection**](docs/CouponsApi.md#createCouponCollection) | **POST** /couponCollections | Create а coupon collection
*CouponsApi* | [**createCoupons**](docs/CouponsApi.md#createCoupons) | **POST** /coupons | Create coupons for a coupon collection
*CouponsApi* | [**getCouponCollection**](docs/CouponsApi.md#getCouponCollection) | **GET** /couponCollections/{id} | Get a coupon collection by id
*CouponsApi* | [**getCouponCollections**](docs/CouponsApi.md#getCouponCollections) | **GET** /couponCollections | Get all your coupon collections
*CouponsApi* | [**updateCouponCollection**](docs/CouponsApi.md#updateCouponCollection) | **PATCH** /couponCollections/{id} | Update a coupon collection by id
*DealsApi* | [**crmAttributesDealsGet**](docs/DealsApi.md#crmAttributesDealsGet) | **GET** /crm/attributes/deals | Get deal attributes
*DealsApi* | [**crmAttributesPost**](docs/DealsApi.md#crmAttributesPost) | **POST** /crm/attributes | Create a deal/company attribute
*DealsApi* | [**crmDealsGet**](docs/DealsApi.md#crmDealsGet) | **GET** /crm/deals | Get all deals
*DealsApi* | [**crmDealsIdDelete**](docs/DealsApi.md#crmDealsIdDelete) | **DELETE** /crm/deals/{id} | Delete a deal
*DealsApi* | [**crmDealsIdGet**](docs/DealsApi.md#crmDealsIdGet) | **GET** /crm/deals/{id} | Get a deal
*DealsApi* | [**crmDealsIdPatch**](docs/DealsApi.md#crmDealsIdPatch) | **PATCH** /crm/deals/{id} | Update a deal
*DealsApi* | [**crmDealsImportPost**](docs/DealsApi.md#crmDealsImportPost) | **POST** /crm/deals/import | Import deals(creation and updation)
*DealsApi* | [**crmDealsLinkUnlinkIdPatch**](docs/DealsApi.md#crmDealsLinkUnlinkIdPatch) | **PATCH** /crm/deals/link-unlink/{id} | Link and Unlink a deal with contacts and companies
*DealsApi* | [**crmDealsPost**](docs/DealsApi.md#crmDealsPost) | **POST** /crm/deals | Create a deal
*DealsApi* | [**crmPipelineDetailsAllGet**](docs/DealsApi.md#crmPipelineDetailsAllGet) | **GET** /crm/pipeline/details/all | Get all pipelines
*DealsApi* | [**crmPipelineDetailsGet**](docs/DealsApi.md#crmPipelineDetailsGet) | **GET** /crm/pipeline/details | Get pipeline stages
*DealsApi* | [**crmPipelineDetailsPipelineIDGet**](docs/DealsApi.md#crmPipelineDetailsPipelineIDGet) | **GET** /crm/pipeline/details/{pipelineID} | Get a pipeline
*DomainsApi* | [**authenticateDomain**](docs/DomainsApi.md#authenticateDomain) | **PUT** /senders/domains/{domainName}/authenticate | Authenticate a domain
*DomainsApi* | [**createDomain**](docs/DomainsApi.md#createDomain) | **POST** /senders/domains | Create a new domain
*DomainsApi* | [**deleteDomain**](docs/DomainsApi.md#deleteDomain) | **DELETE** /senders/domains/{domainName} | Delete a domain
*DomainsApi* | [**getDomainConfiguration**](docs/DomainsApi.md#getDomainConfiguration) | **GET** /senders/domains/{domainName} | Validate domain configuration
*DomainsApi* | [**getDomains**](docs/DomainsApi.md#getDomains) | **GET** /senders/domains | Get the list of all your domains
*EcommerceApi* | [**createBatchOrder**](docs/EcommerceApi.md#createBatchOrder) | **POST** /orders/status/batch | Create orders in batch
*EcommerceApi* | [**createOrder**](docs/EcommerceApi.md#createOrder) | **POST** /orders/status | Managing the status of the order
*EcommerceApi* | [**createUpdateBatchCategory**](docs/EcommerceApi.md#createUpdateBatchCategory) | **POST** /categories/batch | Create categories in batch
*EcommerceApi* | [**createUpdateBatchProducts**](docs/EcommerceApi.md#createUpdateBatchProducts) | **POST** /products/batch | Create products in batch
*EcommerceApi* | [**createUpdateCategory**](docs/EcommerceApi.md#createUpdateCategory) | **POST** /categories | Create/Update a category
*EcommerceApi* | [**createUpdateProduct**](docs/EcommerceApi.md#createUpdateProduct) | **POST** /products | Create/Update a product
*EcommerceApi* | [**ecommerceActivatePost**](docs/EcommerceApi.md#ecommerceActivatePost) | **POST** /ecommerce/activate | Activate the eCommerce app
*EcommerceApi* | [**ecommerceAttributionMetricsConversionSourceConversionSourceIdGet**](docs/EcommerceApi.md#ecommerceAttributionMetricsConversionSourceConversionSourceIdGet) | **GET** /ecommerce/attribution/metrics/{conversionSource}/{conversionSourceId} | Get detailed attribution metrics for a single Brevo campaign or workflow
*EcommerceApi* | [**ecommerceAttributionMetricsGet**](docs/EcommerceApi.md#ecommerceAttributionMetricsGet) | **GET** /ecommerce/attribution/metrics | Get attribution metrics for one or more Brevo campaigns or workflows
*EcommerceApi* | [**ecommerceAttributionProductsConversionSourceConversionSourceIdGet**](docs/EcommerceApi.md#ecommerceAttributionProductsConversionSourceConversionSourceIdGet) | **GET** /ecommerce/attribution/products/{conversionSource}/{conversionSourceId} | Get attributed product sales for a single Brevo campaign or workflow
*EcommerceApi* | [**ecommerceConfigDisplayCurrencyGet**](docs/EcommerceApi.md#ecommerceConfigDisplayCurrencyGet) | **GET** /ecommerce/config/displayCurrency | Get the ISO 4217 compliant display currency code for your Brevo account
*EcommerceApi* | [**getCategories**](docs/EcommerceApi.md#getCategories) | **GET** /categories | Return all your categories
*EcommerceApi* | [**getCategoryInfo**](docs/EcommerceApi.md#getCategoryInfo) | **GET** /categories/{id} | Get a category details
*EcommerceApi* | [**getOrders**](docs/EcommerceApi.md#getOrders) | **GET** /orders | Get order details
*EcommerceApi* | [**getProductInfo**](docs/EcommerceApi.md#getProductInfo) | **GET** /products/{id} | Get a product&#39;s details
*EcommerceApi* | [**getProducts**](docs/EcommerceApi.md#getProducts) | **GET** /products | Return all your products
*EcommerceApi* | [**setConfigDisplayCurrency**](docs/EcommerceApi.md#setConfigDisplayCurrency) | **POST** /ecommerce/config/displayCurrency | Set the ISO 4217 compliant display currency code for your Brevo account
*EmailCampaignsApi* | [**createEmailCampaign**](docs/EmailCampaignsApi.md#createEmailCampaign) | **POST** /emailCampaigns | Create an email campaign
*EmailCampaignsApi* | [**deleteEmailCampaign**](docs/EmailCampaignsApi.md#deleteEmailCampaign) | **DELETE** /emailCampaigns/{campaignId} | Delete an email campaign
*EmailCampaignsApi* | [**emailExportRecipients**](docs/EmailCampaignsApi.md#emailExportRecipients) | **POST** /emailCampaigns/{campaignId}/exportRecipients | Export the recipients of an email campaign
*EmailCampaignsApi* | [**getAbTestCampaignResult**](docs/EmailCampaignsApi.md#getAbTestCampaignResult) | **GET** /emailCampaigns/{campaignId}/abTestCampaignResult | Get an A/B test email campaign results
*EmailCampaignsApi* | [**getEmailCampaign**](docs/EmailCampaignsApi.md#getEmailCampaign) | **GET** /emailCampaigns/{campaignId} | Get an email campaign report
*EmailCampaignsApi* | [**getEmailCampaigns**](docs/EmailCampaignsApi.md#getEmailCampaigns) | **GET** /emailCampaigns | Return all your created email campaigns
*EmailCampaignsApi* | [**getSharedTemplateUrl**](docs/EmailCampaignsApi.md#getSharedTemplateUrl) | **GET** /emailCampaigns/{campaignId}/sharedUrl | Get a shared template url
*EmailCampaignsApi* | [**sendEmailCampaignNow**](docs/EmailCampaignsApi.md#sendEmailCampaignNow) | **POST** /emailCampaigns/{campaignId}/sendNow | Send an email campaign immediately, based on campaignId
*EmailCampaignsApi* | [**sendReport**](docs/EmailCampaignsApi.md#sendReport) | **POST** /emailCampaigns/{campaignId}/sendReport | Send the report of a campaign
*EmailCampaignsApi* | [**sendTestEmail**](docs/EmailCampaignsApi.md#sendTestEmail) | **POST** /emailCampaigns/{campaignId}/sendTest | Send an email campaign to your test list
*EmailCampaignsApi* | [**updateCampaignStatus**](docs/EmailCampaignsApi.md#updateCampaignStatus) | **PUT** /emailCampaigns/{campaignId}/status | Update an email campaign status
*EmailCampaignsApi* | [**updateEmailCampaign**](docs/EmailCampaignsApi.md#updateEmailCampaign) | **PUT** /emailCampaigns/{campaignId} | Update an email campaign
*EmailCampaignsApi* | [**uploadImageToGallery**](docs/EmailCampaignsApi.md#uploadImageToGallery) | **POST** /emailCampaigns/images | Upload an image to your account&#39;s image gallery
*EventsApi* | [**createEvent**](docs/EventsApi.md#createEvent) | **POST** /events | Create an event
*ExternalFeedsApi* | [**createExternalFeed**](docs/ExternalFeedsApi.md#createExternalFeed) | **POST** /feeds | Create an external feed
*ExternalFeedsApi* | [**deleteExternalFeed**](docs/ExternalFeedsApi.md#deleteExternalFeed) | **DELETE** /feeds/{uuid} | Delete an external feed
*ExternalFeedsApi* | [**getAllExternalFeeds**](docs/ExternalFeedsApi.md#getAllExternalFeeds) | **GET** /feeds | Fetch all external feeds
*ExternalFeedsApi* | [**getExternalFeedByUUID**](docs/ExternalFeedsApi.md#getExternalFeedByUUID) | **GET** /feeds/{uuid} | Get an external feed by UUID
*ExternalFeedsApi* | [**updateExternalFeed**](docs/ExternalFeedsApi.md#updateExternalFeed) | **PUT** /feeds/{uuid} | Update an external feed
*FilesApi* | [**crmFilesGet**](docs/FilesApi.md#crmFilesGet) | **GET** /crm/files | Get all files
*FilesApi* | [**crmFilesIdDataGet**](docs/FilesApi.md#crmFilesIdDataGet) | **GET** /crm/files/{id}/data | Get file details
*FilesApi* | [**crmFilesIdDelete**](docs/FilesApi.md#crmFilesIdDelete) | **DELETE** /crm/files/{id} | Delete a file
*FilesApi* | [**crmFilesIdGet**](docs/FilesApi.md#crmFilesIdGet) | **GET** /crm/files/{id} | Download a file
*FilesApi* | [**crmFilesPost**](docs/FilesApi.md#crmFilesPost) | **POST** /crm/files | Upload a file
*InboundParsingApi* | [**getInboundEmailAttachment**](docs/InboundParsingApi.md#getInboundEmailAttachment) | **GET** /inbound/attachments/{downloadToken} | Retrieve inbound attachment with download token.
*InboundParsingApi* | [**getInboundEmailEvents**](docs/InboundParsingApi.md#getInboundEmailEvents) | **GET** /inbound/events | Get the list of all the events for the received emails.
*InboundParsingApi* | [**getInboundEmailEventsByUuid**](docs/InboundParsingApi.md#getInboundEmailEventsByUuid) | **GET** /inbound/events/{uuid} | Fetch all events history for one particular received email.
*MasterAccountApi* | [**corporateGroupIdDelete**](docs/MasterAccountApi.md#corporateGroupIdDelete) | **DELETE** /corporate/group/{id} | Delete a group
*MasterAccountApi* | [**corporateGroupIdGet**](docs/MasterAccountApi.md#corporateGroupIdGet) | **GET** /corporate/group/{id} | GET a group details
*MasterAccountApi* | [**corporateGroupIdPut**](docs/MasterAccountApi.md#corporateGroupIdPut) | **PUT** /corporate/group/{id} | Update a group of sub-accounts
*MasterAccountApi* | [**corporateGroupPost**](docs/MasterAccountApi.md#corporateGroupPost) | **POST** /corporate/group | Create a new group of sub-accounts
*MasterAccountApi* | [**corporateGroupUnlinkGroupIdSubAccountsPut**](docs/MasterAccountApi.md#corporateGroupUnlinkGroupIdSubAccountsPut) | **PUT** /corporate/group/unlink/{groupId}/subAccounts | Delete sub-account from group
*MasterAccountApi* | [**corporateIpGet**](docs/MasterAccountApi.md#corporateIpGet) | **GET** /corporate/ip | List of all IPs
*MasterAccountApi* | [**corporateMasterAccountGet**](docs/MasterAccountApi.md#corporateMasterAccountGet) | **GET** /corporate/masterAccount | Get the details of requested master account
*MasterAccountApi* | [**corporateSsoTokenPost**](docs/MasterAccountApi.md#corporateSsoTokenPost) | **POST** /corporate/ssoToken | Generate SSO token to access admin account
*MasterAccountApi* | [**corporateSubAccountGet**](docs/MasterAccountApi.md#corporateSubAccountGet) | **GET** /corporate/subAccount | Get the list of all the sub-accounts of the master account.
*MasterAccountApi* | [**corporateSubAccountIdApplicationsTogglePut**](docs/MasterAccountApi.md#corporateSubAccountIdApplicationsTogglePut) | **PUT** /corporate/subAccount/{id}/applications/toggle | Enable/disable sub-account application(s)
*MasterAccountApi* | [**corporateSubAccountIdDelete**](docs/MasterAccountApi.md#corporateSubAccountIdDelete) | **DELETE** /corporate/subAccount/{id} | Delete a sub-account
*MasterAccountApi* | [**corporateSubAccountIdGet**](docs/MasterAccountApi.md#corporateSubAccountIdGet) | **GET** /corporate/subAccount/{id} | Get sub-account details
*MasterAccountApi* | [**corporateSubAccountIdPlanPut**](docs/MasterAccountApi.md#corporateSubAccountIdPlanPut) | **PUT** /corporate/subAccount/{id}/plan | Update sub-account plan
*MasterAccountApi* | [**corporateSubAccountIpAssociatePost**](docs/MasterAccountApi.md#corporateSubAccountIpAssociatePost) | **POST** /corporate/subAccount/ip/associate | Associate an IP to sub-accounts
*MasterAccountApi* | [**corporateSubAccountIpDissociatePut**](docs/MasterAccountApi.md#corporateSubAccountIpDissociatePut) | **PUT** /corporate/subAccount/ip/dissociate | Dissociate an IP from sub-accounts
*MasterAccountApi* | [**corporateSubAccountKeyPost**](docs/MasterAccountApi.md#corporateSubAccountKeyPost) | **POST** /corporate/subAccount/key | Create an API key for a sub-account
*MasterAccountApi* | [**corporateSubAccountPost**](docs/MasterAccountApi.md#corporateSubAccountPost) | **POST** /corporate/subAccount | Create a new sub-account under a master account.
*MasterAccountApi* | [**corporateSubAccountSsoTokenPost**](docs/MasterAccountApi.md#corporateSubAccountSsoTokenPost) | **POST** /corporate/subAccount/ssoToken | Generate SSO token to access sub-account
*MasterAccountApi* | [**corporateSubAccountsPlanPut**](docs/MasterAccountApi.md#corporateSubAccountsPlanPut) | **PUT** /corporate/subAccounts/plan | Update sub-accounts plan
*MasterAccountApi* | [**corporateUserEmailPermissionsPut**](docs/MasterAccountApi.md#corporateUserEmailPermissionsPut) | **PUT** /corporate/user/{email}/permissions | Change admin user permissions
*MasterAccountApi* | [**corporateUserInvitationActionEmailPut**](docs/MasterAccountApi.md#corporateUserInvitationActionEmailPut) | **PUT** /corporate/user/invitation/{action}/{email} | Resend / cancel admin user invitation
*MasterAccountApi* | [**corporateUserRevokeEmailDelete**](docs/MasterAccountApi.md#corporateUserRevokeEmailDelete) | **DELETE** /corporate/user/revoke/{email} | Revoke an admin user
*MasterAccountApi* | [**getAccountActivity**](docs/MasterAccountApi.md#getAccountActivity) | **GET** /organization/activities | Get user activity logs
*MasterAccountApi* | [**getCorporateInvitedUsersList**](docs/MasterAccountApi.md#getCorporateInvitedUsersList) | **GET** /corporate/invited/users | Get the list of all admin users
*MasterAccountApi* | [**getCorporateUserPermission**](docs/MasterAccountApi.md#getCorporateUserPermission) | **GET** /corporate/user/{email}/permissions | Check admin user permissions
*MasterAccountApi* | [**getSubAccountGroups**](docs/MasterAccountApi.md#getSubAccountGroups) | **GET** /corporate/groups | Get the list of groups
*MasterAccountApi* | [**inviteAdminUser**](docs/MasterAccountApi.md#inviteAdminUser) | **POST** /corporate/user/invitation/send | Send invitation to an admin user
*NotesApi* | [**crmNotesGet**](docs/NotesApi.md#crmNotesGet) | **GET** /crm/notes | Get all notes
*NotesApi* | [**crmNotesIdDelete**](docs/NotesApi.md#crmNotesIdDelete) | **DELETE** /crm/notes/{id} | Delete a note
*NotesApi* | [**crmNotesIdGet**](docs/NotesApi.md#crmNotesIdGet) | **GET** /crm/notes/{id} | Get a note
*NotesApi* | [**crmNotesIdPatch**](docs/NotesApi.md#crmNotesIdPatch) | **PATCH** /crm/notes/{id} | Update a note
*NotesApi* | [**crmNotesPost**](docs/NotesApi.md#crmNotesPost) | **POST** /crm/notes | Create a note
*PaymentsApi* | [**createPaymentRequest**](docs/PaymentsApi.md#createPaymentRequest) | **POST** /payments/requests | Create a payment request
*PaymentsApi* | [**deletePaymentRequest**](docs/PaymentsApi.md#deletePaymentRequest) | **DELETE** /payments/requests/{id} | Delete a payment request.
*PaymentsApi* | [**getPaymentRequest**](docs/PaymentsApi.md#getPaymentRequest) | **GET** /payments/requests/{id} | Get payment request details
*ProcessApi* | [**getProcess**](docs/ProcessApi.md#getProcess) | **GET** /processes/{processId} | Return the informations for a process
*ProcessApi* | [**getProcesses**](docs/ProcessApi.md#getProcesses) | **GET** /processes | Return all the processes for your account
*ProgramApi* | [**createNewLP**](docs/ProgramApi.md#createNewLP) | **POST** /loyalty/config/programs | Create loyalty program
*ProgramApi* | [**deleteContactMembers**](docs/ProgramApi.md#deleteContactMembers) | **DELETE** /loyalty/config/programs/{pid}/subscription-members | Delete subscription member
*ProgramApi* | [**deleteLoyaltyProgram**](docs/ProgramApi.md#deleteLoyaltyProgram) | **DELETE** /loyalty/config/programs/{pid} | Delete Loyalty Program
*ProgramApi* | [**getLPList**](docs/ProgramApi.md#getLPList) | **GET** /loyalty/config/programs | Get loyalty program list
*ProgramApi* | [**getLoyaltyProgramInfo**](docs/ProgramApi.md#getLoyaltyProgramInfo) | **GET** /loyalty/config/programs/{pid} | Get loyalty program Info
*ProgramApi* | [**getParameterSubscriptionInfo**](docs/ProgramApi.md#getParameterSubscriptionInfo) | **GET** /loyalty/config/programs/{pid}/account-info | Get Subscription Data
*ProgramApi* | [**loyaltyConfigProgramsPidContactCidDelete**](docs/ProgramApi.md#loyaltyConfigProgramsPidContactCidDelete) | **DELETE** /loyalty/config/programs/{pid}/contact/{cid} | Delete subscription
*ProgramApi* | [**partiallyUpdateLoyaltyProgram**](docs/ProgramApi.md#partiallyUpdateLoyaltyProgram) | **PATCH** /loyalty/config/programs/{pid} | Partially update loyalty program
*ProgramApi* | [**publishLoyaltyProgram**](docs/ProgramApi.md#publishLoyaltyProgram) | **POST** /loyalty/config/programs/{pid}/publish | Publish loyalty program
*ProgramApi* | [**subscribeMemberToASubscription**](docs/ProgramApi.md#subscribeMemberToASubscription) | **POST** /loyalty/config/programs/{pid}/subscription-members | Create subscription member
*ProgramApi* | [**subscribeToLoyaltyProgram**](docs/ProgramApi.md#subscribeToLoyaltyProgram) | **POST** /loyalty/config/programs/{pid}/subscriptions | Create subscription
*ProgramApi* | [**updateLoyaltyProgram**](docs/ProgramApi.md#updateLoyaltyProgram) | **PUT** /loyalty/config/programs/{pid} | Update loyalty program
*RewardApi* | [**getCodeCount**](docs/RewardApi.md#getCodeCount) | **GET** /loyalty/offer/programs/{pid}/code-pools/{cpid}/codes-count | Get code count
*RewardApi* | [**loyaltyOfferProgramsPidOffersGet**](docs/RewardApi.md#loyaltyOfferProgramsPidOffersGet) | **GET** /loyalty/offer/programs/{pid}/offers | Get Reward Page API
*RewardApi* | [**loyaltyOfferProgramsPidOffersPost**](docs/RewardApi.md#loyaltyOfferProgramsPidOffersPost) | **POST** /loyalty/offer/programs/{pid}/offers | Create a reward
*RewardApi* | [**loyaltyOfferProgramsPidRewardsAttributePost**](docs/RewardApi.md#loyaltyOfferProgramsPidRewardsAttributePost) | **POST** /loyalty/offer/programs/{pid}/rewards/attribute | Create a voucher
*RewardApi* | [**loyaltyOfferProgramsPidRewardsRedeemPost**](docs/RewardApi.md#loyaltyOfferProgramsPidRewardsRedeemPost) | **POST** /loyalty/offer/programs/{pid}/rewards/redeem | Create redeem voucher request
*RewardApi* | [**loyaltyOfferProgramsPidRewardsRedeemTidCompletePost**](docs/RewardApi.md#loyaltyOfferProgramsPidRewardsRedeemTidCompletePost) | **POST** /loyalty/offer/programs/{pid}/rewards/redeem/{tid}/complete | Complete redeem voucher request
*RewardApi* | [**loyaltyOfferProgramsPidRewardsRevokeDelete**](docs/RewardApi.md#loyaltyOfferProgramsPidRewardsRevokeDelete) | **DELETE** /loyalty/offer/programs/{pid}/rewards/revoke | Revoke vouchers
*RewardApi* | [**loyaltyOfferProgramsPidRewardsRidGet**](docs/RewardApi.md#loyaltyOfferProgramsPidRewardsRidGet) | **GET** /loyalty/offer/programs/{pid}/rewards/{rid} | Get reward information
*RewardApi* | [**loyaltyOfferProgramsPidRewardsValidatePost**](docs/RewardApi.md#loyaltyOfferProgramsPidRewardsValidatePost) | **POST** /loyalty/offer/programs/{pid}/rewards/validate | Validate a reward
*RewardApi* | [**loyaltyOfferProgramsPidVouchersGet**](docs/RewardApi.md#loyaltyOfferProgramsPidVouchersGet) | **GET** /loyalty/offer/programs/{pid}/vouchers | Get voucher for a contact
*SendersApi* | [**createSender**](docs/SendersApi.md#createSender) | **POST** /senders | Create a new sender
*SendersApi* | [**deleteSender**](docs/SendersApi.md#deleteSender) | **DELETE** /senders/{senderId} | Delete a sender
*SendersApi* | [**getIps**](docs/SendersApi.md#getIps) | **GET** /senders/ips | Get all the dedicated IPs for your account
*SendersApi* | [**getIpsFromSender**](docs/SendersApi.md#getIpsFromSender) | **GET** /senders/{senderId}/ips | Get all the dedicated IPs for a sender
*SendersApi* | [**getSenders**](docs/SendersApi.md#getSenders) | **GET** /senders | Get the list of all your senders
*SendersApi* | [**updateSender**](docs/SendersApi.md#updateSender) | **PUT** /senders/{senderId} | Update a sender
*SendersApi* | [**validateSenderByOTP**](docs/SendersApi.md#validateSenderByOTP) | **PUT** /senders/{senderId}/validate | Update a sender
*SmsCampaignsApi* | [**createSmsCampaign**](docs/SmsCampaignsApi.md#createSmsCampaign) | **POST** /smsCampaigns | Creates an SMS campaign
*SmsCampaignsApi* | [**deleteSmsCampaign**](docs/SmsCampaignsApi.md#deleteSmsCampaign) | **DELETE** /smsCampaigns/{campaignId} | Delete an SMS campaign
*SmsCampaignsApi* | [**getSmsCampaign**](docs/SmsCampaignsApi.md#getSmsCampaign) | **GET** /smsCampaigns/{campaignId} | Get an SMS campaign
*SmsCampaignsApi* | [**getSmsCampaigns**](docs/SmsCampaignsApi.md#getSmsCampaigns) | **GET** /smsCampaigns | Returns the information for all your created SMS campaigns
*SmsCampaignsApi* | [**requestSmsRecipientExport**](docs/SmsCampaignsApi.md#requestSmsRecipientExport) | **POST** /smsCampaigns/{campaignId}/exportRecipients | Export an SMS campaign&#39;s recipients
*SmsCampaignsApi* | [**sendSmsCampaignNow**](docs/SmsCampaignsApi.md#sendSmsCampaignNow) | **POST** /smsCampaigns/{campaignId}/sendNow | Send your SMS campaign immediately
*SmsCampaignsApi* | [**sendSmsReport**](docs/SmsCampaignsApi.md#sendSmsReport) | **POST** /smsCampaigns/{campaignId}/sendReport | Send an SMS campaign&#39;s report
*SmsCampaignsApi* | [**sendTestSms**](docs/SmsCampaignsApi.md#sendTestSms) | **POST** /smsCampaigns/{campaignId}/sendTest | Send a test SMS campaign
*SmsCampaignsApi* | [**updateSmsCampaign**](docs/SmsCampaignsApi.md#updateSmsCampaign) | **PUT** /smsCampaigns/{campaignId} | Update an SMS campaign
*SmsCampaignsApi* | [**updateSmsCampaignStatus**](docs/SmsCampaignsApi.md#updateSmsCampaignStatus) | **PUT** /smsCampaigns/{campaignId}/status | Update a campaign&#39;s status
*TasksApi* | [**crmTasksGet**](docs/TasksApi.md#crmTasksGet) | **GET** /crm/tasks | Get all tasks
*TasksApi* | [**crmTasksIdDelete**](docs/TasksApi.md#crmTasksIdDelete) | **DELETE** /crm/tasks/{id} | Delete a task
*TasksApi* | [**crmTasksIdGet**](docs/TasksApi.md#crmTasksIdGet) | **GET** /crm/tasks/{id} | Get a task
*TasksApi* | [**crmTasksIdPatch**](docs/TasksApi.md#crmTasksIdPatch) | **PATCH** /crm/tasks/{id} | Update a task
*TasksApi* | [**crmTasksPost**](docs/TasksApi.md#crmTasksPost) | **POST** /crm/tasks | Create a task
*TasksApi* | [**crmTasktypesGet**](docs/TasksApi.md#crmTasktypesGet) | **GET** /crm/tasktypes | Get all task types
*TierApi* | [**addSubscriptionToTier**](docs/TierApi.md#addSubscriptionToTier) | **POST** /loyalty/tier/programs/{pid}/contacts/{cid}/tiers/{tid} | Assign a tier
*TierApi* | [**createTierForTierGroup**](docs/TierApi.md#createTierForTierGroup) | **POST** /loyalty/tier/programs/{pid}/tier-groups/{gid}/tiers | Create a tier
*TierApi* | [**createTierGroup**](docs/TierApi.md#createTierGroup) | **POST** /loyalty/tier/programs/{pid}/tier-groups | Create a tier group
*TierApi* | [**deleteTier**](docs/TierApi.md#deleteTier) | **DELETE** /loyalty/tier/programs/{pid}/tiers/{tid} | Delete tier
*TierApi* | [**deleteTierGroup**](docs/TierApi.md#deleteTierGroup) | **DELETE** /loyalty/tier/programs/{pid}/tier-groups/{gid} | Delete tier group
*TierApi* | [**getListOfTierGroups**](docs/TierApi.md#getListOfTierGroups) | **GET** /loyalty/tier/programs/{pid}/tier-groups | List tier groups
*TierApi* | [**getLoyaltyProgramTier**](docs/TierApi.md#getLoyaltyProgramTier) | **GET** /loyalty/tier/programs/{pid}/tiers | List tiers
*TierApi* | [**getTierGroup**](docs/TierApi.md#getTierGroup) | **GET** /loyalty/tier/programs/{pid}/tier-groups/{gid} | Get tier group
*TierApi* | [**updateTier**](docs/TierApi.md#updateTier) | **PUT** /loyalty/tier/programs/{pid}/tiers/{tid} | Update tier
*TierApi* | [**updateTierGroup**](docs/TierApi.md#updateTierGroup) | **PUT** /loyalty/tier/programs/{pid}/tier-groups/{gid} | Update tier group
*TransactionalEmailsApi* | [**blockNewDomain**](docs/TransactionalEmailsApi.md#blockNewDomain) | **POST** /smtp/blockedDomains | Add a new domain to the list of blocked domains
*TransactionalEmailsApi* | [**createSmtpTemplate**](docs/TransactionalEmailsApi.md#createSmtpTemplate) | **POST** /smtp/templates | Create an email template
*TransactionalEmailsApi* | [**deleteBlockedDomain**](docs/TransactionalEmailsApi.md#deleteBlockedDomain) | **DELETE** /smtp/blockedDomains/{domain} | Unblock an existing domain from the list of blocked domains
*TransactionalEmailsApi* | [**deleteHardbounces**](docs/TransactionalEmailsApi.md#deleteHardbounces) | **POST** /smtp/deleteHardbounces | Delete hardbounces
*TransactionalEmailsApi* | [**deleteScheduledEmailById**](docs/TransactionalEmailsApi.md#deleteScheduledEmailById) | **DELETE** /smtp/email/{identifier} | Delete scheduled emails by batchId or messageId
*TransactionalEmailsApi* | [**deleteSmtpTemplate**](docs/TransactionalEmailsApi.md#deleteSmtpTemplate) | **DELETE** /smtp/templates/{templateId} | Delete an inactive email template
*TransactionalEmailsApi* | [**getAggregatedSmtpReport**](docs/TransactionalEmailsApi.md#getAggregatedSmtpReport) | **GET** /smtp/statistics/aggregatedReport | Get your transactional email activity aggregated over a period of time
*TransactionalEmailsApi* | [**getBlockedDomains**](docs/TransactionalEmailsApi.md#getBlockedDomains) | **GET** /smtp/blockedDomains | Get the list of blocked domains
*TransactionalEmailsApi* | [**getEmailEventReport**](docs/TransactionalEmailsApi.md#getEmailEventReport) | **GET** /smtp/statistics/events | Get all your transactional email activity (unaggregated events)
*TransactionalEmailsApi* | [**getScheduledEmailByBatchId**](docs/TransactionalEmailsApi.md#getScheduledEmailByBatchId) | **GET** /smtp/emailStatus/{batchId} | Fetch scheduled emails by batchId
*TransactionalEmailsApi* | [**getScheduledEmailByMessageId**](docs/TransactionalEmailsApi.md#getScheduledEmailByMessageId) | **GET** /smtp/emailStatus/{messageId} | Fetch scheduled email by messageId
*TransactionalEmailsApi* | [**getSmtpReport**](docs/TransactionalEmailsApi.md#getSmtpReport) | **GET** /smtp/statistics/reports | Get your transactional email activity aggregated per day
*TransactionalEmailsApi* | [**getSmtpTemplate**](docs/TransactionalEmailsApi.md#getSmtpTemplate) | **GET** /smtp/templates/{templateId} | Returns the template information
*TransactionalEmailsApi* | [**getSmtpTemplates**](docs/TransactionalEmailsApi.md#getSmtpTemplates) | **GET** /smtp/templates | Get the list of email templates
*TransactionalEmailsApi* | [**getTransacBlockedContacts**](docs/TransactionalEmailsApi.md#getTransacBlockedContacts) | **GET** /smtp/blockedContacts | Get the list of blocked or unsubscribed transactional contacts
*TransactionalEmailsApi* | [**getTransacEmailContent**](docs/TransactionalEmailsApi.md#getTransacEmailContent) | **GET** /smtp/emails/{uuid} | Get the personalized content of a sent transactional email
*TransactionalEmailsApi* | [**getTransacEmailsList**](docs/TransactionalEmailsApi.md#getTransacEmailsList) | **GET** /smtp/emails | Get the list of transactional emails on the basis of allowed filters
*TransactionalEmailsApi* | [**postPreviewSmtpEmailTemplates**](docs/TransactionalEmailsApi.md#postPreviewSmtpEmailTemplates) | **POST** /smtp/template/preview | Generate the rendered preview of transactional template
*TransactionalEmailsApi* | [**sendTestTemplate**](docs/TransactionalEmailsApi.md#sendTestTemplate) | **POST** /smtp/templates/{templateId}/sendTest | Send a template to your test list
*TransactionalEmailsApi* | [**sendTransacEmail**](docs/TransactionalEmailsApi.md#sendTransacEmail) | **POST** /smtp/email | Send a transactional email
*TransactionalEmailsApi* | [**smtpBlockedContactsEmailDelete**](docs/TransactionalEmailsApi.md#smtpBlockedContactsEmailDelete) | **DELETE** /smtp/blockedContacts/{email} | Unblock or resubscribe a transactional contact
*TransactionalEmailsApi* | [**smtpLogIdentifierDelete**](docs/TransactionalEmailsApi.md#smtpLogIdentifierDelete) | **DELETE** /smtp/log/{identifier} | Delete an SMTP transactional log
*TransactionalEmailsApi* | [**updateSmtpTemplate**](docs/TransactionalEmailsApi.md#updateSmtpTemplate) | **PUT** /smtp/templates/{templateId} | Update an email template
*TransactionalSmsApi* | [**getSmsEvents**](docs/TransactionalSmsApi.md#getSmsEvents) | **GET** /transactionalSMS/statistics/events | Get all your SMS activity (unaggregated events)
*TransactionalSmsApi* | [**getTransacAggregatedSmsReport**](docs/TransactionalSmsApi.md#getTransacAggregatedSmsReport) | **GET** /transactionalSMS/statistics/aggregatedReport | Get your SMS activity aggregated over a period of time
*TransactionalSmsApi* | [**getTransacSmsReport**](docs/TransactionalSmsApi.md#getTransacSmsReport) | **GET** /transactionalSMS/statistics/reports | Get your SMS activity aggregated per day
*TransactionalSmsApi* | [**sendAsyncTransactionalSms**](docs/TransactionalSmsApi.md#sendAsyncTransactionalSms) | **POST** /transactionalSMS/send | Send SMS message asynchronously to a mobile number
*TransactionalSmsApi* | [**sendTransacSms**](docs/TransactionalSmsApi.md#sendTransacSms) | **POST** /transactionalSMS/sms | Send SMS message to a mobile number
*TransactionalWhatsAppApi* | [**getWhatsappEventReport**](docs/TransactionalWhatsAppApi.md#getWhatsappEventReport) | **GET** /whatsapp/statistics/events | Get all your WhatsApp activity (unaggregated events)
*TransactionalWhatsAppApi* | [**sendWhatsappMessage**](docs/TransactionalWhatsAppApi.md#sendWhatsappMessage) | **POST** /whatsapp/sendMessage | Send a WhatsApp message
*UserApi* | [**editUserPermission**](docs/UserApi.md#editUserPermission) | **POST** /organization/user/update/permissions | Update permission for a user
*UserApi* | [**getInvitedUsersList**](docs/UserApi.md#getInvitedUsersList) | **GET** /organization/invited/users | Get the list of all your users
*UserApi* | [**getUserPermission**](docs/UserApi.md#getUserPermission) | **GET** /organization/user/{email}/permissions | Check user permission
*UserApi* | [**inviteuser**](docs/UserApi.md#inviteuser) | **POST** /organization/user/invitation/send | Send invitation to user
*UserApi* | [**putRevokeUserPermission**](docs/UserApi.md#putRevokeUserPermission) | **PUT** /organization/user/invitation/revoke/{email} | Revoke user permission
*UserApi* | [**putresendcancelinvitation**](docs/UserApi.md#putresendcancelinvitation) | **PUT** /organization/user/invitation/{action}/{email} | Resend / Cancel invitation
*WebhooksApi* | [**createWebhook**](docs/WebhooksApi.md#createWebhook) | **POST** /webhooks | Create a webhook
*WebhooksApi* | [**deleteWebhook**](docs/WebhooksApi.md#deleteWebhook) | **DELETE** /webhooks/{webhookId} | Delete a webhook
*WebhooksApi* | [**exportWebhooksHistory**](docs/WebhooksApi.md#exportWebhooksHistory) | **POST** /webhooks/export | Export all webhook events
*WebhooksApi* | [**getWebhook**](docs/WebhooksApi.md#getWebhook) | **GET** /webhooks/{webhookId} | Get a webhook details
*WebhooksApi* | [**getWebhooks**](docs/WebhooksApi.md#getWebhooks) | **GET** /webhooks | Get all webhooks
*WebhooksApi* | [**updateWebhook**](docs/WebhooksApi.md#updateWebhook) | **PUT** /webhooks/{webhookId} | Update a webhook
*WhatsAppCampaignsApi* | [**createWhatsAppCampaign**](docs/WhatsAppCampaignsApi.md#createWhatsAppCampaign) | **POST** /whatsappCampaigns | Create and Send a WhatsApp campaign
*WhatsAppCampaignsApi* | [**createWhatsAppTemplate**](docs/WhatsAppCampaignsApi.md#createWhatsAppTemplate) | **POST** /whatsppCampaigns/template | Create a WhatsApp template
*WhatsAppCampaignsApi* | [**deleteWhatsAppCampaign**](docs/WhatsAppCampaignsApi.md#deleteWhatsAppCampaign) | **DELETE** /whatsappCampaigns/{campaignId} | Delete a WhatsApp campaign
*WhatsAppCampaignsApi* | [**getWhatsAppCampaign**](docs/WhatsAppCampaignsApi.md#getWhatsAppCampaign) | **GET** /whatsappCampaigns/{campaignId} | Get a WhatsApp campaign
*WhatsAppCampaignsApi* | [**getWhatsAppCampaigns**](docs/WhatsAppCampaignsApi.md#getWhatsAppCampaigns) | **GET** /whatsappCampaigns | Return all your created WhatsApp campaigns
*WhatsAppCampaignsApi* | [**getWhatsAppConfig**](docs/WhatsAppCampaignsApi.md#getWhatsAppConfig) | **GET** /whatsappCampaigns/config | Get your WhatsApp API account information
*WhatsAppCampaignsApi* | [**getWhatsAppTemplates**](docs/WhatsAppCampaignsApi.md#getWhatsAppTemplates) | **GET** /whatsappCampaigns/template-list | Return all your created WhatsApp templates
*WhatsAppCampaignsApi* | [**sendWhatsAppTemplateApproval**](docs/WhatsAppCampaignsApi.md#sendWhatsAppTemplateApproval) | **POST** /whatsappCampaigns/template/approval/{templateId} | Send your WhatsApp template for approval
*WhatsAppCampaignsApi* | [**updateWhatsAppCampaign**](docs/WhatsAppCampaignsApi.md#updateWhatsAppCampaign) | **PUT** /whatsappCampaigns/{campaignId} | Update a WhatsApp campaign


## Documentation for Models

 - [AbTestCampaignResult](docs/AbTestCampaignResult.md)
 - [AbTestCampaignResultClickedLinks](docs/AbTestCampaignResultClickedLinks.md)
 - [AbTestCampaignResultStatistics](docs/AbTestCampaignResultStatistics.md)
 - [AbTestVersionClicks](docs/AbTestVersionClicks.md)
 - [AbTestVersionClicksInner](docs/AbTestVersionClicksInner.md)
 - [AbTestVersionStats](docs/AbTestVersionStats.md)
 - [AddChildDomain](docs/AddChildDomain.md)
 - [AddContactToList](docs/AddContactToList.md)
 - [AddSubscriptionMemberPayload](docs/AddSubscriptionMemberPayload.md)
 - [AggregateBalance](docs/AggregateBalance.md)
 - [AuthenticateDomainModel](docs/AuthenticateDomainModel.md)
 - [Balance](docs/Balance.md)
 - [BalanceDataPerContact](docs/BalanceDataPerContact.md)
 - [BalanceDefinition](docs/BalanceDefinition.md)
 - [BalanceDefinitionPage](docs/BalanceDefinitionPage.md)
 - [BalanceLimit](docs/BalanceLimit.md)
 - [BalanceOrder](docs/BalanceOrder.md)
 - [BlockDomain](docs/BlockDomain.md)
 - [Body](docs/Body.md)
 - [Body1](docs/Body1.md)
 - [Body10](docs/Body10.md)
 - [Body11](docs/Body11.md)
 - [Body12](docs/Body12.md)
 - [Body13](docs/Body13.md)
 - [Body14](docs/Body14.md)
 - [Body15](docs/Body15.md)
 - [Body16](docs/Body16.md)
 - [Body17](docs/Body17.md)
 - [Body18](docs/Body18.md)
 - [Body19](docs/Body19.md)
 - [Body2](docs/Body2.md)
 - [Body3](docs/Body3.md)
 - [Body4](docs/Body4.md)
 - [Body5](docs/Body5.md)
 - [Body6](docs/Body6.md)
 - [Body7](docs/Body7.md)
 - [Body8](docs/Body8.md)
 - [Body9](docs/Body9.md)
 - [BodyVariablesItems](docs/BodyVariablesItems.md)
 - [Cart](docs/Cart.md)
 - [CompaniesList](docs/CompaniesList.md)
 - [Company](docs/Company.md)
 - [CompanyAttributes](docs/CompanyAttributes.md)
 - [CompanyAttributesInner](docs/CompanyAttributesInner.md)
 - [ComponentItems](docs/ComponentItems.md)
 - [ContactBalancesResp](docs/ContactBalancesResp.md)
 - [ContactErrorModel](docs/ContactErrorModel.md)
 - [ConversationsMessage](docs/ConversationsMessage.md)
 - [ConversationsMessageAttachments](docs/ConversationsMessageAttachments.md)
 - [ConversationsMessageFile](docs/ConversationsMessageFile.md)
 - [ConversationsMessageFileImageInfo](docs/ConversationsMessageFileImageInfo.md)
 - [ConversationsMessageForwardedToSourceStatus](docs/ConversationsMessageForwardedToSourceStatus.md)
 - [ConversationsMessageFrom](docs/ConversationsMessageFrom.md)
 - [ConversationsMessageReplyTo](docs/ConversationsMessageReplyTo.md)
 - [ConversationsMessageTo](docs/ConversationsMessageTo.md)
 - [ConversionSourceMetrics](docs/ConversionSourceMetrics.md)
 - [ConversionSourceProduct](docs/ConversionSourceProduct.md)
 - [CorporateGroupDetailsResponse](docs/CorporateGroupDetailsResponse.md)
 - [CorporateGroupDetailsResponseGroup](docs/CorporateGroupDetailsResponseGroup.md)
 - [CorporateGroupDetailsResponseSubaccounts](docs/CorporateGroupDetailsResponseSubaccounts.md)
 - [CorporateGroupDetailsResponseUsers](docs/CorporateGroupDetailsResponseUsers.md)
 - [CorporateuseremailpermissionsPrivileges](docs/CorporateuseremailpermissionsPrivileges.md)
 - [CreateApiKeyRequest](docs/CreateApiKeyRequest.md)
 - [CreateApiKeyResponse](docs/CreateApiKeyResponse.md)
 - [CreateAttribute](docs/CreateAttribute.md)
 - [CreateAttributeEnumeration](docs/CreateAttributeEnumeration.md)
 - [CreateBalanceDefinitionPayload](docs/CreateBalanceDefinitionPayload.md)
 - [CreateBalanceLimitPayload](docs/CreateBalanceLimitPayload.md)
 - [CreateBalancePayload](docs/CreateBalancePayload.md)
 - [CreateCategoryModel](docs/CreateCategoryModel.md)
 - [CreateChild](docs/CreateChild.md)
 - [CreateContact](docs/CreateContact.md)
 - [CreateCouponCollection](docs/CreateCouponCollection.md)
 - [CreateCoupons](docs/CreateCoupons.md)
 - [CreateDoiContact](docs/CreateDoiContact.md)
 - [CreateDomain](docs/CreateDomain.md)
 - [CreateDomainModel](docs/CreateDomainModel.md)
 - [CreateDomainModelDnsRecords](docs/CreateDomainModelDnsRecords.md)
 - [CreateDomainModelDnsRecordsDkimRecord](docs/CreateDomainModelDnsRecordsDkimRecord.md)
 - [CreateEmailCampaign](docs/CreateEmailCampaign.md)
 - [CreateEmailCampaignEmailExpirationDate](docs/CreateEmailCampaignEmailExpirationDate.md)
 - [CreateEmailCampaignRecipients](docs/CreateEmailCampaignRecipients.md)
 - [CreateEmailCampaignSender](docs/CreateEmailCampaignSender.md)
 - [CreateExternalFeed](docs/CreateExternalFeed.md)
 - [CreateList](docs/CreateList.md)
 - [CreateLoyaltyProgramPayload](docs/CreateLoyaltyProgramPayload.md)
 - [CreateModel](docs/CreateModel.md)
 - [CreateOrderPayload](docs/CreateOrderPayload.md)
 - [CreatePaymentRequest](docs/CreatePaymentRequest.md)
 - [CreatePaymentResponse](docs/CreatePaymentResponse.md)
 - [CreateProductModel](docs/CreateProductModel.md)
 - [CreateSender](docs/CreateSender.md)
 - [CreateSenderIps](docs/CreateSenderIps.md)
 - [CreateSenderModel](docs/CreateSenderModel.md)
 - [CreateSmsCampaign](docs/CreateSmsCampaign.md)
 - [CreateSmsCampaignRecipients](docs/CreateSmsCampaignRecipients.md)
 - [CreateSmtpEmail](docs/CreateSmtpEmail.md)
 - [CreateSmtpTemplate](docs/CreateSmtpTemplate.md)
 - [CreateSmtpTemplateSender](docs/CreateSmtpTemplateSender.md)
 - [CreateSubAccount](docs/CreateSubAccount.md)
 - [CreateSubAccountResponse](docs/CreateSubAccountResponse.md)
 - [CreateSubscriptionPayload](docs/CreateSubscriptionPayload.md)
 - [CreateSubscriptionResponse](docs/CreateSubscriptionResponse.md)
 - [CreateTierGroupRequest](docs/CreateTierGroupRequest.md)
 - [CreateTransactionPayload](docs/CreateTransactionPayload.md)
 - [CreateUpdateBatchCategory](docs/CreateUpdateBatchCategory.md)
 - [CreateUpdateBatchCategoryModel](docs/CreateUpdateBatchCategoryModel.md)
 - [CreateUpdateBatchProducts](docs/CreateUpdateBatchProducts.md)
 - [CreateUpdateBatchProductsModel](docs/CreateUpdateBatchProductsModel.md)
 - [CreateUpdateCategories](docs/CreateUpdateCategories.md)
 - [CreateUpdateCategory](docs/CreateUpdateCategory.md)
 - [CreateUpdateContactModel](docs/CreateUpdateContactModel.md)
 - [CreateUpdateFolder](docs/CreateUpdateFolder.md)
 - [CreateUpdateProduct](docs/CreateUpdateProduct.md)
 - [CreateUpdateProducts](docs/CreateUpdateProducts.md)
 - [CreateWebhook](docs/CreateWebhook.md)
 - [CreateWhatsAppCampaign](docs/CreateWhatsAppCampaign.md)
 - [CreateWhatsAppCampaignRecipients](docs/CreateWhatsAppCampaignRecipients.md)
 - [CreateWhatsAppTemplate](docs/CreateWhatsAppTemplate.md)
 - [CreatedBatchId](docs/CreatedBatchId.md)
 - [CreatedProcessId](docs/CreatedProcessId.md)
 - [Deal](docs/Deal.md)
 - [DealAttributes](docs/DealAttributes.md)
 - [DealAttributesInner](docs/DealAttributesInner.md)
 - [DealsList](docs/DealsList.md)
 - [DeleteHardbounces](docs/DeleteHardbounces.md)
 - [EmailExportRecipients](docs/EmailExportRecipients.md)
 - [ErrorModel](docs/ErrorModel.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [Event](docs/Event.md)
 - [EventIdentifiers](docs/EventIdentifiers.md)
 - [ExportWebhooksHistory](docs/ExportWebhooksHistory.md)
 - [FetchTemplatePreview](docs/FetchTemplatePreview.md)
 - [FileData](docs/FileData.md)
 - [FileDownloadableLink](docs/FileDownloadableLink.md)
 - [FileList](docs/FileList.md)
 - [GetAccountActivity](docs/GetAccountActivity.md)
 - [GetAccountActivityLogs](docs/GetAccountActivityLogs.md)
 - [GetAccountMarketingAutomation](docs/GetAccountMarketingAutomation.md)
 - [GetAccountPlan](docs/GetAccountPlan.md)
 - [GetAccountRelay](docs/GetAccountRelay.md)
 - [GetAccountRelayData](docs/GetAccountRelayData.md)
 - [GetAggregatedReport](docs/GetAggregatedReport.md)
 - [GetAllExternalFeeds](docs/GetAllExternalFeeds.md)
 - [GetAllExternalFeedsFeeds](docs/GetAllExternalFeedsFeeds.md)
 - [GetAttributes](docs/GetAttributes.md)
 - [GetAttributesAttributes](docs/GetAttributesAttributes.md)
 - [GetAttributesEnumeration](docs/GetAttributesEnumeration.md)
 - [GetBlockedDomains](docs/GetBlockedDomains.md)
 - [GetCampaignOverview](docs/GetCampaignOverview.md)
 - [GetCampaignRecipients](docs/GetCampaignRecipients.md)
 - [GetCampaignStats](docs/GetCampaignStats.md)
 - [GetCategories](docs/GetCategories.md)
 - [GetCategoryDetails](docs/GetCategoryDetails.md)
 - [GetChildDomain](docs/GetChildDomain.md)
 - [GetClient](docs/GetClient.md)
 - [GetContactCampaignStats](docs/GetContactCampaignStats.md)
 - [GetContactCampaignStatsClicked](docs/GetContactCampaignStatsClicked.md)
 - [GetContactCampaignStatsOpened](docs/GetContactCampaignStatsOpened.md)
 - [GetContactCampaignStatsTransacAttributes](docs/GetContactCampaignStatsTransacAttributes.md)
 - [GetContactCampaignStatsUnsubscriptions](docs/GetContactCampaignStatsUnsubscriptions.md)
 - [GetContactDetails](docs/GetContactDetails.md)
 - [GetContacts](docs/GetContacts.md)
 - [GetCorporateInvitedUsersList](docs/GetCorporateInvitedUsersList.md)
 - [GetCorporateInvitedUsersListFeatureAccess](docs/GetCorporateInvitedUsersListFeatureAccess.md)
 - [GetCorporateInvitedUsersListGroups](docs/GetCorporateInvitedUsersListGroups.md)
 - [GetCorporateInvitedUsersListUsers](docs/GetCorporateInvitedUsersListUsers.md)
 - [GetCorporateUserPermission](docs/GetCorporateUserPermission.md)
 - [GetCorporateUserPermissionFeatureAccess](docs/GetCorporateUserPermissionFeatureAccess.md)
 - [GetCorporateUserPermissionGroups](docs/GetCorporateUserPermissionGroups.md)
 - [GetCouponCollection](docs/GetCouponCollection.md)
 - [GetDeviceBrowserStats](docs/GetDeviceBrowserStats.md)
 - [GetDomainConfigurationModel](docs/GetDomainConfigurationModel.md)
 - [GetDomainsList](docs/GetDomainsList.md)
 - [GetDomainsListDomains](docs/GetDomainsListDomains.md)
 - [GetEmailCampaigns](docs/GetEmailCampaigns.md)
 - [GetEmailEventReport](docs/GetEmailEventReport.md)
 - [GetEmailEventReportEvents](docs/GetEmailEventReportEvents.md)
 - [GetExtendedCampaignOverviewSender](docs/GetExtendedCampaignOverviewSender.md)
 - [GetExtendedCampaignStats](docs/GetExtendedCampaignStats.md)
 - [GetExtendedClientAddress](docs/GetExtendedClientAddress.md)
 - [GetExtendedContactDetailsStatistics](docs/GetExtendedContactDetailsStatistics.md)
 - [GetExtendedContactDetailsStatisticsClicked](docs/GetExtendedContactDetailsStatisticsClicked.md)
 - [GetExtendedContactDetailsStatisticsDelivered](docs/GetExtendedContactDetailsStatisticsDelivered.md)
 - [GetExtendedContactDetailsStatisticsLinks](docs/GetExtendedContactDetailsStatisticsLinks.md)
 - [GetExtendedContactDetailsStatisticsMessagesSent](docs/GetExtendedContactDetailsStatisticsMessagesSent.md)
 - [GetExtendedContactDetailsStatisticsOpened](docs/GetExtendedContactDetailsStatisticsOpened.md)
 - [GetExtendedContactDetailsStatisticsUnsubscriptions](docs/GetExtendedContactDetailsStatisticsUnsubscriptions.md)
 - [GetExtendedContactDetailsStatisticsUnsubscriptionsAdminUnsubscription](docs/GetExtendedContactDetailsStatisticsUnsubscriptionsAdminUnsubscription.md)
 - [GetExtendedContactDetailsStatisticsUnsubscriptionsUserUnsubscription](docs/GetExtendedContactDetailsStatisticsUnsubscriptionsUserUnsubscription.md)
 - [GetExtendedListCampaignStats](docs/GetExtendedListCampaignStats.md)
 - [GetExternalFeedByUUID](docs/GetExternalFeedByUUID.md)
 - [GetExternalFeedByUUIDHeaders](docs/GetExternalFeedByUUIDHeaders.md)
 - [GetFolder](docs/GetFolder.md)
 - [GetFolderLists](docs/GetFolderLists.md)
 - [GetFolders](docs/GetFolders.md)
 - [GetInboundEmailEvents](docs/GetInboundEmailEvents.md)
 - [GetInboundEmailEventsByUuid](docs/GetInboundEmailEventsByUuid.md)
 - [GetInboundEmailEventsByUuidAttachments](docs/GetInboundEmailEventsByUuidAttachments.md)
 - [GetInboundEmailEventsByUuidLogs](docs/GetInboundEmailEventsByUuidLogs.md)
 - [GetInboundEmailEventsEvents](docs/GetInboundEmailEventsEvents.md)
 - [GetInvitedUsersList](docs/GetInvitedUsersList.md)
 - [GetInvitedUsersListFeatureAccess](docs/GetInvitedUsersListFeatureAccess.md)
 - [GetInvitedUsersListUsers](docs/GetInvitedUsersListUsers.md)
 - [GetIp](docs/GetIp.md)
 - [GetIpFromSender](docs/GetIpFromSender.md)
 - [GetIps](docs/GetIps.md)
 - [GetIpsFromSender](docs/GetIpsFromSender.md)
 - [GetList](docs/GetList.md)
 - [GetLists](docs/GetLists.md)
 - [GetOrders](docs/GetOrders.md)
 - [GetPaymentRequest](docs/GetPaymentRequest.md)
 - [GetProcess](docs/GetProcess.md)
 - [GetProcesses](docs/GetProcesses.md)
 - [GetProductDetails](docs/GetProductDetails.md)
 - [GetProducts](docs/GetProducts.md)
 - [GetReports](docs/GetReports.md)
 - [GetReportsReports](docs/GetReportsReports.md)
 - [GetScheduledEmailByBatchId](docs/GetScheduledEmailByBatchId.md)
 - [GetScheduledEmailByBatchIdBatches](docs/GetScheduledEmailByBatchIdBatches.md)
 - [GetScheduledEmailByMessageId](docs/GetScheduledEmailByMessageId.md)
 - [GetSegment](docs/GetSegment.md)
 - [GetSegments](docs/GetSegments.md)
 - [GetSendersList](docs/GetSendersList.md)
 - [GetSendersListIps](docs/GetSendersListIps.md)
 - [GetSendersListSenders](docs/GetSendersListSenders.md)
 - [GetSharedTemplateUrl](docs/GetSharedTemplateUrl.md)
 - [GetSmsCampaignOverview](docs/GetSmsCampaignOverview.md)
 - [GetSmsCampaignStats](docs/GetSmsCampaignStats.md)
 - [GetSmsCampaigns](docs/GetSmsCampaigns.md)
 - [GetSmsEventReport](docs/GetSmsEventReport.md)
 - [GetSmsEventReportEvents](docs/GetSmsEventReportEvents.md)
 - [GetSmtpTemplateOverview](docs/GetSmtpTemplateOverview.md)
 - [GetSmtpTemplateOverviewSender](docs/GetSmtpTemplateOverviewSender.md)
 - [GetSmtpTemplates](docs/GetSmtpTemplates.md)
 - [GetSsoToken](docs/GetSsoToken.md)
 - [GetStatsByBrowser](docs/GetStatsByBrowser.md)
 - [GetStatsByDevice](docs/GetStatsByDevice.md)
 - [GetStatsByDomain](docs/GetStatsByDomain.md)
 - [GetTransacAggregatedSmsReport](docs/GetTransacAggregatedSmsReport.md)
 - [GetTransacBlockedContacts](docs/GetTransacBlockedContacts.md)
 - [GetTransacBlockedContactsContacts](docs/GetTransacBlockedContactsContacts.md)
 - [GetTransacBlockedContactsReason](docs/GetTransacBlockedContactsReason.md)
 - [GetTransacEmailContent](docs/GetTransacEmailContent.md)
 - [GetTransacEmailContentEvents](docs/GetTransacEmailContentEvents.md)
 - [GetTransacEmailsList](docs/GetTransacEmailsList.md)
 - [GetTransacEmailsListTransactionalEmails](docs/GetTransacEmailsListTransactionalEmails.md)
 - [GetTransacSmsReport](docs/GetTransacSmsReport.md)
 - [GetTransacSmsReportReports](docs/GetTransacSmsReportReports.md)
 - [GetUserPermission](docs/GetUserPermission.md)
 - [GetUserPermissionPrivileges](docs/GetUserPermissionPrivileges.md)
 - [GetWATemplates](docs/GetWATemplates.md)
 - [GetWATemplatesTemplates](docs/GetWATemplatesTemplates.md)
 - [GetWebhook](docs/GetWebhook.md)
 - [GetWebhookAuth](docs/GetWebhookAuth.md)
 - [GetWebhookHeaders](docs/GetWebhookHeaders.md)
 - [GetWebhooks](docs/GetWebhooks.md)
 - [GetWhatsAppConfig](docs/GetWhatsAppConfig.md)
 - [GetWhatsappCampaignOverview](docs/GetWhatsappCampaignOverview.md)
 - [GetWhatsappCampaigns](docs/GetWhatsappCampaigns.md)
 - [GetWhatsappCampaignsCampaigns](docs/GetWhatsappCampaignsCampaigns.md)
 - [GetWhatsappEventReport](docs/GetWhatsappEventReport.md)
 - [GetWhatsappEventReportEvents](docs/GetWhatsappEventReportEvents.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse2002](docs/InlineResponse2002.md)
 - [InlineResponse2003](docs/InlineResponse2003.md)
 - [InlineResponse2004](docs/InlineResponse2004.md)
 - [InlineResponse2005](docs/InlineResponse2005.md)
 - [InlineResponse2006](docs/InlineResponse2006.md)
 - [InlineResponse2006Totals](docs/InlineResponse2006Totals.md)
 - [InlineResponse2007](docs/InlineResponse2007.md)
 - [InlineResponse2008](docs/InlineResponse2008.md)
 - [InlineResponse2009](docs/InlineResponse2009.md)
 - [InlineResponse201](docs/InlineResponse201.md)
 - [InlineResponse2011](docs/InlineResponse2011.md)
 - [InlineResponse2012](docs/InlineResponse2012.md)
 - [InlineResponse2013](docs/InlineResponse2013.md)
 - [InlineResponse2014](docs/InlineResponse2014.md)
 - [InlineResponse2015](docs/InlineResponse2015.md)
 - [InlineResponse400](docs/InlineResponse400.md)
 - [InviteAdminUser](docs/InviteAdminUser.md)
 - [InviteAdminUserPrivileges](docs/InviteAdminUserPrivileges.md)
 - [Inviteuser](docs/Inviteuser.md)
 - [InviteuserPrivileges](docs/InviteuserPrivileges.md)
 - [LoyaltyProgram](docs/LoyaltyProgram.md)
 - [LoyaltyProgramPage](docs/LoyaltyProgramPage.md)
 - [LoyaltyProgramValidationError](docs/LoyaltyProgramValidationError.md)
 - [LoyaltyTierPage](docs/LoyaltyTierPage.md)
 - [MainAttributeRewardPayload](docs/MainAttributeRewardPayload.md)
 - [MainBillingPayload](docs/MainBillingPayload.md)
 - [MainCodeCountHttpResponse](docs/MainCodeCountHttpResponse.md)
 - [MainCreateRedeemPayload](docs/MainCreateRedeemPayload.md)
 - [MainCreateRewardPayload](docs/MainCreateRewardPayload.md)
 - [MainCreateRewardResponse](docs/MainCreateRewardResponse.md)
 - [MainErrorResponse](docs/MainErrorResponse.md)
 - [MainFilter](docs/MainFilter.md)
 - [MainGenerator](docs/MainGenerator.md)
 - [MainGetContactRewardsPayload](docs/MainGetContactRewardsPayload.md)
 - [MainIdentifiersPayload](docs/MainIdentifiersPayload.md)
 - [MainLimit](docs/MainLimit.md)
 - [MainModelContactReward](docs/MainModelContactReward.md)
 - [MainModelContactRewardsResp](docs/MainModelContactRewardsResp.md)
 - [MainNodeResponse](docs/MainNodeResponse.md)
 - [MainOrderPayload](docs/MainOrderPayload.md)
 - [MainProduct](docs/MainProduct.md)
 - [MainProductPayload](docs/MainProductPayload.md)
 - [MainRedeem](docs/MainRedeem.md)
 - [MainResultParameterResponse](docs/MainResultParameterResponse.md)
 - [MainReward](docs/MainReward.md)
 - [MainRewardAttribution](docs/MainRewardAttribution.md)
 - [MainRewardConfigurations](docs/MainRewardConfigurations.md)
 - [MainRewardPage](docs/MainRewardPage.md)
 - [MainRewardPageObj](docs/MainRewardPageObj.md)
 - [MainRewardValidate](docs/MainRewardValidate.md)
 - [MainRule](docs/MainRule.md)
 - [MainRuleConditionResponse](docs/MainRuleConditionResponse.md)
 - [MainRuleEventResponse](docs/MainRuleEventResponse.md)
 - [MainRuleResultResponse](docs/MainRuleResultResponse.md)
 - [MainValidateRewardPayload](docs/MainValidateRewardPayload.md)
 - [MainValueResponse](docs/MainValueResponse.md)
 - [MainVoucherRevokePayload](docs/MainVoucherRevokePayload.md)
 - [MasterDetailsResponse](docs/MasterDetailsResponse.md)
 - [MasterDetailsResponseBillingInfo](docs/MasterDetailsResponseBillingInfo.md)
 - [MasterDetailsResponseBillingInfoAddress](docs/MasterDetailsResponseBillingInfoAddress.md)
 - [MasterDetailsResponseBillingInfoName](docs/MasterDetailsResponseBillingInfoName.md)
 - [MasterDetailsResponsePlanInfo](docs/MasterDetailsResponsePlanInfo.md)
 - [MasterDetailsResponsePlanInfoFeatures](docs/MasterDetailsResponsePlanInfoFeatures.md)
 - [MemberContact](docs/MemberContact.md)
 - [ModelConfiguration](docs/ModelConfiguration.md)
 - [ModelSubscriptionBalanceResp](docs/ModelSubscriptionBalanceResp.md)
 - [Note](docs/Note.md)
 - [NoteData](docs/NoteData.md)
 - [NoteId](docs/NoteId.md)
 - [NoteList](docs/NoteList.md)
 - [Notification](docs/Notification.md)
 - [Order](docs/Order.md)
 - [OrderBatch](docs/OrderBatch.md)
 - [OrderBilling](docs/OrderBilling.md)
 - [OrderIdentifiers](docs/OrderIdentifiers.md)
 - [OrderProducts](docs/OrderProducts.md)
 - [Otp](docs/Otp.md)
 - [PatchLoyaltyProgramPayload](docs/PatchLoyaltyProgramPayload.md)
 - [Pipeline](docs/Pipeline.md)
 - [PipelineStage](docs/PipelineStage.md)
 - [Pipelines](docs/Pipelines.md)
 - [PostContactInfo](docs/PostContactInfo.md)
 - [PostContactInfoContacts](docs/PostContactInfoContacts.md)
 - [PostSendFailed](docs/PostSendFailed.md)
 - [PostSendSmsTestFailed](docs/PostSendSmsTestFailed.md)
 - [PutRevokeUserPermission](docs/PutRevokeUserPermission.md)
 - [Putresendcancelinvitation](docs/Putresendcancelinvitation.md)
 - [RemoveContactFromList](docs/RemoveContactFromList.md)
 - [RequestContactExport](docs/RequestContactExport.md)
 - [RequestContactExportCustomContactFilter](docs/RequestContactExportCustomContactFilter.md)
 - [RequestContactImport](docs/RequestContactImport.md)
 - [RequestContactImportJsonBody](docs/RequestContactImportJsonBody.md)
 - [RequestContactImportNewList](docs/RequestContactImportNewList.md)
 - [RequestSmsRecipientExport](docs/RequestSmsRecipientExport.md)
 - [ScheduleSmtpEmail](docs/ScheduleSmtpEmail.md)
 - [SendReport](docs/SendReport.md)
 - [SendReportEmail](docs/SendReportEmail.md)
 - [SendSms](docs/SendSms.md)
 - [SendSmtpEmail](docs/SendSmtpEmail.md)
 - [SendSmtpEmailAttachment](docs/SendSmtpEmailAttachment.md)
 - [SendSmtpEmailBcc](docs/SendSmtpEmailBcc.md)
 - [SendSmtpEmailCc](docs/SendSmtpEmailCc.md)
 - [SendSmtpEmailMessageVersions](docs/SendSmtpEmailMessageVersions.md)
 - [SendSmtpEmailReplyTo](docs/SendSmtpEmailReplyTo.md)
 - [SendSmtpEmailReplyTo1](docs/SendSmtpEmailReplyTo1.md)
 - [SendSmtpEmailSender](docs/SendSmtpEmailSender.md)
 - [SendSmtpEmailTo](docs/SendSmtpEmailTo.md)
 - [SendSmtpEmailTo1](docs/SendSmtpEmailTo1.md)
 - [SendTestEmail](docs/SendTestEmail.md)
 - [SendTestSms](docs/SendTestSms.md)
 - [SendTransacSms](docs/SendTransacSms.md)
 - [SendTransacSmsTag](docs/SendTransacSmsTag.md)
 - [SendWhatsappMessage](docs/SendWhatsappMessage.md)
 - [SetConfigDisplayCurrency](docs/SetConfigDisplayCurrency.md)
 - [SsoTokenRequest](docs/SsoTokenRequest.md)
 - [SsoTokenRequestCorporate](docs/SsoTokenRequestCorporate.md)
 - [SubAccountAppsToggleRequest](docs/SubAccountAppsToggleRequest.md)
 - [SubAccountDetailsResponse](docs/SubAccountDetailsResponse.md)
 - [SubAccountDetailsResponseGroups](docs/SubAccountDetailsResponseGroups.md)
 - [SubAccountDetailsResponsePlanInfo](docs/SubAccountDetailsResponsePlanInfo.md)
 - [SubAccountDetailsResponsePlanInfoCredits](docs/SubAccountDetailsResponsePlanInfoCredits.md)
 - [SubAccountDetailsResponsePlanInfoCreditsEmails](docs/SubAccountDetailsResponsePlanInfoCreditsEmails.md)
 - [SubAccountDetailsResponsePlanInfoCreditsExternalFeeds](docs/SubAccountDetailsResponsePlanInfoCreditsExternalFeeds.md)
 - [SubAccountDetailsResponsePlanInfoCreditsSms](docs/SubAccountDetailsResponsePlanInfoCreditsSms.md)
 - [SubAccountDetailsResponsePlanInfoCreditsWhatsapp](docs/SubAccountDetailsResponsePlanInfoCreditsWhatsapp.md)
 - [SubAccountDetailsResponsePlanInfoCreditsWpSubscribers](docs/SubAccountDetailsResponsePlanInfoCreditsWpSubscribers.md)
 - [SubAccountDetailsResponsePlanInfoFeatures](docs/SubAccountDetailsResponsePlanInfoFeatures.md)
 - [SubAccountDetailsResponsePlanInfoFeaturesInbox](docs/SubAccountDetailsResponsePlanInfoFeaturesInbox.md)
 - [SubAccountDetailsResponsePlanInfoFeaturesLandingPage](docs/SubAccountDetailsResponsePlanInfoFeaturesLandingPage.md)
 - [SubAccountDetailsResponsePlanInfoFeaturesSalesUsers](docs/SubAccountDetailsResponsePlanInfoFeaturesSalesUsers.md)
 - [SubAccountDetailsResponsePlanInfoFeaturesUsers](docs/SubAccountDetailsResponsePlanInfoFeaturesUsers.md)
 - [SubAccountUpdatePlanRequest](docs/SubAccountUpdatePlanRequest.md)
 - [SubAccountUpdatePlanRequestCredits](docs/SubAccountUpdatePlanRequestCredits.md)
 - [SubAccountUpdatePlanRequestFeatures](docs/SubAccountUpdatePlanRequestFeatures.md)
 - [SubAccountsResponse](docs/SubAccountsResponse.md)
 - [SubAccountsResponseGroups](docs/SubAccountsResponseGroups.md)
 - [SubAccountsResponseSubAccounts](docs/SubAccountsResponseSubAccounts.md)
 - [SubAccountsUpdatePlanRequest](docs/SubAccountsUpdatePlanRequest.md)
 - [SubAccountsUpdatePlanRequestCredits](docs/SubAccountsUpdatePlanRequestCredits.md)
 - [SubAccountsUpdatePlanRequestFeatures](docs/SubAccountsUpdatePlanRequestFeatures.md)
 - [Subscription](docs/Subscription.md)
 - [SubscriptionAggregateBalance](docs/SubscriptionAggregateBalance.md)
 - [SubscriptionAttributedReward](docs/SubscriptionAttributedReward.md)
 - [SubscriptionBalances](docs/SubscriptionBalances.md)
 - [SubscriptionHandlerInfo](docs/SubscriptionHandlerInfo.md)
 - [SubscriptionMember](docs/SubscriptionMember.md)
 - [SubscriptionTier](docs/SubscriptionTier.md)
 - [Task](docs/Task.md)
 - [TaskList](docs/TaskList.md)
 - [TaskReminder](docs/TaskReminder.md)
 - [TaskTypes](docs/TaskTypes.md)
 - [TemplatePreview](docs/TemplatePreview.md)
 - [Tier](docs/Tier.md)
 - [TierAccessConditions](docs/TierAccessConditions.md)
 - [TierForContact](docs/TierForContact.md)
 - [TierGroup](docs/TierGroup.md)
 - [TierGroupPage](docs/TierGroupPage.md)
 - [TierRequest](docs/TierRequest.md)
 - [TierRequestAccessConditions](docs/TierRequestAccessConditions.md)
 - [TierRequestPutPayload](docs/TierRequestPutPayload.md)
 - [TierRequestTierRewards](docs/TierRequestTierRewards.md)
 - [TierTierRewards](docs/TierTierRewards.md)
 - [Transaction](docs/Transaction.md)
 - [TransactionHistory](docs/TransactionHistory.md)
 - [TransactionHistoryResp](docs/TransactionHistoryResp.md)
 - [UnauthorizedResponse](docs/UnauthorizedResponse.md)
 - [UpdateAttribute](docs/UpdateAttribute.md)
 - [UpdateAttributeEnumeration](docs/UpdateAttributeEnumeration.md)
 - [UpdateBalanceDefinitionPayload](docs/UpdateBalanceDefinitionPayload.md)
 - [UpdateBalanceLimitPayload](docs/UpdateBalanceLimitPayload.md)
 - [UpdateBatchContacts](docs/UpdateBatchContacts.md)
 - [UpdateBatchContactsContacts](docs/UpdateBatchContactsContacts.md)
 - [UpdateBatchContactsModel](docs/UpdateBatchContactsModel.md)
 - [UpdateCampaignStatus](docs/UpdateCampaignStatus.md)
 - [UpdateChild](docs/UpdateChild.md)
 - [UpdateContact](docs/UpdateContact.md)
 - [UpdateCouponCollection](docs/UpdateCouponCollection.md)
 - [UpdateEmailCampaign](docs/UpdateEmailCampaign.md)
 - [UpdateEmailCampaignEmailExpirationDate](docs/UpdateEmailCampaignEmailExpirationDate.md)
 - [UpdateEmailCampaignRecipients](docs/UpdateEmailCampaignRecipients.md)
 - [UpdateEmailCampaignSender](docs/UpdateEmailCampaignSender.md)
 - [UpdateExternalFeed](docs/UpdateExternalFeed.md)
 - [UpdateList](docs/UpdateList.md)
 - [UpdateLoyaltyProgramPayload](docs/UpdateLoyaltyProgramPayload.md)
 - [UpdateSender](docs/UpdateSender.md)
 - [UpdateSmsCampaign](docs/UpdateSmsCampaign.md)
 - [UpdateSmtpTemplate](docs/UpdateSmtpTemplate.md)
 - [UpdateSmtpTemplateSender](docs/UpdateSmtpTemplateSender.md)
 - [UpdateTierGroupRequest](docs/UpdateTierGroupRequest.md)
 - [UpdateWebhook](docs/UpdateWebhook.md)
 - [UpdateWhatsAppCampaign](docs/UpdateWhatsAppCampaign.md)
 - [UploadImageModel](docs/UploadImageModel.md)
 - [UploadImageToGallery](docs/UploadImageToGallery.md)
 - [ValidationErrors](docs/ValidationErrors.md)
 - [VariablesItems](docs/VariablesItems.md)
 - [WhatsappCampStats](docs/WhatsappCampStats.md)
 - [WhatsappCampTemplate](docs/WhatsappCampTemplate.md)
 - [GetExtendedCampaignOverview](docs/GetExtendedCampaignOverview.md)
 - [GetExtendedClient](docs/GetExtendedClient.md)
 - [GetExtendedContactDetails](docs/GetExtendedContactDetails.md)
 - [GetExtendedList](docs/GetExtendedList.md)
 - [GetSmsCampaign](docs/GetSmsCampaign.md)
 - [GetAccount](docs/GetAccount.md)
 - [GetEmailCampaign](docs/GetEmailCampaign.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### api-key

- **Type**: API key
- **API key parameter name**: api-key
- **Location**: HTTP header

### partner-key

- **Type**: API key
- **API key parameter name**: partner-key
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Support and Feedback

Be sure to visit the Brevo official [documentation website](https://developers.brevo.com/docs/getting-started ) for additional information about our API.

If you find a bug, please post the issue on [Github](https://github.com/getbrevo/brevo-java/issues).

As always, if you need additional assistance, drop us a note [here](https://account.brevo.com/support).

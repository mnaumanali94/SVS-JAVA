#Getting started

## How to Build

The generated code uses a few Maven dependencies e.g., Jackson, UniRest,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Eclipse click on ``` File -> Import ```.

![Importing SDK into Eclipse - Step 1](http://apidocs.io/illustration/java?step=import0&workspaceFolder=SVS-Java&workspaceName=SVS&projectName=SVSLib&rootNamespace=com.gotransverse.svs.webhook.client)

* In the import dialog, select ``` Existing Java Project ``` and click ``` Next ```.

![Importing SDK into Eclipse - Step 2](http://apidocs.io/illustration/java?step=import1&workspaceFolder=SVS-Java&workspaceName=SVS&projectName=SVSLib&rootNamespace=com.gotransverse.svs.webhook.client)

* Browse to locate the folder containing the source code. Select the detected location of the project and click ``` Finish ```.

![Importing SDK into Eclipse - Step 3](http://apidocs.io/illustration/java?step=import2&workspaceFolder=SVS-Java&workspaceName=SVS&projectName=SVSLib&rootNamespace=com.gotransverse.svs.webhook.client)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](http://apidocs.io/illustration/java?step=import3&workspaceFolder=SVS-Java&workspaceName=SVS&projectName=SVSLib&rootNamespace=com.gotransverse.svs.webhook.client)

## How to Use

The following section explains how to use the SVS library in a new console project.

### 1. Starting a new project

For starting a new project, click the menu command ``` File > New > Project ```.

![Add a new project in Eclipse](http://apidocs.io/illustration/java?step=createNewProject0&workspaceFolder=SVS-Java&workspaceName=SVS&projectName=SVSLib&rootNamespace=com.gotransverse.svs.webhook.client)

Next, choose ``` Maven > Maven Project ```and click ``` Next ```.

![Create a new Maven Project - Step 1](http://apidocs.io/illustration/java?step=createNewProject1&workspaceFolder=SVS-Java&workspaceName=SVS&projectName=SVSLib&rootNamespace=com.gotransverse.svs.webhook.client)

Here, make sure to use the current workspace by choosing ``` Use default Workspace location ```, as shown in the picture below and click ``` Next ```.

![Create a new Maven Project - Step 2](http://apidocs.io/illustration/java?step=createNewProject2&workspaceFolder=SVS-Java&workspaceName=SVS&projectName=SVSLib&rootNamespace=com.gotransverse.svs.webhook.client)

Following this, select the *quick start* project type to create a simple project with an existing class and a ``` main ``` method. To do this, choose ``` maven-archetype-quickstart ``` item from the list and click ``` Next ```.

![Create a new Maven Project - Step 3](http://apidocs.io/illustration/java?step=createNewProject3&workspaceFolder=SVS-Java&workspaceName=SVS&projectName=SVSLib&rootNamespace=com.gotransverse.svs.webhook.client)

In the last step, provide a ``` Group Id ``` and ``` Artifact Id ``` as shown in the picture below and click ``` Finish ```.

![Create a new Maven Project - Step 4](http://apidocs.io/illustration/java?step=createNewProject4&workspaceFolder=SVS-Java&workspaceName=SVS&projectName=SVSLib&rootNamespace=com.gotransverse.svs.webhook.client)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its ``` pom.xml ``` file. In order to add a dependency on the *SVSLib* client library, double click on the ``` pom.xml ``` file in the ``` Package Explorer ```. Opening the ``` pom.xml ``` file will render a graphical view on the cavas. Here, switch to the ``` Dependencies ``` tab and click the ``` Add ``` button as shown in the picture below.

![Adding dependency to the client library - Step 1](http://apidocs.io/illustration/java?step=testProject0&workspaceFolder=SVS-Java&workspaceName=SVS&projectName=SVSLib&rootNamespace=com.gotransverse.svs.webhook.client)

Clicking the ``` Add ``` button will open a dialog where you need to specify SVS in ``` Group Id ``` and SVSLib in the ``` Artifact Id ``` fields. Once added click ``` OK ```. Save the ``` pom.xml ``` file.

![Adding dependency to the client library - Step 2](http://apidocs.io/illustration/java?step=testProject1&workspaceFolder=SVS-Java&workspaceName=SVS&projectName=SVSLib&rootNamespace=com.gotransverse.svs.webhook.client)

### 3. Write sample code

Once the ``` SimpleConsoleApp ``` is created, a file named ``` App.java ``` will be visible in the *Package Explorer* with a ``` main ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

![Adding dependency to the client library - Step 2](http://apidocs.io/illustration/java?step=testProject2&workspaceFolder=SVS-Java&workspaceName=SVS&projectName=SVSLib&rootNamespace=com.gotransverse.svs.webhook.client)

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project *SVSLib* from the package explorer.
2. Select "Run -> Run as -> JUnit Test" or use "Alt + Shift + X" followed by "T" to run the Tests.

## Initialization

### 

API client can be initialized as following.

```java
// Initializing Object Mapper for Serialization and Deserialization purposes
public static ObjectMapper mapper = new ObjectMapper()
{
	private static final long serialVersionUID = -174113593500315394L;
	{
		configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		setSerializationInclusion(JsonInclude.Include.NON_NULL);
	}
};


SVSClient client = new SVSClient();
```

## Class Reference

### <a name="list_of_controllers"></a>List of Controllers

* [RegisterManagementController](#register_management_controller)
* [DataExportController](#data_export_controller)

### <a name="register_management_controller"></a>![Class: ](http://apidocs.io/img/class.png "com.gotransverse.svs.webhook.client.controllers.RegisterManagementController") RegisterManagementController

#### Get singleton instance

The singleton instance of the ``` RegisterManagementController ``` class can be accessed from the API Client.

```java
RegisterManagementController registerManagement = client.getRegisterManagement();
```

#### <a name="get_store_external_account_number_balance_async"></a>![Method: ](http://apidocs.io/img/method.png "com.gotransverse.svs.webhook.client.controllers.RegisterManagementController.getStoreExternalAccountNumberBalanceAsync") getStoreExternalAccountNumberBalanceAsync

> *Tags:*  ``` Skips Authentication ``` 

> Gets the current balance of one or more registers by external account number


```java
void getStoreExternalAccountNumberBalanceAsync(
        final String authorization,
        final String storeId,
        final String externalNumber,
        final APICallBack<List<RegisterBalance>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| authorization |  ``` Required ```  | A token that indicates a user has been previously authorized to perform an action in the system.  Passed in the form of a bearer token without encoding, e.g. `Bearer abcd123456789efghiljklmnoqrstuvwkxz` |
| storeId |  ``` Required ```  | The uuid of the store that owns the register. |
| externalNumber |  ``` Required ```  | The external account id associated with the register |


#### Example Usage

```java
String authorization = "Authorization";
String storeId = "store-id";
String externalNumber = "external-number";
// Invoking the API call with sample inputs
registerManagement.getStoreExternalAccountNumberBalanceAsync(authorization, storeId, externalNumber, new APICallBack<List<RegisterBalance>>() {
    public void onSuccess(HttpContext context, List<RegisterBalance> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | Authentication failed |
| 403 | Access denied |
| 404 | Entity not found |
| 422 | Validation failure |



#### <a name="create_store_register_by_store_id_async"></a>![Method: ](http://apidocs.io/img/method.png "com.gotransverse.svs.webhook.client.controllers.RegisterManagementController.createStoreRegisterByStoreIdAsync") createStoreRegisterByStoreIdAsync

> *Tags:*  ``` Skips Authentication ``` 

> Creates a new balance register


```java
void createStoreRegisterByStoreIdAsync(
        final String authorization,
        final String storeId,
        final StoredValueRegister register,
        final APICallBack<StoredValueRegister> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| authorization |  ``` Required ```  | A token that indicates a user has been previously authorized to perform an action in the system.  Passed in the form of a bearer token without encoding, e.g. `Bearer abcd123456789efghiljklmnoqrstuvwkxz` |
| storeId |  ``` Required ```  | The uuid of the store that is creating the register. |
| register |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String authorization = "Authorization";
    String storeId = "store-id";
    StoredValueRegister register = new StoredValueRegister();
    // Invoking the API call with sample inputs
    registerManagement.createStoreRegisterByStoreIdAsync(authorization, storeId, register, new APICallBack<StoredValueRegister>() {
        public void onSuccess(HttpContext context, StoredValueRegister response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | Authentication failed |
| 403 | Access denied |
| 404 | Entity not found |
| 422 | Validation failure |



#### <a name="get_store_register_by_store_id_and_register_id_async"></a>![Method: ](http://apidocs.io/img/method.png "com.gotransverse.svs.webhook.client.controllers.RegisterManagementController.getStoreRegisterByStoreIdAndRegisterIdAsync") getStoreRegisterByStoreIdAndRegisterIdAsync

> *Tags:*  ``` Skips Authentication ``` 

> Retrieves a stored value register


```java
void getStoreRegisterByStoreIdAndRegisterIdAsync(
        final String authorization,
        final String storeId,
        final String registerId,
        final APICallBack<StoredValueRegister> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| authorization |  ``` Required ```  | A token that indicates a user has been previously authorized to perform an action in the system.  Passed in the form of a bearer token without encoding, e.g. `Bearer abcd123456789efghiljklmnoqrstuvwkxz` |
| storeId |  ``` Required ```  | The uuid of the store that owns the register. |
| registerId |  ``` Required ```  | The uuid of the register being retrieved |


#### Example Usage

```java
String authorization = "Authorization";
String storeId = "store-id";
String registerId = "register-id";
// Invoking the API call with sample inputs
registerManagement.getStoreRegisterByStoreIdAndRegisterIdAsync(authorization, storeId, registerId, new APICallBack<StoredValueRegister>() {
    public void onSuccess(HttpContext context, StoredValueRegister response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | Authentication failed |
| 403 | Access denied |
| 404 | Entity not found |
| 422 | Validation failure |



#### <a name="create_store_register_allocate_by_store_id_async"></a>![Method: ](http://apidocs.io/img/method.png "com.gotransverse.svs.webhook.client.controllers.RegisterManagementController.createStoreRegisterAllocateByStoreIdAsync") createStoreRegisterAllocateByStoreIdAsync

> *Tags:*  ``` Skips Authentication ``` 

> Forces an allocation on a register


```java
void createStoreRegisterAllocateByStoreIdAsync(
        final String authorization,
        final String storeId,
        final String registerId,
        final APICallBack<RegisterBalance> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| authorization |  ``` Required ```  | A token that indicates a user has been previously authorized to perform an action in the system.  Passed in the form of a bearer token without encoding, e.g. `Bearer abcd123456789efghiljklmnoqrstuvwkxz` |
| storeId |  ``` Required ```  | The uuid of the store that owns the register |
| registerId |  ``` Required ```  | The uuid of the register |


#### Example Usage

```java
String authorization = "Authorization";
String storeId = "store-id";
String registerId = "register-id";
// Invoking the API call with sample inputs
registerManagement.createStoreRegisterAllocateByStoreIdAsync(authorization, storeId, registerId, new APICallBack<RegisterBalance>() {
    public void onSuccess(HttpContext context, RegisterBalance response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | Authentication failed |
| 403 | Access denied |
| 404 | Entity not found |
| 422 | Validation failure |



#### <a name="get_store_register_balance_by_store_id_async"></a>![Method: ](http://apidocs.io/img/method.png "com.gotransverse.svs.webhook.client.controllers.RegisterManagementController.getStoreRegisterBalanceByStoreIdAsync") getStoreRegisterBalanceByStoreIdAsync

> *Tags:*  ``` Skips Authentication ``` 

> Gets the current balance of a register


```java
void getStoreRegisterBalanceByStoreIdAsync(
        final String authorization,
        final String storeId,
        final String registerId,
        final APICallBack<RegisterBalance> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| authorization |  ``` Required ```  | A token that indicates a user has been previously authorized to perform an action in the system.  Passed in the form of a bearer token without encoding, e.g. `Bearer abcd123456789efghiljklmnoqrstuvwkxz` |
| storeId |  ``` Required ```  | The uuid of the store that owns the register. |
| registerId |  ``` Required ```  | The uuid of the register |


#### Example Usage

```java
String authorization = "Authorization";
String storeId = "store-id";
String registerId = "register-id";
// Invoking the API call with sample inputs
registerManagement.getStoreRegisterBalanceByStoreIdAsync(authorization, storeId, registerId, new APICallBack<RegisterBalance>() {
    public void onSuccess(HttpContext context, RegisterBalance response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | Authentication failed |
| 403 | Access denied |
| 404 | Entity not found |
| 422 | Validation failure |



#### <a name="get_store_test_connection_by_store_id_async"></a>![Method: ](http://apidocs.io/img/method.png "com.gotransverse.svs.webhook.client.controllers.RegisterManagementController.getStoreTestConnectionByStoreIdAsync") getStoreTestConnectionByStoreIdAsync

> *Tags:*  ``` Skips Authentication ``` 

> Tests a connection to the stored value server


```java
void getStoreTestConnectionByStoreIdAsync(
        final String authorization,
        final String storeId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| authorization |  ``` Required ```  | A token that indicates a user has been previously authorized to perform an action in the system.  Passed in the form of a bearer token without encoding, e.g. `Bearer abcd123456789efghiljklmnoqrstuvwkxz` |
| storeId |  ``` Required ```  | The uuid for the store |


#### Example Usage

```java
String authorization = "Authorization";
String storeId = "store-id";
// Invoking the API call with sample inputs
registerManagement.getStoreTestConnectionByStoreIdAsync(authorization, storeId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | Authentication failed |
| 403 | Access denied |
| 404 | Entity not found |
| 422 | Validation failure |



#### <a name="create_store_register_consume_by_store_id_async"></a>![Method: ](http://apidocs.io/img/method.png "com.gotransverse.svs.webhook.client.controllers.RegisterManagementController.createStoreRegisterConsumeByStoreIdAsync") createStoreRegisterConsumeByStoreIdAsync

> *Tags:*  ``` Skips Authentication ``` 

> Adds one or more consumption transactions to a register


```java
void createStoreRegisterConsumeByStoreIdAsync(
        final String authorization,
        final String storeId,
        final String registerId,
        final List<StoredValueConsumption> consumption,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| authorization |  ``` Required ```  | A token that indicates a user has been previously authorized to perform an action in the system.  Passed in the form of a bearer token without encoding, e.g. `Bearer abcd123456789efghiljklmnoqrstuvwkxz` |
| storeId |  ``` Required ```  | The uuid of the store that owns the register |
| registerId |  ``` Required ```  | The uuid of the register |
| consumption |  ``` Required ```  ``` Collection ```  | The consumption transactions to post to the register |


#### Example Usage

```java
try {
    String authorization = "Authorization";
    String storeId = "store-id";
    String registerId = "register-id";
    List<StoredValueConsumption> consumption = new ArrayList<StoredValueConsumption>();
    // Invoking the API call with sample inputs
    registerManagement.createStoreRegisterConsumeByStoreIdAsync(authorization, storeId, registerId, consumption, new APICallBack<void>() {
        public void onSuccess(HttpContext context, void response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | Authentication failed |
| 403 | Access denied |
| 404 | Entity not found |
| 422 | Validation failure |



#### <a name="create_store_register_contribute_by_store_id_async"></a>![Method: ](http://apidocs.io/img/method.png "com.gotransverse.svs.webhook.client.controllers.RegisterManagementController.createStoreRegisterContributeByStoreIdAsync") createStoreRegisterContributeByStoreIdAsync

> *Tags:*  ``` Skips Authentication ``` 

> Adds one or more contribution transactions to a register


```java
void createStoreRegisterContributeByStoreIdAsync(
        final String authorization,
        final String storeId,
        final String registerId,
        final List<StoredValueContribution> contribution,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| authorization |  ``` Required ```  | A token that indicates a user has been previously authorized to perform an action in the system.  Passed in the form of a bearer token without encoding, e.g. `Bearer abcd123456789efghiljklmnoqrstuvwkxz` |
| storeId |  ``` Required ```  | The uuid of the store that owns the register |
| registerId |  ``` Required ```  | The uuid of the register |
| contribution |  ``` Required ```  ``` Collection ```  | The contribution transactions to post to the register |


#### Example Usage

```java
try {
    String authorization = "Authorization";
    String storeId = "store-id";
    String registerId = "register-id";
    List<StoredValueContribution> contribution = new ArrayList<StoredValueContribution>();
    // Invoking the API call with sample inputs
    registerManagement.createStoreRegisterContributeByStoreIdAsync(authorization, storeId, registerId, contribution, new APICallBack<void>() {
        public void onSuccess(HttpContext context, void response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | Authentication failed |
| 403 | Access denied |
| 404 | Entity not found |
| 422 | Validation failure |



#### <a name="get_store_register_daily_transactions_by_store_id_async"></a>![Method: ](http://apidocs.io/img/method.png "com.gotransverse.svs.webhook.client.controllers.RegisterManagementController.getStoreRegisterDailyTransactionsByStoreIdAsync") getStoreRegisterDailyTransactionsByStoreIdAsync

> *Tags:*  ``` Skips Authentication ``` 

> Gets a paged, filtered, sorted list of aggregated daily transactions for a register


```java
void getStoreRegisterDailyTransactionsByStoreIdAsync(
        final String authorization,
        final String storeId,
        final String registerId,
        final Integer pageSize,
        final Integer pageNumber,
        final APICallBack<List<StoredValueDailyTransaction>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| authorization |  ``` Required ```  | A token that indicates a user has been previously authorized to perform an action in the system.  Passed in the form of a bearer token without encoding, e.g. `Bearer abcd123456789efghiljklmnoqrstuvwkxz` |
| storeId |  ``` Required ```  | The uuid of the store that owns the register |
| registerId |  ``` Required ```  | The uuid of the register |
| pageSize |  ``` Optional ```  | The page size for the listing.  Defaults to 25, maximum value of 100 |
| pageNumber |  ``` Optional ```  | The page number for the listing.  Defaults to 1. |


#### Example Usage

```java
String authorization = "Authorization";
String storeId = "store-id";
String registerId = "register-id";
Integer pageSize = 194;
Integer pageNumber = 194;
// Invoking the API call with sample inputs
registerManagement.getStoreRegisterDailyTransactionsByStoreIdAsync(authorization, storeId, registerId, pageSize, pageNumber, new APICallBack<List<StoredValueDailyTransaction>>() {
    public void onSuccess(HttpContext context, List<StoredValueDailyTransaction> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | Authentication failed |
| 403 | Access denied |
| 404 | Entity not found |
| 422 | Validation failure |



#### <a name="get_store_external_account_id_balance_by_store_id_async"></a>![Method: ](http://apidocs.io/img/method.png "com.gotransverse.svs.webhook.client.controllers.RegisterManagementController.getStoreExternalAccountIdBalanceByStoreIdAsync") getStoreExternalAccountIdBalanceByStoreIdAsync

> *Tags:*  ``` Skips Authentication ``` 

> Gets the current balance of one or more registers by external account id


```java
void getStoreExternalAccountIdBalanceByStoreIdAsync(
        final String authorization,
        final String storeId,
        final String externalId,
        final APICallBack<List<RegisterBalance>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| authorization |  ``` Required ```  | A token that indicates a user has been previously authorized to perform an action in the system.  Passed in the form of a bearer token without encoding, e.g. `Bearer abcd123456789efghiljklmnoqrstuvwkxz` |
| storeId |  ``` Required ```  | The uuid of the store that owns the register. |
| externalId |  ``` Required ```  | The external account id associated with the register |


#### Example Usage

```java
String authorization = "Authorization";
String storeId = "store-id";
String externalId = "external-id";
// Invoking the API call with sample inputs
registerManagement.getStoreExternalAccountIdBalanceByStoreIdAsync(authorization, storeId, externalId, new APICallBack<List<RegisterBalance>>() {
    public void onSuccess(HttpContext context, List<RegisterBalance> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | Authentication failed |
| 403 | Access denied |
| 404 | Entity not found |
| 422 | Validation failure |



#### <a name="get_store_transaction_date_range_by_store_id_async"></a>![Method: ](http://apidocs.io/img/method.png "com.gotransverse.svs.webhook.client.controllers.RegisterManagementController.getStoreTransactionDateRangeByStoreIdAsync") getStoreTransactionDateRangeByStoreIdAsync

> *Tags:*  ``` Skips Authentication ``` 

> Gets the earliest transaction date (contribution or consumption) on a store


```java
void getStoreTransactionDateRangeByStoreIdAsync(
        final String authorization,
        final String storeId,
        final APICallBack<StoreDateRange> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| authorization |  ``` Required ```  | A token that indicates a user has been previously authorized to perform an action in the system.  Passed in the form of a bearer token without encoding, e.g. `Bearer abcd123456789efghiljklmnoqrstuvwkxz` |
| storeId |  ``` Required ```  | The uuid for the store |


#### Example Usage

```java
String authorization = "Authorization";
String storeId = "store-id";
// Invoking the API call with sample inputs
registerManagement.getStoreTransactionDateRangeByStoreIdAsync(authorization, storeId, new APICallBack<StoreDateRange>() {
    public void onSuccess(HttpContext context, StoreDateRange response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | Authentication failed |
| 403 | Access denied |
| 404 | Entity not found |
| 422 | Validation failure |



#### <a name="get_store_register_transactions_by_store_id_async"></a>![Method: ](http://apidocs.io/img/method.png "com.gotransverse.svs.webhook.client.controllers.RegisterManagementController.getStoreRegisterTransactionsByStoreIdAsync") getStoreRegisterTransactionsByStoreIdAsync

> *Tags:*  ``` Skips Authentication ``` 

> Gets a paged, filtered, sorted list of transactions for a register


```java
void getStoreRegisterTransactionsByStoreIdAsync(
        final String authorization,
        final String storeId,
        final String registerId,
        final SortEnum sort,
        final SortDirectionEnum sortDirection,
        final Long txnId,
        final Date txnDate,
        final String txnSourceId,
        final String txnSourceType,
        final TxnDirectionEnum txnDirection,
        final Integer pageSize,
        final Integer pageNumber,
        final APICallBack<List<StoredValueTransaction>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| authorization |  ``` Required ```  | A token that indicates a user has been previously authorized to perform an action in the system.  Passed in the form of a bearer token without encoding, e.g. `Bearer abcd123456789efghiljklmnoqrstuvwkxz` |
| storeId |  ``` Required ```  | The uuid of the store that owns the register |
| registerId |  ``` Required ```  | The uuid of the register |
| sort |  ``` Optional ```  ``` DefaultValue ```  | The sort field to sort on |
| sortDirection |  ``` Optional ```  ``` DefaultValue ```  | The direction of the sort |
| txnId |  ``` Optional ```  | The txn_id to filter on |
| txnDate |  ``` Optional ```  | A date to filter on |
| txnSourceId |  ``` Optional ```  | A source id to filter on |
| txnSourceType |  ``` Optional ```  | The source_type of the transaction. |
| txnDirection |  ``` Optional ```  | The direction of the transaction. |
| pageSize |  ``` Optional ```  | The page size for the listing.  Defaults to 25, maximum value of 100 |
| pageNumber |  ``` Optional ```  | The page number for the listing.  Defaults to 1. |


#### Example Usage

```java
String authorization = "Authorization";
String storeId = "store-id";
String registerId = "register-id";
SortEnum sort = SortEnum.fromString("txn_id");
SortDirectionEnum sortDirection = SortDirectionEnum.fromString("desc");
Long txnId = 194;
Date txnDate = new Date();
String txnSourceId = "txn_source_id";
String txnSourceType = "txn_source_type";
TxnDirectionEnum txnDirection = TxnDirectionEnum.fromString("CONTRIBUTION");
Integer pageSize = 194;
Integer pageNumber = 194;
// Invoking the API call with sample inputs
registerManagement.getStoreRegisterTransactionsByStoreIdAsync(authorization, storeId, registerId, sort, sortDirection, txnId, txnDate, txnSourceId, txnSourceType, txnDirection, pageSize, pageNumber, new APICallBack<List<StoredValueTransaction>>() {
    public void onSuccess(HttpContext context, List<StoredValueTransaction> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | Authentication failed |
| 403 | Access denied |
| 404 | Entity not found |
| 422 | Validation failure |



#### <a name="update_store_register_by_store_id_and_register_id_async"></a>![Method: ](http://apidocs.io/img/method.png "com.gotransverse.svs.webhook.client.controllers.RegisterManagementController.updateStoreRegisterByStoreIdAndRegisterIdAsync") updateStoreRegisterByStoreIdAndRegisterIdAsync

> *Tags:*  ``` Skips Authentication ``` 

> Updates a balance register


```java
void updateStoreRegisterByStoreIdAndRegisterIdAsync(
        final String authorization,
        final String storeId,
        final String registerId,
        final StoredValueRegister register,
        final APICallBack<StoredValueRegister> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| authorization |  ``` Required ```  | A token that indicates a user has been previously authorized to perform an action in the system.  Passed in the form of a bearer token without encoding, e.g. `Bearer abcd123456789efghiljklmnoqrstuvwkxz` |
| storeId |  ``` Required ```  | The uuid of the store that is updating the register. |
| registerId |  ``` Required ```  | The uuid of the register being updated |
| register |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String authorization = "Authorization";
    String storeId = "store-id";
    String registerId = "register-id";
    StoredValueRegister register = new StoredValueRegister();
    // Invoking the API call with sample inputs
    registerManagement.updateStoreRegisterByStoreIdAndRegisterIdAsync(authorization, storeId, registerId, register, new APICallBack<StoredValueRegister>() {
        public void onSuccess(HttpContext context, StoredValueRegister response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | Authentication failed |
| 403 | Access denied |
| 404 | Entity not found |
| 422 | Validation failure |



[Back to List of Controllers](#list_of_controllers)

### <a name="data_export_controller"></a>![Class: ](http://apidocs.io/img/class.png "com.gotransverse.svs.webhook.client.controllers.DataExportController") DataExportController

#### Get singleton instance

The singleton instance of the ``` DataExportController ``` class can be accessed from the API Client.

```java
DataExportController dataExport = client.getDataExport();
```

#### <a name="get_store_registers_export_daily_balances_async"></a>![Method: ](http://apidocs.io/img/method.png "com.gotransverse.svs.webhook.client.controllers.DataExportController.getStoreRegistersExportDailyBalancesAsync") getStoreRegistersExportDailyBalancesAsync

> *Tags:*  ``` Skips Authentication ``` 

> Retrieves balances by register as of a given date


```java
void getStoreRegistersExportDailyBalancesAsync(
        final String authorization,
        final String storeId,
        final TimezoneEnum timeZone,
        final Date asOfDate,
        final APICallBack<List<ExportRegisterBalance>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| authorization |  ``` Required ```  | A token that indicates a user has been previously authorized to perform an action in the system.  Passed in the form of a bearer token without encoding, e.g. `Bearer abcd123456789efghiljklmnoqrstuvwkxz` |
| storeId |  ``` Required ```  | The uuid for the store |
| timeZone |  ``` Required ```  | The name of the timezone. |
| asOfDate |  ``` Required ```  | The as of date to return records for. YYYY-MM-DD format |


#### Example Usage

```java
String authorization = "Authorization";
String storeId = "store-id";
TimezoneEnum timeZone = TimezoneEnum.fromString("Enum_Africa/Abidjan");
Date asOfDate = new Date();
// Invoking the API call with sample inputs
dataExport.getStoreRegistersExportDailyBalancesAsync(authorization, storeId, timeZone, asOfDate, new APICallBack<List<ExportRegisterBalance>>() {
    public void onSuccess(HttpContext context, List<ExportRegisterBalance> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | Authentication failed |
| 403 | Access denied |
| 404 | Entity not found |
| 422 | Validation failure |



#### <a name="get_store_registers_export_daily_balances_by_source_async"></a>![Method: ](http://apidocs.io/img/method.png "com.gotransverse.svs.webhook.client.controllers.DataExportController.getStoreRegistersExportDailyBalancesBySourceAsync") getStoreRegistersExportDailyBalancesBySourceAsync

> *Tags:*  ``` Skips Authentication ``` 

> Retrieves daily register balances as of a given date


```java
void getStoreRegistersExportDailyBalancesBySourceAsync(
        final String authorization,
        final String storeId,
        final TimezoneEnum timeZone,
        final Date asOfDate,
        final APICallBack<List<ExportRegisterBalanceBySource>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| authorization |  ``` Required ```  | A token that indicates a user has been previously authorized to perform an action in the system.  Passed in the form of a bearer token without encoding, e.g. `Bearer abcd123456789efghiljklmnoqrstuvwkxz` |
| storeId |  ``` Required ```  | The uuid for the store |
| timeZone |  ``` Required ```  | The name of the timezone. |
| asOfDate |  ``` Required ```  | The as of date to return records for. YYYY-MM-DD format |


#### Example Usage

```java
String authorization = "Authorization";
String storeId = "store-id";
TimezoneEnum timeZone = TimezoneEnum.fromString("Enum_Africa/Abidjan");
Date asOfDate = new Date();
// Invoking the API call with sample inputs
dataExport.getStoreRegistersExportDailyBalancesBySourceAsync(authorization, storeId, timeZone, asOfDate, new APICallBack<List<ExportRegisterBalanceBySource>>() {
    public void onSuccess(HttpContext context, List<ExportRegisterBalanceBySource> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | Authentication failed |
| 403 | Access denied |
| 404 | Entity not found |
| 422 | Validation failure |



#### <a name="get_store_registers_export_daily_consumptions_by_source_async"></a>![Method: ](http://apidocs.io/img/method.png "com.gotransverse.svs.webhook.client.controllers.DataExportController.getStoreRegistersExportDailyConsumptionsBySourceAsync") getStoreRegistersExportDailyConsumptionsBySourceAsync

> *Tags:*  ``` Skips Authentication ``` 

> Retrieves a list of daily weighted consumptions for a given store


```java
void getStoreRegistersExportDailyConsumptionsBySourceAsync(
        final String authorization,
        final String storeId,
        final TimezoneEnum timeZone,
        final Date fromDate,
        final Date toDate,
        final APICallBack<List<ExportRegisterWeightedConsumptionBySource>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| authorization |  ``` Required ```  | A token that indicates a user has been previously authorized to perform an action in the system.  Passed in the form of a bearer token without encoding, e.g. `Bearer abcd123456789efghiljklmnoqrstuvwkxz` |
| storeId |  ``` Required ```  | The uuid for the store |
| timeZone |  ``` Required ```  | The name of the timezone. |
| fromDate |  ``` Required ```  | The from date to export in YYYY-MM-DD format |
| toDate |  ``` Required ```  | The to date to export in YYYY-MM-DD format |


#### Example Usage

```java
String authorization = "Authorization";
String storeId = "store-id";
TimezoneEnum timeZone = TimezoneEnum.fromString("Enum_Africa/Abidjan");
Date fromDate = new Date();
Date toDate = new Date();
// Invoking the API call with sample inputs
dataExport.getStoreRegistersExportDailyConsumptionsBySourceAsync(authorization, storeId, timeZone, fromDate, toDate, new APICallBack<List<ExportRegisterWeightedConsumptionBySource>>() {
    public void onSuccess(HttpContext context, List<ExportRegisterWeightedConsumptionBySource> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | Authentication failed |
| 403 | Access denied |
| 404 | Entity not found |
| 422 | Validation failure |



[Back to List of Controllers](#list_of_controllers)




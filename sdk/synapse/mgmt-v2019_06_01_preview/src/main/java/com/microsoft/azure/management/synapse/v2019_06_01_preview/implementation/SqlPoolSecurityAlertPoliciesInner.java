/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in SqlPoolSecurityAlertPolicies.
 */
public class SqlPoolSecurityAlertPoliciesInner {
    /** The Retrofit service to perform REST calls. */
    private SqlPoolSecurityAlertPoliciesService service;
    /** The service client containing this operation class. */
    private SynapseManagementClientImpl client;

    /**
     * Initializes an instance of SqlPoolSecurityAlertPoliciesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public SqlPoolSecurityAlertPoliciesInner(Retrofit retrofit, SynapseManagementClientImpl client) {
        this.service = retrofit.create(SqlPoolSecurityAlertPoliciesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for SqlPoolSecurityAlertPolicies to be
     * used by Retrofit to perform actually REST calls.
     */
    interface SqlPoolSecurityAlertPoliciesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2019_06_01_preview.SqlPoolSecurityAlertPolicies get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/sqlPools/{sqlPoolName}/securityAlertPolicies/{securityAlertPolicyName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("sqlPoolName") String sqlPoolName, @Path("securityAlertPolicyName") String securityAlertPolicyName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2019_06_01_preview.SqlPoolSecurityAlertPolicies createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/sqlPools/{sqlPoolName}/securityAlertPolicies/{securityAlertPolicyName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("sqlPoolName") String sqlPoolName, @Path("securityAlertPolicyName") String securityAlertPolicyName, @Query("api-version") String apiVersion, @Body SqlPoolSecurityAlertPolicyInner parameters, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Get a Sql pool's security alert policy.
     * Get a Sql pool's security alert policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SqlPoolSecurityAlertPolicyInner object if successful.
     */
    public SqlPoolSecurityAlertPolicyInner get(String resourceGroupName, String workspaceName, String sqlPoolName) {
        return getWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName).toBlocking().single().body();
    }

    /**
     * Get a Sql pool's security alert policy.
     * Get a Sql pool's security alert policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SqlPoolSecurityAlertPolicyInner> getAsync(String resourceGroupName, String workspaceName, String sqlPoolName, final ServiceCallback<SqlPoolSecurityAlertPolicyInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName), serviceCallback);
    }

    /**
     * Get a Sql pool's security alert policy.
     * Get a Sql pool's security alert policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SqlPoolSecurityAlertPolicyInner object
     */
    public Observable<SqlPoolSecurityAlertPolicyInner> getAsync(String resourceGroupName, String workspaceName, String sqlPoolName) {
        return getWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName).map(new Func1<ServiceResponse<SqlPoolSecurityAlertPolicyInner>, SqlPoolSecurityAlertPolicyInner>() {
            @Override
            public SqlPoolSecurityAlertPolicyInner call(ServiceResponse<SqlPoolSecurityAlertPolicyInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get a Sql pool's security alert policy.
     * Get a Sql pool's security alert policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SqlPoolSecurityAlertPolicyInner object
     */
    public Observable<ServiceResponse<SqlPoolSecurityAlertPolicyInner>> getWithServiceResponseAsync(String resourceGroupName, String workspaceName, String sqlPoolName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (sqlPoolName == null) {
            throw new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String securityAlertPolicyName = "default";
        return service.get(this.client.subscriptionId(), resourceGroupName, workspaceName, sqlPoolName, securityAlertPolicyName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SqlPoolSecurityAlertPolicyInner>>>() {
                @Override
                public Observable<ServiceResponse<SqlPoolSecurityAlertPolicyInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SqlPoolSecurityAlertPolicyInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<SqlPoolSecurityAlertPolicyInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SqlPoolSecurityAlertPolicyInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SqlPoolSecurityAlertPolicyInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Create or update a Sql pool's security alert policy.
     * Create or update a Sql pool's security alert policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param parameters The Sql pool security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SqlPoolSecurityAlertPolicyInner object if successful.
     */
    public SqlPoolSecurityAlertPolicyInner createOrUpdate(String resourceGroupName, String workspaceName, String sqlPoolName, SqlPoolSecurityAlertPolicyInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName, parameters).toBlocking().single().body();
    }

    /**
     * Create or update a Sql pool's security alert policy.
     * Create or update a Sql pool's security alert policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param parameters The Sql pool security alert policy.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SqlPoolSecurityAlertPolicyInner> createOrUpdateAsync(String resourceGroupName, String workspaceName, String sqlPoolName, SqlPoolSecurityAlertPolicyInner parameters, final ServiceCallback<SqlPoolSecurityAlertPolicyInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName, parameters), serviceCallback);
    }

    /**
     * Create or update a Sql pool's security alert policy.
     * Create or update a Sql pool's security alert policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param parameters The Sql pool security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SqlPoolSecurityAlertPolicyInner object
     */
    public Observable<SqlPoolSecurityAlertPolicyInner> createOrUpdateAsync(String resourceGroupName, String workspaceName, String sqlPoolName, SqlPoolSecurityAlertPolicyInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName, parameters).map(new Func1<ServiceResponse<SqlPoolSecurityAlertPolicyInner>, SqlPoolSecurityAlertPolicyInner>() {
            @Override
            public SqlPoolSecurityAlertPolicyInner call(ServiceResponse<SqlPoolSecurityAlertPolicyInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Create or update a Sql pool's security alert policy.
     * Create or update a Sql pool's security alert policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param parameters The Sql pool security alert policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SqlPoolSecurityAlertPolicyInner object
     */
    public Observable<ServiceResponse<SqlPoolSecurityAlertPolicyInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String workspaceName, String sqlPoolName, SqlPoolSecurityAlertPolicyInner parameters) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (sqlPoolName == null) {
            throw new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        final String securityAlertPolicyName = "default";
        return service.createOrUpdate(this.client.subscriptionId(), resourceGroupName, workspaceName, sqlPoolName, securityAlertPolicyName, this.client.apiVersion(), parameters, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SqlPoolSecurityAlertPolicyInner>>>() {
                @Override
                public Observable<ServiceResponse<SqlPoolSecurityAlertPolicyInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SqlPoolSecurityAlertPolicyInner> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<SqlPoolSecurityAlertPolicyInner> createOrUpdateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SqlPoolSecurityAlertPolicyInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SqlPoolSecurityAlertPolicyInner>() { }.getType())
                .register(201, new TypeToken<SqlPoolSecurityAlertPolicyInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}

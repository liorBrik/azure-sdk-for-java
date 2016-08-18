/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources.implementation;

import com.microsoft.azure.management.resources.GenericResource;
import com.microsoft.azure.management.resources.Plan;
import com.microsoft.azure.management.resources.fluentcore.arm.models.implementation.GroupableResourceImpl;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import rx.Observable;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * The implementation for {@link GenericResource} and its nested interfaces.
 */
final class GenericResourceImpl
    extends GroupableResourceImpl<
        GenericResource,
        GenericResourceInner,
        GenericResourceImpl,
        ResourceManager>
    implements
        GenericResource,
        GenericResource.Definition,
        GenericResource.UpdateStages.WithApiVersion,
        GenericResource.Update {
    private final ResourcesInner client;
    private String resourceProviderNamespace;
    private String parentResourceId;
    private String resourceType;
    private String apiVersion;

    GenericResourceImpl(String key,
                        GenericResourceInner innerModel,
                        ResourcesInner client,
                        final ResourceManagementClientImpl serviceClient,
                        final ResourceManager resourceManager) {
        super(key, innerModel, resourceManager);
        this.client = client;
    }

    @Override
    public String resourceProviderNamespace() {
        return resourceProviderNamespace;
    }

    @Override
    public String parentResourceId() {
        return parentResourceId;
    }

    @Override
    public String resourceType() {
        return resourceType;
    }

    @Override
    public String apiVersion() {
        return apiVersion;
    }

    @Override
    public Plan plan() {
        return inner().plan();
    }

    @Override
    public Object properties() {
        return inner().properties();
    }

    @Override
    public GenericResource refresh() throws Exception {
        return null;
    }

    public GenericResourceImpl withProperties(Object properties) {
            inner().withProperties(properties);
        return this;
    }

    @Override
    public GenericResourceImpl withParentResource(String parentResourceId) {
        this.parentResourceId = parentResourceId;
        return this;
    }

    public GenericResourceImpl withPlan(String name, String publisher, String product, String promotionCode) {
            inner().withPlan(new Plan().withName(name).withPublisher(publisher).withProduct(product).withPromotionCode(promotionCode));
        return this;
    }

    @Override
    public GenericResourceImpl withoutPlan() {
            inner().withPlan(null);
        return this;
    }

    @Override
    public GenericResourceImpl withProviderNamespace(String resourceProviderNamespace) {
        this.resourceProviderNamespace = resourceProviderNamespace;
        return this;
    }

    @Override
    public GenericResourceImpl withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    @Override
    public GenericResourceImpl withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    @Override
    public GenericResourceImpl create() throws Exception {
        createResource();
        return this;
    }

    public ServiceCall<GenericResource> createAsync(final ServiceCallback<GenericResource> callback) {
        final ServiceCall<GenericResource> serviceCall = new ServiceCall<>(null);
        createAsync().subscribe(new Action1<GenericResource>() {
            @Override
            public void call(GenericResource fluentModelT) {
                serviceCall.success(new ServiceResponse<>(fluentModelT, null));
                if (callback != null) {
                    callback.success(new ServiceResponse<>(fluentModelT, null));
                }
            }
        }, new Action1<Throwable>() {
            @Override
            public void call(Throwable throwable) {
                serviceCall.failure(throwable);
                if (callback != null) {
                    callback.failure(throwable);
                }
            }
        });
        return serviceCall;
    }

    @Override
    public Observable<GenericResource> createAsync() {
        return createResourceAsync();
    }

    @Override
    public GenericResourceImpl apply() throws Exception {
        return create();
    }

    @Override
    public Observable<GenericResource> applyAsync() {
        return createAsync();
    }

    @Override
    public ServiceCall<GenericResource> applyAsync(ServiceCallback<GenericResource> callback) {
        return createAsync(callback);
    }

    // CreatorTaskGroup.ResourceCreator implementation

    @Override
    public GenericResource createResource() throws Exception {
        GenericResourceInner inner = client.createOrUpdate(
                resourceGroupName(),
                resourceProviderNamespace,
                parentResourceId,
                resourceType,
                name(),
                apiVersion,
                inner()
        ).getBody();
        this.setInner(inner);
        return this;
    }

    @Override
    public Observable<GenericResource> createResourceAsync() {
        return client.createOrUpdateAsync(
                resourceGroupName(),
                resourceProviderNamespace,
                parentResourceId,
                resourceType,
                name(),
                apiVersion,
                inner(),
                null)
                .observable()
                .subscribeOn(Schedulers.io())
                .map(innerToFluentMap(this));
    }
}

/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.apimanagement.v2019_01_01.UserIdentities;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.apimanagement.v2019_01_01.UserIdentityContract;

class UserIdentitiesImpl extends WrapperImpl<UserIdentitiesInner> implements UserIdentities {
    private final ApiManagementManager manager;

    UserIdentitiesImpl(ApiManagementManager manager) {
        super(manager.inner().userIdentities());
        this.manager = manager;
    }

    public ApiManagementManager manager() {
        return this.manager;
    }

    private UserIdentityContractImpl wrapModel(UserIdentityContractInner inner) {
        return  new UserIdentityContractImpl(inner, manager());
    }

    @Override
    public Observable<UserIdentityContract> listAsync(final String resourceGroupName, final String serviceName, final String userId) {
        UserIdentitiesInner client = this.inner();
        return client.listAsync(resourceGroupName, serviceName, userId)
        .flatMapIterable(new Func1<Page<UserIdentityContractInner>, Iterable<UserIdentityContractInner>>() {
            @Override
            public Iterable<UserIdentityContractInner> call(Page<UserIdentityContractInner> page) {
                return page.items();
            }
        })
        .map(new Func1<UserIdentityContractInner, UserIdentityContract>() {
            @Override
            public UserIdentityContract call(UserIdentityContractInner inner) {
                return wrapModel(inner);
            }
        });
    }

}

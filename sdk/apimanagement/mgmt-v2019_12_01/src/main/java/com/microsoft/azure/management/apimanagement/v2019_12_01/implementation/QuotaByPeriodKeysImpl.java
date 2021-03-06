/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.apimanagement.v2019_12_01.QuotaByPeriodKeys;
import rx.Observable;
import rx.functions.Func1;
import rx.Completable;
import com.microsoft.azure.management.apimanagement.v2019_12_01.QuotaCounterValueContractProperties;
import com.microsoft.azure.management.apimanagement.v2019_12_01.QuotaCounterContract;

class QuotaByPeriodKeysImpl extends WrapperImpl<QuotaByPeriodKeysInner> implements QuotaByPeriodKeys {
    private final ApiManagementManager manager;

    QuotaByPeriodKeysImpl(ApiManagementManager manager) {
        super(manager.inner().quotaByPeriodKeys());
        this.manager = manager;
    }

    public ApiManagementManager manager() {
        return this.manager;
    }

    private QuotaCounterContractImpl wrapModel(QuotaCounterContractInner inner) {
        return  new QuotaCounterContractImpl(inner, manager());
    }

    @Override
    public Completable updateAsync(String resourceGroupName, String serviceName, String quotaCounterKey, String quotaPeriodKey, QuotaCounterValueContractProperties parameters) {
        QuotaByPeriodKeysInner client = this.inner();
        return client.updateAsync(resourceGroupName, serviceName, quotaCounterKey, quotaPeriodKey, parameters).toCompletable();
    }

    @Override
    public Observable<QuotaCounterContract> getAsync(String resourceGroupName, String serviceName, String quotaCounterKey, String quotaPeriodKey) {
        QuotaByPeriodKeysInner client = this.inner();
        return client.getAsync(resourceGroupName, serviceName, quotaCounterKey, quotaPeriodKey)
        .flatMap(new Func1<QuotaCounterContractInner, Observable<QuotaCounterContract>>() {
            @Override
            public Observable<QuotaCounterContract> call(QuotaCounterContractInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((QuotaCounterContract)wrapModel(inner));
                }
            }
       });
    }

}

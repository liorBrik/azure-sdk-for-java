/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.SqlPoolOperationResults;
import rx.functions.Func1;
import rx.Observable;

class SqlPoolOperationResultsImpl extends WrapperImpl<SqlPoolOperationResultsInner> implements SqlPoolOperationResults {
    private final SynapseManager manager;

    SqlPoolOperationResultsImpl(SynapseManager manager) {
        super(manager.inner().sqlPoolOperationResults());
        this.manager = manager;
    }

    public SynapseManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Object> getLocationHeaderResultAsync(String resourceGroupName, String workspaceName, String sqlPoolName, String operationId) {
        SqlPoolOperationResultsInner client = this.inner();
        return client.getLocationHeaderResultAsync(resourceGroupName, workspaceName, sqlPoolName, operationId)
    ;}

}

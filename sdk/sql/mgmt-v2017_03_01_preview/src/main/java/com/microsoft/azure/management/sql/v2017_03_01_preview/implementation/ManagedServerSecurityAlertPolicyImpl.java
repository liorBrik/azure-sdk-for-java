/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview.implementation;

import com.microsoft.azure.management.sql.v2017_03_01_preview.ManagedServerSecurityAlertPolicy;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.sql.v2017_03_01_preview.SecurityAlertPolicyState;
import java.util.List;
import org.joda.time.DateTime;

class ManagedServerSecurityAlertPolicyImpl extends CreatableUpdatableImpl<ManagedServerSecurityAlertPolicy, ManagedServerSecurityAlertPolicyInner, ManagedServerSecurityAlertPolicyImpl> implements ManagedServerSecurityAlertPolicy, ManagedServerSecurityAlertPolicy.Definition, ManagedServerSecurityAlertPolicy.Update {
    private final SqlManager manager;
    private String resourceGroupName;
    private String managedInstanceName;

    ManagedServerSecurityAlertPolicyImpl(String name, SqlManager manager) {
        super(name, new ManagedServerSecurityAlertPolicyInner());
        this.manager = manager;
        // Set resource name
        this.managedInstanceName = name;
        //
    }

    ManagedServerSecurityAlertPolicyImpl(ManagedServerSecurityAlertPolicyInner inner, SqlManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.managedInstanceName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.managedInstanceName = IdParsingUtils.getValueFromIdByName(inner.id(), "managedInstances");
        //
    }

    @Override
    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ManagedServerSecurityAlertPolicy> createResourceAsync() {
        ManagedServerSecurityAlertPoliciesInner client = this.manager().inner().managedServerSecurityAlertPolicies();
        return client.createOrUpdateAsync(this.resourceGroupName, this.managedInstanceName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ManagedServerSecurityAlertPolicy> updateResourceAsync() {
        ManagedServerSecurityAlertPoliciesInner client = this.manager().inner().managedServerSecurityAlertPolicies();
        return client.createOrUpdateAsync(this.resourceGroupName, this.managedInstanceName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ManagedServerSecurityAlertPolicyInner> getInnerAsync() {
        ManagedServerSecurityAlertPoliciesInner client = this.manager().inner().managedServerSecurityAlertPolicies();
        return client.getAsync(this.resourceGroupName, this.managedInstanceName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public DateTime creationTime() {
        return this.inner().creationTime();
    }

    @Override
    public List<String> disabledAlerts() {
        return this.inner().disabledAlerts();
    }

    @Override
    public Boolean emailAccountAdmins() {
        return this.inner().emailAccountAdmins();
    }

    @Override
    public List<String> emailAddresses() {
        return this.inner().emailAddresses();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Integer retentionDays() {
        return this.inner().retentionDays();
    }

    @Override
    public SecurityAlertPolicyState state() {
        return this.inner().state();
    }

    @Override
    public String storageAccountAccessKey() {
        return this.inner().storageAccountAccessKey();
    }

    @Override
    public String storageEndpoint() {
        return this.inner().storageEndpoint();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public ManagedServerSecurityAlertPolicyImpl withExistingManagedInstance(String resourceGroupName, String managedInstanceName) {
        this.resourceGroupName = resourceGroupName;
        this.managedInstanceName = managedInstanceName;
        return this;
    }

    @Override
    public ManagedServerSecurityAlertPolicyImpl withState(SecurityAlertPolicyState state) {
        this.inner().withState(state);
        return this;
    }

    @Override
    public ManagedServerSecurityAlertPolicyImpl withDisabledAlerts(List<String> disabledAlerts) {
        this.inner().withDisabledAlerts(disabledAlerts);
        return this;
    }

    @Override
    public ManagedServerSecurityAlertPolicyImpl withEmailAccountAdmins(Boolean emailAccountAdmins) {
        this.inner().withEmailAccountAdmins(emailAccountAdmins);
        return this;
    }

    @Override
    public ManagedServerSecurityAlertPolicyImpl withEmailAddresses(List<String> emailAddresses) {
        this.inner().withEmailAddresses(emailAddresses);
        return this;
    }

    @Override
    public ManagedServerSecurityAlertPolicyImpl withRetentionDays(Integer retentionDays) {
        this.inner().withRetentionDays(retentionDays);
        return this;
    }

    @Override
    public ManagedServerSecurityAlertPolicyImpl withStorageAccountAccessKey(String storageAccountAccessKey) {
        this.inner().withStorageAccountAccessKey(storageAccountAccessKey);
        return this;
    }

    @Override
    public ManagedServerSecurityAlertPolicyImpl withStorageEndpoint(String storageEndpoint) {
        this.inner().withStorageEndpoint(storageEndpoint);
        return this;
    }

}

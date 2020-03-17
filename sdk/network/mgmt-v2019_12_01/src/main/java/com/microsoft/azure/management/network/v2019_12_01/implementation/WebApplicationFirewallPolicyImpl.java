/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_12_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.network.v2019_12_01.WebApplicationFirewallPolicy;
import rx.Observable;
import com.microsoft.azure.management.network.v2019_12_01.PolicySettings;
import java.util.List;
import com.microsoft.azure.management.network.v2019_12_01.WebApplicationFirewallCustomRule;
import com.microsoft.azure.management.network.v2019_12_01.ProvisioningState;
import com.microsoft.azure.management.network.v2019_12_01.WebApplicationFirewallPolicyResourceState;
import com.microsoft.azure.management.network.v2019_12_01.ManagedRulesDefinition;
import com.microsoft.azure.SubResource;
import java.util.ArrayList;
import com.microsoft.azure.management.network.v2019_12_01.ApplicationGateway;

class WebApplicationFirewallPolicyImpl extends GroupableResourceCoreImpl<WebApplicationFirewallPolicy, WebApplicationFirewallPolicyInner, WebApplicationFirewallPolicyImpl, NetworkManager> implements WebApplicationFirewallPolicy, WebApplicationFirewallPolicy.Definition, WebApplicationFirewallPolicy.Update {
    WebApplicationFirewallPolicyImpl(String name, WebApplicationFirewallPolicyInner inner, NetworkManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<WebApplicationFirewallPolicy> createResourceAsync() {
        WebApplicationFirewallPoliciesInner client = this.manager().inner().webApplicationFirewallPolicies();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<WebApplicationFirewallPolicy> updateResourceAsync() {
        WebApplicationFirewallPoliciesInner client = this.manager().inner().webApplicationFirewallPolicies();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<WebApplicationFirewallPolicyInner> getInnerAsync() {
        WebApplicationFirewallPoliciesInner client = this.manager().inner().webApplicationFirewallPolicies();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public List<ApplicationGateway> applicationGateways() {
        List<ApplicationGateway> lst = new ArrayList<ApplicationGateway>();
        if (this.inner().applicationGateways() != null) {
            for (ApplicationGatewayInner inner : this.inner().applicationGateways()) {
                lst.add( new ApplicationGatewayImpl(inner.name(), inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public List<WebApplicationFirewallCustomRule> customRules() {
        return this.inner().customRules();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public List<SubResource> httpListeners() {
        return this.inner().httpListeners();
    }

    @Override
    public ManagedRulesDefinition managedRules() {
        return this.inner().managedRules();
    }

    @Override
    public List<SubResource> pathBasedRules() {
        return this.inner().pathBasedRules();
    }

    @Override
    public PolicySettings policySettings() {
        return this.inner().policySettings();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public WebApplicationFirewallPolicyResourceState resourceState() {
        return this.inner().resourceState();
    }

    @Override
    public WebApplicationFirewallPolicyImpl withManagedRules(ManagedRulesDefinition managedRules) {
        this.inner().withManagedRules(managedRules);
        return this;
    }

    @Override
    public WebApplicationFirewallPolicyImpl withCustomRules(List<WebApplicationFirewallCustomRule> customRules) {
        this.inner().withCustomRules(customRules);
        return this;
    }

    @Override
    public WebApplicationFirewallPolicyImpl withPolicySettings(PolicySettings policySettings) {
        this.inner().withPolicySettings(policySettings);
        return this;
    }

}

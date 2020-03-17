/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_12_01.implementation;

import com.microsoft.azure.management.network.v2019_12_01.FirewallPolicyRuleGroup;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.network.v2019_12_01.FirewallPolicyRule;
import com.microsoft.azure.management.network.v2019_12_01.ProvisioningState;

class FirewallPolicyRuleGroupImpl extends CreatableUpdatableImpl<FirewallPolicyRuleGroup, FirewallPolicyRuleGroupInner, FirewallPolicyRuleGroupImpl> implements FirewallPolicyRuleGroup, FirewallPolicyRuleGroup.Definition, FirewallPolicyRuleGroup.Update {
    private final NetworkManager manager;
    private String resourceGroupName;
    private String firewallPolicyName;
    private String ruleGroupName;

    FirewallPolicyRuleGroupImpl(String name, NetworkManager manager) {
        super(name, new FirewallPolicyRuleGroupInner());
        this.manager = manager;
        // Set resource name
        this.ruleGroupName = name;
        //
    }

    FirewallPolicyRuleGroupImpl(FirewallPolicyRuleGroupInner inner, NetworkManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.ruleGroupName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.firewallPolicyName = IdParsingUtils.getValueFromIdByName(inner.id(), "firewallPolicies");
        this.ruleGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "ruleGroups");
        //
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public Observable<FirewallPolicyRuleGroup> createResourceAsync() {
        FirewallPolicyRuleGroupsInner client = this.manager().inner().firewallPolicyRuleGroups();
        return client.createOrUpdateAsync(this.resourceGroupName, this.firewallPolicyName, this.ruleGroupName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<FirewallPolicyRuleGroup> updateResourceAsync() {
        FirewallPolicyRuleGroupsInner client = this.manager().inner().firewallPolicyRuleGroups();
        return client.createOrUpdateAsync(this.resourceGroupName, this.firewallPolicyName, this.ruleGroupName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<FirewallPolicyRuleGroupInner> getInnerAsync() {
        FirewallPolicyRuleGroupsInner client = this.manager().inner().firewallPolicyRuleGroups();
        return client.getAsync(this.resourceGroupName, this.firewallPolicyName, this.ruleGroupName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String etag() {
        return this.inner().etag();
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
    public Integer priority() {
        return this.inner().priority();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public List<FirewallPolicyRule> rules() {
        return this.inner().rules();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public FirewallPolicyRuleGroupImpl withExistingFirewallPolicy(String resourceGroupName, String firewallPolicyName) {
        this.resourceGroupName = resourceGroupName;
        this.firewallPolicyName = firewallPolicyName;
        return this;
    }

    @Override
    public FirewallPolicyRuleGroupImpl withId(String id) {
        this.inner().withId(id);
        return this;
    }

    @Override
    public FirewallPolicyRuleGroupImpl withName(String name) {
        this.inner().withName(name);
        return this;
    }

    @Override
    public FirewallPolicyRuleGroupImpl withPriority(Integer priority) {
        this.inner().withPriority(priority);
        return this;
    }

    @Override
    public FirewallPolicyRuleGroupImpl withRules(List<FirewallPolicyRule> rules) {
        this.inner().withRules(rules);
        return this;
    }

}

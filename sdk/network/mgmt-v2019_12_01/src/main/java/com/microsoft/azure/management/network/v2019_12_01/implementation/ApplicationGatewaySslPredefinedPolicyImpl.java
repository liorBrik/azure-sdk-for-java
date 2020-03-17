/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_12_01.implementation;

import com.microsoft.azure.management.network.v2019_12_01.ApplicationGatewaySslPredefinedPolicy;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.network.v2019_12_01.ApplicationGatewaySslCipherSuite;
import com.microsoft.azure.management.network.v2019_12_01.ApplicationGatewaySslProtocol;

class ApplicationGatewaySslPredefinedPolicyImpl extends WrapperImpl<ApplicationGatewaySslPredefinedPolicyInner> implements ApplicationGatewaySslPredefinedPolicy {
    private final NetworkManager manager;
    ApplicationGatewaySslPredefinedPolicyImpl(ApplicationGatewaySslPredefinedPolicyInner inner, NetworkManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public List<ApplicationGatewaySslCipherSuite> cipherSuites() {
        return this.inner().cipherSuites();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public ApplicationGatewaySslProtocol minProtocolVersion() {
        return this.inner().minProtocolVersion();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

}

/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_12_01;

import com.microsoft.azure.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains the DDoS protection settings of the public IP.
 */
public class DdosSettings {
    /**
     * The DDoS custom policy associated with the public IP.
     */
    @JsonProperty(value = "ddosCustomPolicy")
    private SubResource ddosCustomPolicy;

    /**
     * The DDoS protection policy customizability of the public IP. Only
     * standard coverage will have the ability to be customized. Possible
     * values include: 'Basic', 'Standard'.
     */
    @JsonProperty(value = "protectionCoverage")
    private DdosSettingsProtectionCoverage protectionCoverage;

    /**
     * Enables DDoS protection on the public IP.
     */
    @JsonProperty(value = "protectedIP")
    private Boolean protectedIP;

    /**
     * Get the DDoS custom policy associated with the public IP.
     *
     * @return the ddosCustomPolicy value
     */
    public SubResource ddosCustomPolicy() {
        return this.ddosCustomPolicy;
    }

    /**
     * Set the DDoS custom policy associated with the public IP.
     *
     * @param ddosCustomPolicy the ddosCustomPolicy value to set
     * @return the DdosSettings object itself.
     */
    public DdosSettings withDdosCustomPolicy(SubResource ddosCustomPolicy) {
        this.ddosCustomPolicy = ddosCustomPolicy;
        return this;
    }

    /**
     * Get the DDoS protection policy customizability of the public IP. Only standard coverage will have the ability to be customized. Possible values include: 'Basic', 'Standard'.
     *
     * @return the protectionCoverage value
     */
    public DdosSettingsProtectionCoverage protectionCoverage() {
        return this.protectionCoverage;
    }

    /**
     * Set the DDoS protection policy customizability of the public IP. Only standard coverage will have the ability to be customized. Possible values include: 'Basic', 'Standard'.
     *
     * @param protectionCoverage the protectionCoverage value to set
     * @return the DdosSettings object itself.
     */
    public DdosSettings withProtectionCoverage(DdosSettingsProtectionCoverage protectionCoverage) {
        this.protectionCoverage = protectionCoverage;
        return this;
    }

    /**
     * Get enables DDoS protection on the public IP.
     *
     * @return the protectedIP value
     */
    public Boolean protectedIP() {
        return this.protectedIP;
    }

    /**
     * Set enables DDoS protection on the public IP.
     *
     * @param protectedIP the protectedIP value to set
     * @return the DdosSettings object itself.
     */
    public DdosSettings withProtectedIP(Boolean protectedIP) {
        this.protectedIP = protectedIP;
        return this;
    }

}

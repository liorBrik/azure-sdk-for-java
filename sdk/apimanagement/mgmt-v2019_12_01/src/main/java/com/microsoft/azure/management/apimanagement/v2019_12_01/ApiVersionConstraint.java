/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Control Plane Apis version constraint for the API Management service.
 */
public class ApiVersionConstraint {
    /**
     * Limit control plane API calls to API Management service with version
     * equal to or newer than this value.
     */
    @JsonProperty(value = "minApiVersion")
    private String minApiVersion;

    /**
     * Get limit control plane API calls to API Management service with version equal to or newer than this value.
     *
     * @return the minApiVersion value
     */
    public String minApiVersion() {
        return this.minApiVersion;
    }

    /**
     * Set limit control plane API calls to API Management service with version equal to or newer than this value.
     *
     * @param minApiVersion the minApiVersion value to set
     * @return the ApiVersionConstraint object itself.
     */
    public ApiVersionConstraint withMinApiVersion(String minApiVersion) {
        this.minApiVersion = minApiVersion;
        return this;
    }

}

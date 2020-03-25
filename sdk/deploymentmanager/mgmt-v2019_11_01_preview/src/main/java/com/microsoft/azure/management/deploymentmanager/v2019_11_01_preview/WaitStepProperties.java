/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Defines the properties of a Wait step.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "stepType", defaultImpl = WaitStepProperties.class)
@JsonTypeName("Wait")
public class WaitStepProperties extends StepProperties {
    /**
     * The Wait attributes.
     */
    @JsonProperty(value = "attributes", required = true)
    private WaitStepAttributes attributes;

    /**
     * Get the Wait attributes.
     *
     * @return the attributes value
     */
    public WaitStepAttributes attributes() {
        return this.attributes;
    }

    /**
     * Set the Wait attributes.
     *
     * @param attributes the attributes value to set
     * @return the WaitStepProperties object itself.
     */
    public WaitStepProperties withAttributes(WaitStepAttributes attributes) {
        this.attributes = attributes;
        return this;
    }

}

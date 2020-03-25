// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/**
 * Additional parameters for a set of operations.
 */
@Fluent
public final class RequestOptions {
    /*
     * The tracking ID sent with the request to help with debugging.
     */
    @JsonProperty(value = "")
    private UUID xMsClientRequestId;

    /**
     * Get the xMsClientRequestId property: The tracking ID sent with the
     * request to help with debugging.
     *
     * @return the xMsClientRequestId value.
     */
    public UUID getXMsClientRequestId() {
        return this.xMsClientRequestId;
    }

    /**
     * Set the xMsClientRequestId property: The tracking ID sent with the
     * request to help with debugging.
     *
     * @param xMsClientRequestId the xMsClientRequestId value to set.
     * @return the RequestOptions object itself.
     */
    public RequestOptions setXMsClientRequestId(UUID xMsClientRequestId) {
        this.xMsClientRequestId = xMsClientRequestId;
        return this;
    }
}

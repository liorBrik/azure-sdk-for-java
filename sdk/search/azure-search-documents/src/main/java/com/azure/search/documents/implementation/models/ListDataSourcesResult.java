// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.search.documents.models.DataSource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Response from a List Datasources request. If successful, it includes the
 * full definitions of all datasources.
 */
@Fluent
public final class ListDataSourcesResult {
    /*
     * The datasources in the Search service.
     */
    @JsonProperty(value = "value", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private List<DataSource> dataSources;

    /**
     * Get the dataSources property: The datasources in the Search service.
     *
     * @return the dataSources value.
     */
    public List<DataSource> getDataSources() {
        return this.dataSources;
    }
}

/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.sql.v2014_04_01.implementation.ElasticPoolsInner;
import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.sql.v2014_04_01.ElasticPoolServerMetric;
import com.microsoft.azure.management.sql.v2014_04_01.ElasticPoolServerMetricDefinition;

/**
 * Type representing ElasticPools.
 */
public interface ElasticPools extends SupportsCreating<ElasticPool.DefinitionStages.Blank>, HasInner<ElasticPoolsInner> {
    /**
     * Gets an elastic pool.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param elasticPoolName The name of the elastic pool to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ElasticPool> getAsync(String resourceGroupName, String serverName, String elasticPoolName);

    /**
     * Returns a list of elastic pools in a server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ElasticPool> listByServerAsync(String resourceGroupName, String serverName);

    /**
     * Deletes the elastic pool.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param elasticPoolName The name of the elastic pool to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String serverName, String elasticPoolName);

    /**
     * Returns elastic pool  metrics.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param elasticPoolName The name of the elastic pool.
     * @param filter An OData filter expression that describes a subset of metrics to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ElasticPoolServerMetric> listMetricsAsync(String resourceGroupName, String serverName, String elasticPoolName, String filter);

    /**
     * Returns elastic pool metric definitions.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param elasticPoolName The name of the elastic pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ElasticPoolServerMetricDefinition> listMetricDefinitionsAsync(String resourceGroupName, String serverName, String elasticPoolName);

}

/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_12_01;

import rx.Observable;
import com.microsoft.azure.management.network.v2019_12_01.implementation.ResourceNavigationLinksInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ResourceNavigationLinks.
 */
public interface ResourceNavigationLinks extends HasInner<ResourceNavigationLinksInner> {
    /**
     * Gets a list of resource navigation links for a subnet.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ResourceNavigationLinksListResult> listAsync(String resourceGroupName, String virtualNetworkName, String subnetName);

}

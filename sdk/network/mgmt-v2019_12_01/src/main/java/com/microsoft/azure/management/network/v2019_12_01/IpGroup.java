/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_12_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2019_12_01.implementation.NetworkManager;
import java.util.List;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2019_12_01.implementation.IpGroupInner;

/**
 * Type representing IpGroup.
 */
public interface IpGroup extends HasInner<IpGroupInner>, Resource, GroupableResourceCore<NetworkManager, IpGroupInner>, HasResourceGroup, Refreshable<IpGroup>, Updatable<IpGroup.Update>, HasManager<NetworkManager> {
    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the firewalls value.
     */
    List<SubResource> firewalls();

    /**
     * @return the ipAddresses value.
     */
    List<String> ipAddresses();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * The entirety of the IpGroup definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of IpGroup definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a IpGroup definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the IpGroup definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the ipgroup definition allowing to specify IpAddresses.
         */
        interface WithIpAddresses {
            /**
             * Specifies ipAddresses.
             * @param ipAddresses IpAddresses/IpAddressPrefixes in the IpGroups resource
             * @return the next definition stage
             */
            WithCreate withIpAddresses(List<String> ipAddresses);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<IpGroup>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithIpAddresses {
        }
    }
    /**
     * The template for a IpGroup update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<IpGroup>, Resource.UpdateWithTags<Update>, UpdateStages.WithIpAddresses {
    }

    /**
     * Grouping of IpGroup update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the ipgroup update allowing to specify IpAddresses.
         */
        interface WithIpAddresses {
            /**
             * Specifies ipAddresses.
             * @param ipAddresses IpAddresses/IpAddressPrefixes in the IpGroups resource
             * @return the next update stage
             */
            Update withIpAddresses(List<String> ipAddresses);
        }

    }
}

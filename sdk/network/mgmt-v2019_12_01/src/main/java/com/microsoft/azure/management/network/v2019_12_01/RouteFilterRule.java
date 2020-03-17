/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_12_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2019_12_01.implementation.RouteFilterRuleInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2019_12_01.implementation.NetworkManager;
import java.util.List;

/**
 * Type representing RouteFilterRule.
 */
public interface RouteFilterRule extends HasInner<RouteFilterRuleInner>, Indexable, Refreshable<RouteFilterRule>, Updatable<RouteFilterRule.Update>, HasManager<NetworkManager> {
    /**
     * @return the access value.
     */
    Access access();

    /**
     * @return the communities value.
     */
    List<String> communities();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the routeFilterRuleType value.
     */
    String routeFilterRuleType();

    /**
     * The entirety of the RouteFilterRule definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithRouteFilter, DefinitionStages.WithAccess, DefinitionStages.WithCommunities, DefinitionStages.WithRouteFilterRuleType, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of RouteFilterRule definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a RouteFilterRule definition.
         */
        interface Blank extends WithRouteFilter {
        }

        /**
         * The stage of the routefilterrule definition allowing to specify RouteFilter.
         */
        interface WithRouteFilter {
           /**
            * Specifies resourceGroupName, routeFilterName.
            * @param resourceGroupName The name of the resource group
            * @param routeFilterName The name of the route filter
            * @return the next definition stage
            */
            WithAccess withExistingRouteFilter(String resourceGroupName, String routeFilterName);
        }

        /**
         * The stage of the routefilterrule definition allowing to specify Access.
         */
        interface WithAccess {
           /**
            * Specifies access.
            * @param access The access type of the rule. Possible values include: 'Allow', 'Deny'
            * @return the next definition stage
            */
            WithCommunities withAccess(Access access);
        }

        /**
         * The stage of the routefilterrule definition allowing to specify Communities.
         */
        interface WithCommunities {
           /**
            * Specifies communities.
            * @param communities The collection for bgp community values to filter on. e.g. ['12076:5010','12076:5020']
            * @return the next definition stage
            */
            WithRouteFilterRuleType withCommunities(List<String> communities);
        }

        /**
         * The stage of the routefilterrule definition allowing to specify RouteFilterRuleType.
         */
        interface WithRouteFilterRuleType {
           /**
            * Specifies routeFilterRuleType.
            * @param routeFilterRuleType The rule type of the rule
            * @return the next definition stage
            */
            WithCreate withRouteFilterRuleType(String routeFilterRuleType);
        }

        /**
         * The stage of the routefilterrule definition allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             * @param id Resource ID
             * @return the next definition stage
             */
            WithCreate withId(String id);
        }

        /**
         * The stage of the routefilterrule definition allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location Resource location
             * @return the next definition stage
             */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the routefilterrule definition allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource
             * @return the next definition stage
             */
            WithCreate withName(String name);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<RouteFilterRule>, DefinitionStages.WithId, DefinitionStages.WithLocation, DefinitionStages.WithName {
        }
    }
    /**
     * The template for a RouteFilterRule update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<RouteFilterRule>, UpdateStages.WithId, UpdateStages.WithLocation, UpdateStages.WithName {
    }

    /**
     * Grouping of RouteFilterRule update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the routefilterrule update allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             * @param id Resource ID
             * @return the next update stage
             */
            Update withId(String id);
        }

        /**
         * The stage of the routefilterrule update allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location Resource location
             * @return the next update stage
             */
            Update withLocation(String location);
        }

        /**
         * The stage of the routefilterrule update allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource
             * @return the next update stage
             */
            Update withName(String name);
        }

    }
}

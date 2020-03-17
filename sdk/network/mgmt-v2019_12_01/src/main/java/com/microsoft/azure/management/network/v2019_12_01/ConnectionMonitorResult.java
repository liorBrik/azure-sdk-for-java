/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_12_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2019_12_01.implementation.ConnectionMonitorResultInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2019_12_01.implementation.NetworkManager;
import java.util.Map;
import java.util.List;
import org.joda.time.DateTime;

/**
 * Type representing ConnectionMonitorResult.
 */
public interface ConnectionMonitorResult extends HasInner<ConnectionMonitorResultInner>, Indexable, Refreshable<ConnectionMonitorResult>, Updatable<ConnectionMonitorResult.Update>, HasManager<NetworkManager> {
    /**
     * @return the autoStart value.
     */
    Boolean autoStart();

    /**
     * @return the connectionMonitorType value.
     */
    ConnectionMonitorType connectionMonitorType();

    /**
     * @return the destination value.
     */
    ConnectionMonitorDestination destination();

    /**
     * @return the endpoints value.
     */
    List<ConnectionMonitorEndpoint> endpoints();

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
     * @return the monitoringIntervalInSeconds value.
     */
    Integer monitoringIntervalInSeconds();

    /**
     * @return the monitoringStatus value.
     */
    String monitoringStatus();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the notes value.
     */
    String notes();

    /**
     * @return the outputs value.
     */
    List<ConnectionMonitorOutput> outputs();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the source value.
     */
    ConnectionMonitorSource source();

    /**
     * @return the startTime value.
     */
    DateTime startTime();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the testConfigurations value.
     */
    List<ConnectionMonitorTestConfiguration> testConfigurations();

    /**
     * @return the testGroups value.
     */
    List<ConnectionMonitorTestGroup> testGroups();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the ConnectionMonitorResult definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithNetworkWatcher, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ConnectionMonitorResult definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ConnectionMonitorResult definition.
         */
        interface Blank extends WithNetworkWatcher {
        }

        /**
         * The stage of the connectionmonitorresult definition allowing to specify NetworkWatcher.
         */
        interface WithNetworkWatcher {
           /**
            * Specifies resourceGroupName, networkWatcherName.
            * @param resourceGroupName The name of the resource group containing Network Watcher
            * @param networkWatcherName The name of the Network Watcher resource
            * @return the next definition stage
            */
            WithCreate withExistingNetworkWatcher(String resourceGroupName, String networkWatcherName);
        }

        /**
         * The stage of the connectionmonitorresult definition allowing to specify AutoStart.
         */
        interface WithAutoStart {
            /**
             * Specifies autoStart.
             * @param autoStart Determines if the connection monitor will start automatically once created
             * @return the next definition stage
             */
            WithCreate withAutoStart(Boolean autoStart);
        }

        /**
         * The stage of the connectionmonitorresult definition allowing to specify Destination.
         */
        interface WithDestination {
            /**
             * Specifies destination.
             * @param destination Describes the destination of connection monitor
             * @return the next definition stage
             */
            WithCreate withDestination(ConnectionMonitorDestination destination);
        }

        /**
         * The stage of the connectionmonitorresult definition allowing to specify Endpoints.
         */
        interface WithEndpoints {
            /**
             * Specifies endpoints.
             * @param endpoints List of connection monitor endpoints
             * @return the next definition stage
             */
            WithCreate withEndpoints(List<ConnectionMonitorEndpoint> endpoints);
        }

        /**
         * The stage of the connectionmonitorresult definition allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location Connection monitor location
             * @return the next definition stage
             */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the connectionmonitorresult definition allowing to specify MonitoringIntervalInSeconds.
         */
        interface WithMonitoringIntervalInSeconds {
            /**
             * Specifies monitoringIntervalInSeconds.
             * @param monitoringIntervalInSeconds Monitoring interval in seconds
             * @return the next definition stage
             */
            WithCreate withMonitoringIntervalInSeconds(Integer monitoringIntervalInSeconds);
        }

        /**
         * The stage of the connectionmonitorresult definition allowing to specify Notes.
         */
        interface WithNotes {
            /**
             * Specifies notes.
             * @param notes Optional notes to be associated with the connection monitor
             * @return the next definition stage
             */
            WithCreate withNotes(String notes);
        }

        /**
         * The stage of the connectionmonitorresult definition allowing to specify Outputs.
         */
        interface WithOutputs {
            /**
             * Specifies outputs.
             * @param outputs List of connection monitor outputs
             * @return the next definition stage
             */
            WithCreate withOutputs(List<ConnectionMonitorOutput> outputs);
        }

        /**
         * The stage of the connectionmonitorresult definition allowing to specify Source.
         */
        interface WithSource {
            /**
             * Specifies source.
             * @param source Describes the source of connection monitor
             * @return the next definition stage
             */
            WithCreate withSource(ConnectionMonitorSource source);
        }

        /**
         * The stage of the connectionmonitorresult definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags Connection monitor tags
             * @return the next definition stage
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the connectionmonitorresult definition allowing to specify TestConfigurations.
         */
        interface WithTestConfigurations {
            /**
             * Specifies testConfigurations.
             * @param testConfigurations List of connection monitor test configurations
             * @return the next definition stage
             */
            WithCreate withTestConfigurations(List<ConnectionMonitorTestConfiguration> testConfigurations);
        }

        /**
         * The stage of the connectionmonitorresult definition allowing to specify TestGroups.
         */
        interface WithTestGroups {
            /**
             * Specifies testGroups.
             * @param testGroups List of connection monitor test groups
             * @return the next definition stage
             */
            WithCreate withTestGroups(List<ConnectionMonitorTestGroup> testGroups);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ConnectionMonitorResult>, DefinitionStages.WithAutoStart, DefinitionStages.WithDestination, DefinitionStages.WithEndpoints, DefinitionStages.WithLocation, DefinitionStages.WithMonitoringIntervalInSeconds, DefinitionStages.WithNotes, DefinitionStages.WithOutputs, DefinitionStages.WithSource, DefinitionStages.WithTags, DefinitionStages.WithTestConfigurations, DefinitionStages.WithTestGroups {
        }
    }
    /**
     * The template for a ConnectionMonitorResult update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ConnectionMonitorResult>, UpdateStages.WithAutoStart, UpdateStages.WithDestination, UpdateStages.WithEndpoints, UpdateStages.WithLocation, UpdateStages.WithMonitoringIntervalInSeconds, UpdateStages.WithNotes, UpdateStages.WithOutputs, UpdateStages.WithSource, UpdateStages.WithTags, UpdateStages.WithTestConfigurations, UpdateStages.WithTestGroups {
    }

    /**
     * Grouping of ConnectionMonitorResult update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the connectionmonitorresult update allowing to specify AutoStart.
         */
        interface WithAutoStart {
            /**
             * Specifies autoStart.
             * @param autoStart Determines if the connection monitor will start automatically once created
             * @return the next update stage
             */
            Update withAutoStart(Boolean autoStart);
        }

        /**
         * The stage of the connectionmonitorresult update allowing to specify Destination.
         */
        interface WithDestination {
            /**
             * Specifies destination.
             * @param destination Describes the destination of connection monitor
             * @return the next update stage
             */
            Update withDestination(ConnectionMonitorDestination destination);
        }

        /**
         * The stage of the connectionmonitorresult update allowing to specify Endpoints.
         */
        interface WithEndpoints {
            /**
             * Specifies endpoints.
             * @param endpoints List of connection monitor endpoints
             * @return the next update stage
             */
            Update withEndpoints(List<ConnectionMonitorEndpoint> endpoints);
        }

        /**
         * The stage of the connectionmonitorresult update allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location Connection monitor location
             * @return the next update stage
             */
            Update withLocation(String location);
        }

        /**
         * The stage of the connectionmonitorresult update allowing to specify MonitoringIntervalInSeconds.
         */
        interface WithMonitoringIntervalInSeconds {
            /**
             * Specifies monitoringIntervalInSeconds.
             * @param monitoringIntervalInSeconds Monitoring interval in seconds
             * @return the next update stage
             */
            Update withMonitoringIntervalInSeconds(Integer monitoringIntervalInSeconds);
        }

        /**
         * The stage of the connectionmonitorresult update allowing to specify Notes.
         */
        interface WithNotes {
            /**
             * Specifies notes.
             * @param notes Optional notes to be associated with the connection monitor
             * @return the next update stage
             */
            Update withNotes(String notes);
        }

        /**
         * The stage of the connectionmonitorresult update allowing to specify Outputs.
         */
        interface WithOutputs {
            /**
             * Specifies outputs.
             * @param outputs List of connection monitor outputs
             * @return the next update stage
             */
            Update withOutputs(List<ConnectionMonitorOutput> outputs);
        }

        /**
         * The stage of the connectionmonitorresult update allowing to specify Source.
         */
        interface WithSource {
            /**
             * Specifies source.
             * @param source Describes the source of connection monitor
             * @return the next update stage
             */
            Update withSource(ConnectionMonitorSource source);
        }

        /**
         * The stage of the connectionmonitorresult update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags Connection monitor tags
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the connectionmonitorresult update allowing to specify TestConfigurations.
         */
        interface WithTestConfigurations {
            /**
             * Specifies testConfigurations.
             * @param testConfigurations List of connection monitor test configurations
             * @return the next update stage
             */
            Update withTestConfigurations(List<ConnectionMonitorTestConfiguration> testConfigurations);
        }

        /**
         * The stage of the connectionmonitorresult update allowing to specify TestGroups.
         */
        interface WithTestGroups {
            /**
             * Specifies testGroups.
             * @param testGroups List of connection monitor test groups
             * @return the next update stage
             */
            Update withTestGroups(List<ConnectionMonitorTestGroup> testGroups);
        }

    }
}

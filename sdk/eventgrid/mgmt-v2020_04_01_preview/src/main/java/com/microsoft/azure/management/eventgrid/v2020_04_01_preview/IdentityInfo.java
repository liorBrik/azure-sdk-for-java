/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2020_04_01_preview;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The identity information for the resource.
 */
public class IdentityInfo {
    /**
     * The type of managed identity used. The type 'SystemAssigned,
     * UserAssigned' includes both an implicitly created identity and a set of
     * user-assigned identities. The type 'None' will remove any identity.
     * Possible values include: 'None', 'SystemAssigned', 'UserAssigned',
     * 'SystemAssigned, UserAssigned'.
     */
    @JsonProperty(value = "type")
    private IdentityType type;

    /**
     * The principal ID of resource identity.
     */
    @JsonProperty(value = "principalId")
    private String principalId;

    /**
     * The tenant ID of resource.
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /**
     * The list of user identities associated with the resource. The user
     * identity dictionary key references will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     * This property is currently not used and reserved for future usage.
     */
    @JsonProperty(value = "userAssignedIdentities")
    private Map<String, UserIdentityProperties> userAssignedIdentities;

    /**
     * Get the type of managed identity used. The type 'SystemAssigned, UserAssigned' includes both an implicitly created identity and a set of user-assigned identities. The type 'None' will remove any identity. Possible values include: 'None', 'SystemAssigned', 'UserAssigned', 'SystemAssigned, UserAssigned'.
     *
     * @return the type value
     */
    public IdentityType type() {
        return this.type;
    }

    /**
     * Set the type of managed identity used. The type 'SystemAssigned, UserAssigned' includes both an implicitly created identity and a set of user-assigned identities. The type 'None' will remove any identity. Possible values include: 'None', 'SystemAssigned', 'UserAssigned', 'SystemAssigned, UserAssigned'.
     *
     * @param type the type value to set
     * @return the IdentityInfo object itself.
     */
    public IdentityInfo withType(IdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the principal ID of resource identity.
     *
     * @return the principalId value
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Set the principal ID of resource identity.
     *
     * @param principalId the principalId value to set
     * @return the IdentityInfo object itself.
     */
    public IdentityInfo withPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

    /**
     * Get the tenant ID of resource.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenant ID of resource.
     *
     * @param tenantId the tenantId value to set
     * @return the IdentityInfo object itself.
     */
    public IdentityInfo withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the list of user identities associated with the resource. The user identity dictionary key references will be ARM resource ids in the form:
     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     This property is currently not used and reserved for future usage.
     *
     * @return the userAssignedIdentities value
     */
    public Map<String, UserIdentityProperties> userAssignedIdentities() {
        return this.userAssignedIdentities;
    }

    /**
     * Set the list of user identities associated with the resource. The user identity dictionary key references will be ARM resource ids in the form:
     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     This property is currently not used and reserved for future usage.
     *
     * @param userAssignedIdentities the userAssignedIdentities value to set
     * @return the IdentityInfo object itself.
     */
    public IdentityInfo withUserAssignedIdentities(Map<String, UserIdentityProperties> userAssignedIdentities) {
        this.userAssignedIdentities = userAssignedIdentities;
        return this;
    }

}

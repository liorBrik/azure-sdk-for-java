/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_12_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Identity for the resource.
 */
public class ManagedServiceIdentity {
    /**
     * The principal id of the system assigned identity. This property will
     * only be provided for a system assigned identity.
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private String principalId;

    /**
     * The tenant id of the system assigned identity. This property will only
     * be provided for a system assigned identity.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /**
     * The type of identity used for the resource. The type 'SystemAssigned,
     * UserAssigned' includes both an implicitly created identity and a set of
     * user assigned identities. The type 'None' will remove any identities
     * from the virtual machine. Possible values include: 'SystemAssigned',
     * 'UserAssigned', 'SystemAssigned, UserAssigned', 'None'.
     */
    @JsonProperty(value = "type")
    private ResourceIdentityType type;

    /**
     * The list of user identities associated with resource. The user identity
     * dictionary key references will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     */
    @JsonProperty(value = "userAssignedIdentities")
    private Map<String, ManagedServiceIdentityUserAssignedIdentitiesValue> userAssignedIdentities;

    /**
     * Get the principal id of the system assigned identity. This property will only be provided for a system assigned identity.
     *
     * @return the principalId value
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Get the tenant id of the system assigned identity. This property will only be provided for a system assigned identity.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get the type of identity used for the resource. The type 'SystemAssigned, UserAssigned' includes both an implicitly created identity and a set of user assigned identities. The type 'None' will remove any identities from the virtual machine. Possible values include: 'SystemAssigned', 'UserAssigned', 'SystemAssigned, UserAssigned', 'None'.
     *
     * @return the type value
     */
    public ResourceIdentityType type() {
        return this.type;
    }

    /**
     * Set the type of identity used for the resource. The type 'SystemAssigned, UserAssigned' includes both an implicitly created identity and a set of user assigned identities. The type 'None' will remove any identities from the virtual machine. Possible values include: 'SystemAssigned', 'UserAssigned', 'SystemAssigned, UserAssigned', 'None'.
     *
     * @param type the type value to set
     * @return the ManagedServiceIdentity object itself.
     */
    public ManagedServiceIdentity withType(ResourceIdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the list of user identities associated with resource. The user identity dictionary key references will be ARM resource ids in the form: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     *
     * @return the userAssignedIdentities value
     */
    public Map<String, ManagedServiceIdentityUserAssignedIdentitiesValue> userAssignedIdentities() {
        return this.userAssignedIdentities;
    }

    /**
     * Set the list of user identities associated with resource. The user identity dictionary key references will be ARM resource ids in the form: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     *
     * @param userAssignedIdentities the userAssignedIdentities value to set
     * @return the ManagedServiceIdentity object itself.
     */
    public ManagedServiceIdentity withUserAssignedIdentities(Map<String, ManagedServiceIdentityUserAssignedIdentitiesValue> userAssignedIdentities) {
        this.userAssignedIdentities = userAssignedIdentities;
        return this;
    }

}

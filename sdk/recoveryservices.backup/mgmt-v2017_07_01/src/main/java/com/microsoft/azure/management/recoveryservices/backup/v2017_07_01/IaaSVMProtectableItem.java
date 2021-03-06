/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * IaaS VM workload-specific backup item.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "protectableItemType")
@JsonTypeName("IaaSVMProtectableItem")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Microsoft.ClassicCompute/virtualMachines", value = AzureIaaSClassicComputeVMProtectableItem.class),
    @JsonSubTypes.Type(name = "Microsoft.Compute/virtualMachines", value = AzureIaaSComputeVMProtectableItem.class)
})
public class IaaSVMProtectableItem extends WorkloadProtectableItem {
    /**
     * Fully qualified ARM ID of the virtual machine.
     */
    @JsonProperty(value = "virtualMachineId")
    private String virtualMachineId;

    /**
     * Get fully qualified ARM ID of the virtual machine.
     *
     * @return the virtualMachineId value
     */
    public String virtualMachineId() {
        return this.virtualMachineId;
    }

    /**
     * Set fully qualified ARM ID of the virtual machine.
     *
     * @param virtualMachineId the virtualMachineId value to set
     * @return the IaaSVMProtectableItem object itself.
     */
    public IaaSVMProtectableItem withVirtualMachineId(String virtualMachineId) {
        this.virtualMachineId = virtualMachineId;
        return this;
    }

}

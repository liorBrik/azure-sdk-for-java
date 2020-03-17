/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_12_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for VpnType.
 */
public final class VpnType extends ExpandableStringEnum<VpnType> {
    /** Static value PolicyBased for VpnType. */
    public static final VpnType POLICY_BASED = fromString("PolicyBased");

    /** Static value RouteBased for VpnType. */
    public static final VpnType ROUTE_BASED = fromString("RouteBased");

    /**
     * Creates or finds a VpnType from its string representation.
     * @param name a name to look for
     * @return the corresponding VpnType
     */
    @JsonCreator
    public static VpnType fromString(String name) {
        return fromString(name, VpnType.class);
    }

    /**
     * @return known VpnType values
     */
    public static Collection<VpnType> values() {
        return values(VpnType.class);
    }
}

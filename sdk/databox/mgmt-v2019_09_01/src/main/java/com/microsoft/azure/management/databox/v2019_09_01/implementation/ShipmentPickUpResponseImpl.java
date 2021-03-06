/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox.v2019_09_01.implementation;

import com.microsoft.azure.management.databox.v2019_09_01.ShipmentPickUpResponse;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import org.joda.time.DateTime;

class ShipmentPickUpResponseImpl extends WrapperImpl<ShipmentPickUpResponseInner> implements ShipmentPickUpResponse {
    private final DataBoxManager manager;
    ShipmentPickUpResponseImpl(ShipmentPickUpResponseInner inner, DataBoxManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public DataBoxManager manager() {
        return this.manager;
    }

    @Override
    public String confirmationNumber() {
        return this.inner().confirmationNumber();
    }

    @Override
    public DateTime readyByTime() {
        return this.inner().readyByTime();
    }

}

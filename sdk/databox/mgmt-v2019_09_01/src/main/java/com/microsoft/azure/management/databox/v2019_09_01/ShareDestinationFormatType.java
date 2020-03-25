/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox.v2019_09_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ShareDestinationFormatType.
 */
public enum ShareDestinationFormatType {
    /** Unknown format. */
    UNKNOWN_TYPE("UnknownType"),

    /** Storsimple data format. */
    HCS("HCS"),

    /** Azure storage block blob format. */
    BLOCK_BLOB("BlockBlob"),

    /** Azure storage page blob format. */
    PAGE_BLOB("PageBlob"),

    /** Azure storage file format. */
    AZURE_FILE("AzureFile"),

    /** Azure Compute Disk. */
    MANAGED_DISK("ManagedDisk");

    /** The actual serialized value for a ShareDestinationFormatType instance. */
    private String value;

    ShareDestinationFormatType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ShareDestinationFormatType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ShareDestinationFormatType object, or null if unable to parse.
     */
    @JsonCreator
    public static ShareDestinationFormatType fromString(String value) {
        ShareDestinationFormatType[] items = ShareDestinationFormatType.values();
        for (ShareDestinationFormatType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}

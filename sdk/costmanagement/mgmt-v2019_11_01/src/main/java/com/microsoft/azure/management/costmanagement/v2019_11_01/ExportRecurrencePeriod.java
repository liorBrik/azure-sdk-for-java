/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.costmanagement.v2019_11_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The start and end date for recurrence schedule.
 */
public class ExportRecurrencePeriod {
    /**
     * The start date of recurrence.
     */
    @JsonProperty(value = "from", required = true)
    private DateTime from;

    /**
     * The end date of recurrence.
     */
    @JsonProperty(value = "to")
    private DateTime to;

    /**
     * Get the start date of recurrence.
     *
     * @return the from value
     */
    public DateTime from() {
        return this.from;
    }

    /**
     * Set the start date of recurrence.
     *
     * @param from the from value to set
     * @return the ExportRecurrencePeriod object itself.
     */
    public ExportRecurrencePeriod withFrom(DateTime from) {
        this.from = from;
        return this;
    }

    /**
     * Get the end date of recurrence.
     *
     * @return the to value
     */
    public DateTime to() {
        return this.to;
    }

    /**
     * Set the end date of recurrence.
     *
     * @param to the to value to set
     * @return the ExportRecurrencePeriod object itself.
     */
    public ExportRecurrencePeriod withTo(DateTime to) {
        this.to = to;
        return this;
    }

}

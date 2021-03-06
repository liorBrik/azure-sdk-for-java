/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about a Windows OS.
 */
public class WindowsOsInfo {
    /**
     * The state of the Windows OS (i.e. NonSysprepped, SysprepRequested,
     * SysprepApplied). Possible values include: 'NonSysprepped',
     * 'SysprepRequested', 'SysprepApplied'.
     */
    @JsonProperty(value = "windowsOsState")
    private WindowsOsState windowsOsState;

    /**
     * Get the state of the Windows OS (i.e. NonSysprepped, SysprepRequested, SysprepApplied). Possible values include: 'NonSysprepped', 'SysprepRequested', 'SysprepApplied'.
     *
     * @return the windowsOsState value
     */
    public WindowsOsState windowsOsState() {
        return this.windowsOsState;
    }

    /**
     * Set the state of the Windows OS (i.e. NonSysprepped, SysprepRequested, SysprepApplied). Possible values include: 'NonSysprepped', 'SysprepRequested', 'SysprepApplied'.
     *
     * @param windowsOsState the windowsOsState value to set
     * @return the WindowsOsInfo object itself.
     */
    public WindowsOsInfo withWindowsOsState(WindowsOsState windowsOsState) {
        this.windowsOsState = windowsOsState;
        return this;
    }

}

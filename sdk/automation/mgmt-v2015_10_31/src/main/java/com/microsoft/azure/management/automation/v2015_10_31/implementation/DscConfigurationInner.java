/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31.implementation;

import com.microsoft.azure.management.automation.v2015_10_31.DscConfigurationProvisioningState;
import java.util.Map;
import com.microsoft.azure.management.automation.v2015_10_31.DscConfigurationParameter;
import com.microsoft.azure.management.automation.v2015_10_31.ContentSource;
import com.microsoft.azure.management.automation.v2015_10_31.DscConfigurationState;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Definition of the configuration type.
 */
@JsonFlatten
@SkipParentValidation
public class DscConfigurationInner extends Resource {
    /**
     * Gets or sets the provisioning state of the configuration. Possible
     * values include: 'Succeeded'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private DscConfigurationProvisioningState provisioningState;

    /**
     * Gets or sets the job count of the configuration.
     */
    @JsonProperty(value = "properties.jobCount")
    private Integer jobCount;

    /**
     * Gets or sets the configuration parameters.
     */
    @JsonProperty(value = "properties.parameters")
    private Map<String, DscConfigurationParameter> parameters;

    /**
     * Gets or sets the source.
     */
    @JsonProperty(value = "properties.source")
    private ContentSource source;

    /**
     * Gets or sets the state of the configuration. Possible values include:
     * 'New', 'Edit', 'Published'.
     */
    @JsonProperty(value = "properties.state")
    private DscConfigurationState state;

    /**
     * Gets or sets verbose log option.
     */
    @JsonProperty(value = "properties.logVerbose")
    private Boolean logVerbose;

    /**
     * Gets or sets the creation time.
     */
    @JsonProperty(value = "properties.creationTime")
    private DateTime creationTime;

    /**
     * Gets or sets the last modified time.
     */
    @JsonProperty(value = "properties.lastModifiedTime")
    private DateTime lastModifiedTime;

    /**
     * Gets the number of compiled node configurations.
     */
    @JsonProperty(value = "properties.nodeConfigurationCount")
    private int nodeConfigurationCount;

    /**
     * Gets or sets the description.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * Gets or sets the etag of the resource.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Get gets or sets the provisioning state of the configuration. Possible values include: 'Succeeded'.
     *
     * @return the provisioningState value
     */
    public DscConfigurationProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set gets or sets the provisioning state of the configuration. Possible values include: 'Succeeded'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the DscConfigurationInner object itself.
     */
    public DscConfigurationInner withProvisioningState(DscConfigurationProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get gets or sets the job count of the configuration.
     *
     * @return the jobCount value
     */
    public Integer jobCount() {
        return this.jobCount;
    }

    /**
     * Set gets or sets the job count of the configuration.
     *
     * @param jobCount the jobCount value to set
     * @return the DscConfigurationInner object itself.
     */
    public DscConfigurationInner withJobCount(Integer jobCount) {
        this.jobCount = jobCount;
        return this;
    }

    /**
     * Get gets or sets the configuration parameters.
     *
     * @return the parameters value
     */
    public Map<String, DscConfigurationParameter> parameters() {
        return this.parameters;
    }

    /**
     * Set gets or sets the configuration parameters.
     *
     * @param parameters the parameters value to set
     * @return the DscConfigurationInner object itself.
     */
    public DscConfigurationInner withParameters(Map<String, DscConfigurationParameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get gets or sets the source.
     *
     * @return the source value
     */
    public ContentSource source() {
        return this.source;
    }

    /**
     * Set gets or sets the source.
     *
     * @param source the source value to set
     * @return the DscConfigurationInner object itself.
     */
    public DscConfigurationInner withSource(ContentSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get gets or sets the state of the configuration. Possible values include: 'New', 'Edit', 'Published'.
     *
     * @return the state value
     */
    public DscConfigurationState state() {
        return this.state;
    }

    /**
     * Set gets or sets the state of the configuration. Possible values include: 'New', 'Edit', 'Published'.
     *
     * @param state the state value to set
     * @return the DscConfigurationInner object itself.
     */
    public DscConfigurationInner withState(DscConfigurationState state) {
        this.state = state;
        return this;
    }

    /**
     * Get gets or sets verbose log option.
     *
     * @return the logVerbose value
     */
    public Boolean logVerbose() {
        return this.logVerbose;
    }

    /**
     * Set gets or sets verbose log option.
     *
     * @param logVerbose the logVerbose value to set
     * @return the DscConfigurationInner object itself.
     */
    public DscConfigurationInner withLogVerbose(Boolean logVerbose) {
        this.logVerbose = logVerbose;
        return this;
    }

    /**
     * Get gets or sets the creation time.
     *
     * @return the creationTime value
     */
    public DateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Set gets or sets the creation time.
     *
     * @param creationTime the creationTime value to set
     * @return the DscConfigurationInner object itself.
     */
    public DscConfigurationInner withCreationTime(DateTime creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Get gets or sets the last modified time.
     *
     * @return the lastModifiedTime value
     */
    public DateTime lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Set gets or sets the last modified time.
     *
     * @param lastModifiedTime the lastModifiedTime value to set
     * @return the DscConfigurationInner object itself.
     */
    public DscConfigurationInner withLastModifiedTime(DateTime lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * Get gets the number of compiled node configurations.
     *
     * @return the nodeConfigurationCount value
     */
    public int nodeConfigurationCount() {
        return this.nodeConfigurationCount;
    }

    /**
     * Set gets the number of compiled node configurations.
     *
     * @param nodeConfigurationCount the nodeConfigurationCount value to set
     * @return the DscConfigurationInner object itself.
     */
    public DscConfigurationInner withNodeConfigurationCount(int nodeConfigurationCount) {
        this.nodeConfigurationCount = nodeConfigurationCount;
        return this;
    }

    /**
     * Get gets or sets the description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set gets or sets the description.
     *
     * @param description the description value to set
     * @return the DscConfigurationInner object itself.
     */
    public DscConfigurationInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get gets or sets the etag of the resource.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set gets or sets the etag of the resource.
     *
     * @param etag the etag value to set
     * @return the DscConfigurationInner object itself.
     */
    public DscConfigurationInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

}

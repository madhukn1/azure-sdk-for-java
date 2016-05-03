/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.compute.models;


/**
 * The instance view of a virtual machine extension handler.
 */
public class VirtualMachineExtensionHandlerInstanceView {
    /**
     * Gets or sets full type of the extension handler which includes both
     * publisher and type.
     */
    private String type;

    /**
     * Gets or sets the type version of the extension handler.
     */
    private String typeHandlerVersion;

    /**
     * Gets or sets the extension handler status.
     */
    private InstanceViewStatus status;

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Get the typeHandlerVersion value.
     *
     * @return the typeHandlerVersion value
     */
    public String getTypeHandlerVersion() {
        return this.typeHandlerVersion;
    }

    /**
     * Set the typeHandlerVersion value.
     *
     * @param typeHandlerVersion the typeHandlerVersion value to set
     */
    public void setTypeHandlerVersion(String typeHandlerVersion) {
        this.typeHandlerVersion = typeHandlerVersion;
    }

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public InstanceViewStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status value.
     *
     * @param status the status value to set
     */
    public void setStatus(InstanceViewStatus status) {
        this.status = status;
    }

}
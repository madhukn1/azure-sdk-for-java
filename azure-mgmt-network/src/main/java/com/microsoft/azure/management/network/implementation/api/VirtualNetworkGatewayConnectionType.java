/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.network.implementation.api;

/**
 * Defines values for VirtualNetworkGatewayConnectionType.
 */
public final class VirtualNetworkGatewayConnectionType {
    /** Static value IPsec for VirtualNetworkGatewayConnectionType. */
    public static final String IPSEC = "IPsec";

    /** Static value Vnet2Vnet for VirtualNetworkGatewayConnectionType. */
    public static final String VNET2VNET = "Vnet2Vnet";

    /** Static value ExpressRoute for VirtualNetworkGatewayConnectionType. */
    public static final String EXPRESS_ROUTE = "ExpressRoute";

    /** Static value VPNClient for VirtualNetworkGatewayConnectionType. */
    public static final String VPNCLIENT = "VPNClient";

    private VirtualNetworkGatewayConnectionType() {
    }
}
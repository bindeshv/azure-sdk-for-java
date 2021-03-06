/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_04_01.implementation;

import com.microsoft.azure.management.network.v2020_04_01.PacketCaptureQueryStatusResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.network.v2020_04_01.PcError;
import com.microsoft.azure.management.network.v2020_04_01.PcStatus;

class PacketCaptureQueryStatusResultImpl extends WrapperImpl<PacketCaptureQueryStatusResultInner> implements PacketCaptureQueryStatusResult {
    private final NetworkManager manager;
    PacketCaptureQueryStatusResultImpl(PacketCaptureQueryStatusResultInner inner, NetworkManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public DateTime captureStartTime() {
        return this.inner().captureStartTime();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public List<PcError> packetCaptureError() {
        return this.inner().packetCaptureError();
    }

    @Override
    public PcStatus packetCaptureStatus() {
        return this.inner().packetCaptureStatus();
    }

    @Override
    public String stopReason() {
        return this.inner().stopReason();
    }

}

/*
 * Copyright 2014 University of Lancaster
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.leafgraph.flowdam.openflow;

/**
 * Header represents the standard 8 byte OpenFlow header (all protocol versions).
 */
public class Header {
    /** Wire version this packet represents. */
    private short version;
    /** Packet type. */
    private short type;
    /** Length of the packet (including OpenFlow header). */
    private int length;
    /** Transaction ID of request. */
    private long transactionId;

    /**
     * Create a new Header.
     *
     * @param version wire version of packet
     * @param type packet type
     * @param length packet length (including header)
     * @param transactionId transaction ID of request
     */
    public Header(short version, short type, int length, long transactionId) {
        this.version = version;
        this.type = type;
        this.length = length;
        this.transactionId = transactionId;
    }

    /**
     * Get the wire version of the OpenFlow packet.
     *
     * @return wire version of the packet
     */
    public short getVersion() {
        return version;
    }

    /**
     * Get the type of this packet as represented by it's numerical ID.
     *
     * @return packet type number
     */
    public short getType() {
        return type;
    }

    /**
     * Get the length of the OpenFlow packet (including 8 byte header).
     *
     * @return length of packet including header
     */
    public int getLength() {
        return length;
    }

    /**
     * Get the transaction ID of this OpenFlow packet.
     *
     * @return transaction ID of packet
     */
    public long getTransactionId() {
        return transactionId;
    }
}

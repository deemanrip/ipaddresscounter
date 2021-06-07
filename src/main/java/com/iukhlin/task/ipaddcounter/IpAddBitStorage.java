package com.iukhlin.task.ipaddcounter;

import java.util.BitSet;

/**
 * Wrapper for two BitSets. Previously converted IP addresses are used as indexes to set bits.
 */
public class IpAddBitStorage {
    private final BitSet positive = new BitSet();
    private final BitSet negative = new BitSet();

    public void setIpAdd(int ipAdd) {
        if (ipAdd >= 0) {
            positive.set(ipAdd);
        } else {
            int ipAddToSet = ipAdd == Integer.MIN_VALUE ? 0 : ipAdd;
            negative.set(-ipAddToSet);
        }
    }

    public long getIpAddUniqueCount() {
        return (long)positive.cardinality() + negative.cardinality();
    }
}

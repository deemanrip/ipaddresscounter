package com.iukhlin.task.ipaddcounter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IpAddBitStorageTest {

    @Test
    void testPositiveIpAdd() {
        IpAddBitStorage bitStorage = new IpAddBitStorage();
        bitStorage.setIpAdd(1);
        bitStorage.setIpAdd(2);

        assertEquals(2, bitStorage.getIpAddUniqueCount());
    }

    @Test
    void testPositiveAndNegativeIpAdd() {
        IpAddBitStorage bitStorage = new IpAddBitStorage();
        bitStorage.setIpAdd(4);
        bitStorage.setIpAdd(-3);

        assertEquals(2, bitStorage.getIpAddUniqueCount());
    }

    @Test
    void testNegativeIpAdd() {
        IpAddBitStorage bitStorage = new IpAddBitStorage();
        bitStorage.setIpAdd(-7);
        bitStorage.setIpAdd(-3);
        bitStorage.setIpAdd(-5);

        assertEquals(3, bitStorage.getIpAddUniqueCount());
    }
}
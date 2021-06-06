package com.iukhlin.task.ipaddcounter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IpAddCounterTest {

    @Test
    void tesCountUniqueIpAdd() {
        IpAddCounter ipAddCounter = new IpAddCounter("src/test/resources/ip_add_small");
        long actual = ipAddCounter.countUniqueIpAdd();

        assertEquals(5, actual);
    }
}
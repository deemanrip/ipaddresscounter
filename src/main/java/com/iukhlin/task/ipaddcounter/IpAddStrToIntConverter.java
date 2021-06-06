package com.iukhlin.task.ipaddcounter;

/**
 * This class is used to convert IPv4 address to Java's int
 */
public class IpAddStrToIntConverter {
    public int convert(String ipAddStr) {
        String[] octets = ipAddStr.split("\\.");
        int ipAddInt = 0;
        for (String octet : octets) {
            ipAddInt <<= 8;
            ipAddInt |= Integer.parseInt(octet);
        }
        return ipAddInt;
    }
}

package com.iukhlin.task.ipaddcounter;

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

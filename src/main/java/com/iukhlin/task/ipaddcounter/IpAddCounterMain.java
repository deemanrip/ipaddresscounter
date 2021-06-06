package com.iukhlin.task.ipaddcounter;

/**
 * Entry point of the app. Checks that the argument with file path is specified.
 */
public class IpAddCounterMain {
    public static void main(String[] args) {
        if(args.length < 1) {
            throw new IllegalArgumentException("There should be specified path to file with ip addresses");
        }

        String ipAddFilePath = args[0];
        IpAddCounter ipAddCounter = new IpAddCounter(ipAddFilePath);
        long uniqueIpAddCount = ipAddCounter.countUniqueIpAdd();

        System.out.println("Unique ip addresses count is " + uniqueIpAddCount);
    }
}

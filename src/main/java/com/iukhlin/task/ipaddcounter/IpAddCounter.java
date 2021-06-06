package com.iukhlin.task.ipaddcounter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * This class reads IP addresses from passed path line by line,
 * converts to int and sets converted address to wrapper storage.
 * Then, returns unique count of all addresses from file.
 */
public class IpAddCounter {
    private static final Logger logger = LogManager.getLogger(IpAddCounter.class);

    private final String ipAddFilePath;
    private final IpAddBitStorage ipAddBitStorage = new IpAddBitStorage();
    private final IpAddStrToIntConverter converter = new IpAddStrToIntConverter();

    public IpAddCounter(String ipAddFilePath) {
        this.ipAddFilePath = ipAddFilePath;
    }

    public String getIpAddFilePath() {
        return ipAddFilePath;
    }

    public long countUniqueIpAdd() {
        long ipAddUniqueCount = 0;
        logger.info("Start reading file by path: " + ipAddFilePath);
        try (var lines = Files.lines(Paths.get(ipAddFilePath))) {
            lines.forEach(ipAddStr -> {
                int ipAddInt = converter.convert(ipAddStr);
                ipAddBitStorage.setIpAdd(ipAddInt);
            });
            ipAddUniqueCount = ipAddBitStorage.getIpAddUniqueCount();
        } catch (IOException e) {
            logger.error("Couldn't read file with ip addresses by path: " + ipAddFilePath, e);
            System.exit(1);
        }

        logger.info("Completed reading file and counting unique addresses");
        return ipAddUniqueCount;
    }
}

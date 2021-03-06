package org.ethereum.manager;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author Roman Mandeleil
 * @since 11.12.2014
 */
@Component
public class AdminInfo {


    private long startupTimeStamp;
    private boolean consensus = true;


    @PostConstruct
    public void init() {
        startupTimeStamp = System.currentTimeMillis();
    }

    public long getStartupTimeStamp() {
        return startupTimeStamp;
    }

    public boolean isConsensus() {
        return consensus;
    }

    public void lostConsensus() {
        consensus = false;
    }
}

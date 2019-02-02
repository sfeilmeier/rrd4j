package org.rrd4j.core;

/**
 * Wrap a exception generated by the backend store
 * 
 * @author Fabrice Bacchella
 * @since 3.4
 *
 */
public class RrdBackendException extends RrdException {

    public RrdBackendException(String message) {
        super(message);
    }

    public RrdBackendException(String message, Throwable cause) {
        super(message, cause);
    }

}
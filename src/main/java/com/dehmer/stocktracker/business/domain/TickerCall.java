package com.dehmer.stocktracker.business.domain;

import java.time.ZonedDateTime;

public class TickerCall {
    private String symbol;
    private ZonedDateTime lastRefreshed;
    private String timeZone;
    private String timeSeries;

    public String getSymbol() {
        return this.symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public ZonedDateTime getLastRefreshed() {
        return this.lastRefreshed;
    }

    public void setLastRefreshed(ZonedDateTime lastRefreshed) {
        this.lastRefreshed = lastRefreshed;
    }

    public String getTimeZone() {
        return this.timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getTimeSeries() {
        return this.timeSeries;
    }

    public void setTimeSeries(String timeSeries) {
        this.timeSeries = timeSeries;
    }
    
}

package com.example.dz2;

import java.io.Serializable;

public class TicketStructure implements Serializable {

    private String name;
    private String time;
    private String time2;
    private String ticket;

    public TicketStructure(String name, String time, String time2, String ticket) {
        this.name = name;
        this.time = time;
        this.time2 = time2;
        this.ticket = ticket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime2() {
        return time2;
    }

    public void setTime2(String time2) {
        this.time2 = time2;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }
}

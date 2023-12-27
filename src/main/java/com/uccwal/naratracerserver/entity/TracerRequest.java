package com.uccwal.naratracerserver.entity;

import java.util.List;

public class TracerRequest {

    private String category;
    private List<String> bidder;
    private List<String> titleLinkText;
    private String startDate;
    private String endDate;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<String> getBidder() {
        return bidder;
    }

    public void setBidder(List<String> bidder) {
        this.bidder = bidder;
    }

    public List<String> getTitleLinkText() {
        return titleLinkText;
    }

    public void setTitleLinkText(List<String> titleLinkText) {
        this.titleLinkText = titleLinkText;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "TracerRequest{" +
                "category='" + category + '\'' +
                ", bidder=" + bidder +
                ", titleLinkText=" + titleLinkText +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}

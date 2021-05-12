package io.codewithridhwan.streamdatacollector.model;

import java.util.List;

public class Group {
    private List<Object> group_topics;
    private String group_city;
    private String group_country;
    private float group_id;
    private String group_name;
    private float group_lon;
    private String group_urlname;
    private String group_state;
    private float group_lat;

    public List<Object> getGroup_topics() {
        return group_topics;
    }

    public void setGroup_topics(List<Object> group_topics) {
        this.group_topics = group_topics;
    }

    public String getGroup_city() {
        return group_city;
    }

    public void setGroup_city(String group_city) {
        this.group_city = group_city;
    }

    public String getGroup_country() {
        return group_country;
    }

    public void setGroup_country(String group_country) {
        this.group_country = group_country;
    }

    public float getGroup_id() {
        return group_id;
    }

    public void setGroup_id(float group_id) {
        this.group_id = group_id;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public float getGroup_lon() {
        return group_lon;
    }

    public void setGroup_lon(float group_lon) {
        this.group_lon = group_lon;
    }

    public String getGroup_urlname() {
        return group_urlname;
    }

    public void setGroup_urlname(String group_urlname) {
        this.group_urlname = group_urlname;
    }

    public String getGroup_state() {
        return group_state;
    }

    public void setGroup_state(String group_state) {
        this.group_state = group_state;
    }

    public float getGroup_lat() {
        return group_lat;
    }

    public void setGroup_lat(float group_lat) {
        this.group_lat = group_lat;
    }
}

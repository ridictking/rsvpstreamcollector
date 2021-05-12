package io.codewithridhwan.streamdatacollector.model;

public class Venue {
    private String venue_name;
    private float lon;
    private float lat;
    private float venue_id;

    public String getVenue_name() {
        return venue_name;
    }

    public void setVenue_name(String venue_name) {
        this.venue_name = venue_name;
    }

    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getVenue_id() {
        return venue_id;
    }

    public void setVenue_id(float venue_id) {
        this.venue_id = venue_id;
    }
}

package io.codewithridhwan.streamdatacollector.model;

public class Member {
    private float member_id;
    private String photo;
    private String member_name;

    public float getMember_id() {
        return member_id;
    }

    public void setMember_id(float member_id) {
        this.member_id = member_id;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getMember_name() {
        return member_name;
    }

    public void setMember_name(String member_name) {
        this.member_name = member_name;
    }
}

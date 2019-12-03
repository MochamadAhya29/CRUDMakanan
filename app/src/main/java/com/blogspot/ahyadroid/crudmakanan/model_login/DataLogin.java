package com.blogspot.ahyadroid.crudmakanan.model_login;

import com.google.gson.annotations.SerializedName;

public class DataLogin {
    @SerializedName("user_status")
    private String userStatus;

    @SerializedName("user_nama")
    private String userNama;

    @SerializedName("user_email")
    private String userEmail;

    @SerializedName("user_password")
    private String userPassword;

    @SerializedName("user_id")
    private String userId;

    @SerializedName("user_hp")
    private String userHp;

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserNama() {
        return userNama;
    }

    public void setUserNama(String userNama) {
        this.userNama = userNama;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserHp() {
        return userHp;
    }

    public void setUserHp(String userHp) {
        this.userHp = userHp;
    }
}

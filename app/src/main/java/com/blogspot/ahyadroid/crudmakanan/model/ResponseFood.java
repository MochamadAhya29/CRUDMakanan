package com.blogspot.ahyadroid.crudmakanan.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseFood {

    @SerializedName("pesan")
    private String pesan;

    @SerializedName("data")
    private List<DataItem> data;

    @SerializedName("sukses")
    private boolean sukses;

    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }

    public List<DataItem> getData() {
        return data;
    }

    public void setData(List<DataItem> data) {
        this.data = data;
    }

    public boolean isSukses() {
        return sukses;
    }

    public void setSukses(boolean sukses) {
        this.sukses = sukses;
    }
}

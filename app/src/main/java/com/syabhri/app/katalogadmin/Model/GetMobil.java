package com.syabhri.app.katalogadmin.Model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetMobil {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("result")
    @Expose
    private List<Mobil> result = null;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Mobil> getMobil() {
        return result;
    }

    public void setMobil(List<Mobil> result) {
        this.result = result;
    }

}
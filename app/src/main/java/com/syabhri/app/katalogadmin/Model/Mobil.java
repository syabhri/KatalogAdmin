package com.syabhri.app.katalogadmin.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Mobil {

    @SerializedName("id_mobil")
    @Expose
    private String idMobil;
    @SerializedName("tahun_mobil")
    @Expose
    private String tahunMobil;
    @SerializedName("merek_mobil")
    @Expose
    private String merekMobil;
    @SerializedName("nama_mobil")
    @Expose
    private String namaMobil;
    @SerializedName("rating_mobil")
    @Expose
    private String ratingMobil;
    @SerializedName("photo_url")
    @Expose
    private String photoUrl;

    public String getIdMobil() {
        return idMobil;
    }

    public void setIdMobil(String idMobil) {
        this.idMobil = idMobil;
    }

    public String getTahunMobil() {
        return tahunMobil;
    }

    public void setTahunMobil(String tahunMobil) {
        this.tahunMobil = tahunMobil;
    }

    public String getMerekMobil() {
        return merekMobil;
    }

    public void setMerekMobil(String merekMobil) {
        this.merekMobil = merekMobil;
    }

    public String getNamaMobil() {
        return namaMobil;
    }

    public void setNamaMobil(String namaMobil) {
        this.namaMobil = namaMobil;
    }

    public String getRatingMobil() {
        return ratingMobil;
    }

    public void setRatingMobil(String ratingMobil) {
        this.ratingMobil = ratingMobil;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

}
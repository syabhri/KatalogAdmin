package com.syabhri.app.katalogadmin.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Review {

    @SerializedName("id_review")
    @Expose
    private String idReview;
    @SerializedName("id_user")
    @Expose
    private String idUser;
    @SerializedName("id_mobil")
    @Expose
    private String idMobil;
    @SerializedName("rating")
    @Expose
    private String rating;
    @SerializedName("deskripsi")
    @Expose
    private String deskripsi;

    public String getIdReview() {
        return idReview;
    }

    public void setIdReview(String idReview) {
        this.idReview = idReview;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getIdMobil() {
        return idMobil;
    }

    public void setIdMobil(String idMobil) {
        this.idMobil = idMobil;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

}
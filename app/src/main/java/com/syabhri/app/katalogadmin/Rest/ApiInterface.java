package com.syabhri.app.katalogadmin.Rest;

import com.syabhri.app.katalogadmin.Model.GetMobil;
import com.syabhri.app.katalogadmin.Model.GetReview;
import com.syabhri.app.katalogadmin.Model.GetUser;
import com.syabhri.app.katalogadmin.Model.PostPutDelReview;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ApiInterface {
    @GET("review/user")
    Call<GetReview> getReview();

    @FormUrlEncoded
    @POST("review/user")
    Call<PostPutDelReview> postReview(
            @Field("id_review") String idReview, @Field("id_user") String idUser,
            @Field("id_mobil") String idMobil, @Field("rating") String rating,
            @Field("deskripsi") String deskripsi);

    @FormUrlEncoded
    @PUT("review/user")
    Call<PostPutDelReview> putReview(
            @Field("id_review") String idReview, @Field("id_user") String idUser,
            @Field("id_mobil") String idMobil, @Field("rating") String rating,
            @Field("deskripsi") String deskripsi);

    @FormUrlEncoded
    @HTTP(method = "DELETE", path = "review/user", hasBody = true)
    Call<PostPutDelReview> deleteReview(@Field("id_review") String idReview);

    /********* Mobil *********/
    @GET("mobil/all")
    Call<GetMobil> getMobil();

    @FormUrlEncoded
    @POST("mobil/all")
    Call<GetMobil> postMobil(
            @Field("id_mobil") String idMobil,
            @Field("tahun_mobil") String tahunMobil,
            @Field("merek_mobil") String merekMobil,
            @Field("photo_url") String photoUrl,
            @Field("action") String action
    );

    @FormUrlEncoded
    @POST("mobil/all")
    Call<GetMobil> putMobil(
            @Field("id_mobil") String idMobil,
            @Field("tahun_mobil") String tahunMobil,
            @Field("merek_mobil") String merekMobil,
            @Field("photo_url") String photoUrl,
            @Field("action") String action
    );

    @FormUrlEncoded
    @POST("mobil/all")
    Call<GetMobil> deleteMobil(
            @Field("id_mobil") String idMobil,
            @Field("action") String action);

    /********* user *********/
    @GET("user/all")
    Call<GetUser> getUser();

    @FormUrlEncoded
    @POST("user/all")
    Call<GetUser> postUser(
            @Field("id_user") String idUser,
            @Field("username") String username,
            @Field("password") String password,
            @Field("action") String action
    );

    @FormUrlEncoded
    @POST("user/all")
    Call<GetUser> putUser(
            @Field("id_user") String idUser,
            @Field("username") String username,
            @Field("password") String password,
            @Field("action") String action
    );

    @FormUrlEncoded
    @POST("user/all")
    Call<GetUser> deleteUser(
            @Field("id_user") String idUser,
            @Field("action") String action);

}

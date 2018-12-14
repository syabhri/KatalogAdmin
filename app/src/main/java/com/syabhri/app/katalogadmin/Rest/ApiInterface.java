package com.syabhri.app.katalogadmin.Rest;

import com.syabhri.app.katalogadmin.Model.GetReview;
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



}

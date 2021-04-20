package com.mind.Defoxes.Interface;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.GET;
import retrofit2.http.Query;

import com.mind.Defoxes.Modal.LoginModal ;
import com.mind.Defoxes.Modal.LeadModal;
import com.mind.Defoxes.Modal.ProfileModal;
import com.mind.Defoxes.Modal.ContactModal;
//ApiRetrofitInterface
public interface RetrofitAPI {
    // as we are making a post request to post a data
    // so we are annotating it with post
    // and along with that we are passing a parameter as users

    //Mukammil Basha Contact Details
    @POST("api/contact/CREATE")
    //on below line we are creating a method to post our data.
    Call<ContactModal> createContactPost(@Body ContactModal contactModal);
    @GET("api/contact/GET ALL?")
    Call<ContactModal> getContact_all(@Query("name") String Name, @Query("email") String Email,@Query("contact_number") String Contact_number);
    @GET("api/contact/GET?")
    Call<ContactModal> getContact(@Query("name") String Name, @Query("email") String Email,@Query("contact_number") String Contact_number);
    //Mukammil Basha Contact Details


    @POST("api/contact/CREATE?type=json")
        //on below line we are creating a method to post our data.
    Call<LoginModal> createLoginPost(@Body LoginModal LoginModal);
    @GET("api/contact/GET ALL?type=json")
    Call<LoginModal> getLogin_all(@Query("name") String Name, @Query("email") String Email,@Query("contact_number") String Contact_number);
    @GET("api/contact/GET?type=json")
    Call<LoginModal> getLogin(@Query("name") String Name, @Query("email") String Email,@Query("contact_number") String Contact_number);
    //Mukammil Basha Contact Details


    //Mukammil Basha Lead Details
    @POST("api/lead/CREATE?type=json")
    //on below line we are creating a method to post our data.
    Call<LeadModal> create_leadPost(@Body LeadModal leadModal);
    @GET("api/lead/GET ALL?type=json")
    Call<LeadModal> get_lead_all(@Query("name") String Name, @Query("email") String Email,@Query("contact_number") String Contact_number,@Query("note") String Note,@Query("another_note") String Another_note);
    @GET("api/lead/GET?type=json")
    Call<LeadModal> get_lead(@Query("name") String Name, @Query("email") String Email,@Query("contact_number") String Contact_number,@Query("note") String Note,@Query("another_note") String Another_note);
    //Mukammil Basha Lead Details

    //Mukammil Basha Profile+Residentials Details
    @POST("api/business/CREATE?type=json")
//    on below line we are creating a method to post our data.
    Call<ProfileModal> create_ProfilePost(@Body ProfileModal profileModal);
    @GET("api/business/GET ALL?type=json")
    Call<ProfileModal> get_Profile_all(@Query("display_name") String Display_name,@Query("business_name") String Business_name,@Query("registered_name") String Registered_name,@Query("address") String Address, @Query("locality") String Location,@Query("district") String District,@Query("city") String City,@Query("state") String State,@Query("country") String Country,@Query("postal_code") String Postal_Code,@Query("category_id") int category_id);
    @GET("api/business/GET?type=json")
    Call<ProfileModal> get_Profile(@Query("display_name") String Display_name,@Query("business_name") String Business_name,@Query("registered_name") String Registered_name,@Query("address") String Address, @Query("locality") String Location,@Query("district") String District,@Query("city") String City,@Query("state") String State,@Query("country") String Country,@Query("postal_code") String Postal_Code,@Query("category_id") int category_id);
    //Mukammil Basha Profile+Residentials Details
}

package free.tech.jofrasa.Interface;

import free.tech.jofrasa.ExtraClass.Model.Client;
import free.tech.jofrasa.ExtraClass.Response;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by root on 31-10-17.
 */

public interface ApiInterface {
    @GET("provider/listProviders/")
    Call<Response> getProviderCall();

    @GET("provider/productsProvider/")
    Call<Response> getProductCall(@Query("") int id);

    @POST("client/insertClient/")
    Call<Client> savePost(@Body Client client);

    @GET("client/verifyEmail/{email}")
    Call<Client> verifyEmail(@Path("email") String email);

}

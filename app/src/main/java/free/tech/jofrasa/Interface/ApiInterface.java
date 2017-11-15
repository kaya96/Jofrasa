package free.tech.jofrasa.Interface;

import free.tech.jofrasa.ExtraClass.Model.Client;
import free.tech.jofrasa.Response.ResponseProduct;
import free.tech.jofrasa.Response.ResponseProvider;
import retrofit2.Call;
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
    Call<ResponseProvider> getProviderCall();

    @GET("provider/productsProvider/{providerId}")
    Call<ResponseProduct> getProductCall(@Path("providerId") int id);

    @POST("client/insertClient/")
    @FormUrlEncoded
    Call<Client> savePost(@Field("_name") String _name,
                          @Field("_surname") String _surname,
                          @Field("_nit") String _nit,
                          @Field("_email") String _email,
                          @Field("_adress") String _adress,
                          @Field("_cell_number") String _cell_number,
                          @Field("_phone_number") String _phone_number);
}

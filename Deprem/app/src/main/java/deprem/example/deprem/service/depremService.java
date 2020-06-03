package deprem.example.deprem.service;

import deprem.example.deprem.model.depremModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface depremService {
    @GET("pure_api.php")
    Call<List<depremModel>>getData();

}

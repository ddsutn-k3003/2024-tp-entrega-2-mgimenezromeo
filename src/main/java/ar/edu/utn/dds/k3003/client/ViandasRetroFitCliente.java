package ar.edu.utn.dds.k3003.client;

import ar.edu.utn.dds.k3003.facades.dtos.ViandaDTO;
import Retrofit2.Call;
import Retrofit2.http.GET;
import Retrofit2.http.Query;
import java.util.List;

public interface ViandasRetrofitClient {
    @GET("/viandas/search/findByColaboradorIdAndAnioAndMes")
    Call<List<ViandaDTO>> viandasDeColaborador(
            @Query("colaboradorId") Long colaboradorId,
            @Query("anio") Integer anio,
            @Query("mes") Integer mes
    );
}

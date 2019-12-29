package com.example.mislugares.REST;

import com.example.mislugares.Modelos.Lugar;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

/**
 * Interfaz con las operaciones a realizar de nuestra API REST con RetroFit
 */
public interface LugarRest {
    // Obtener todos
    // GET: http://localhost:8080/lugares
    @GET("lugares/")
    Call<List<Lugar>> findAll();

    // Obtener uno lugar por ID
    // GET: http://localhost:8080/lugares/{id}
    @GET("lugares/{id}")
    Call<Lugar> findById(@Path("id") Long id);

    // Crear un lugar
    //POST: http://localhost:8080/lugares
    @POST("lugares/")
    Call<Lugar> create(@Body Lugar lugar);

    // Elimina un lugar
    // DELETE: http://localhost:8080/lugares/{id}
    @DELETE("lugares/{id}")
    Call<Lugar> delete(@Path("id") Long id);

    // Actualiza un lugar
    // PUT: http://localhost:8080/lugares/{id}
    @PUT("lugares/{id}")
    Call<Lugar> update(@Path("id") Long id, @Body Lugar lugar);
}

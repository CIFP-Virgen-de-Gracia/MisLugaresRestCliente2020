package com.example.mislugares.REST;

/**
 * API Utils para iniciar y configurar el Cliente RetroFIT
 * Aquí definimos las opciones del API REST que consumamos
 */
public class APIUtils {
    // IP del servidor
    private static final String server = "10.0.2.2";
    // Puerto del microservicio
    private static final String port = "8080";
    //Servicio, si usamos otro punto de partida, pero lo hemos definido en el ProuctoRest
    private static final String servicio = "lugares";
    // IP del servicio
    public static final String API_URL = "http://" + server + ":" + port + "/";

    private APIUtils() {
    }

    // Constructor del servicio con los elementos de la interfaz
    public static LugarRest getService() {
        return RetrofitClient.getClient(API_URL).create(LugarRest.class);
    }
}
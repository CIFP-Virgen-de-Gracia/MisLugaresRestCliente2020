package com.example.mislugares.Modelos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Clase Lugar
 */
public class Lugar {
    // Indicamos como se va a serializar los campos en jSON
    @SerializedName("id")
    @Expose
    private Long id;

    @SerializedName("nombre")
    @Expose
    private String nombre;

    @SerializedName("tipo")
    @Expose
    private String tipo;

    @SerializedName("fecha")
    @Expose
    private String fecha;

    @SerializedName("latitud")
    @Expose
    private Float latitud;

    @SerializedName("longitud")
    @Expose
    private Float longitud;

    @SerializedName("imagen")
    @Expose
    private String imagen;

    public Lugar() {

    }

    /**
     * Constructor de la clase Lugar
     *
     * @param id       Identificador, ID
     * @param nombre   Nombre de Lugar
     * @param tipo     Tipo de Lugar
     * @param fecha    Fecha de Lugar
     * @param latitud  Latitud del Lugar
     * @param longitud Longitud de Lugar
     * @param imagen   Imagen de Lugar
     */

    public Lugar(Long id, String nombre, String tipo, String fecha, Float latitud, Float longitud, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.fecha = fecha;
        this.latitud = latitud;
        this.longitud = longitud;
        this.imagen = imagen;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Float getLatitud() {
        return latitud;
    }

    public void setLatitud(Float latitud) {
        this.latitud = latitud;
    }

    public Float getLongitud() {
        return longitud;
    }

    public void setLongitud(Float longitud) {
        this.longitud = longitud;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Lugar{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", fecha='" + fecha + '\'' +
                ", latitud=" + latitud +
                ", longitud=" + longitud +
                ", imagen='" + imagen + '\'' +
                '}';
    }
}

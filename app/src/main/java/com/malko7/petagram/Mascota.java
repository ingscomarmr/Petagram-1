package com.malko7.petagram;

/**
 * Created by mjcruzs on 13/5/16.
 */
public class Mascota {

    private int foto;
    private String nombre;
    private int votos;

    public Mascota(int foto, String nombre, int votos) {
        this.foto = foto;
        this.nombre = nombre;
        this.votos = votos;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }
}

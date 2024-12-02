package com.aluracursos.screenmach.modelos;

import com.aluracursos.screenmach.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {
    private String director;

    /*public Pelicula(String nombre, int fechaLanzamiento, int duracionEnMinutos, boolean incluidoEnElPlan) {
        super(nombre, fechaLanzamiento, duracionEnMinutos, incluidoEnElPlan);
    }
*/
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion() {
        return (int) (calcularMedia() / 2);
    }
}


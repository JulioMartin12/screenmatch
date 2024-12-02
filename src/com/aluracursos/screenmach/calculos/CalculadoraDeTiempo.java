package com.aluracursos.screenmach.calculos;

import com.aluracursos.screenmach.modelos.Titulo;

public class CalculadoraDeTiempo {
    private  int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo){
        tiempoTotal += titulo.getDuracionEnMinutos();
    }
}

package com.aluracursos.screenmach.calculos;

public class FiltroRecomendacion {
    public void filtra(Clasificacion clasificacion){
        if(clasificacion.getClasificacion() >= 4){
            System.out.println("Muy bien evaludado en el momento");
        } else if (clasificacion.getClasificacion() >=2){
            System.out.println("Popular en el momento");
        }else{
            System.out.println("Colocálo en tu lista para verlo después");
        }
    }
}

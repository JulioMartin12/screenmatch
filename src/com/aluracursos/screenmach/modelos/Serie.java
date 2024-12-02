package com.aluracursos.screenmach.modelos;

public class Serie extends Titulo {
    private  int temporadas;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

   /* public Serie(String nombre, int fechaLanzamiento, int duracionEnMinutos, boolean incluidoEnElPlan) {
        super(nombre, fechaLanzamiento, duracionEnMinutos, incluidoEnElPlan);
    }
*/
    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public int getDuracionEnMinutos(){
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }
}

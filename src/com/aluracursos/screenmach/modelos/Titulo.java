package com.aluracursos.screenmach.modelos;

public class Titulo {
    private String nombre;
    private  int fechaLanzamiento;
    private  int duracionEnMinutos;
    private  boolean incluidoEnElPlan;
    private  int totalEvaluaciones;
    private  Double sumaTotalEvaluaciones;

   /* public Titulo(String nombre, int fechaLanzamiento, int duracionEnMinutos, boolean incluidoEnElPlan) {
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
        this.duracionEnMinutos = duracionEnMinutos;
        this.incluidoEnElPlan = incluidoEnElPlan;
    }*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(int fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public int getTotalEvaluaciones() {
        return totalEvaluaciones;
    }

    public void setTotalEvaluaciones(int totalEvaluaciones) {
        this.totalEvaluaciones = totalEvaluaciones;
    }

    public Double getSumaTotalEvaluaciones() {
        return sumaTotalEvaluaciones;
    }

    public void setSumaTotalEvaluaciones(Double sumaTotalEvaluaciones) {
        this.sumaTotalEvaluaciones = sumaTotalEvaluaciones;
    }

    public  void evaluaPelicula(double nota){
        this.setTotalEvaluaciones(this.getTotalEvaluaciones() + 1);
        this.setSumaTotalEvaluaciones(this.getSumaTotalEvaluaciones()+nota);

    }

    public  Double  calcularMedia(){
        return this.getSumaTotalEvaluaciones() / this.getTotalEvaluaciones();
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "nombre='" + nombre + '\'' +
                ", fechaLanzamiento=" + fechaLanzamiento +
                ", duracionEnMinutos=" + duracionEnMinutos +
                ", incluidoEnElPlan=" + incluidoEnElPlan +
                '}';
    }
}


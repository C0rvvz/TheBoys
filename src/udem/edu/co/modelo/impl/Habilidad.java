package udem.edu.co.modelo.impl;

public class Habilidad {
    private String habilidad;

    public Habilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    @Override
    public String toString() {
        return habilidad ;
    }
}




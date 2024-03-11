package udem.edu.co.modelo.impl;

import java.util.List;

public class Seven {
    private String nombre;
    private List<Habilidad> habilidades;

    public Seven(String nombre, List<Habilidad> habilidades) {
        this.nombre = nombre;
        this.habilidades = habilidades;
    }

    public Seven() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Habilidad> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<Habilidad> habilidades) {
        this.habilidades = habilidades;
    }

    @Override
    public String toString() {
        return
                nombre + '/'
                + habilidades ;
    }
}

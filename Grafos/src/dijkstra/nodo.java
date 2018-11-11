package dijkstra;

import java.util.List;

public class nodo {
    private String nombre;
    private List<Arco> aristas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Arco> getAristas() {
        return aristas;
    }

    public void setAristas(List<Arco> aristas) {
        this.aristas = aristas;
    }
}

package e.hp.mascotas;

public class Mascotas {
    private String nombre ;
    private String estrella;
    private int foto;

    public Mascotas(int foto, String nombre, String estrella) {
        this.foto = foto;
        this.nombre = nombre;
        this.estrella = estrella;
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

    public String getEstrella() {
        return estrella;
    }

    public void setEstrella(String estrella) {
        this.estrella = estrella;
    }
}

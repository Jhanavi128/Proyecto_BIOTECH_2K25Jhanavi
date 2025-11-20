package jmBIOTECH_2K25.jmProterozoico;

public abstract class jmClasificacion {
    protected String jmNombre;

    public jmClasificacion(String nombre) {
        this.jmNombre = nombre;
    }

    public void jmMostrarNombre(String prefijo){
        System.out.println(prefijo + jmNombre);
    }

    public String getJmNombre() {
        return jmNombre;
    }

    public void setJmNombre(String jmNombre) {
        this.jmNombre = jmNombre;
    }
}

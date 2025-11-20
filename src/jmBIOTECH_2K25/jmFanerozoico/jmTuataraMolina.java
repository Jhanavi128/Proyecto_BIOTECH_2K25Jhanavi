package jmBIOTECH_2K25.jmFanerozoico;


public class jmTuataraMolina {
    private String jmNombre;

    public jmTuataraMolina(String nombre){
        this.jmNombre = nombre;
        System.out.println("Tuatara creado: " + this.jmNombre);

    }

    public void jmMostrarNombre (String prefijo){
        System.out.println(prefijo + jmNombre);
    }

    public void comer (){
        System.out.println(jmNombre + " está comiendo insectos.");
    }

    public String getJmNombre() {
        return jmNombre;
    }

    public void setJmNombre(String jmNombre) {
        this.jmNombre = jmNombre;
    }

    
}

package jmBIOTECH_2K25;

import jmBIOTECH_2K25.jmFanerozoico.jmTuataraMolina;

public class jmBiologoRuso {
    private String jmNombre;

    public jmBiologoRuso(String nombre){
        this.jmNombre = nombre;
        System.out.println("Biologo Ruso creado: " + this.jmNombre);
    }

    public void jmSolicitarNombreClasificacion(){
        System.out.println(jmNombre + " está solicitando el nombre de la clasificación....");
    }

    public void jmClasificarReptiles(Object reptiles){
        System.out.println(jmNombre + " esta clasificando los reptiles proporcionados...");
    }

    public void jmEscogerReptil(jmTuataraMolina inReptil){
        System.out.println("jmNombre" + " ha escogido al reptil: ");
        inReptil.jmMostrarNombre("->");
    }

    public void jmSolicitarMutacion(jmTuataraMolina inReptil, Object inTanqueMutacion){
       System.out.println(jmNombre + " solicita la mutación del reptil: ");
        inReptil.jmMostrarNombre("->");
        System.out.println("Mutando en el tanque...");
        
        int numero = (int)(Math.random() * (1000 -100) + 100);
        if(numero > 500){
            System.out.println("Mutación exitosa.");
        } else {
            System.out.println("Mutación fallida.");
        }
    }


    

}

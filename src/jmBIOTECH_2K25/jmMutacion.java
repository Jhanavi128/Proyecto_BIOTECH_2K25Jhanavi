package jmBIOTECH_2K25;

import jmBIOTECH_2K25.jmFanerozoico.jmTuataraMolina;

public class jmMutacion {
    public jmMutacion(){}

    public void jmIArecibeAnimal(Object jmIA, jmTuataraMolina reptil){
        System.out.println("\n IA RECIBE ANIMAL");
        System.out.println("La IA ha recibido al reptil:");
        reptil.jmMostrarNombre("->");
        System.out.println("Analizando estructura genética...");
        System.out.println("Preparando proceso de mutación...");
    }

    public void jmMutar(Object jmIA, jmTuataraMolina reptil){
        System.out.println("\n MUTACIÓN EN PROCESO");
        System.out.println("Activando procedimientos químicos...");
        System.out.println("Calculando resultados...");

        int resultado = (int)(Math.random() * (1000 - 100) + 100);
        if(resultado % 2 == 0){
            String nuevoNombre = reptil.getJmNombre() + "Jhanavi";
            System.out.println("Mutación EXITOSA");
            System.out.println("Nuevo nombre mutado: " + nuevoNombre);

        }else{
            System.out.println("Mutación FALLIDA");
            System.out.println("El reptil no logró adaptarse al proceso.");
        }
        System.out.println("FIN DE MUTACIÓN");
    }
}

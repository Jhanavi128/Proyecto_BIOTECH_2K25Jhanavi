package jmBIOTECH_2K25;

import jmBIOTECH_2K25.jmProterozoico.jmGnathostomata;
import jmBIOTECH_2K25.jmProterozoico.jmOsteichthyes;
import jmBIOTECH_2K25.jmProterozoico.jmSarcopterygii;
import jmBIOTECH_2K25.jmProterozoico.jmTetrapoda;
import jmBIOTECH_2K25.jmProterozoico.jmAmniota;
import jmBIOTECH_2K25.jmFanerozoico.jmTuataraMolina;

public class jmAppBiotech {
    
    public void iniciar() throws Exception{
        System.out.println("----- SISTEMA BIOTECH 2K25 -----");
        ejecutarSpinner();
        generarArbol();
        jmTuataraMolina t = crearTuatara();
        ejecutarBiologo(t);
        ejecutarMutacion(t);
    }

    private void ejecutarSpinner() throws InterruptedException{
        char[] spinner = {'|', '/', '-', '\\'};
        for(int i = 0; i <= 100; i++){
            System.out.println("\r" + spinner [i % 4] + " " + i + "%");
            Thread.sleep(25);
        }
        System.out.println("\nCarga completa 100%");
    }

    private void generarArbol(){
        System.out.println("\nARBOL FILOGENÉTICO:" );
        jmGnathostomata g = new jmGnathostomata();
        g.jmMostrarNombre("|-- ");

        jmOsteichthyes o = new jmOsteichthyes();
        o.jmMostrarNombre("|   |-- ");

        jmSarcopterygii s = new jmSarcopterygii();
        s.jmMostrarNombre("|   |   |-- ");

        jmTetrapoda t = new jmTetrapoda();
        t.jmMostrarNombre("|   |   |   |-- ");

        jmAmniota a = new jmAmniota();
        a.jmMostrarNombre("|   |   |   |   |-- ");

        System.out.println("|   |   |   |   |   |-- TuataraMolina");
    }

    private jmTuataraMolina crearTuatara(){
        System.out.println("Creando tuatara Molina...");
        jmTuataraMolina t = new jmTuataraMolina("Pepita");
        t.jmMostrarNombre("Nombre: ");
        t.comer();
        return t;
    }

    private void ejecutarBiologo(jmTuataraMolina tuatara){
        System.out.println("BIOLOGO RUSO");
        jmBiologoRuso bio = new jmBiologoRuso("Dr.Chapatin");
        bio.jmSolicitarNombreClasificacion();
        bio.jmClasificarReptiles(null);
        bio.jmEscogerReptil(tuatara);
        bio.jmSolicitarMutacion(tuatara,null);
    }

    private void ejecutarMutacion(jmTuataraMolina t){
        System.out.println("MUTACION FINAL");
        jmMutacion m = new jmMutacion();
        m.jmIArecibeAnimal(null, t);
        m.jmMutar(null, t);
    }
}



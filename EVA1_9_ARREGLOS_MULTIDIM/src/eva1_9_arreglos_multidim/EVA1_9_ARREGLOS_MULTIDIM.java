/*
 * "EVA 1 Practica 9 "Arreglos Multidimencionales"
 *  26/08/2022"
 */
package eva1_9_arreglos_multidim;

/**
 * @author Quintana Juarez Bryan Alexis
 */
public class EVA1_9_ARREGLOS_MULTIDIM {

    public static void main(String[] args) {
       int[][] matrizDatos = new int[3][5];
       System.out.println("Filas: "+ matrizDatos.length);
       //Rellenar los valores del arreglo
        for (int i = 0; i < matrizDatos.length; i++) {  //Primer Dimensión (3 FIlas)
            System.out.println("Columnas: "+ matrizDatos[i].length);
            
            for (int j = 0; j < matrizDatos[i].length; j++) {  //Segunda Dimensión (5 Columns)
                matrizDatos[i][j] = 100;
            }
        }
        //Imprimir los valores de arreglo
        System.out.println("");
        for (int i = 0; i < matrizDatos.length; i++) {  //Primer Dimensión (3 FIlas)
            for (int j = 0; j < matrizDatos[i].length; j++) {  //Segunda Dimensión (5 Columns)
                System.out.print("[" + matrizDatos[i][j] + "]");
            }
            System.out.println("");
        }
       
    }
}

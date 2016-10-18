/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema11;
import java.util.*;
/**
 *
 * @author PC
 */
public class PP2Problema11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num= solicitarDatos("cantidad de numeros en el numero ");
        int[] numero = new int[num];
       
    }
    public static int solicitarDatos(String d){ //Solicita datos
        int miDato;
        Scanner entradaEscaner = new Scanner(System.in);
        System.out.print("Introduce el dato " + d);
        miDato= entradaEscaner.nextInt();
        return miDato;
    }
     public static int [] llenarVector(int []n){//Metodo de llenar el vector, recibe un arreglo de enteros, regresa un arreglo de enteros
        Scanner entradaEscaner = new Scanner(System.in);       
        for (int i = 0; i<n.length; i++){//Mientras que el valor de i sea menor que el tamaño del arreglo(10), i se aumentara en 1
            System.out.print("Introduce un número para la posición [" + i + "]"); //i indica la posición
            n[i]=entradaEscaner.nextInt();//En la pocision i se asigna el valor
                                          //Y regresa hasta que la posicion i se vuelva 10
                                          //En ese momento regresa el arreglo
        }
        return n;
       }
    public static void c(){
        
    }
}

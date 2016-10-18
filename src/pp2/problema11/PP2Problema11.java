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
        int[] numeros= {1,4,5,6,9,10,11,40,50,60,90,100,110,};,
        String[] romanos= {"I","IV","V","VI","IX","X","XI","XL","L","LX","XC","C","CX","CD","D","M"};
        convertirNumero();
    }
    public static int solicitarDatos(String d){ //Solicita datos
        int miDato;
        Scanner entradaEscaner = new Scanner(System.in);
        System.out.print("Introduce el dato " + d);
        miDato= entradaEscaner.nextInt();
        return miDato;
    }
    public static int verificarNumero(String d){
        int a; //Variable
        do{ //Hacer que solicite datos y se guarden en a 
        a = solicitarDatos(d);
        }while(a<=0);//Mientras que a sea menor o igual que 0
        return a; //Regresa el valor de a
    }
    public static String convertirNumero(){
        int a = verificarNumero(" numero a convertir "); //Se ingresa el numero de 4 digitos //4589
        String r=""; //Se declara un string para guardar el numero
        r=r+a;//El numero se transorma a String //""+4589 
        return r;//Regresa 4589 en forma de dato String
    }
}

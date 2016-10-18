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
        int[] numeros= {1,4,5,9,10,40,50,90,100,400,500,900,1000}; //Arreglo de numeros en los que hay los caracteres romanos en numeros
                                                                   //Ya que se necesitan para poder "igualarlos" en la posicion
        String[] romanos= {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};//Arreglo de numeros romanos que tienen un valor 
        convertirNumero(numeros,romanos);
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
    public static void convertirNumero(int[] numeros, String[]romanos){
        int a = verificarNumero(" numero a convertir "); //Se solicita el numero //3453
        String r=""; //Se declara una cadena
        for(int i=numeros.length-1;i>=0;i--){//Recorrer al reves el arreglo para que empieze por el numero mas grande //i=12
            int veces=a/numeros[i];//a una nueva variable llamada veces el numero solicitado se divide entre la posicion
                                   //veces=3453/1000 veces=3
            while(veces>0){ //Significa que s epudo dividir entre ese numero //3>0 VERDADERO //2>0 VERDADERO //
                r=r+romanos[i]; //El numero que se encuentra en la posicion 12 //r=""+"M" //r="M"+"M" r="MM" //
                veces--; //A veces se le quita 1 //veces=2 //veces=1
            }
            a=a%numeros[i]; //a=3453%1000 a=453 (y continua al principio del for)
        }
       System.out.print(r); //Se imprime la cadena
    }
}

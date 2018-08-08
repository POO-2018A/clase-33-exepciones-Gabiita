/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arregloenteros;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ArregloEnteros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);    
        int tamanoArreglo=0;
        int posicion=0; 
        int numeroIngresado;
        int arreglo [] = new int [tamanoArreglo];
        
        try {
            System.out.println("Ingresa el tamaño del arreglo, por favor");
            tamanoArreglo = Integer.parseInt(scan.nextLine());
            for(int i=0;i<tamanoArreglo ;i++){
                System.out.println("Ingrese el "+i+" numero:");
                numeroIngresado=Integer.parseInt(scan.nextLine());
                arreglo [i]=numeroIngresado;
            }
            System.out.println("Que posicion deseas ver?");
            posicion=Integer.parseInt(scan.nextLine());
            System.out.println("La posicion ingresada contiene el numero:"+ arreglo[posicion]);
        }catch (NumberFormatException e1){
            System.out.println("Por favor, no ingreses LETRAS");
        }catch(NegativeArraySizeException e2){ 
            System.out.println("Esta lista de numeros no contiene posiciones negativas ");
        }catch(ArrayIndexOutOfBoundsException e3){
            System.out.println("Ingrese una posicion correcta");
        }
     
        
    }
    
}

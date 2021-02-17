
package prueba;

import java.util.Scanner;

public class punto3 {
    static int tribo (int num){
        if(num == 0 || num==1 || num==2){
            return 0;
        }
        else if (num==3){
            return 1;
        }else{
            return tribo(num-1) + tribo(num-2)+tribo(num-3);
        } 
    }
    public static void main(String[] args) {
        Scanner entradaEscaner = new Scanner (System.in);
        System.out.println("ingrese el numero de la secuencia que desea ver");
        String aux=entradaEscaner.nextLine();
        int n=Integer.parseInt(aux);
        System.out.println("el numero de la secuencia es: "+tribo(n));
    }
    
}

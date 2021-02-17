
package prueba;

import java.util.Scanner;

public class punto4 {
    
    static double potencia(double base, int indice, double aux){
        if (indice>=1){
            aux=aux*base;
            indice=indice-1;
            return potencia(base, indice,aux);
        }else{
            return aux;
        }
    }
    public static void main(String[] args) {
        Scanner entradaEscaner = new Scanner (System.in);
        System.out.println("ingrese la base");
        String aux1=entradaEscaner.nextLine();
        double base=Double.parseDouble(aux1);
        System.out.println("ingrese la potencia");
        String aux2=entradaEscaner.nextLine();
        int indice=Integer.parseInt(aux2);
        double aux=1;
        System.out.println(potencia(base,indice,aux));        
    }
    
}

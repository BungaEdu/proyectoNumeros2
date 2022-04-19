/*Creamos un array de 10 elementos
Lo rellenamos pidiendo números al US
El resultado es que me indique cuántas veces ha introducido los números
*/

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        /*************DECLARACIÓN*************/
        int arrayUs [] = new int [10];
        int arrayImp [] = new int [10];
        Scanner sc = new Scanner(System.in);
        int numUs = 0, i=0;

        /************PETICIÓN NÚMEROS***********/
        System.out.println("Dime un número: ");
        for(i=0;i<10;i++) {
            arrayUs[i]= sc.nextInt();
        }

        /***********CONTADOR REPETICIONES******/
        int num=0,cont=0,j=0;
        for(i=0;i<10;i++){
            for (j=0;j<10;j++) {
                if(arrayUs[i]==arrayUs[j])
                    cont++;
            }
            System.out.print(arrayUs[i]+"="+cont+",");
            cont=0;
        }

        //No he conseguido quitar los duplicados.
    }
}

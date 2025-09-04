

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //EJECICI0 1
        /*

        int n1, n2, Suma;
        System.out.println("Digite el primer valor");
        n1 = teclado.nextInt();
        System.out.println("Digite el segundo valor");
        n2 = teclado.nextInt();
        Suma    = n1+n2;
        System.out.println("El resultado de la suma es:" + Suma);}

        //EJERCICIO 2
        /**

        Random ale= new Random();
        int n1,n2, Suma;
        n1=ale.nextInt(51);
        System.out.println(n1);
        n2=ale.nextInt((10-5)+1)+5;
        System.out.println(n2);

        //EJERCICIO 3
        /*

        Random ale = new Random();
      int suma = 0;
      for (int i = 1; i <= 101; ) {
          i++;
          int n = ale.nextInt(200) + 1;
          System.out.println(n);
          suma += n;
      }
      System.out.println("el resultado del ejercicio es:" + suma);

      //EJERCICIO 4
         /*

    Random ale = new Random();

    int suma = 0;
    int sumapares =0;
    int sumaimpares =0;
        for (int i = 1; i <= 101; ) {
        i++;
        int n = ale.nextInt(200) + 1;
        System.out.println(n);
        suma += n;
        if (n% 2== 0){
            sumapares += n;
        }else {
            sumaimpares +=n;
        }

    }
        System.out.println("el resultado de los pares es:" + sumapares);
        System.out.println("el resultado de los impares es;" + sumaimpares);
    }
}
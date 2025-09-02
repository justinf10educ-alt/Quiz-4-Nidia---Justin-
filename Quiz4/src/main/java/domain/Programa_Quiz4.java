
package domain;

import java.util.Scanner;

public class Programa_Quiz4 {

    public void verificarParImpar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite un número: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es PAR.");
        } else {
            System.out.println("El número " + numero + " es IMPAR.");
        }
    }
}

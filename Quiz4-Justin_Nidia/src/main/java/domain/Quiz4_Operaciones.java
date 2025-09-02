/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;
import javax.swing.JOptionPane;

/**
 *
 * @author Justin Flores
 */
public class Quiz4_Operaciones {
    
    public void Operaciones(){

 //Sumar - Resta
        //Inicio - Me va a permitir meter datos.
		int numero1 = 0;
		int numero2 = 0;
	    int resultado = 0;


	    for (int i=0 ; i < 3 ; i++){

			numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer número Justin: "));
	        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo número: "));

			if (numero1 > numero2){

						resultado = numero1 - numero2;

						JOptionPane.showMessageDialog(null, "La resta es de: " + resultado);
					}
					else if(numero1 == numero2){

						resultado = numero1 * numero2;

						JOptionPane.showMessageDialog(null, "La multiplicación es de: " + resultado);

						}

					else{

						resultado = numero1 + numero2;

						JOptionPane.showMessageDialog(null, "La suma es de: " + resultado);
		}


			}


}
    
}

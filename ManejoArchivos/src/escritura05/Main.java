/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura05;

import java.util.Scanner;

/**
 *
 * @author daigo
 */
public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char continuar;
        do {

            System.out.println("Ingrese la marca del vehiculo");
            String marca = entrada.nextLine();

            System.out.println("Ingrese su nombre");
            String nombre = entrada.nextLine();

            System.out.println("Ingrese el numero de placa");
            String placa = entrada.nextLine();

            char tipoPlaca = Character.toUpperCase(placa.charAt(0));

            String cadenafinal = String.format(
                    "%s | %s | %s\n",
                    nombre, placa, marca
            );
            CrearArchivos.agregarRegistros(cadenafinal, tipoPlaca);
            System.out.printf("Dese continuar ingresando otro vehiculo ? (S/N)");
            continuar = entrada.nextLine().toUpperCase().charAt(0);

        } while (continuar == 'S');

    }
}

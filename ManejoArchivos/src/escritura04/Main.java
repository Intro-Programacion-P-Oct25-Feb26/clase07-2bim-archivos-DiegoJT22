/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura04;


import java.util.Scanner;

/**
 *
 * @author daigo
 */
public class Main {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        String cadenaFinal = "";
        String cedula = "";

        for (int i = 1; i < 3; i++) {

            System.out.println("Ingrese cedula");
            cedula = entrada.nextLine();
            System.out.println("Ingrese nombre");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese correo");
            String correo = entrada.nextLine();

            cadenaFinal = String.format("%s %s %s\n", cedula,nombre,correo);
            CrearArchivo.agregarRegistros(cadenaFinal,cedula);
        }

    } 
}

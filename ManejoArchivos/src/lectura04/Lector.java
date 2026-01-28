/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectura04;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author daigo
 */
public class Lector {

    public static void obtenerPromedio() {

        double suma = 0;
        int contador = 0;
        try {
            Scanner entrada = new Scanner(new File("data/datosDos.txt"));

            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                List<String> lista = Arrays.asList(linea.split("\\|"));
                ArrayList<String> linea_partes = new ArrayList<>(lista);


                    contador = contador + 1;

                    suma = suma + Double.parseDouble(linea_partes.get(3));
                

            }
        } catch (FileNotFoundException ex) {
            System.getLogger(Lector.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        suma = suma / contador;

        System.out.printf("El promedio es: %.2f", suma);

    }

}

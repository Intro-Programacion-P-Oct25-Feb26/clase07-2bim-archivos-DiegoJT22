/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura05;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Formatter;
/**
 *
 * @author daigo
 */
public class CrearArchivos {
    public static void agregarRegistros(String datos, char tipoPlaca) {
        String nombreArchivo;
        switch(tipoPlaca){
            case 'L':
                nombreArchivo = "data/placasLoja.txt";
                break;
            case 'P':
                    nombreArchivo="data/placasPichincha.txt";
                    break;
            case 'G':
                nombreArchivo = "data/placasGuayas.txt";
                break;
            default:
                nombreArchivo = "data/otrasCiudades.txt";
                break;

        
        }

        try{
            FileOutputStream fos = new FileOutputStream(nombreArchivo,true);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            Formatter salida = new Formatter(osw);
            
            salida.format("%s",datos);
            salida.close();
        
        }catch(Exception e){
            System.err.println("Error al crear el archivo.");
            System.exit(1);
        
        }
        
    }
    
}

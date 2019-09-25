import java.io.*;
public class Ejercicio10 {
 public static void main(String[] args) {
 try{
    PrintWriter fichero= new PrintWriter(new File ("fichero.txt"));
    for (int i=1; i<11; i++){
    fichero.println("Fila numero: "+i);

    
 }
    fichero.close();
 }
    catch (FileNotFoundException fn ){
    System.out.println("No se encuentra el fichero");}
   
 }
}
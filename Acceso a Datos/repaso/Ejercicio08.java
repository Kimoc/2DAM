 import java.io.*;
 public class Ejercicio08{
    public static void main(String[] args) throws IOException {
    File fichero = new File("fichero1.txt");//declarar fichero
    FileReader fic = new FileReader(fichero); //crear el flujo de entrada
    int i;
    while ((i = fic.read()) != -1) //se va leyendo un carácter
     System.out.println( (char) i + "==>"+ i);
     fic.close(); //cerrar fichero }
    }
}
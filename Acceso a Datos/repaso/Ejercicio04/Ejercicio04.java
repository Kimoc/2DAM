import java.io.IOException;
import java.util.Scanner;
import java.io.*;
public class Ejercicio04{
    //USAR AL LANZAR :Input.txt como argumento
    public static void main(String[] args) throws IOException {
        File fich = new File(args[0]);
        Scanner lec= new Scanner(System.in);
        char inputUsuario;
        FileWriter fw= new FileWriter(fich);
        do{
                 System.out.println("Introduce caracteres hasta que se introduzca el caracter:  \\  ");
                 inputUsuario= lec.next().charAt(0);
                 if(inputUsuario!='\\'){
                    fw.write(inputUsuario);
                 }
           
        }
        while(inputUsuario != '\\');      
        fw.close();


    
    }
}
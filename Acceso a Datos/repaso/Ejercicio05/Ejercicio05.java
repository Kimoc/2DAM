import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.*;

public class Ejercicio05{
    public static void main(String[] args) throws IOException {
        File fich= new File("FicheroTipoData");
        //Indroducimos datos en fichero
        FileOutputStream fileOut=new FileOutputStream(fich);
        FileInputStream fileIn=new FileInputStream(fich);
        String[] nombres= {"Christian","Manolo","Cinthya","Paco","Aaron"};
        int [] edad= {18,20,17,29,30};

        for(int i=0;i<edad.length;i++){
            dataOut.writeUTF(nombres[i]);
            dataOut.writeInt(edad[i]);
        }
        //Leemeos fichero
        DataOutputStream dataOut=new DataOutputStream(fileOut);
        DataInputStream dataIn= new DataInputStream(fileIn);
        while(dataIn.available()>0){
            System.out.print("Nombre: " +dataIn.readUTF());
            System.out.println(", Edad: "+dataIn.readInt());
        }
        dataIn.close();
        dataOut.close();
    }
}
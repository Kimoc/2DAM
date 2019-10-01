
import java.io.*;

public class Ejercicio03{
    public static void main(String[] args) throws IOException {
      BufferedReader reader;
      try{
            File fich= new File(args[0]);
            reader = new BufferedReader(new FileReader(fich));
            String line ;
            while((line=reader.readLine())!=null){
                System.out.println(line);
            }
      }catch (IOException e){
          System.out.println("Error al leer fichero o el fichero no existe");
      }

        

    }
}
import java.io.*;
//Acces a datos tema 1 ejercicio 3
public class Ejercicio07{
    public static void main(String[] args) {

        String directorio=".";
        File _directorio=new File(directorio,"Curs 2DAM");
        if(_directorio.mkdir()){

            File aval1= new File (_directorio,"1AVAL");
            File aval2= new File (_directorio,"2AVAL");
            File aval3=new File (_directorio,"3AVAl");
            aval2.mkdir();
            aval3.mkdir();
            if(aval1.mkdir()){
                File examenMio = new File(aval1,"Examen Mio");
                File examenTuyo =new File (aval1,"Examen Tuyo");
                try{
                    examenMio.createNewFile();
                    examenTuyo.createNewFile();
                }catch(IOException ioe){

                }
            }
            
        
        }
        

    }
}
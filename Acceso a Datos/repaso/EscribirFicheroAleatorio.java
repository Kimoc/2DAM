import java.io.*;
public class EscribirFicheroAleatorio{
    public static void main(String[] args) throws IOException{
        File fich = new File("FicheroAleatorio.dat");
        RandomAccessFile raf = new RandomAccessFile(fich,"rw" );
        String [] noms ={"Ruben,Toni,Juan Francisco","Christian","Esteban","Pablo","Cinthya","Paco"};
        int[] edat={24,22,19,19,21,26,27,22};
        double[] nota={8.2,9.6,3.6,5.0,8.8,7.1,6.3,6.6};

        StringBuffer buffer = null; //buffer para almacenar noms
        try{
            for (int i=0;i<noms.length;i++){
                        //recorrer los nombres
                        raf.writeInt(i+1);
                        buffer=new StringBuffer(noms[i]);
                        buffer.setLength(10);//fijar 10 caracteres par que no salgan
                        raf.writeChars(buffer.toString());
                        raf.writeInt(edat[i]);//inserta edad
                        raf.writeDouble(nota[i]);//inserta nota
                        raf.close();
            }
        }catch(IOException ioe){

        
        }
    }
}
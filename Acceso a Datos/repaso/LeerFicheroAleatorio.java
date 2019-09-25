import java.io.*;  
import java.util.*; 
public class LeerFicheroAleatorio{
    static Scanner lector = new Scanner (System.in);
    public static void main(String[] args) throws IOException{
       File fich = new File("FicheroAleatorio.dat");
       RandomAccessFile raf= new RandomAccessFile(fich,"r");
       System.out.println("Dime el id del alumno:");

       int ide=lector.nextInt();
       boolean encontrado;

       int id,edad,posicion;
       double nota;
       char nombre[] = new char[10],aux;

       posicion=0;

       for(;;){//para recorrer el fichero (todo)
            raf.seek(posicion);
            
            id=raf.readInt();
            for(int i = 0;i<nombre.length;i++){
                aux=raf.readChar();
                nombre[i]=aux;// se va guardando en el array
            }
            String nom=new String(nombre);
            edad=raf.readInt();
            nota=raf.readDouble();
            encontrado = false;

            if(ide==id){
                System.out.printf("ID: %s","Nombre: %s","Edad: %d","Nota : %,2f %n",id,nom.trim(),edad,nota);
                encontrado=true;
                break;
            }
            //Se posiciona en el siguiente alumno , cada alumno ocupa 36 Bytes
            posicion=posicion+36;

            if(raf.getFilePointer()==raf.length()) break;
        }
        raf.close();
        if(!encontrado){
            System.out.println("Alumno no encontrado");
        }
    }

}
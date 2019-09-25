import java.io.*;
public class Ejercicio05{

	public static void main(String[] args){
		
		String fichero=args[0];//ruta del fichero
		File f1= new File (fichero);
		
		try{
			if(f1.exists()){

				System.out.printnl("Ruta: \t"+f1.getPath());
				System.out.printnl("Ruta: \t"+f1.getPath());
				System.out.printnl("Ruta: \t"+f1.getPath());
			}
		}catch(IOException ioe){

		}
	}

}

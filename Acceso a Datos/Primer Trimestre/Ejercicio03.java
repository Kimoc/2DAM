import java.io.*;
public class Ejercicio03{

	public static void main(String[] args){
		//pasamos rua y nos dice si es fichero o directorio
		String fichero=args[0];
		File f1= new File (fichero);
		
		for(int i =0; i<fList.length;i++){
			File f2= new File (directorio,fList[i]);
			if(f2.isDirectory()){

				System.out.println("D--Nombre "+f2.getName()+"   Tamaño "+f2.length() +"Bytes");
				}	
			
			
			else{
				System.out.println("A--Nombre "+f2.getName()+"   Tamaño "+f2.length() +"Bytes");

				}	
 
					
		}
	}

}

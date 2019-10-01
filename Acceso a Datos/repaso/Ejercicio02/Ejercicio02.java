import java.io.*;
public class Ejercicio02{

	public static void main(String[] args){
		//Lista los ficheros de input en el argumento (args[0])
		String directorio =args[0];
		File f1= new File (directorio);
		String [] fList=f1.list();
		System.out.println("Directorio: "+directorio);
		for(int i =0; i<fList.length;i++){
		
		System.out.println("Nombre "+fList[i].getName()+"   Tamaño "+fList[i].length() +"Bytes");
					
			
			
			
					
		}
	}

}

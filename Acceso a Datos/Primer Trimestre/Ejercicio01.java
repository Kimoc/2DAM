import java.io.*;
import java.util.*;
public class Ejercicio01{

	public static void main(String[] args){
		
		String directorio ="/home/aaron/Desktop/Acceso a datos";
		File f1= new File (directorio);
		String [] fList=f1.list();
		System.out.println("Directorio: "+directorio);
		for(int i =0; i<fList.length;i++){
			File f2= new File (directorio,fList[i]);
			System.out.println("Nombre "+f2.getName()+"   Tamaño "+f2.length() +"Bytes");
			
			}	 
					

	}

}

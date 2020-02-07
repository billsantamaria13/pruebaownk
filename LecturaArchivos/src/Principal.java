import java.io.File;
import java.util.Scanner;
import java.io.FileFilter;

public class Principal 
{
	
	
	
	public static void main(String[] args) 
	
	{
		//Solicita ruta a trabajar
		System.out.println("*********************************************");
		System.out.println("* Ingrese la ruta con la que desea trabajar *");
		System.out.println("*********************************************");
		
		
		Scanner directorio = new Scanner(System.in);
		String ruta = directorio.nextLine();
		File file = new File(ruta);
		File[] lista = file.listFiles();
				
		int cuenta=0;	
		int cuenta2=0;	
		
		for (int i = 0; i < lista.length; i++) 
		      if (lista[i].isFile())
		           cuenta++;
		
		System.out.println("======================================");
		System.out.println("=            Hay " +  cuenta + " archivos          =");
		System.out.println("======================================");
		System.out.println("  ");	
		
		for (int i = 1; i < lista.length; i++) 
		      if (lista[i].isDirectory())
		           cuenta++;
		
		System.out.println("======================================");
		System.out.println("=            Hay " +  cuenta + " carpetas          =");
		System.out.println("======================================");
		System.out.println("  ");
		
		
	    //Solicita la extension a validar		
		System.out.println("**************************************************");
		System.out.println("* Ingrese la extension de los archivos a buscar  *");
		System.out.println("**************************************************");
		Scanner extension = new Scanner(System.in);
		String ext = extension.nextLine();
	    
				File carpeta = new File(ruta);
			    File[] archivos;
			    if(carpeta.exists()) 
			    {
			        if(carpeta.isDirectory()) 
			        {
			            archivos = carpeta.listFiles();
			            
			            System.out.println("==================================================");
	        			System.out.println("=   Se encontraron los siguientes archivos "+ ext +"  =");
	        			System.out.println("==================================================");
			            
			            for(int i=0; i<archivos.length; i++) 
			            {
			                if(archivos[i].getName().endsWith(ext)) 
			                	
			                    System.out.println(archivos[i].getName());
			            }
			        }
	
			    }
	}
}

//C:\Users\OWNK\Documents\Script\01_Base_de_datos


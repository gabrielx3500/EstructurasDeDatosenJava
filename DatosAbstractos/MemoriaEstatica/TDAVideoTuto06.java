//Memoria estatica: es un espacio de memoria que no se 
//modifica en tiemp de ejecucion
import java.util.*;
import javax.swing.JOptionPane;
public class TDAVideoTuto06{
	public static void main(String[] args){
    //Declaramso el Arreglo
	int numeros[] = new int[5];
	int i;
	String palabras[] = new String[5];
	int numerotes[] = new int[numeros.length];
	//declaramos el bucle for
	//para recorrer el arreglo
	for(i = 0; i<5;i++){
	  numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el Elemento del Indice: " + i));
	}	
    //Mostramos los datos
    System.out.println("\nLos Datos sin ordenar son: ");
    for(i = 0; i<5;i++){
	   System.out.print("[" + numeros[i] + "]");
	}	
     System.out.println("\nLos Datos ordenados son: ");
     Arrays.sort(numeros);//Aqui ordenamos el atreglo de numeros
      for(i = 0; i<5;i++){
	   System.out.print("[" + numeros[i] + "]");
	}	
	//rellenado de datos del arreglo palabras
	Arrays.fill(palabras,"Bienvenido a la fiesta");
	 System.out.println("\nElementos del Arreglo palabras ");
	 for(i = 0; i<5;i++){
	   System.out.print("[" + palabras[i] + "]");
	}	
	//Copiando los elementos del Arreglo numeros a numerotes
	System.arraycopy(numeros,0,numerotes,0,numeros.length);
	 System.out.println("\nElementos del Arreglo numerotes ");
	 for(i = 0; i<5;i++){
	   System.out.print("[" + numerotes[i] + "]");
	}	
	}
}
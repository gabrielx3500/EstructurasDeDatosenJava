//Es un espacio de memoria que puede variar
//durante la ejecucion del programa
//Metodo de ArrayList: add, get, set, remove, size
import java.util.*;
import javax.swing.JOptionPane;
public class TDAVideoTuto07{
	public static void main(String[] args){
	//Declaramos un ArrayList
	ArrayList<String>cadenas;
	cadenas = new ArrayList<String>();
	String frase, respuesta;
	do{
       frase = JOptionPane.showInputDialog(null,"Ingresa la Frase: ");
       respuesta = JOptionPane.showInputDialog(null,"Deseas Ingresar otra Frase (SI/NO)?");
       respuesta = respuesta.toUpperCase();
       //Agregando la Frase a la Lista
       cadenas.add(frase);
	}while(!respuesta.equals("NO"));//Mientras respuesta sea diferente de NO, Repite la pregunta	
    //Mostramos en pantalla
    for(int i = 0;i<cadenas.size();i++)
    {
    	System.out.println(cadenas.get(i));
    }
	}
}
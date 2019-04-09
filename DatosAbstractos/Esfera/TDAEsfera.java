import java.util.*;
public class TDAEsfera{
		//Declaracion de variables
	private double radio = 0;
	//Definimos el constructor
	public TDAEsfera(double radioInicial){
       if(radioInicial>0){
       	this.radio = radioInicial;
       }else{
       	this.radio = 0.0;
       }
	}	

	//Creamos los metodos
	public double getRadio(){
		return this.radio;
	}

	public double getDiametro(){
	 return (radio*2);	
	}

	public double getCircunferencia(){
	 return (Math.PI*getDiametro());
	}

	public double  getArea(){
	 return (4*Math.PI*radio*radio);
	}

	public double getVolumen(){
	 return (4*Math.PI*Math.pow(radio,3));	
	}
}
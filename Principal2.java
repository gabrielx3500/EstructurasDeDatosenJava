public class Principal2{
	//Formateo de cadenas
	//Es estático porque para acceder a el necesitamos de la clase:
	//String.format
	public static void main(String[] args){
	//Declara´mos las variables
		double r = Math.PI;
		//Mostramoes el resultado
		System.out.println(String.format("El Valor de PI es: %.3f ",r));


	}
}
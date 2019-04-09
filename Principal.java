public class Principal{
	//Formateo de cadenas
	//Es estático porque para acceder a el necesitamos de la clase:
	//String.format
	public static void main(String[] args){
	//Declara´mos las variables
		String nombre = "Juana";
		int escalones = 40;
		String s = String.format("%s ha subido %d ",nombre,escalones);
		//Mostramoes el resultado
		System.out.println(s);


	}
}
public class Principal3{
	//Formateo de cadenas
	//Es estático porque para acceder a el necesitamos de la clase:
	//String.format
	public static void main(String[] args){
	//Declara´mos las variables
		String mensaje = "Me gusta programar";
		int dias = 7;
		//Mostramoes el resultado
		System.out.println(String.format("%s los %d dias de la Semana",mensaje,dias));


	}
}
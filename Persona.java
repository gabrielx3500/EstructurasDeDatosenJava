public class Persona extends Main{
	//El Constructor es el que nos ayuda a inicializar los atributos de los objetos
	public static void main(String[] args){
	//Declaracion de Variables
	private String nombre, apellido;
	private int edad;
	private double sueldo;

    //Constructor
	public Persona(String nom, String ape, int ed)
	{
      nombre = nom;
      apellido = ape; 
      edad = ed;
	}
	//Metrodos getter y Setter
	public String getNombre(){
      return nombre;
	}
	public void setNombre(String nom){
      nombre = nom;
	}

	public String getApellido(){
      return apellido;
	}
	public String setApellido(String ape){
      apellido = ape;
	}
    public int getEdad(){
      return edad;
	}
	public void setEdad(int ed){
		if(ed>0 && ed<120)
		{
		edad = ed;	
		}
		else
		{
		edad = 0;	
		}
	}
	@Override
	public String toString(){
      return String.format("Nombre: %s \n Apellido: %s \n Edad: %d",getNombre(), getApellido(), getEdad());
	}

}
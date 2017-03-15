package principal;

public class Empleado extends Persona {
	private String rango;
	

	
	public Empleado(String dni,String nombre,String apellidos,String rango){
		
		this.rango=rango;
		
	}
	@Override
	public void mostrar(){
	
		System.out.println("DNI:" + getDni());
		System.out.println("Nombre: " + getNombre());
		System.out.println("apellidos: " + getApellidos());
		System.out.println("Rango: "+ rango);
		
	}

	public String getRango() {
		return rango;
	}

	public void setRango(String rango) {
		this.rango = rango;
	}
}

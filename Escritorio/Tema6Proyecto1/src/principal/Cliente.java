package principal;

public class Cliente extends Persona{

	private String visa;

	public Cliente(String dni,String nombre,String apellidos,String visa){
		
		this.visa=visa;
		
	}
	@Override
	public void mostrar(){
		
		System.out.println("DNI:" + getDni());
		System.out.println("Nombre: " + getNombre());
		System.out.println("apellidos: " + getApellidos());
		System.out.println("visa: " + visa);
		
	}

	public String getVisa() {
		return visa;
	}

	public void setVisa(String visa) {
		this.visa = visa;
	}
	
}

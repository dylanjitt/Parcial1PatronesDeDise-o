package empresas7;

public class Empleado {
	private String nombre;
	private String apellido;
	private String id;
	
	public String getId() {
		return id;
	}
	public Empleado setId(String id) {
		this.id = id;
		return this;
	}
	public String getNombre() {
		return nombre;
	}
	public Empleado setNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}
	public String getApellido() {
		return apellido;
	}
	public Empleado setApellido(String apellido) {
		this.apellido = apellido;
		return this;
	}
	
	public void info() {
		System.out.println("EMPLEADO: "+nombre+" "+apellido+" ("+id+")");
	}
	

}

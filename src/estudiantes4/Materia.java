package estudiantes4;

public class Materia {
	
	private String nombre;
	private Estudiante estudiante;
	
	public Materia(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	
	public void inscribir(Estudiante estudiante) {
		System.out.println("El estudiante "+estudiante.getNombre()+", C.I.:"+estudiante.getCi()+", ha sido inscrito en la materia "+nombre);
	}
	
	

}

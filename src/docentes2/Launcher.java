package docentes2;

public class Launcher {
	
	public static void main(String[] args) {
		Docente d1 = new Docente("Ramiro", "Flores");
		
		d1.setSueldo(5000.00);
		d1.setCarga_horaria(80);
		d1.setCurso_educacion_superior(true);
		d1.setAcceso_plataforma(true);
		d1.setMarcado_biometrico(false);
		d1.setMarcado_hoja_de_entrada("08:00");
		d1.setMarcado_hoja_de_salida("18:00");
		
		Docente d2 = d1.clone();
		d2.setNombre("Gabriel");
		d2.setApellido("Hernandez");
		
		Docente d3 = d1.clone();
		d3.setNombre("Geronimo");
		d3.setApellido("Bump");
		
		Docente d4 = d1.clone();
		d4.setNombre("James");
		d4.setApellido("McGill");
		
		Docente d5 = d1.clone();
		d5.setNombre("Howard");
		d5.setApellido("Hamlin");
		
		Docente d6 = d1.clone();
		d6.setNombre("Ignacio");
		d6.setApellido("Vargas");
		
		Docente d7 = d1.clone();
		d7.setNombre("Kimberly");
		d7.setApellido("Wexler");
		
		Docente d8 = d1.clone();
		d8.setNombre("Elton");
		d8.setApellido("John");
		
		Docente d9 = d1.clone();
		d9.setNombre("Damon");
		d9.setApellido("Albarn");
		
		Docente d10 = d1.clone();
		d10.setNombre("Charles");
		d10.setApellido("McGill");
		
		Docente d11 = d1.clone();
		d11.setNombre("Howard");
		d11.setApellido("Hamlin");
		
		Docente d12 = d1.clone();
		d12.setNombre("Walter");
		d12.setApellido("White");
		
		Docente d13 = d1.clone();
		d13.setNombre("Hank");
		d13.setApellido("Schrader");
		
		Docente d14 = d1.clone();
		d14.setNombre("Keanu");
		d14.setApellido("Reeves");
		
		Docente d15 = d1.clone();
		d15.setNombre("Robert");
		d15.setApellido("Pattinson");
		
		d1.showInfo();
		d2.showInfo();
		d3.showInfo();
		d4.showInfo();
		d5.showInfo();
		d6.showInfo();
		d7.showInfo();
		d8.showInfo();
		d9.showInfo();
		d10.showInfo();
		d11.showInfo();
		d12.showInfo();
		d13.showInfo();
		d14.showInfo();
		d15.showInfo();
		
	}

}

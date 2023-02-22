package colegio1;

public class Launcher {

	public static void main(String[] args) {
		Estudiante e = new Estudiante("Luz Noceda", new Cajero("Rodrigo Vargas", 777));
		e.pagar(1218);
		
		Estudiante e2 = new Estudiante("Dipper Pines", new Cajero("Rodrigo Vargas", 777));
		e2.pagar(1218);
		
		Estudiante e3 = new Estudiante("Anne Boonchuy", new Cajero("Rodrigo Vargas", 777));
		e3.pagar(1218);
		
		Estudiante e4 = new Estudiante("Tame Impala", new Cajero("Rodrigo Vargas", 777));
		e4.pagar(1218);

		Estudiante e5 = new Estudiante("Robert pattinson", new Cajero("Rodrigo Vargas", 777));
		e5.pagar(1218);
	}

}

package estudiantes4;

public class Launcher {

	public static void main(String[] args) {
		Estudiante e1 = new Estudiante("844579-1P", "Diego Rojas");
		Estudiante e2 = new Estudiante("544567", "ROdrigo Candia");
		Estudiante e3 = new Estudiante("777666", "Augustus POrter");
		Estudiante e4 = new Estudiante("123475", "Russel Hobbs");
		Estudiante e5 = new Estudiante("3529782", "Carlos Santana");
		Estudiante e6 = new Estudiante("6969420","Marshall Matters");
		
		String mate = "matematicas";
		String lenguaje = "lenguaje";
		String historia = "historia";
		String ingles = "ingles";
		
		FactoryMateria.make(lenguaje).inscribir(e1);
		FactoryMateria.make(ingles).inscribir(e2);
		FactoryMateria.make(mate).inscribir(e3);
		FactoryMateria.make(historia).inscribir(e4);
		FactoryMateria.make(lenguaje).inscribir(e5);
		FactoryMateria.make(historia).inscribir(e6);

	}

}

package estudiantes4;

public class FactoryMateria {
	
	public static Materia make(String type) {
		Materia materia;
		
		switch (type.toLowerCase()){
        case "matematicas":
            materia = new Materia("Matematicas");
            break;
        case "lenguaje":
        	materia = new Materia("Lenguaje");
            break;
        case "ingles":
        	materia = new Materia("Ingles");
            break;
        case "historia":
        	materia = new Materia("Historia");
            break;
        default:
        	materia = new Materia("NOT ASSIGNED");
            break;
    }
    return materia;
}

}

package empresas7;


import java.util.LinkedList;
import java.util.List;

public class PymTecnologies implements IAgregate{
	
	private List<Empleado> empleados = new LinkedList<>();
	
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(Empleado empleados) {
		this.empleados.add(empleados);
	}
	
	@Override
	public PymTecIterator createIterator() {
		return new PymTecIterator(empleados);
	}

}

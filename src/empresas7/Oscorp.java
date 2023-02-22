package empresas7;

import java.util.ArrayList;
import java.util.List;

public class Oscorp implements IAgregate{
	
	private List<Empleado> empleados = new ArrayList<>();

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(Empleado empleados) {
		this.empleados.add(empleados);
	}

	@Override
	public OscorpIterator createIterator() {
		return new OscorpIterator(empleados);
	}

}

package empresas7;

import java.util.List;
import java.util.Vector;

public class StarkIndustries implements IAgregate {
	
	private Vector<Empleado> empleados = new Vector<Empleado>();
	
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(Empleado empleados) {
		this.empleados.add(empleados);
	}

	@Override
	public StarkIndIterator createIterator() {
		return new StarkIndIterator(empleados);
	}

}

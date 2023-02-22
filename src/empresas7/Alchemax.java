package empresas7;

import java.util.List;
import java.util.Stack;

public class Alchemax implements IAgregate {
	
	private Stack<Empleado> empleados = new Stack<>();
	
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(Empleado empleados) {
		this.empleados.add(empleados);
	}
	
	@Override
	public AlchemaxIterator createIterator() {
		return new AlchemaxIterator(empleados);
	}

}

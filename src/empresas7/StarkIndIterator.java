package empresas7;

import java.util.Vector;

public class StarkIndIterator implements Iterator {
	
	private Vector<Empleado> empleados = new Vector<Empleado>();
	private int position =0;
	
	
	public StarkIndIterator(Vector<Empleado> empleados) {
		this.empleados = empleados;
	}

	@Override
	public Empleado next() {
		return this.empleados.get(position++);
	}

	@Override
	public boolean hasNext() {
		return this.empleados.size() !=0 && position < this.empleados.size();
	}

}

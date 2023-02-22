package empresas7;

import java.util.LinkedList;
import java.util.List;

public class PymTecIterator implements Iterator{
	
	private List<Empleado> empleados = new LinkedList<>();
	private int position =0;

	public PymTecIterator(List<Empleado> empleados) {
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

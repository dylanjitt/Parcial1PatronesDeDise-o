package empresas7;

import java.util.ArrayList;
import java.util.List;

public class OscorpIterator implements Iterator{
	
	private List<Empleado> empleados = new ArrayList<>();
	private int position= 0;
	

	public OscorpIterator(List<Empleado> empleados) {
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

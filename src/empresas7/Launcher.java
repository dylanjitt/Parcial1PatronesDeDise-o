package empresas7;

import java.util.HashMap;
import java.util.Map;

public class Launcher {

	public static void main(String[] args) {
		Empleado e1 = new Empleado();
		Empleado e2 = new Empleado();
		Empleado e3 = new Empleado();
		Empleado e4 = new Empleado();
		Empleado e5 = new Empleado();
		Empleado e6 = new Empleado();
		Empleado e7 = new Empleado();
		Empleado e8 = new Empleado();
		
		e1.setNombre("Peter").setApellido("Parker").setId("2445");
		e2.setNombre("Benjamin").setApellido("Tennyson").setId("5889");
		e3.setNombre("Andrew").setApellido("Tate").setId("6969");
		e4.setNombre("Anthony").setApellido("Stark").setId("0000");
		e5.setNombre("Rodrigo").setApellido("Chavez").setId("1234");
		e6.setNombre("Gustavo").setApellido("Fring").setId("1111");
		e7.setNombre("America").setApellido("Chavez").setId("9999");
		e8.setNombre("Stephen").setApellido("Strange").setId("56798");
		
		Oscorp oscorp = new Oscorp();
		StarkIndustries stark = new StarkIndustries();
		PymTecnologies pym = new PymTecnologies();
		Alchemax alchemax = new Alchemax();
		
		oscorp.setEmpleados(e1);
		oscorp.setEmpleados(e2);
		
		stark.setEmpleados(e3);
		stark.setEmpleados(e4);
		
		pym.setEmpleados(e5);
		pym.setEmpleados(e6);
		
		alchemax.setEmpleados(e7);
		alchemax.setEmpleados(e8);
		
		Map<String,Empleado> inc = new HashMap<>();
		Iterator iterator = oscorp.createIterator();
		while (iterator.hasNext()){
            Empleado tmp = iterator.next();
            //tmp.info();
            inc.put(tmp.getId(),tmp);
        }
		
		iterator = stark.createIterator();
		while (iterator.hasNext()){
            Empleado tmp = iterator.next();
            //tmp.info();
            inc.put(tmp.getId(),tmp);
        }
		
		iterator = pym.createIterator();
		while (iterator.hasNext()){
            Empleado tmp = iterator.next();
            //tmp.info();
            inc.put(tmp.getId(),tmp);
        }
		iterator = alchemax.createIterator();
		while (iterator.hasNext()){
            Empleado tmp = iterator.next();
            //tmp.info();
            inc.put(tmp.getId(),tmp);
        }
		
		System.out.println("EMPLEADOS EN SISTEMA: ");
		System.out.println("-----------------------");
		for (String key:inc.keySet()) {
			
			inc.get(key).info();
		}
		

	}

}

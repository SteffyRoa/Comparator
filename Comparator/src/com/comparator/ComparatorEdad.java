
package com.comparator;

import com.concurso.pojo.Empleado;
import java.util.Comparator;

public class ComparatorEdad implements Comparator<Empleado> {

    @Override
    public int compare(Empleado t1, Empleado t2) {
        //comparar por nombre
        return t1.getEdad()-(t2.getEdad());//por nombre
    }
  
}

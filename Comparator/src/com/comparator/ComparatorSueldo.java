
package com.comparator;

import com.concurso.pojo.Empleado;
import java.util.Comparator;

public class ComparatorSueldo implements Comparator<Empleado> {

    @Override
    public int compare(Empleado t1, Empleado t2) {
        //comparar por nombre
          return(int) (t1.getSueldo()-t2.getSueldo());//por sueldo
    }
 
}

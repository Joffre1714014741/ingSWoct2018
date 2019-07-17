
package calcular.edad;

import java.util.Calendar;
import java.util.GregorianCalendar;
 
public class CalcularEdad {
 
	public static void main(String[] args) {
		
		System.out.println(calcular(new GregorianCalendar(1994,02,14)));
	}
 
    public static int calcular(Calendar fechaNac) {
        Calendar fechaActual = Calendar.getInstance();
 
    
        int years = fechaActual.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);
        int months = fechaActual.get(Calendar.MONTH) - fechaNac.get(Calendar.MONTH);
        int days = fechaActual.get(Calendar.DAY_OF_MONTH) - fechaNac.get(Calendar.DAY_OF_MONTH);
 
          if(months < 0 
           || (months==0 && days < 0)) { 
            years--;
        }
        return years;
    }
}

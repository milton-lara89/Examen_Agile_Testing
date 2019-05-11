package exaprac2;
import clases.empleado;
import java.util.Scanner;
/**
 *
 * @author Mirita_Guardado
 */
public class exaprac2 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        empleado emp1 = new empleado();
        empleado emp2 = new empleado();
        empleado emp3 = new empleado();
        
        double total=0;
        double mayor=0;
        
        System.out.println("Ingrese nombre empleado");
        emp1.setNombre(leer.next());
        System.out.println("Horas trabajadas?");
        emp1.setHorasTrabajadas(leer.nextInt());
        System.out.println("Salario x Hora ?");
        emp1.setSalXhora(leer.nextDouble());
        emp1.calcularSalario();
        System.out.println("Salario: " + emp1.getSalario());
        
        System.out.println("Ingrese nombre empleado");
        emp2.setNombre(leer.next());
        System.out.println("Horas trabajadas?");
        emp2.setHorasTrabajadas(leer.nextInt());
        System.out.println("Salario x Hora ?");
        emp2.setSalXhora(leer.nextDouble());
        emp2.calcularSalario();
        System.out.println("Salario: " + emp2.getSalario());
        
        System.out.println("Ingrese nombre empleado");
        emp3.setNombre(leer.next());
        System.out.println("Horas trabajadas?");
        emp3.setHorasTrabajadas(leer.nextInt());
        System.out.println("Salario x Hora ?");
        emp3.setSalXhora(leer.nextDouble());
        emp3.calcularSalario();
        System.out.println("Salario: " + emp3.getSalario());
        
        total = emp1.getSalario()+emp2.getSalario() +
                emp3.getSalario();
        
       if(emp1.getSalario() > mayor){
            System.out.println("Salario mayor es de:"+
                    emp1.getNombre());
            mayor = emp1.getSalario();
        }
        if(emp2.getSalario() > mayor){
            System.out.println("Salario mayor es de:"+
                    emp2.getNombre());
            mayor = emp2.getSalario();
        }
        if(emp3.getSalario() > mayor){
            System.out.println("Salario mayor es de:"+
                    emp3.getNombre());
            mayor = emp3.getSalario();
        }
        System.out.println("Total planilla $" + total);   
        
    }
    
}

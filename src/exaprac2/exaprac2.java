package exaprac2;
import java.util.Scanner;
import javax.swing.JOptionPane; 
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
        
        int Cant=0;
        double total=0;
        String detalle= "***** DETALLE DE PLANILLA *****\n";
        
        Cant= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados a registrar:"));
            
        String nombre[] = new String [Cant];
        int horas[] = new int [Cant];
        double salario[] = new double [Cant];
        double subtotal[] = new double [Cant];
        double mayor = subtotal[0];
        String empmay = nombre[0];
        
        for(int i=0; i<Cant; i++){
            nombre[i]=JOptionPane.showInputDialog("Nombre del empleado " + (i+1)); 
            horas[i]=Integer.parseInt(JOptionPane.showInputDialog("Horas Trabajadas: "));
            salario[i]=Double.parseDouble(JOptionPane.showInputDialog("Salario X Hora: "));
            total += horas[i] * salario[i]; 
            subtotal[i] = horas[i] * salario[i];
            detalle += "Empleado: " + nombre[i] + " Horas: " + horas[i] + " Salario: $ " + subtotal[i] + "\n";  
        
            
            
            if(subtotal[i]>mayor){
                mayor=subtotal[i];
                empmay=nombre[i];
            }
        }   
        JOptionPane.showMessageDialog(null, detalle + "\n El total de la planilla es: $ " + total + "\n" + "El empleado con mayor salario es: " + empmay);
    }
}

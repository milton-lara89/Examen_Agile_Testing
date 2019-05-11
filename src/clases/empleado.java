
package clases;

public class empleado {
    public String nombre;
    private double salario;
    private int horasTrabajadas;
    private double salXhora;

    public empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getSalXhora() {
        return salXhora;
    }

    public void setSalXhora(double salXhora) {
        this.salXhora = salXhora;
    }
    
    
   public double calcularSalario(){
       
       this.salario = this.horasTrabajadas * this.salXhora;
       return this.salario;
   }
   
 
    
    
}

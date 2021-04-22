package Lab1_Semana4;

import java.text.DecimalFormat;
import java.text.NumberFormat;
/**
 *
 * @author Giovanni López
 */
public class DescuentosDeLey {
    private double salario;

    public DescuentosDeLey(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
    
    public void calcularDescuentos(){
        NumberFormat formato= new DecimalFormat("#,###.##");
        System.out.println("=======Descuentos aplicados=============");
        System.out.println("Sueldo bruto: " + getSalario());
        double calcularISSS = getSalario() * 0.13;
        double calcularAFP = getSalario() * 0.15;
        double calcularRENTA = getSalario() * 0.1;
        
        double salarioLiquido = (getSalario() - (calcularISSS + calcularAFP + calcularRENTA));
        System.out.println("Se desconto 13% de ISSS $" + formato.format(calcularISSS) );
        System.out.println("Se desconto 15% de AFP $" + formato.format(calcularAFP));
        System.out.println("Se desconto 10% de RENTA $" + formato.format(calcularRENTA));
        System.out.println("Su salario liquido es de: $" + formato.format(salarioLiquido));
        System.out.println("========================================");                
    }
    
    public void calcularRENTA(){
        NumberFormat formato= new DecimalFormat("#,###.##");
        System.out.println("=======Descuentos aplicados=============");
        System.out.println("Sueldo bruto: " + getSalario());
        double calcularRENTA = getSalario() * 0.1;
        double salarioLiquido = getSalario() - calcularRENTA;
        System.out.println("Se desconto 10% de RENTA $" + formato.format(calcularRENTA));
        System.out.println("Su salario liquido es de: $" + formato.format(salarioLiquido));
        System.out.println("========================================");          
    }
}

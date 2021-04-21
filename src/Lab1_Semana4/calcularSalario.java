package Lab1_Semana4;

import java.util.Scanner;

/**
 *
 * @author Giovanni López
 */
public class calcularSalario {
    public static void main(String[] args) {
        //instacia(objeto) de la clase Ejercicio1
        Ejercicio1 obj = new Ejercicio1();
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese nombre de empleado");
        obj.setNombreEmpleado(leer.nextLine());
        
        System.out.println("Ingrese horas trabajadas");
        obj.setHorasTrabajadas(Integer.parseInt(leer.nextLine()));
        
        System.out.println("Ingrese pago por horas");
        obj.setPagoPorHoras(Integer.parseInt(leer.nextLine())); 
        
        calcular(obj.getHorasTrabajadas(), obj.getPagoPorHoras());
        System.out.println("Nombre del empleado: " + obj.getNombreEmpleado());
        
    }

    public static void calcular(int horasTrabajadas, int pagoPorHoras){
        
        //instacia(objeto) de la clase Ejercicio1
        Ejercicio1 obj = new Ejercicio1();
        
        if(horasTrabajadas <= 40){
            System.out.println("\n===============Datos===============");
            System.out.println("Usted no ha realizado Horas Extras");
            
            double salarioSinRenta = horasTrabajadas * pagoPorHoras;            
            obj.setSalarioBruto(salarioSinRenta);
            System.out.println("Salario bruto $" + obj.getSalarioBruto());
            
            double retenciónAplicada = salarioSinRenta * 0.1;
            obj.setMontoRetencion(retenciónAplicada);
            System.out.println("Retencion Aplicada(RENTA) 10%: $" + obj.getMontoRetencion());
            
            double salarioConRenta = salarioSinRenta - retenciónAplicada;
            obj.setSalarioLiquido(salarioConRenta);
            System.out.println("Salario liquido: $" + obj.getSalarioLiquido());
            System.out.println("===================================");            
                       
        }else if(horasTrabajadas > 40 && horasTrabajadas <= 48){
            System.out.println("\n===============Datos===============");
            int calcularHoras = (horasTrabajadas - 40);
            double pagoDoble = (calcularHoras * pagoPorHoras) * 2;
            System.out.println("Usted ha realizado "+ calcularHoras + " Horas Extras son pagadas al doble: $" + pagoDoble); 
            
            //Calculamos cuanto gana, durante las horas de trabajo normales(40 horas)
            double horasNomales = 40 * pagoPorHoras; 
            
            //Calculamos cuanto gana, tomando en cuenta el salario normal y lo que gana por las horas extras
            double salarioSinRenta = horasNomales + pagoDoble;
            obj.setSalarioBruto(salarioSinRenta);
            System.out.println("Salario bruto $" + obj.getSalarioBruto());
            
            double retencionAplicada = salarioSinRenta * 0.1;
            obj.setMontoRetencion(retencionAplicada);
            System.out.println("Retencion Aplicada(RENTA) 10%: $" + obj.getMontoRetencion());
            
            double salarioConRenta = salarioSinRenta - retencionAplicada;
            obj.setSalarioLiquido(salarioConRenta);
            System.out.println("Salario liquido: $" + obj.getSalarioLiquido());            
            System.out.println("===================================");
                        
        }else if(horasTrabajadas > 48){
            System.out.println("\n===============Datos===============");
            //Pago doble
            int calcularHorasDoble = (48 - 40);
            double pagoDoble = (calcularHorasDoble * pagoPorHoras) * 2;
            System.out.println("Usted ha realizado "+ calcularHorasDoble + " Horas Extras son pagadas al doble: $" + pagoDoble);                                                             
                        
            //pago triple
            int calcularHorasTriple = (horasTrabajadas - 48);
            double pagoTriple = (calcularHorasTriple * pagoPorHoras) * 3;
            System.out.println("Usted ha excedido de 8 horas, horas excedidas: "+ calcularHorasTriple + " son pagadas al triple: $" + pagoTriple);     
            
            //Calculamos cuanto gana, durante las horas de trabajo normales(40 horas)
            double horasNomales = 40 * pagoPorHoras; 
            
            //Calculamos cuanto gana, tomando en cuenta el salario normal y lo que gana por las horas extras            
            double salarioSinRenta =(pagoDoble + pagoTriple + horasNomales);
            obj.setSalarioBruto(salarioSinRenta);
            System.out.println("Salario bruto $" + obj.getSalarioBruto());
            
            double retencionAplicada = salarioSinRenta * 0.1;
            obj.setMontoRetencion(retencionAplicada);
            System.out.println("Retencion Aplicada(RENTA) 10%: $" + obj.getMontoRetencion());
            
            double salarioConRenta = salarioSinRenta - retencionAplicada;
            obj.setSalarioLiquido(salarioConRenta);
            System.out.println("Salario liquido: $" + obj.getSalarioLiquido());            
            System.out.println("===================================");            
        }
        
    }
}

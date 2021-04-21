package Lab1_Semana4;

import java.util.Scanner;

/**
 *
 * @author Alexitho López
 */
public class TransaccionesBancarias {
    public static void main(String[] args) {                
        //instacia de la clase cuenta bancaria
        CuentaBancaria cuenta = new CuentaBancaria();
        
        Scanner leer = new Scanner(System.in);
        
        String duiCliente, nombreCliente;
        long telefonoCliente;
        
        double abono, retiro;
        
        System.out.println("Ingrese los datos que se solicitan a continuacion: ");
        System.out.println("Nombre del propietario: ");
        nombreCliente = leer.nextLine();
        
        System.out.println("Numero de DUI: ");
        duiCliente = leer.nextLine();
        
        System.out.println("Telefono: ");
        telefonoCliente = leer.nextLong();
        
        //instancia de la clase cliente
        Cliente propietario = new Cliente(duiCliente, nombreCliente, telefonoCliente);
        cuenta.propietarioCuenta = propietario;
        
        System.out.println("Ingrese la cantidad a abonar:");
        cuenta.abonar(abono = leer.nextDouble());
        
        System.out.println("Ingrese cantidad a retirar");
        cuenta.retirar(retiro = leer.nextDouble());
        
        System.out.println("-----------------------------------------------------");
        System.out.println("Su saldo de la cuenta es: " + cuenta.saldoCuenta);
        System.out.println("Datos del propietario: \n" + cuenta.datosPropietarioCuenta());
    }
}

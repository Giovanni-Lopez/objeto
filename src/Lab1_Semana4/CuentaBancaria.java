package Lab1_Semana4;

/**
 *
 * @author Alexitho López
 */
public class CuentaBancaria {
    long numeroCuenta;
    Cliente propietarioCuenta;// atributo propietarioCuenta del tipo de la clase cliente
    double saldoCuenta;
    
    public void abonar(double cantidad){
        saldoCuenta += cantidad;//logica de negocio        
    }
    public void retirar(double cantidad){
        if(cantidad > saldoCuenta){
            System.out.println("saldo insuficiente!!");            
        }
        saldoCuenta -= cantidad;//logica de negocio       
    }
    public String datosPropietarioCuenta(){
        String informacion = "";
        informacion += "DUI: " + propietarioCuenta.duiCliente + "\n";
        informacion += "Nombre: " + propietarioCuenta.nombreCliente + "\n";
        informacion += "Telefono: " + propietarioCuenta.telefonoCliente + "\n";
        return informacion;
    }
}

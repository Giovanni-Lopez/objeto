package Lab1_Semana4;

/**
 *
 * @author Alexitho López
 */
public class Cliente {
    String duiCliente, nombreCliente;
    long telefonoCliente; // solamente ingresar numeros   
    
    public Cliente(String duiCliente, String nombreCliente, long telefonoCliente){
        this.duiCliente = duiCliente;
        this.nombreCliente = nombreCliente;
        this.telefonoCliente = telefonoCliente;
    }
}

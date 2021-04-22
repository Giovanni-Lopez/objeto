package Lab1_Semana4;

import java.util.Date;

/**
 *
 * @author Giovanni López
 */
public class Administrativo extends Empleado{
    
    //Constructor de la subclase: incluimos como parámetros al menos los del constructor de la superclase
    public Administrativo (String nombre, String codigoEmpleado, int edad, String direccion, String areaPertenece, String cargoDesempeña, double sueldoBase, String fechaIngreso) {

        super(nombre, codigoEmpleado, edad, direccion, areaPertenece, cargoDesempeña, sueldoBase, fechaIngreso);

    }//Cierre del constructor
    
    public void mostrardatosAdministrativo() {            
        // Sí podemos acceder a variables de instancia a través de los métodos de acceso públicos de la superclase
        
        System.out.println (
                            "==============Datos Administrativos Capturados==============" +
                            "\nNombre de Administrador: " + getNombre() + 
                            "\nCodigo de Administrador: " + getCodigoEmpleado() + 
                            "\nEdad: " + getEdad() + 
                            "\nArea a la cual pertenece: " +  getAreaPertenece() + 
                            "\nDirección: " + getDireccion() + 
                            "\nCargo que desempeña: " + getCargoDesempeña() + 
                            "\nSueldo Base: " + getSueldoBase() + 
                            "\nFecha de ingreso: " + getFechaIngreso() + 
                            "\n=========================================================="
                            ); 
    }    
}

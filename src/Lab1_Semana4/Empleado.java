package Lab1_Semana4;

import java.util.Date;

/**
 *
 * @author Giovanni López
 */
public class Empleado {

    /*
    
    En la escuela especializada en ingeniería ITCA-FEPADE se manejan un número grande de empleados,
    recursos humanos proporciono la siguiente información.
    
    Todo empleado tiene nombre, código de empleado, edad, dirección, área a la que pertenece,
    cargo que desempeña en el área, sueldo base, fecha de ingreso.
    
    Los empleados pueden ser docentes o administrativos.
    
    El docente puede ser permanente o por servicio.
    
    El área cuenta con código de área, nombre, cantidad de empleados, numero de edificio.
    
    Al final se desea capturar la información del empleado, imprimir los datos personales y el área a la que
    pertenece.
    
    Del edificio se conoce la ubicación, el nombre, cantidad de departamentos que alberga,
    cantidad de pisos.
    
    Además, se desea saber el salario final del empleado tomando en cuenta todos los
    descuentos de ley (ISSS, AFP Y RENTA), recordar que si es empleado por servicio solo se le debe
    descontar renta.
    
     */
    
    //Atrinutos    
        private String nombre;
        private String codigoEmpleado;
        private int edad;
        private String direccion;
        private String areaPertenece;
        private String cargoDesempeña;
        private double sueldoBase;
        private String fechaIngreso;

        
    //contructor
    public Empleado(String nombre, String codigoEmpleado, int edad, String direccion, String areaPertenece, String cargoDesempeña, double sueldoBase, String fechaIngreso) {
        this.nombre = nombre;
        this.codigoEmpleado = codigoEmpleado;
        this.edad = edad;
        this.direccion = direccion;
        this.areaPertenece = areaPertenece;
        this.cargoDesempeña = cargoDesempeña;
        this.sueldoBase = sueldoBase;
        this.fechaIngreso = fechaIngreso;
    }

    //Metodos get
    public String getNombre() {
        return nombre;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getAreaPertenece() {
        return areaPertenece;
    }

    public String getCargoDesempeña() {
        return cargoDesempeña;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }
}

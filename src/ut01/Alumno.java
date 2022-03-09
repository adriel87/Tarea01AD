package ut01;

import ut01.interfaces.GetValues;

import java.io.Serializable;
import java.util.Date;

import static helpers.datesHelper.printDate;

public class Alumno implements Serializable, GetValues {

    private String      dni,
                        nombre,
                        primerApellido,
                        segundoApellido,
                        telefono;
    private Vivienda    vivienda;
    private Date        fechaDeNacimiento;

    public Alumno(String dni, String nombre, String primerApellido, String segundoApellido, String telefono, Vivienda vivienda, Date fechaDeNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.telefono = telefono;
        this.vivienda = vivienda;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }


    public String getDni() { return dni; }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Vivienda getVivienda() {
        return vivienda;
    }

    public void setVivienda(Vivienda vivienda) {
        this.vivienda = vivienda;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    @Override
    public String getValuesToSave() {
         String dni              = String.format("%-30.30s\t",this.dni),
                nombre           = String.format("%-30.30s\t",this.nombre),
                apellido1        = String.format("%-30.30s\t",this.primerApellido),
                apellido2        = String.format("%-30.30s\t",this.segundoApellido),
                telefono         = String.format("%-30.30s\t",this.telefono),
                codPostal        = String.format("%-30.30s\t",this.vivienda.getCodigoPostal()),
                direccion        = String.format("%-30.30s\t",this.vivienda.getDireccion()),
                provincia        = String.format("%-30.30s\t",this.vivienda.getProvincia()),
                fechaNacimiento  = String.format("%-30.30s\t",printDate(this.fechaDeNacimiento)),

                values = dni+nombre+apellido1+apellido2+direccion+codPostal+provincia+telefono+fechaNacimiento;

        return values;
    }
}

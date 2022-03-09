package ut01;

import ut01.interfaces.GetValues;

import java.io.Serializable;
import java.util.Date;

import static helpers.datesHelper.printDate;


public class Curso implements Serializable, GetValues{
    private String  codigo,
                    denominacion;
    private int     numHoras;
    private Date    fechaInicio,
                    fechaFin;


    public Curso(String codigo, String denominacion, int numHoras, Date fechaInicio, Date fechaFin){
        this.codigo         = codigo;
        this.denominacion   = denominacion;
        this.numHoras       = numHoras;
        this.fechaInicio    = fechaInicio;
        this.fechaFin       = fechaFin;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getValuesToSave(){
        String  code        = String.format("%-30.30s\t",this.codigo),
                description = String.format("%-30.30s\t",this.denominacion),
                hourCount   = String.format("%-30d\t",this.numHoras),
                initDate    = String.format("%-30.30s\t", printDate(this.fechaInicio)),
                endDate     = String.format("%-30.30s\n",printDate(this.fechaFin)),

                values      = code + description + hourCount + initDate + endDate;

        return values;
    }

    @Override
    public String toString() {
        return  "codigo='" + codigo + '\t' +
                "denominacion='" + denominacion + '\t' +
                "numHoras=" + numHoras +  '\t' +
                "fechaInicio=" + printDate(this.fechaInicio) +  '\t' +
                "fechaFin=" + printDate(this.fechaFin) ;
    }


}

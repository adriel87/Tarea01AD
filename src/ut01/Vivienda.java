package ut01;

public class Vivienda {
    private String      direccion,
                        codigoPostal,
                        provincia;

    public Vivienda(String direccion, String codigoPostal, String provincia) {
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.provincia = provincia;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
}

package cu.devtool.librocontable.models.dto;

public class ParametroDto {
    private String informacion;

    public ParametroDto(String informacion) {
        this.informacion = informacion;

    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

}
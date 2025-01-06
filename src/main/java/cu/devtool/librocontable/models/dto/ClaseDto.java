package cu.devtool.librocontable.models.dto;

public class ClaseDto {
    private String titulo, usuario;

    public ClaseDto(String titulo, String usuario) {
        this.titulo = titulo;
        this.usuario = usuario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

}
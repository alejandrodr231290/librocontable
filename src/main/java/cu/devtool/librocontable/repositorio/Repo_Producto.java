package cu.devtool.librocontable.repositorio;

import java.util.Arrays;
import java.util.List;

import cu.devtool.librocontable.models.Producto;
// video 21
public class Repo_Producto {
    List<Producto> datos;

    public Repo_Producto() {
        this.datos = Arrays.asList(
                new Producto(001L, "Mause", 50),
                new Producto(002L, "Disco Duro", 300),
                new Producto(003L, "Teclado", 30),
                new Producto(004L, "Board", 800));
    }

    public List<Producto> getDatos() {
        return datos;
    }

    public void setDatos(List<Producto> datos) {
        this.datos = datos;
    }

    public List<Producto> findAll() {
        return datos;
    }

    public Producto findId(long idProucto) {
        return datos.stream()
                .filter(p -> p.getIdProducto().equals(idProucto))
                .findFirst().orElse(null);
    }

}

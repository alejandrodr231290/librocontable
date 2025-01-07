package cu.devtool.librocontable.service;

import java.util.List;
import java.util.stream.Collectors;

import cu.devtool.librocontable.models.Producto;
import cu.devtool.librocontable.repositorio.Repo_Producto;

//video 22-23-24
//accesos a api, calculos auxiliares, no se recomienda en el controlador, sino en los servicios
public class Producto_Service {
    private Repo_Producto repositorio = new Repo_Producto();

    public List<Producto> findAll() { // valor de cada producto x 1.50
        return repositorio.findAll().stream().map(p -> {
            // return new Producto(p.getIdProducto(), p.getNombre(), p.getPrecio() * 1.5d);
            Producto newProducto = (Producto) p.clone();
            newProducto.setPrecio(p.getPrecio() * 1.5d);
            return newProducto;
        }).collect(Collectors.toList());
    }

    public Producto findId(long idProducto) {
        return repositorio.findId(idProducto);
    }
}

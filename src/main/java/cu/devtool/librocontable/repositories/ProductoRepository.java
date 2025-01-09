package cu.devtool.librocontable.repositories;

import org.springframework.data.repository.CrudRepository;
import cu.devtool.librocontable.models.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Integer> {
}

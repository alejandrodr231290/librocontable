package cu.devtool.librocontable.repositories;

import org.springframework.data.repository.CrudRepository;
import cu.devtool.librocontable.models.Factura;

public interface FacturaRepository extends CrudRepository<Factura, Integer> {
}
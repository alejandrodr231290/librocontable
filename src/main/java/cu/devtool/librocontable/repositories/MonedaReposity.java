package cu.devtool.librocontable.repositories;


import org.springframework.data.repository.CrudRepository;
import cu.devtool.librocontable.models.Moneda;

public interface MonedaReposity extends CrudRepository<Moneda, Integer> {
}

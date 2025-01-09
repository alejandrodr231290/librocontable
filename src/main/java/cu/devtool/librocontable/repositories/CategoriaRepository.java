package cu.devtool.librocontable.repositories;

import org.springframework.data.repository.CrudRepository;
import cu.devtool.librocontable.models.Categoria;

public interface CategoriaRepository extends CrudRepository<Categoria, Integer> {
}
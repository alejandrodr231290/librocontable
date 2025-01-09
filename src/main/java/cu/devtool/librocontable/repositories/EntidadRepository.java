package cu.devtool.librocontable.repositories;
import org.springframework.data.repository.CrudRepository;
import cu.devtool.librocontable.models.Entidad;

public interface EntidadRepository extends CrudRepository<Entidad, Integer> {
}

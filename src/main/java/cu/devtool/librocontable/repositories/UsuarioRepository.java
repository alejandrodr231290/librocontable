package cu.devtool.librocontable.repositories;
import org.springframework.data.repository.CrudRepository;
import cu.devtool.librocontable.models.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

}

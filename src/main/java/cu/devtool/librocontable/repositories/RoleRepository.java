package cu.devtool.librocontable.repositories;

import org.springframework.data.repository.CrudRepository;
import cu.devtool.librocontable.models.Role;

public interface RoleRepository extends CrudRepository<Role, Integer> {
}

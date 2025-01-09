package cu.devtool.librocontable.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "role_permiso")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RolePermiso {
    @Id
    @GeneratedValue
    private Long id;
    private int modulo; //0 configuracion,1-Informes 2-inventario 3-ventas
    private boolean listar;
    private boolean crear;
    private boolean editar;
    private boolean eliminar;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;


}
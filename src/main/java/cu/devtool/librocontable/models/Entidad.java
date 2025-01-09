package cu.devtool.librocontable.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "entidad")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Entidad {
    @Id
    @GeneratedValue
    private Long id;
    private String reup;
    private String nombre;
    private String direccion;
    private String ubicacion;
    private String telefono;
    private String email;

    @OneToMany(mappedBy = "entidad")
    private List<Usuario> usuarios;

    @OneToMany(mappedBy = "entidad")
    private List<Role> roles;

    @OneToMany(mappedBy = "entidad")
    private List<Establecimiento> establecimientos;

    @OneToMany(mappedBy = "entidad")
    private List<Proveedor> proveedores;

    @OneToMany(mappedBy = "entidad")
    private List<Cliente> clientes;

    @OneToMany(mappedBy = "entidad")
    private List<Factura> facturas;   

    @OneToMany(mappedBy = "entidad")
    private List<Cuenta> cuentas;

    @OneToMany(mappedBy = "entidad")
    private List<Categoria> categorias;

    @OneToMany(mappedBy = "entidad")
    private List<Producto> productos;

    @OneToMany(mappedBy = "entidad")
    private List<UnidadMedida> unidadMedidas;
     

}

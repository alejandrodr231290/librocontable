package cu.devtool.librocontable.models;

import java.util.List;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "producto")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Producto {
    @Id
    @GeneratedValue
    private Long id;
    private String codigo;
    private String nombre;
    private String descripcion;
    private Double precio_compra;
    private Double precio_venta;

    @ManyToOne
    @JoinColumn(name = "entidad_id")
    private Entidad entidad;
   
    @ManyToMany(mappedBy = "productos")
    private List<Establecimiento> establecimientos;

    @OneToOne
    @JoinColumn(name = "unidad_medida_id")
    private UnidadMedida unidadMedida;

    @OneToOne
    @JoinColumn(name = "categoria_id", nullable=true)
    private Categoria categoria;

}

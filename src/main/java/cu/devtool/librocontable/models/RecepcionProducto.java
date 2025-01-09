package cu.devtool.librocontable.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "recepcion_producto")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RecepcionProducto {
    @Id
    @GeneratedValue
    private Long id;
    private int cantidad;

    @ManyToOne
    @JoinColumn(name = "recepcion_id")
    private Recepcion recepcion;

    @OneToOne
    @JoinColumn(name = "producto_id")
    private Producto producto;

}
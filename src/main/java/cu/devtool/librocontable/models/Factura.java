package cu.devtool.librocontable.models;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "factura")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date fecha;
    private int tipo;

    @ManyToOne
    @JoinColumn(name = "entidad_id")
    private Entidad entidad;

    @OneToMany(mappedBy = "factura")
    private List<FacturaProducto> productos;

    @OneToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

}

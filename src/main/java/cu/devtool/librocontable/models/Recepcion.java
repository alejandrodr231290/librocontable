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
@Table(name = "recepcion")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Recepcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date fecha;
   
    @ManyToOne
    @JoinColumn(name = "entidad_id")
    private Entidad entidad;

    @OneToMany(mappedBy = "recepcion")
    private List<RecepcionProducto> productos;

    @OneToOne
    @JoinColumn(name = "cliente_id")
    private Proveedor preveedor;

}

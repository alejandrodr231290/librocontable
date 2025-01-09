package cu.devtool.librocontable.models;

import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "proveedor")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Proveedor {
    @Id
    @GeneratedValue
    private Long id;
    private String codigo;
    private String nombre;
       

    @ManyToOne
    @JoinColumn(name = "entidad_id")
    private Entidad entidad; 
   

}
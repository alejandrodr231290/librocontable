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
@Table(name = "moneda")
@AllArgsConstructor
@NoArgsConstructor
@Data  
public class Moneda {
    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    
}

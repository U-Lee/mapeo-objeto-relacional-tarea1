
package mx.uacm.curso.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author U-Lee
 */
@Entity
@Table(name = "departamentos")
public class Departamento {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "sec_dep", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "sec_dep", sequenceName = "departamento_id_seq", allocationSize = 1)    
    private Integer id;

    @Column(name = "nombre")
    private String nombre;
}

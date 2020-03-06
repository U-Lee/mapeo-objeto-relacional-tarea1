
package mx.uacm.curso.daos;

import javax.persistence.EntityManager;
import mx.uacm.curso.entidades.Departamento;

/**
 *
 * @author U-Lee
 */
public class DepartamentoDAOImpl extends GenericDAOImpl<Departamento, Integer> implements DepartamentoDAO{
    
    public DepartamentoDAOImpl(EntityManager em) {
        super(em, Departamento.class);
    }
    
}

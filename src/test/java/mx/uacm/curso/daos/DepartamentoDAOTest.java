
package mx.uacm.curso.daos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import mx.uacm.curso.entidades.Departamento;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author U-Lee
 */
public class DepartamentoDAOTest {
    
     private static EntityManager em;
    
        private static DepartamentoDAO departamentoDAO;
        
         @BeforeAll
    public static void inicializar() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("blog-pruebas-memoria");
        em = emf.createEntityManager();
        em.getTransaction().begin();
        departamentoDAO = new DepartamentoDAOImpl(em);
    }
    
    @AfterAll
    public static void terminar(){
        em.getTransaction().rollback();
    }
    
    @Test
    public void buscarArticuloTest(){
        
        Departamento d = departamentoDAO.buscarPorId(4);
        Assertions.assertNotNull(d);
        Assertions.assertEquals(4,d.getId());
    }
}

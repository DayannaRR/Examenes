
package ExamenParcial1.concierto.repository;


import ExamenParcial1.concierto.entity.Concierto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Dayanna Rojas
 */
@Repository
public interface ConciertoRepository extends CrudRepository<Concierto,Long>{
    
    
}


package ExamenParcial1.concierto.repository;

import ExamenParcial1.concierto.entity.Lugar;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Dayanna Rojas
 */
@Repository
public interface LugarRepository extends CrudRepository<Lugar,Long>{
    
}

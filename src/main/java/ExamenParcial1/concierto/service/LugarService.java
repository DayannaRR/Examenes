
package ExamenParcial1.concierto.service;

import ExamenParcial1.concierto.entity.Lugar;
import ExamenParcial1.concierto.repository.LugarRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author Dayanna Rojas
 */
@Service
public class LugarService implements ILugarService {

    @Autowired
    private LugarRepository lugarRepository;
    
    @Override
    public List<Lugar> listStore() {
       return (List<Lugar>)lugarRepository.findAll();
    }
    
}

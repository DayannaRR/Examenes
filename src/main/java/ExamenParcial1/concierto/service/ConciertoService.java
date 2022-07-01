
package ExamenParcial1.concierto.service;

import ExamenParcial1.concierto.entity.Concierto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ExamenParcial1.concierto.repository.ConciertoRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Dayanna Rojas
 */
@Service
public class ConciertoService implements IConciertoService {

    @Autowired
    private ConciertoRepository conciertosRepository;

    @Override
    public List<Concierto> getAllConcierto() {
        return (List<Concierto>) conciertosRepository.findAll();
    }

    @Override
    public Concierto getConciertoById(long id) {
        return conciertosRepository.findById(id).orElse(null);
    }

    @Override
    public void saveConcierto(Concierto concierto) {
        conciertosRepository.save(concierto);
    }

    @Override
    public void delete(long id) {
        conciertosRepository.deleteById(id);
    }

    
}

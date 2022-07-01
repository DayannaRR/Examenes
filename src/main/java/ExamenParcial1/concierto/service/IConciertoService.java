
package ExamenParcial1.concierto.service;

import ExamenParcial1.concierto.entity.Concierto;
import java.util.List;

/**
 *
 * @author Dayanna Rojas
 */
public interface IConciertoService {
     public List<Concierto> getAllConcierto();
    public Concierto getConciertoById(long id);
    public void saveConcierto(Concierto concierto);
    public void delete(long id);
}


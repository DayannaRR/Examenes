
package ExamenParcial1.concierto.controller;

import ExamenParcial1.concierto.entity.Concierto;
import ExamenParcial1.concierto.entity.Lugar;
import ExamenParcial1.concierto.service.ILugarService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ExamenParcial1.concierto.service.IConciertoService;

/**
 *
 * @author Dayanna Rojas
 */
@Controller
public class ConciertoController {

    @Autowired
    private ILugarService lugarService;

    @Autowired
    private IConciertoService conciertoService;

    @GetMapping("/conciertos")
    public String index(Model model) {
        List<Concierto> listaconcierto = conciertoService.getAllConcierto();
        model.addAttribute("titulo", "Tabla Conciertos");
        model.addAttribute("conciertos", listaconcierto);
        return "conciertos";
    }

    @GetMapping("/conciertosN")
    public String agregarConciertos(Model model) {
        List<Lugar> listaLugar = lugarService.listStore();
        model.addAttribute("concierto", new Concierto());
        model.addAttribute("lugar", listaLugar);
        return "crear";
    }

    @GetMapping("/editconciertos/{id}")
    public String editarConciertos(@PathVariable("id") Long idConcierto, Model model) {
        Concierto concierto = conciertoService.getConciertoById(idConcierto);
        List<Lugar> listaLugar = lugarService.listStore();
        model.addAttribute("concierto", concierto);
        model.addAttribute("lugar", listaLugar);
        return "crear";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long idConcierto) {
        conciertoService.delete(idConcierto);
        return "redirect:/conciertos";
    }

    @PostMapping("/save")
    public String guardarConciertos(@ModelAttribute Concierto concierto) {
        conciertoService.saveConcierto(concierto);
        return "redirect:/conciertos";
    }
}

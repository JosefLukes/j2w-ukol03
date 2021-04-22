package cz.czechitas.java2webapps.ukol3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class VizitkaController {
  private List<Vizitka> vizitky;

  public VizitkaController() {
    this.vizitky = List.of(
            new Vizitka("Pepa","farma","koněvova 198","13000 Praha", "pepa@zdepa.cz","","www.seznam.cz"),
            new Vizitka("Josef","firma","Želetavská 1","14000 Praha", "josef@zdepa.cz","60660606",""),
            new Vizitka("Jozef","lirma","koněvova 199","13000 Praha", "josef@zdepa.cz","60660606",""),
            new Vizitka("Jusef","sirma","koněvova 197","13000 Praha", "josef@zdepa.cz","60660606",""),
            new Vizitka("Jose","kirma","koněvova 195","13000 Praha", "","60660606","www.google.cz"),
            new Vizitka("Vlaštovka","ČST","jindřišská 16","11000 Praha", "","60660606","www.ceskatelevize.cz")

            );
  }

  @GetMapping("/")
  public ModelAndView seznam() {
    ModelAndView result = new ModelAndView("seznam");
    result.addObject("vizitky",vizitky);
    return result;
  }

  @GetMapping("/detail")
  public ModelAndView detail(int id) {
    ModelAndView result = new ModelAndView("detail");
    result.addObject("vizitka",vizitky.get(id));
    return result;
  }
}

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
            new Vizitka("Michal","Firma","Michalská 1","11000 Praha", "michal@michal.cz","","www.seznam.cz"),
            new Vizitka("Karel","Firma","Karlova 1","11000 Praha", "karel@karel.cz","60660606",""),
            new Vizitka("Antonín","Firma","Antonínská 1","17000 Praha", "antonin@antonin.cz","60660606",""),
            new Vizitka("Jáchym","Firma","Jáchymovská 1","15500 Praha", "","60660606",""),
            new Vizitka("Zdeněk","Firma","Zdeňkov 2","58856 Zdeňkov", "","60660606","www.ceskatelevize.cz")

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

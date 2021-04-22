package cz.czechitas.java2webapps.ukol3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class VizitkaController {
  @GetMapping("/")
  public ModelAndView seznam() {
    ModelAndView result = new ModelAndView("seznam");

    return result;
  }

  @GetMapping("/detail")
  public ModelAndView detail() {
    ModelAndView result = new ModelAndView("detail");

    return result;
  }
}

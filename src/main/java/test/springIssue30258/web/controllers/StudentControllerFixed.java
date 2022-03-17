package test.springIssue30258.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import test.springIssue30258.services.dto.KlausurInputDTO;

@Controller
public class StudentControllerFixed {
  /**
   * This controller instead uses the copy of klausuren.html renamed to klausur.html
   * to show the fix
   */
  @PostMapping("/klausur") //Renamed path to avoid clash
  public String insertKlausur(KlausurInputDTO klausurInputDTO) {
    System.out.println(klausurInputDTO);
    return "redirect:/klausur"; //Renamed path to avoid clash
  }

  @GetMapping("/klausur")
  public String getKlausurPage() {
    return "/klausur";
  }
}

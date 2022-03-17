package test.springIssue30258.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import test.springIssue30258.services.dto.KlausurInputDTO;

@Controller
public class StudentController {

  @GetMapping("/klausuren")
  public String getKlausurenPage() {
    return "/klausuren";
  }

  @PostMapping("/klausuren")
  public String insertKlausur(KlausurInputDTO klausur) {
    System.out.println(klausur);
    return "redirect:/klausuren";
  }

}

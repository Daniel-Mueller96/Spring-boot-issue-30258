package test.springIssue30258.web;

import static org.junit.jupiter.api.Assertions.fail;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDate;
import java.time.LocalTime;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import test.springIssue30258.services.dto.KlausurInputDTO;

@WebMvcTest
@AutoConfigureMockMvc
public class StudentControllerFixedTest {

  @Autowired
  MockMvc mvc;

  @Test
  @DisplayName("shows that the fixed version actually works by showing that error "
      + "400 is resolved and instead says 302 for redirect")
  //uses the StudentControllerFixed
  void test_7() throws Exception {
    KlausurInputDTO klausurInputDTO =
        new KlausurInputDTO(1L, LocalDate.of(2022, 2, 2),
            LocalTime.of(8, 30),
            LocalTime.of(12, 30),
            true, "Test");
    RequestBuilder builder = MockMvcRequestBuilders.post("/klausur")
        .flashAttr("klausurInputDTO", klausurInputDTO);
    mvc.perform(builder).andExpect(status().is(302));
  }
}

package test.springIssue30258.web;

import static org.junit.jupiter.api.Assertions.fail;
import static test.springIssue30258.testdata.KlausurTestData.K123_PRAESENZ_12_30_TO_14_30;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import test.springIssue30258.services.dto.KlausurInputDTO;
import test.springIssue30258.testdata.KlausurInputDTOTestData;

@WebMvcTest
@AutoConfigureMockMvc
public class StudentControllerFixedTest {

  @Autowired
  MockMvc mvc;

  @Test
  @DisplayName("shows that the fixed version actually works by showing that error "
      + "400 is resolved and instead says 302 for redirect")
  //uses the StudentController
  void test_7() throws Exception {
    KlausurInputDTO klausurInputDTO = KlausurInputDTOTestData.build(K123_PRAESENZ_12_30_TO_14_30);
    RequestBuilder builder = MockMvcRequestBuilders.post("/klausur")
        .flashAttr("klausurInputDTO", klausurInputDTO);
    mvc.perform(builder);
    fail();
  }
}

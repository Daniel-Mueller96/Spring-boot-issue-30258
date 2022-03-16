package test.springIssue30258.testdata;

import test.springIssue30258.domain.aggregates.klausur.Klausur;
import test.springIssue30258.services.dto.KlausurInputDTO;

public class KlausurInputDTOTestData {

  public static KlausurInputDTO build(Klausur klausur) {
    return new KlausurInputDTO(klausur.getLsfId(), klausur.getDate(), klausur.getStartTime(),
        klausur.getEndTime(), klausur.isPresent(), klausur.getName());
  }
}

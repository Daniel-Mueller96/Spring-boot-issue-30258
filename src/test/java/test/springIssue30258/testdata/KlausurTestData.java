package test.springIssue30258.testdata;

import java.time.LocalDate;
import java.time.LocalTime;
import test.springIssue30258.domain.aggregates.klausur.Klausur;

public class KlausurTestData {
  public static final Klausur K123_PRAESENZ_12_30_TO_14_30 =
      new Klausur(123L, LocalDate.of(2021, 3, 16), LocalTime.of(12,
          30), LocalTime.of(14, 30), true, "ProPra2");
}

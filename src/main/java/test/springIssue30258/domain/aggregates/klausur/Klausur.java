package test.springIssue30258.domain.aggregates.klausur;

import java.time.LocalDate;
import java.time.LocalTime;

public class Klausur {

  private Long lsfId;
  private LocalDate date;
  private LocalTime startTime;
  private LocalTime endTime;
  private boolean present;
  private String name;

  public Klausur(Long lsfId, LocalDate date, LocalTime startTime, LocalTime endTime,
                 boolean present, String name) {
    this.lsfId = lsfId;
    this.date = date;
    this.startTime = startTime;
    this.endTime = endTime;
    this.present = present;
    this.name = name;
  }

  public Long getLsfId() {
    return lsfId;
  }

  public LocalDate getDate() {
    return date;
  }

  public LocalTime getStartTime() {
    return startTime;
  }

  public LocalTime getEndTime() {
    return endTime;
  }

  public boolean isPresent() {
    return present;
  }

  public String getName() {
    return name;
  }

}

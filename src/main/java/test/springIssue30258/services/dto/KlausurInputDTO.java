package test.springIssue30258.services.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import org.springframework.format.annotation.DateTimeFormat;

public record KlausurInputDTO(Long lsfId, @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate date,
                              LocalTime startTime, LocalTime endTime,
                              boolean present, String name) {
}

package be.ucll.nieuwjaarsfeest;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysCalculator {
    public long daysUntilNewYear() {
        LocalDate currentDate = LocalDate.now();
        LocalDate newYearDate = LocalDate.of(currentDate.getYear() + 1, 1, 1);
        return ChronoUnit.DAYS.between(currentDate, newYearDate);
    }
}

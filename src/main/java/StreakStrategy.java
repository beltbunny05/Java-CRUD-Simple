import java.time.LocalDate;
import java.util.List;

public interface StreakStrategy {
    int calculateStreak(List<CheckIn> streakDias, LocalDate diasComStreak);
}

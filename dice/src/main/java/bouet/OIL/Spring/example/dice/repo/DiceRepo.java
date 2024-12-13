package bouet.OIL.Spring.example.dice.repo;

import bouet.OIL.Spring.example.dice.DiceRollLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiceRepo extends JpaRepository<DiceRollLog, Long> {
}

package bouet.OIL.Spring.example.dice.service;

import bouet.OIL.Spring.example.dice.DiceRollLog;
import bouet.OIL.Spring.example.dice.repo.DiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DiceService {

    @Autowired
    private DiceRepo repository;

    public void logDiceRoll() {
        DiceRollLog log = new DiceRollLog();
        repository.save(log);
    }
}

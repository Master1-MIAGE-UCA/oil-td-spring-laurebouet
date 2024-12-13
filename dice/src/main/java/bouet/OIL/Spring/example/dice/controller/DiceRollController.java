package bouet.OIL.Spring.example.dice.controller;

import bouet.OIL.Spring.example.dice.DiceRollLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import bouet.OIL.Spring.example.dice.repo.DiceRepo;

import java.util.Random;
import java.util.List;

@RestController
@RequestMapping("/api/dice")
public class DiceRollController {

    @Autowired
    private DiceRepo diceRollLog;

    private final Random random = new Random();
    @Autowired
    private DiceRepo diceRepo;

    @PostMapping("/roll")
    public DiceRepo rollDice(@RequestParam(defaultValue = "1") int count) {
        if (count <= 0) {
            throw new IllegalArgumentException("Le nombre de dés doit être supérieur à 0.");
        }
        List<Integer> results = random.ints(count, 1, 7)  // Valeurs entre 1 et 6
                .boxed()
                .toList();
        DiceRepo diceRollLog = new DiceRepo(count, results);
        return diceRepo.save(diceRollLog);
    }
    @GetMapping("/logs")
    public List<DiceRollLog> getAllDiceRepos() {
        return diceRepo.findAll();
    }
}
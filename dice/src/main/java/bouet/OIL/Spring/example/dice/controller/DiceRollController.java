package bouet.OIL.Spring.example.dice.controller;

import bouet.OIL.Spring.example.dice.Dice;
import bouet.OIL.Spring.example.dice.DiceRollLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import bouet.OIL.Spring.example.dice.repo.DiceRepo;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;

@RestController
@RequestMapping("/api/dice")
public class DiceRollController {

    @Autowired
    private Dice dice;

    @GetMapping("/rollDice")
    public int rollSingleDice() {
        return dice.roll();
    }

    @GetMapping("/rollDices/{count}")
    public List<Integer> rollMultipleDices(@PathVariable int count) {
        if (count <= 0) {
            throw new IllegalArgumentException("nb de face > à 0.");
        }
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            results.add(dice.roll());
        }
        return results;
    }
}
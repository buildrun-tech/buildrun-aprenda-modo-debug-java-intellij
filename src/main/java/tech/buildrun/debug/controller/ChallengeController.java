package tech.buildrun.debug.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tech.buildrun.debug.service.TwoService;

import java.util.List;

@RestController
public class ChallengeController {

    private final TwoService twoService;

    public ChallengeController(TwoService twoService) {
        this.twoService = twoService;
    }

    @GetMapping("/one")
    public ResponseEntity<Void> one(
            @RequestParam(name = "number", required = false) Integer number) {

        if (number > 0) {
            System.out.println("Numero Positivo");
        } else {
            System.out.println("Numero Negativo");
        }

        return ResponseEntity.ok().build();
    }

    @GetMapping("/two")
    public ResponseEntity<List<String>> two() {

        var topTwo = twoService.getTopTwo();

        return ResponseEntity.ok(topTwo);
    }

}

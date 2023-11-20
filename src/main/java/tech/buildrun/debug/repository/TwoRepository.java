package tech.buildrun.debug.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TwoRepository {

    public List<String> findAll() {
        var oneOrTwo = (int) ( Math.random() * 2 + 1);

        if (oneOrTwo == 1) {
            return List.of(
                    "one",
                    "two",
                    "three",
                    "four"
            );

        } else {
            return List.of();
        }
    }
}

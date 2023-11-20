package tech.buildrun.debug.service;

import org.springframework.stereotype.Service;
import tech.buildrun.debug.repository.TwoRepository;

import java.util.List;

@Service
public class TwoService {

    private final TwoRepository twoRepository;

    public TwoService(TwoRepository twoRepository) {
        this.twoRepository = twoRepository;
    }

    public List<String> getTopTwo() {
        var all = twoRepository.findAll();

        return all.subList(0, 2);
    }
}

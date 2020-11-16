package guru.springframework.msbrewery.web.services;

import guru.springframework.msbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
            .id(UUID.randomUUID())
            .beerName("Galaxy Cat")
            .beerStyle("Pale Ale")
            .build();
    }
}

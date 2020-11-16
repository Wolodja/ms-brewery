package guru.springframework.msbrewery.web.services;

import guru.springframework.msbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
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

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
            .id(UUID.randomUUID())
            .beerName(beerDto.getBeerName())
            .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        //todo impl - would add a real impl to update a beer
    }

    @Override
    public void deleteById(UUID beerId) {
      log.debug("Deleting a beer...");
    }
}

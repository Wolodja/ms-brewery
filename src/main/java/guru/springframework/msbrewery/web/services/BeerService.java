package guru.springframework.msbrewery.web.services;

import guru.springframework.msbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

public interface BeerService {

    BeerDto getBeerById(UUID beerId);
}

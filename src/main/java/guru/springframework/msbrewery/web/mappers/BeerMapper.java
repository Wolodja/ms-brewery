package guru.springframework.msbrewery.web.mappers;

import guru.springframework.msbrewery.domain.Beer;
import guru.springframework.msbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}

package guru.springframework.msbrewery.web.mappers;

import guru.springframework.msbrewery.domain.Customer;
import guru.springframework.msbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDto customerDto);

    CustomerDto customerToCustomerDto(Customer customer);
}

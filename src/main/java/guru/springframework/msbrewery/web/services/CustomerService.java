package guru.springframework.msbrewery.web.services;

import guru.springframework.msbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerById(UUID id);
}

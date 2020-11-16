package guru.springframework.msbrewery.web.services;

import guru.springframework.msbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerById(UUID id) {
        return CustomerDto.builder()
            .id(UUID.randomUUID())
            .name("John Smith")
            .build();
    }
}

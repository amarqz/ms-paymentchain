package dev.amarqz.paymentchain.business.customer.repository;

import dev.amarqz.paymentchain.business.customer.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    
}
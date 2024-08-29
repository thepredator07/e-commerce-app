package com.example.customer;

import com.example.customer.Address;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record CustomerRequest (
     String id,
     @NotNull(message = "Customer first name is required")
     String firstName,

     @NotNull(message = "Customer last name is required")
     String lastName,
     @NotNull(message = "Customer email required")
     @Email(message = "Not a valid email")
     String email,
     Address address
){

        }

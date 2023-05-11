package com.dany.customer;

public record CustomerUpdateRequest(
        String name,
        String email,
        Integer age
) {
}

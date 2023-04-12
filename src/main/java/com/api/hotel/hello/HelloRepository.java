package com.api.hotel.hello;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloRepository extends JpaRepository<Pessoa, Integer> {
    Pessoa findByNome(String nome);
}

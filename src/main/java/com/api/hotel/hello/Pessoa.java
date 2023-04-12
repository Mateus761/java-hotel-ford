package com.api.hotel.hello;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Pessoa {
    private String nome;
    private Integer idade;

}

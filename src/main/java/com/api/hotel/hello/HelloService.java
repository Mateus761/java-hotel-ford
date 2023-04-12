package com.api.hotel.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Autowired
    private HelloRepository helloRepository;

    public String userAndAgeInDays(String nome){
        Pessoa pessoa = helloRepository.findByNome(nome);
        Integer idadeInDays = pessoa.getIdade() * 365;


        return nome + " você tem " + idadeInDays + " dias de vida!";
    }

    public Pessoa addPessoa(Pessoa pessoa){
        return helloRepository.save(pessoa);
    }

}

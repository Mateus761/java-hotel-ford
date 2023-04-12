package com.api.hotel.hello;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class hello {

    private final HelloService helloService;

    @GetMapping("/hello/{nome}")
    public String hello(@PathVariable ("nome") String nome){
        return helloService.userAndAgeInDays(nome);
    }

    @PostMapping("/pessoa")
    public Pessoa add (@RequestBody Pessoa pessoa){
        return helloService.addPessoa(pessoa);
    }
}



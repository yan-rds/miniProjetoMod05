package br.com.zup.projetoModulo05.catalogo.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RestTemplate {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}

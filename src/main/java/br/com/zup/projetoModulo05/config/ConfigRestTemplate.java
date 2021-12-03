package br.com.zup.projetoModulo05.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigRestTemplate {
    // Este método com @Bean é necessário para o Spring gerenciar o RestTemplate (sem o bean ele só ignora)
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}

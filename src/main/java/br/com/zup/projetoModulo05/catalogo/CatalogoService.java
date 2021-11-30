package br.com.zup.projetoModulo05.catalogo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Optional;


@Service
public class CatalogoService {

    // O RestTemplate é o responsável por consumir a API externa, por isso nós fazemos a injeção de dependencia aqui
    @Autowired
    RestTemplate template;

    // Este método retorna o catalogo de filmes pro usuário
    // A forma que esse catálogo é preenchido eu explico abaixo
    public Catalogo getFilmeEspecifico(String query, String regiao, String anoDeLancamento){

        /* O UriComponentsBuilder constrói uma URI pra gente, e através dos métodos queryParam eu consigo dar
        chave e valor para os filtros do usuário, esses valores eu tô pegando das variáveis acima */
        UriComponents uri = UriComponentsBuilder.newInstance()
                .scheme("https")
                .host("api.themoviedb.org")
                .path("3/search/movie")
                .queryParam("api_key", "988decebbe8940b276f0df16a49d8905")
                .queryParam("language", "pt-br")
                .queryParam("query", query)
                .queryParam("page", "1")
                .queryParam("include_adult", "true")
                .queryParam("region", regiao)
                .queryParam("primary_release_year", anoDeLancamento)
                .build();


        return template.getForObject(uri.toUriString(), Catalogo.class);
    }

    public Catalogo descobrirFilme (){
        /*https://api.themoviedb.org/3/discover/movie?
        api_key=988decebbe8940b276f0df16a49d8905
        &language=pt-BR
        &sort_by=popularity.desc
        &include_adult=false
        &include_video=false
        &page=1
        &primary_release_year=2021
        &with_cast=angelina
        &with_genres=35
        &with_keywords=venom
        &with_watch_monetization_types=flatrate
         */

        UriComponents uri = UriComponentsBuilder.newInstance()
                .scheme("https")
                .host("api.themoviedb.org")
                .path("3/discover/movie")
                .queryParam("api_key", "988decebbe8940b276f0df16a49d8905")
                .queryParam("language", "pt-BR")
                .queryParam("sort_by", "popularity.desc")
                .queryParam("include_adult", "false")
                .queryParam("include_video", "false")
                .build();

        return template.getForObject(uri.toUriString(), Catalogo.class);
    }
}

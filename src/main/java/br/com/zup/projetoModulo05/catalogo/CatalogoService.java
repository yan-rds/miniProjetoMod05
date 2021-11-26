package br.com.zup.projetoModulo05.catalogo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class CatalogoService {

    // O RestTemplate é o responsável por consumir a API externa, por isso nós fazemos a injeção de dependencia aqui
    @Autowired
    RestTemplate template;

    // Este método retorna o catalogo de filmes pro usuário
    // A forma que esse catálogo é preenchido eu explico abaixo
    public Catalogo getCatalogo(){

        /* Essa é a URI (link) da API (como se fosse o que a gente coloca no postman), se você copiar ela e colar
        no postman ou no seu navegador, voce vai tá fazendo uma requisição pra API externa, a themoviedb
         */
        String uri = "https://api.themoviedb.org/3/trending/movie/week?api_key=988decebbe8940b276f0df16a49d8905";

        /* Agora eu utilizo o template (que a gente criou lá em cima), ele tem um método que é o
        getForObject, que funciona bem parecido com o modelMapper que a gente usa.
        Basicamente ele entra na URI (que eu salvei na variavel ai em cima), e transforma o JSON
        da API na classe que eu quiser, aí eu escolhi na Catalogo
        Depois disso, eu retorno ela.
         */
        return template.getForObject(uri, Catalogo.class);
    }
}

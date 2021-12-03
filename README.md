# miniProjetoMod05
Catálogo

Esta parte da aplicação fornece ao usuário 3 possibilidades de filtro
Todas as requisições serão com o verbo HTTP GET

1- Encontrar um filme específico
A Uri da requisição é: LocalHost:8080/catalogo/Query%20De%20Pesquisa/Regiao/Ano%20de%20Lancamento
Ex: localhost:8080/catalogo/venom/br/2021

A resposta será o filme Venom: Tempo de Carnificina, porque é o que se encaixa nesses parâmetros
A Região segue o padrão ISO 3166-1, o Brasil nesse padrão é representado por BR


2- Descobrir filmes através de filtros
A Uri da requisição é:
localhost:8080/catalogo?idioma=idiomaEscolhido&ordenar_por=ordenacaoEscolhida&incluir_adulto=boolean&ano_de_lancamento=anoEscolhido&genero=idGenero

O idioma segue o padrão pt-BR, en-Us e etc;
A ordenação tem as opções: Popularity.asc, Popularity.desc, Release_date.asc, Release_date.desc, Revenue.asc, Revenue.desc, Primary_release_date.asc, Primary_release_date.desc, Original_title.asc, Original_title.desc, vote_average.asc, vote_average.desc, vote_count.asc e vote_count.desc;
Incluir Adulto é um boolean true ou false;
Ano de lancamento é um integer de tamanho 4;
Genero escolhido possui as seguintes opções: 28 - Action, 12 - Adventure, 16 - animation, 35 - Comedy, 80 - Crime, 99 - Documentary, 18 - Drama, 10751 - Family, 14 - Fantasy, 36 - History, 27 - Horror, 10402 - Music, 9648 - Mystery, 10749 - Romance, 878 - Science Fiction, 10770 - Tv Movie, 53 - Thriller, 10752 - War, 37 - Western

Exemplo de requisição: localhost:8080/catalogo?idioma=pt-BR&ordenar_por=popularity.desc&incluir_adulto=false&ano_de_lancamento=2015&genero=12

3- Exibir filmes em cartaz hoje
A Uri de requisição é:
 localhost:8080/catalogo/cartaz
É exibido ao usuário uma lista de filmes que estão em exibição hoje nos cinemas
No Json existe o campo Reserva, que o redireciona a parte da nossa aplicação que realiza a reserva de assento do usuário.

Cinema

Nesta parte da aplicação, temos os métodos para cadastrar um assento através do verbo HTTP Post.

A Uri da requisção é:
localhost:8080/assentos

Utilizando o seguinte json é possível cadastrar um assento no banco de dados
 {
            "disponibilidade":"VAZIO",
            "tipoAssento":"LIVRE",
            "valor": 15.00,
            "numero":3       
            }

O método exibir os assentos por disponibilidade e tipo (se é preferencial ou normal) utiliza o verbo HTTP Get.

A Uri da requisção é:
localhost:8080/assentos

Após enviar a requisição, o usuário visualiza a seguinte resposta:
 {
        "disponibilidade": "VAZIO",
        "tipoAssento": "PREFERENCIAL",
        "valor": 10.0,
        "numero": 1
    }

O método onde é possível alterar o status de um assento, ou seja, mudar de vazio para reservado é feito por meio do verbo HTTP Put, utilizando o ID do assento para fazer a requisição.

A Uri da requisição é:
localhost:8080/assentos/{id}

O json para fazer a alteração do status do assento é:
{
    "disponibilidade":"RESERVADO"
}

E como resposta o usuário recebe:
{
    "numero": 1,
    "disponibilidade": "RESERVADO"
}
 
Agora quando o usuário faz uma nova requisição Get para visualizar os assentos, é possível ver que o assento atualiza a disponibilidade.

É possível também fazer o cadastro de uma sala completa com todos seus atributos, sendo eles um ID de identificação, uma lista de assentos, nome do filme e os horários das sessões utilizando o verbo HTTP Post. 

A Uri da requisição é:
localhost:8080/cinema/sala

O json para cadastro da sala é:
{
    "assentos": [
        {
            "disponibilidade": "RESERVADO",
            "tipoAssento": "LIVRE",
            "valor": 100
        },
        {
            "disponibilidade": "VAZIO",
            "tipoAssento": "LIVRE",
            "valor": 540
        }
    ],
    "nomeFilme": "Homem de Ferro",
    "primeiroHorario":"20:00:00",
    "segundoHorario":"22:00:00",
    "terceiroHorario":"00:00:00",
    "quartoHorario":"02:00:00",
    "quintoHorario":"08:00:00",
    "sextoHorario":"10:00:00",
    "setimoHorario":"12:00:00",
    "oitavoHorario":"14:00:00",
    "nonoHorario":"16:00:00",
    "decimoHorario":"18:00:00",
    "numeroAssentos": 30
}

O método para exibir todas as salas recebe como parâmetro o nome de um filme, para então exibir todas as salas com aquele filme através do verbo HTTP Get e utilizando também o recurso RequestParam.

A Uri de requisição é:
localhost:8080/cinema?nomeFilme=Homem%20de%20Ferro

Se o usuário não passar nenhum filme como parâmetro, o método irá exibir todas as salas.

A Uri da requisição sem nenhum parâmetro é:
localhost:8080/cinema

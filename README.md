
# CRUD Simples

<br>

+ ### Objetivo<br><br>
  O objetivo deste projeto é desenvolver uma API simples utilizando o framework Spring, que permita realizar <br>operações CRUD  (Create, Read, Update e Delete). 
  A API será responsável por gerenciar um conjunto de recursos,<br> que nesse exemplo ela com produtos, fornecendo endpoints que permitam criar novos produtos, listar produtos<br> ativos, atualizar produtos ativos e deixar produtos inativos.<br><br>

+ ### Tecnologias Utilizadas na construção da API<br>
  <img src="https://github.com/LucasLessaAnacleto/LucasLessaAnacleto/blob/main/utils/java-spring-api/java-logo.svg" width=60>  <img src="https://github.com/LucasLessaAnacleto/LucasLessaAnacleto/blob/main/utils/java-spring-api/spring-icon.svg" width=40 height=50>  <img src="https://github.com/LucasLessaAnacleto/LucasLessaAnacleto/blob/main/utils/mysql-icon.svg" width=100 height=60><br>
  + **IDE:** foi o Visual Studio Code com a extensão do *Spring Boot Extension Pack* para inicializar<br> o projeto Spring, adicionar e configurar as dependencias<br><br>
  + **Spring Boot:** simplifica a inicialização de projetos, gerenciamento de dependências e configuração do ambiente de execução.<br><br>
  + **Spring Data JPA:** Ele oferece um modelo de programação simplificado para realizar operações de CRUD e consultas em bancos de dados, eliminando a necessidade de escrever consultas SQL.<br><br>
  + **Spring Web:**  Ele inclui suporte para criação de controladores, gerenciamento de rotas, manipulação de solicitações e respostas HTTP, conversão de dados, validação de entrada, entre outros. <br><br>
  + **Lombok:** É uma biblioteca que oferece recursos para simplificar o desenvolvimento de software, reduzindo a quantidade de código boilerplate (código repetitivo).<br><br>
  + **ModelMapper:** Biblioteca para mapeamento entre objetos em diferentes camadas de um aplicativo, como objetos de transferência de dados (DTOs) para entidades de banco de dados, ou vice-versa.<br><br>
  + **MySQL:** Foi o banco de dados utilizado para gerencias os produtos do projeto, juntamente com o *Workbench* que foi a ferramenta de modelagem e administração do banco de dados. <br><br> 
  + **PostMan:** Foi utilizado para fazer as requisições HTTP e testar minha API.<br><br>
  + **FlyWay:** É uma ferramenta de migração de banco de dados que permite gerenciar e versionar as alterações de esquema do banco de dados de forma fácil e automatizada.<br><br>

+ ### Funcionalidades:<br><br>
  + #### O método Get do HTTP trás uma coleção de produtos<br> existentes e ativos no banco de dados:<br>
<img src="https://github.com/LucasLessaAnacleto/LucasLessaAnacleto/blob/main/utils/java-spring-api/get_listar.jpg" height=600><br><br>
  + #### O método Post do HTTP recebe um corpo contendo o nome e o preço em centavos do produto e<br> cria um novo item no banco de dados:<br>
<img src="https://github.com/LucasLessaAnacleto/LucasLessaAnacleto/blob/main/utils/java-spring-api/post_adicionar.jpg" height=600><br><br>
  + #### O método Put recebe um corpo contendo o nome e o preço em centavos do produto e<br> altera o produto com base do identificador passado na URL:<br>
<img src="https://github.com/LucasLessaAnacleto/LucasLessaAnacleto/blob/main/utils/java-spring-api/put_atualizar.jpg" height=600><br><br>
  + #### O método Delete torna o produto inativo com base no identificador passado na URL:<br>
<img src="https://github.com/LucasLessaAnacleto/LucasLessaAnacleto/blob/main/utils/java-spring-api/delete_desativar.jpg" height=600>

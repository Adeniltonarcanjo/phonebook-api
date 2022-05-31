# Spring Boot



### ⁉️ 

Esse projeto basei-se em uma implementação de uma api utilizando JPA, Lombok, mysql e conceitos basicos para iniciar 
o entendimento de criações de API utilizando Java e Spring Boot.

- Projeto da Spring
- Configuração simples e rápida
- Servidor embarcado
- Agrupador de dependências
- Sem precisar configurar XMLs

### 📎 Requisitos do Sistema

- Java 8 +
- Maven
- IDE

---

### 🚧 Como criar um projeto

- Spring Initializr - <https://start.spring.io>
- IDE


### 🚧 informações 
O projeto foi feito utilizando o banco de dados MYSQL, para utilizar qualquer outro banco de dados, basta ir no arquivo 
aplication.properties e fazer as configurações baseados no banco de dados que irá utilizar, com esse projeto é possivel adicionar contatos, buscar contatos por ID,
por nome, listar todos os contatos ou listar os contatos em ordem crescente pelo nome.A porta escolhida foi a 8081 , caso queria alterar a porta, utilize o arquivo aplication.properties.
As urls para testes são (testes realizados no postman):

-Busca por ID (Get)
http://localhost:8081/persons/{id}

-adicionar contatos (Post)
http://localhost:8081/persons/

-Listar contatos(Get)
http://localhost:8081/persons/list

-listar contatos maiores que um determinado id (get)
http://localhost:8081/persons/list/{id}

-buscar contato por nome  (get)
http://localhost:8081/persons/findByName/{name}

-Listar por ordem alfabetica do nome 
http://localhost:8081/persons/listOrder

Esse projeto foi feito de maneira simples como parte de um tutorial para introdução a spring boot, projeto para quem está iniciando. 


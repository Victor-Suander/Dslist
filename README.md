# DSList – Game Catalog API

API REST desenvolvida em Java + Spring Boot para gerenciamento de catálogo de jogos e listas personalizadas.

Projeto estruturado com arquitetura em camadas inspirada em DDD, incluindo regras de negócio para ordenação dinâmica de jogos dentro de listas.

## Funcionalidades

 Listagem de jogos

 Busca de jogo por ID

 Listagem de categorias/listas

 Reordenação de jogos dentro da lista

 Uso de projections para otimização de queries

 Perfis de ambiente (dev, test, prod)

 Configuração de CORS

## Arquitetura

O projeto segue separação clara de responsabilidades:

src/

- ├── domain/                         # Camada de domínio (regra de negócio)

- │   ├── applicationservice/         # Serviços com lógica de negócio

- │   │   ├── GameService.java

- │   │   └── GameListService.java

- │   │

- │   ├── entity/                     # Entidades JPA

- │   │   ├── Game.java

- │   │   ├── GameList.java

- │   │   ├── Belonging.java

- │   │   └── BelongingPK.java

- │   │

- │   ├── projections/                # Interfaces para queries otimizadas

- │   │   └── GameMinProjection.java

- │   │

- │   └── repository/                 # Interfaces Spring Data JPA

- │       ├── GameRepository.java

- │       └── GameListRepository.java

- │

- ├── infrastructure/                 # Camada de infraestrutura

- │   ├── config/                     # Configurações da aplicação (CORS, etc)

- │   │   └── WebConfig.java

- │   │

- │   ├── controller/                 # Endpoints REST

- │   │   ├── GameController.java

- │   │   ├── GameListController.java

- │   │   └── GameConstants.java

- │   │

- │   ├── dto/                        # Data Transfer Objects

- │   │   ├── GameDTO.java

- │   │   ├── GameListDTO.java

- │   │   ├── GameMinDTO.java

- │   │   └── ReplacementDTO.java

- │

- └── resources/
 
-    ├── application.properties

-    ├── application-dev.properties

-    ├── application-test.properties

-    ├── application-prod.properties

-    └── import.sql
    
## Princípios aplicados:

Arquitetura em camadas

DTO pattern

JPA com chave composta

Projections para performance

Organização por profiles

## Tecnologias

Java 17

Spring Boot

Spring Data JPA

H2 Database (dev/test)

PostgreSQL (prod)

Maven

## Como executar
git clone https://github.com/Victor-Suander/Dslist
cd Dslist
mvn spring-boot:run

API rodando em:

http://localhost:8080

## Endpoints Principais

GET /games
GET /games/{id}
GET /lists
GET /lists/{listId}/games
POST /lists/{listId}/replacement

## Aprendizados Técnicos

Modelagem com chave composta (@Embeddable)

Manipulação transacional para reorder

Uso de projections customizadas

Organização de perfis de ambiente

## Próximos passos

Implementação de frontend

Documentação Swagger

Dockerização

Deploy em Cloud

## Autor


- Victor Suander Camargo Martins

- Backend Java Developer

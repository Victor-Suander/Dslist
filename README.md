# DSList - API REST com Spring Boot
_________________________________________________________________________________________________
## Sobre o Projeto

O DSList é uma API REST desenvolvida com Spring Boot com o objetivo de consolidar conhecimentos em:

- Arquitetura em camadas
- Boas práticas com Spring Data JPA
- Uso de DTOs
- Perfis de ambiente (dev, test, prod)
- Organização profissional de backend
- O sistema permite listar jogos e reorganizá-los dentro de listas personalizadas.

## Arquitetura do Projeto

O projeto segue uma estrutura organizada em camadas:

- src/
- ├── domain/
- │   ├── applicationservice/
- │   ├── entity/
- │   ├── repository/
- │   └── exception/
- ├── infrastructure/
- │   ├── config/
- │   ├── controller/
- │   ├── dto/
- │   ├── exception/
- │   └── util/

## Separação de responsabilidades

- Controller → Responsável pelos endpoints REST
- ApplicationService → Regras de negócio
- Repository → Comunicação com o banco
- DTO → Transferência de dados
- Entity → Representação das tabelas
Essa organização facilita manutenção, testes e evolução do sistema.
_________________________________________________________________________________________________

## Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 (dev/test)
- PostgreSQL (produção)
- Maven
_________________________________________________________________________________________________

## Configuração de Ambientes

O projeto utiliza múltiplos profiles:

- application-dev.properties
- application-test.properties
- application-prod.properties

Para rodar em ambiente de desenvolvimento:

- mvn spring-boot:run

Ou definindo profile:

- -Dspring.profiles.active=dev
_________________________________________________________________________________________________

## Endpoints Principais

- Listar jogos:
GET /games

Resposta:

[
  {
    "id": 1,
    "title": "The Witcher 3",
    "year": 2015
  }
]
_________________________________________________________________________________________________

## Reordenar jogos na lista

POST /lists/{listId}/replacement

Body:

{
  "sourceIndex": 2,
  "destinationIndex": 5
}
_________________________________________________________________________________________________

## Conceitos Aplicados

- Injeção de Dependência
- Padrão DTO
- Separação em camadas
- Queries customizadas com JPA
- Controle transacional com @Transactional
- Seed de banco com import.sql
- Profiles de ambiente
_________________________________________________________________________________________________

## Próximos Passos

- Implementar autenticação (JWT ou API Key)
- Criar front-end para consumo da API
- Deploy em ambiente cloud
- Implementar testes automatizados
_________________________________________________________________________________________________

## Autor
 
- Victor Suander Camargo Martins
- GitHub: github.com/Victor-Suander
- LinkedIn: www.linkedin.com/in/victorsuander

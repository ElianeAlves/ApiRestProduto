# 🚀 ApiRest

A ApiRest é uma API REST simples para gerenciamento de produtos.

O projeto permite realizar operações básicas de CRUD:

✅ Criar produtos
✅ Listar produtos
✅ Buscar produto por ID
✅ Atualizar produto por ID
✅ Remover produto por ID

A API foi desenvolvida utilizando:

Quarkus 3
Java 17
Hibernate ORM com Panache
PostgreSQL
Swagger / OpenAPI
Biblioteca Lombok

O objetivo do projeto é demonstrar a construção de uma API REST utilizando boas práticas de desenvolvimento com Quarkus.


## Subindo a aplicação no modo dev

Você pode executar sua aplicação em modo de desenvolvimento, que permite recarga automática (live coding), usando:

```shell script
./mvnw quarkus:dev
```
## Guias de Extensões Relacionadas

- REST com Jackson ([guia](https://quarkus.io/guides/rest)): Implementação moderna de Jakarta REST no Quarkus, com processamento em tempo de build e integração com Jackson para conversão automática entre objetos Java e JSON.
- JDBC Driver - PostgreSQL ([guia](https://quarkus.io/guides/datasource)): Permite conectar ao banco de dados PostgreSQL utilizando JDBC, com suporte a pool de conexões e integração com o Hibernate ORM.
- Hibernate ORM com Panache ([guia](https://quarkus.io/guides/hibernate-orm-panache)): Simplifica o código de persistência usando Hibernate ORM, através do padrão Active Record ou Repository Pattern.
- OpenAPI / Swagger (SmallRye OpenAPI) ([guia](https://quarkus.io/extensions/io.quarkus/quarkus-smallrye-openapi/)): Gera automaticamente a documentação da API REST e disponibiliza a interface Swagger UI para testes interativos dos endpoints.

## Dúvidas

- Não tive dificuldade para criar o CRUD até o momento pois já tenho bastante prática para criar o básico. 
- Apenas o ValidationExpectionMapper que criei com auxilio do GPT para formatar o retorno dos erros.
# 🚀 ApiRest

A ApiRest é uma API REST simples para gerenciamento de produtos.

O projeto permite realizar operações básicas de CRUD:

✅ Criar produtos

✅ Listar produtos

✅ Buscar produto por ID

✅ Atualizar produtos

✅ Remover produtos

A API foi desenvolvida utilizando:

Quarkus 3

Hibernate ORM com Panache

PostgreSQL

Swagger / OpenAPI

O objetivo do projeto é demonstrar a construção de uma API REST utilizando boas práticas de desenvolvimento com Quarkus.


## Subindo a aplicação no modo dev

Você pode executar sua aplicação em modo de desenvolvimento, que permite recarga automática (live coding), usando:

```shell script
./mvnw quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at <http://localhost:8080/q/dev/>.

## Packaging and running the application

The application can be packaged using:

```shell script
./mvnw package
```

It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:

```shell script
./mvnw package -Dquarkus.package.jar.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Guias de Extensões Relacionadas

- REST com Jackson ([guia](https://quarkus.io/guides/rest)): Implementação moderna de Jakarta REST no Quarkus, com processamento em tempo de build e integração com Jackson para conversão automática entre objetos Java e JSON.
- JDBC Driver - PostgreSQL ([guia](https://quarkus.io/guides/datasource)): Permite conectar ao banco de dados PostgreSQL utilizando JDBC, com suporte a pool de conexões e integração com o Hibernate ORM.
- Hibernate ORM com Panache ([guia](https://quarkus.io/guides/hibernate-orm-panache)): Simplifica o código de persistência usando Hibernate ORM, através do padrão Active Record ou Repository Pattern.
- OpenAPI / Swagger (SmallRye OpenAPI) ([guia](https://quarkus.io/extensions/io.quarkus/quarkus-smallrye-openapi/)): Gera automaticamente a documentação da API REST e disponibiliza a interface Swagger UI para testes interativos dos endpoints.


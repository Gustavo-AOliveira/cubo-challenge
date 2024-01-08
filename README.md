# Projeto de Treinamento Backend - Desafio Resolvido com Java, Spring Boot, e MySQL

Este projeto foi desenvolvido como parte do meu treinamento pessoal em desenvolvimento backend. Embora tenha resolvido um desafio semelhante ao proposto para a vaga de Backend no ITAÚ, é importante destacar que este projeto é destinado exclusivamente para fins de prática e aprendizado, e não participei oficialmente do processo seletivo.

## Sobre o Projeto

O objetivo principal deste projeto é aprimorar minhas habilidades em desenvolvimento backend, especialmente no contexto de aplicações Java, Spring Boot e integração com um banco de dados MySQL. O desafio inspirado no processo seletivo do ITAÚ foi abordado com atenção aos requisitos e boas práticas de programação.

## Tecnologias Utilizadas

- Java
- Spring Boot
- MySQL

## Como Executar o Projeto

1. Clone este repositório
2.  Navegue até o diretório do projeto
3.Configure o banco de dados MySQL no arquivo `application.properties`.
4.  Execute a aplicação

## Funcionalidades Implementadas

### 1. Cadastro de Cliente

**Pacote:** `com.example.cubochallenge.service`

**Classe:** `ClientService`

A funcionalidade de cadastro de cliente foi implementada na classe `ClientService`. Um método `saveClient` recebe dados DTO (DataSaveDTO) e salva um novo cliente utilizando a classe `Client`. Os dados são persistidos no banco de dados através do método `repository.save(client)`.

### 2. Listagem de Todos os Clientes

**Pacote:** `com.example.cubochallenge.service`

**Classe:** `ClientService`

A funcionalidade de listagem de todos os clientes foi implementada na classe `ClientService`. Um método `getAll` retorna uma lista contendo todos os clientes cadastrados no banco de dados.

## Observações

- Este projeto foi desenvolvido apenas para fins de treinamento e aprendizado. Não participei oficialmente do processo seletivo para a vaga no ITAÚ.

## Contato

- Se houver alguma dúvida ou feedback, sinta-se à vontade para entrar em contato comigo através do meu e-mail [gustavo.aquino.dev@gmail.com].



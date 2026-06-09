# Global Solution - DDD com Java

## Sistema de Logística de Suprimentos para Base Lunar

### Descrição do Projeto

Este projeto foi desenvolvido para a disciplina de Domain Driven Design (DDD) da FIAP, como parte da Global Solution.

A proposta consiste em um sistema de logística responsável pelo gerenciamento de cargas destinadas a uma Base Lunar. O sistema controla o cadastro, armazenamento e envio de recursos essenciais, como oxigênio, água, medicamentos e equipamentos, garantindo a organização da distribuição dos suprimentos.

Este trabalho é uma continuação da etapa anterior da Global Solution, na qual foi desenvolvido um sistema em Python utilizando algoritmos e estruturas de dados. Nesta fase, o mesmo domínio foi remodelado utilizando os conceitos de DDD e implementação em Java.

---

## Tecnologias Utilizadas

* Java
* IntelliJ IDEA
* Domain Driven Design (DDD)
* Git e GitHub

---

## Estrutura do Projeto

```text
src
└── br.com.fiap
    ├── application
    ├── domain
    │   ├── entity
    │   ├── event
    │   ├── repository
    │   ├── service
    │   └── valueobject
    ├── infrastructure
    │   └── repository
    └── Main
```

---

## Conceitos DDD Aplicados

* Modelagem de Domínio
* Bounded Context
* Context Map
* Entities
* Value Objects
* Aggregate
* Domain Services
* Domain Events
* Repository Pattern
* Integração Mockada
* Regras de Domínio e Invariantes

---

## Principais Classes

### Entities

* Carga
* Envio
* Setor
* BaseLunar

### Value Objects

* Destino
* Prioridade
* StatusCarga

### Domain Service

* ServicoLogistica

### Eventos

* EventoCargaCadastrada
* EventoCargaEnviada
* EventoCargaRecebida

### Repositórios

* CargaRepository
* EnvioRepository
* CargaRepositoryMock
* EnvioRepositoryMock

---

## Execução

Execute a classe `Main.java` para realizar uma simulação do cadastro e envio de uma carga para a Base Lunar.

---

## Integrantes

* Felipe Otavio Garcia Madeira - RM 563521
* Diego Bondezan Yonamine - RM 562013
* João Victor Cazarini Del Bello Cardozo - RM 562543
* Diogo Paquete Weyne - RM 572347
* Guilherme Andrade Amaral - RM 562112

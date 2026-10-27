# Strategy – Sistema de Evolução de Personagens

## Descrição

Este projeto demonstra a aplicação do padrão de projeto comportamental **Strategy** em Java, utilizando como exemplo um sistema de evolução de atributos de personagens de um jogo online.

O sistema permite realizar diferentes operações matemáticas sobre os atributos de um personagem, selecionando uma estratégia específica para cada operação.

## Estratégias implementadas

- **EstrategiaSomarAtributo:** soma dois valores.
- **EstrategiaSubtrairAtributo:** subtrai um valor de outro.
- **EstrategiaMultiplicarAtributo:** multiplica dois valores.
- **EstrategiaDividirAtributo:** divide um valor por outro, impedindo a divisão por zero.
- **EstrategiaMediaAtributos:** calcula a média aritmética de dois valores.

## Tecnologias utilizadas

- Java
- JUnit 5
- Padrão de projeto Strategy

## Testes

A classe `PersonagemTest` contém testes automatizados para verificar as operações matemáticas e garantir que a divisão por zero gere uma exceção.

## Diagrama UML

O projeto possui um diagrama de classes UML que representa a estrutura das classes, a interface de estratégia e os relacionamentos entre os componentes.

## Objetivo

Compreender e demonstrar o padrão Strategy, permitindo selecionar diferentes algoritmos por meio de uma interface comum, mantendo cada operação implementada em uma classe independente.

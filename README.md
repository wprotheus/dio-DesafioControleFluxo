# DIO - Trilha Java Básico

## Controle de Fluxo - Desafio

O sistema deverá receber dois parâmetros via terminal, que serão dois números inteiros. Com estes dois números deverá ser obtida a quantidade de interações (**for**) e realizar a impressão no console 
(**System.out.print**) da diferença entre os números, exemplo:

* Se for passado os números 12 e 30, teremos uma interação com 18 ocorrências para imprimir os números, exemplo:
`"Imprimindo o número 1"`, `"Imprimindo o número 2"` e assim por diante.
* Se o primeiro parâmetro for MAIOR que o segundo parâmetro, você deverá lançar a exceção customizada chamada de `ParametrosInvalidosException`
com a segunda mensagem: "***O segundo parâmetro deve ser maior que o primeiro***".   

1. Criado o projeto `DesafioControleFluxo`
2. Criada a classe `Contador.java` para realizar toda a codificação do nosso programa.
3. Criada a classe `ParametrosInvalidosException` que representará a exceção de negócio no sistema. 

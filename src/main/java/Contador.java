/*
Controle de Fluxo - Desafio
Vamos exercitar o conteúdo apresentado no módulo de Controle de Fluxo codificando o seguinte cenário.
O sistema deverá receber dois parâmetros via terminal que representarão dois números inteiros,
com estes dois números você deverá obter a quantidade de interações (for) e
realizar a impressão no console (System.out.print) dos números incrementados, exemplo:

Se você passar os números 12 e 30, logo teremos uma interação (for) com 18
ocorrências para imprimir os números, exemplo: "Imprimindo o número 1",
"Imprimindo o número 2" e assim por diante.
Se o primeiro parâmetro for MAIOR que o segundo parâmetro, você deverá lançar a
exceção customizada chamada de ParametrosInvalidosException com a segunda mensagem:
"O segundo parâmetro deve ser maior que o primeiro"
*/


import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        iniciarControleDeFluxo(sc);
        sc.close();
    }

    private static void iniciarControleDeFluxo(Scanner sc) {
        System.out.print("Digite um valor para o primeiro número: ");
        int primeiroNumero = sc.nextInt();

        System.out.print("Digite um valor para o segundo número.: ");
        int segundoNumero = sc.nextInt();

        try {
            contar(primeiroNumero, segundoNumero);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {
        if (primeiroNumero >= segundoNumero)
            throw new ParametrosInvalidosException("O segundo número deve ser maior que o primeiro.");

        int diferenca = segundoNumero - primeiroNumero;
        for (int i = 1; i <= diferenca; i++)
            System.out.println("Imprimindo o número: " + i);
    }
}

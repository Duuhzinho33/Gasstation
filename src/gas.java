import java.util.Scanner;

public class gas

{
    public static void main(String[] args) {

        /** Declarar variaveis */
        float preçogasolina, preçoalcool;
        double vantagem;
        String nomeCliente;

        /** Istanciar Scanner */
        Scanner teclado = new Scanner(System.in);


        while (true) {

            System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/");
            System.out.println("----- Welcome To gas Station -----");
            System.out.println(" qual é o seu nome: ");
            nomeCliente = teclado.next();
            System.out.println("Qual o preço da gasolina: ");
            preçogasolina = teclado.nextFloat();
            System.out.println(" Qual o Preço do Alcool: ");
            preçoalcool = teclado.nextFloat();
            System.out.println("/-/-/-/-/-/-/-/-/-/-");

            /** Logica Posto */

            vantagem = preçogasolina * 0.7;

            if (vantagem > preçoalcool) {
                System.out.println("E melhor abastecer Alcool !!");
            } else {
                System.out.println("E melhor Abastecer gasolina !!");
            }

            Scanner desconto = new Scanner(System.in);

            System.out.println("10 Primeiros clientes tem 25% Desconto !!");

            /** Desconto cliente */




        }


    }}

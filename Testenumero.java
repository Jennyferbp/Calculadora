package poo;

import java.util.HashMap;
import java.util.Scanner;

public class Testenumero implements Escape {
    public static void main(String[] args) {
        Numero n = new Numero();

            boolean continuar = true;

            //Scanner ler diferentes tipos de entrada (int, string..)
            Scanner scan = new Scanner(System.in);
            while(continuar){
                double x = 0;
                double y = 0;
                int operacao = 0;

                System.out.println("Digitar a operação que deseja realizar: "
                +       " \n 1 Soma"
                +       " \n 2 Subtração"
                +       " \n 3 Multiplicação"
                +       " \n 4 Divisão"
                +       " \n 0 Finalizar o programa"
                );

                //scan.nextint ler numeros inteiros digitado pelo o usuário
                operacao = scan.nextInt();
                if (operacao == 0){
                    continuar = false;
                    return;
                }

                //scan.nextDouble ler numeros de ponto flutuante
                System.out.println("informe o valor do primeiro número");
                x = scan.nextDouble();

                System.out.println("informe o valor do segundo número");
                y = scan.nextDouble();

                switch (operacao){
                    case 1:
                        imprimecalculadora(operacao, n.soma(x, y), x, y);
                        break;

                    case 2:
                        imprimecalculadora(operacao, n.subtracao(x, y), x, y);
                        break;
                    
                    case 3:
                        imprimecalculadora(operacao, n.multiplicacao(x, y), x, y);
                        break;

                    case 4:
                        imprimecalculadora(operacao, n.divisao(x, y), x, y);
                        break;
                }
            }

            scan.close();
        }
        
    static void imprimecalculadora(int operacao, double resultado, double x, double y){
        HashMap<Integer, String> mapOperacao = new HashMap<>();
            mapOperacao.put(1, " somado");
            mapOperacao.put(2, " subtraido");
            mapOperacao.put(3, " multiplicado");
            mapOperacao.put(4, " dividido");

            System.out.println("O resultado de " + x + mapOperacao.get(operacao) + " por " + y + " é igual a " + resultado + "\n");
        }
    }

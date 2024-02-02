import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}

public class Contador {
    public static void main(String[] args) {
            try (Scanner terminal = new Scanner(System.in)) {
                System.out.println("Digite o primeiro parâmetro");
                int parametroUm = terminal.nextInt();
                System.out.println("Digite o segundo parâmetro");
                int parametroDois = terminal.nextInt();

                try {
                    // chamando o método contendo a lógica de contagem
                    contar(parametroUm, parametroDois);

                } catch (ParametrosInvalidosException e) {
                    // imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
                    System.out.println("Erro: " + e.getMessage());
       }
            }
     }


    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
    
        if(parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
        }

        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println(i);
      }
    }
}

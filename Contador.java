import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();
        
        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exeption) {
            System.out.println("O SEGUNDO parametro deve ser maior que o PRIMEIRO.");
        }

    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois)
            throw new ParametrosInvalidosException();
        
        for (int indice = 0; parametroDois > parametroUm; indice++) {
                System.out.println("Imprimindo o número " + (indice + 1));
                parametroUm++;
        }
    }    
}

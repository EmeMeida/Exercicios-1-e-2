import java.util.Scanner;

public class Emprestimo {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner ler = new Scanner(System.in);
        double salarioCliente = 10000.00;
        double valordaparcela;
        double Emprestimo ;
        System.out.println("Saldo: R$ "+ salarioCliente);
        System.out.println();
        System.out.print("Digite o Valor do Empréstimo: ");
        Emprestimo = ler.nextDouble();
        System.out.print("Digite a quantidades de parcelas: ");
        valordaparcela = ler.nextDouble();

        if (Emprestimo>salarioCliente){
            System.out.println("O valor do Emprestimo não pode execeder o valor do Saldo");
            System.out.println("Seu Saldo é R$: "+ salarioCliente);
        } else {
            System.out.println("Valor Aprovado!");
        }





    }

}

import java.util.Scanner;
public class Cpf {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String cpf;
        System.out.print("Digite seu CPF sem pontos ou traços: ");
        cpf = ler.next();

        if (cpf.length()== 11 && !cpf.matches("\\d{11}")){
            System.out.println("CPF Válido");
        } else {
            System.out.println("CPF inválido, digite novamente");
        }

        
    }

}

import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Digite o salário base do funcionário: R$ ");
        double salarioBase = scanner.nextDouble();
    
        scanner.nextLine(); 
       
        System.out.print("Digite o desempenho do funcionário (otimo, bom, regular): ");
        String desempenho = scanner.nextLine().trim().toLowerCase();
     
        double salarioFinal = calcularSalarioFinal(salarioBase, desempenho);
    
        System.out.printf("O salário final do funcionário é: R$ %.2f%n", salarioFinal);
    
        scanner.close();
    }

    public static double calcularSalarioFinal(double salarioBase, String desempenho) {
        double bonus = 0.0;
        
        switch (desempenho) {
            case "otimo":
                bonus = 0.20;
                break;
            case "bom":
                bonus = 0.10;
                break;
            case "regular":
                bonus = 0.05;
                break;
            default:
                bonus = 0.00;
                break;
        }
        
        return salarioBase * (1 + bonus);
    }
}

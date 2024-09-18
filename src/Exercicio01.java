//java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
     //Scanner ler = new Scanner (System.in);
    int funcionario01 =  10;
    int funcionario02 = 7;
    int funcionario03 = 0;
    
    System.out.println("A nota do Funcionario 01 é: 0");
    System.out.println("A nota do Funcionario 02 é: 6");
    System.out.println("A nota do Funcionario 03 é: 8");
    System.out.println();


    if (funcionario01<=4){
        System.out.println("A nota do usuario01 está: Ruim");
    }  else if  (funcionario01>=5 && funcionario01 <=9){
        System.out.println("O usuário01 está com a nota: Regular");
    }
    else if  (funcionario01>=10){
        System.out.println("O usuário01 está com a nota acima de: Excelente");
    }//primeiro funcionario
    if (funcionario02<=4){
        System.out.println("A nota do usuario02 está: Ruim");
    }  else if  (funcionario02>=5 && funcionario02 <=9){
        System.out.println("O usuário02 está com a nota: Regular");
    }
    else if  (funcionario02>=10){
        System.out.println("O usuário02 está com a nota: Excelente");
    } //segundo funcionario
    if (funcionario03<=4){
        System.out.println("A nota do usuario03 está: Ruim");
    }  else if  (funcionario03>=5 && funcionario03 <=9){
        System.out.println("O usuário03 está com a nota: Regular");
    }
    else if  (funcionario03>=10){
        System.out.println("O usuário03 está com a nota: Excelente");
    }//terceiro funcionario


    }

}

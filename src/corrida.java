import java.util.Scanner;
public class corrida {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double metros;
        double minutagem;
        double velocidadeMedia;


        System.out.print("Quantos Metros Percorrido: ");
        metros = ler.nextInt();
        System.out.print("Em quantos Minutos (em Segundos): ");
        minutagem = ler.nextInt();

        velocidadeMedia = metros/0.036;

        if (velocidadeMedia<5){
            System.out.println("Movimento Lento");
        } else if (velocidadeMedia>5 && velocidadeMedia<=16){
            System.out.println("Movimento Moderado");
        } else if (velocidadeMedia>15){
            System.out.println("Movimento Rápido");
        }











    }

}

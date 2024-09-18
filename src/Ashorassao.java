import java.util.Scanner;

public class Ashorassao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int horas;


        System.out.print("Digite as Horas em Formato de 24h: ");
        horas = ler.nextInt();
        System.out.println();

        System.out.println("Horas Informada: "+ horas+ "h");

        if (horas>9 && horas < 19){
            System.out.println("Dentro do Horario Comercial");
        } else {
            System.out.println("Fora de Horario comercial");
        }

        




    }

}

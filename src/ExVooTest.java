import java.util.Scanner;
import java.util.Date;

public class ExVooTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Date data = new Date();
        ExVoo umVoo = new ExVoo(data,6);

       umVoo.ocupaCadeira(0);
        if(umVoo.verificaOcupada(2)== false)
            System.out.printf("Cadeira vazia%n");
        else
            System.out.printf("Cadeira Ocupada%n");

        System.out.printf("Cadeiras Vagas: %d%n",umVoo.cadeirasVagas());
        System.out.printf("Numero da proxima Cadeira Livre: %d%n",umVoo.proximaPoltronaLivre());

    }
}

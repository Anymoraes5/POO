import java.util.Date;

public class App {
    public static void main(String[] args) {
        Aluno a = new Aluno("Ana","556", new Date("06/05/2006"));

        Aluno a1 = new Aluno ();

        Aluno a2 = new Aluno ( new Date("06/01/1998"),"292");

        Aluno a3 = new Aluno ("kaue", "123");

        Aluno a4 = new Aluno ("ana", new Date("12/12/2006")); // data com (quando anos de 1900 ate o ano , array onde janiero é 0 e dez é 11 --1 de cada mes e dia)

        System.out.println("Nome: " + a.getNome());
        System.out.println("Nome: " + a1.getNome());
        System.out.println("Nome: " + a2.getNome());
        System.out.println("Nome: " + a3.getNome());
        System.out.println("Nome: " + a4.getNome());
    }
}

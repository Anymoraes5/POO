public class App {
    public static void main(String[] args) throws Exception {
        Mensalista m1 = new Mensalista("José", "Rua ABC nº123", "Junior");
        Horista h1 = new Horista("Maria", "ABC", 10);
        
        m1.calcularSalario();
        System.out.println("MENSALISTA: "+m1.getNome());
        System.out.println("INSS: " +m1.calcularINSS()); // VEIO DEVIDO O EXTEND pq mesmo chamando a classe mensalista acompanha a classe herdada
        System.out.println("IR: " +m1.calcularIR());

        h1.calcularSalario();
        System.out.println("HORISTA: "+h1.getNome());
        System.out.println("SALARIO: "+h1.getSalario());
        System.out.println("INSS: " +h1.calcularINSS()); // VEIO DEVIDO O EXTEND pq mesmo chamando a classe mensalista acompanha a classe herdada
        System.out.println("IR: " +h1.calcularIR());
        
    }
}

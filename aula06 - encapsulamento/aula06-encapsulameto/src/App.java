public class App {
    public static void main(String[] args) throws Exception {
        
        // quando eu coloco o construtor é preciso set na entrada
        Aluno chico = new Aluno("Ana",292123,18,"feminino",true); 
        // chico.setNome("Ana ");
        // chico.setNome("Carol "); //sobrescreve 
        System.out.println(chico.getNome());

        // Aluno moedas = new Aluno();
        // chico.setNome("Ana C");
        // System.out.println(chico.getNome());
    }
}

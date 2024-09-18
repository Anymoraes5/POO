public class Aluno {
     //metodo de acesso(public ou private) dps a tipagem(string, int e etc) e dps nome 
     private String nome;
     private int ra; 
     private int idade;
     private String genero; 
     private boolean status;


      //setter  
      public void setNome (String ent_nome ) { //modificador de acesso tipo de retorno nome (lista de paramentros) todo metodo set é void 
       nome = ent_nome;

    }
    //getter
    public String getNome () { //modificador de acesso tipo de retorno nome (lista de paramentros) todo metodo get o parametrto é vazio 
        return nome;
    }
    
    
    //contrutor - public (construtor é vinculado a classe)
    public Aluno(String nome, int ra, int idade, String genero, boolean status){
        this.nome = nome; // this é para referenciar o nome da variavel 
        this.ra = ra;
        this.idade = idade;
        this.genero = genero;
        this.status = status;
    
    }

    
    
}

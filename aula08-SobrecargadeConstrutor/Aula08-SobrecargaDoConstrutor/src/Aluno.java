import java.util.Date;

public class Aluno {
    private String nome;
    private String matricula;
    private Date data_nascimento;


    //construtor com todos os parametros 
    public Aluno(String nome, String matricula, Date data_nascimento){
        this.nome = nome;
        this.matricula = matricula;
        this.data_nascimento = data_nascimento;
    }
    //construtor vazio
    public Aluno (){

    }
    // Construtor com dois parametros 
    public Aluno (String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }
    // Construtor com dois parametros  (texto e data)
    public Aluno(String nome, Date data_nascimento) {
        this.nome = nome;
        this.data_nascimento = data_nascimento;
    }
    // Construtor com dois parametros (data e texto)
    public Aluno(Date data_nascimento, String matricula) {
        this.data_nascimento = data_nascimento;
        this.matricula = matricula;
    }
    public void setNome (String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
}
        
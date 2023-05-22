package Objects;

public class User {
    private static int nextId = 1;
    private int id;
    private String nome;
    private String login;
    private String senha;
    private String cpf;
    private String cidade;
    private String email;
    
    public User(String nome, String login, String senha, String cpf, String cidade, String email) {
        this.id = nextId++;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.cpf = cpf;
        this.cidade = cidade;
        this.email = email;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void mostrarInfo() {
        System.out.println("Id: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Login: " + login);
        System.out.println("CPF: " + cpf);
        System.out.println("Cidade: " + cidade);
        System.out.println("Email: " + email);
    }
}

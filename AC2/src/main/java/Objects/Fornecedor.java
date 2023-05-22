package Objects;

public class Fornecedor {

    private static int nextId = 1;
    private int id;
    private String cnpj;
    private String endereco;
    private String razaoSocial;
    private String cidade;
    private String uf;
    private String telefone;
    private String email;
    private String ramo;

    public Fornecedor(String cnpj, String endereco, String razaoSocial, String cidade, String uf, String telefone, String email, String ramo) {
        this.id = nextId++;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.razaoSocial = razaoSocial;
        this.cidade = cidade;
        this.uf = uf;
        this.telefone = telefone;
        this.email = email;
        this.ramo = ramo;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void mostrarInfo() {
        System.out.println("Id: " + id);
        System.out.println("Razao Social: " + razaoSocial);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Ramo: " + ramo);
        System.out.println("Endereço: " + endereco);
        System.out.println("Cidade: " + cidade);
        System.out.println("UF: " + uf);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);

    }
}

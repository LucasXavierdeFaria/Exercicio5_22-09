public class Funcionario {
    private String nome;
    private double salarioBruto;
    private String cargo;

    public Funcionario(String nome, double salarioBruto, String cargo) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public String getCargo() {
        return cargo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João Silva", 5000, "Desenvolvedor");
        CalculadoraSalario calculadora = new CalculadoraSalario();

        double salarioLiquido = calculadora.calcularSalarioLiquido(funcionario);
        System.out.println("Salário líquido de " + funcionario.getNome() + ": R$ " + salarioLiquido);
    }
}

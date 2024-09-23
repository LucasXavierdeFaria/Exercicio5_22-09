public class CalculadoraSalario {
    private static final double IMPOSTO = 0.2; // 20% de imposto
    private static final double BENEFICIO = 500; // Benefício fixo de R$ 500

    public double calcularSalarioLiquido(Funcionario funcionario) {
        double salarioBruto = funcionario.getSalarioBruto();
        double descontos = salarioBruto * IMPOSTO;
        return salarioBruto - descontos + BENEFICIO;
    }
}

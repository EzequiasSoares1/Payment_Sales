package Relatorio;
import Funcionarios.Funcionario;
import Funcionarios.Vendedor;
import java.util.List;

public class Relatorio {
    public Float calcularTotalPago(List<Funcionario> funcionarios, int ano, int mes) {
        return funcionarios.stream()
                .filter(funcionario -> funcionario.ehPeriodoDoContrato(ano, mes))
                .map(funcionario -> funcionario.salarioComBeneficio(ano, mes))
                .reduce(0f, Float::sum);
    }

    public Float calcularSalarios(List<Funcionario> funcionarios, int ano, int mes) {
        return funcionarios.stream()
                .filter(funcionario -> funcionario.ehPeriodoDoContrato(ano, mes))
                .map(funcionario -> funcionario.salarioSemBeneficio(ano, mes))
                .reduce(0f, Float::sum);
    }

    public Float calcularBeneficiosTotal(List<Funcionario> funcionarios, int ano, int mes) {
        return funcionarios.stream()
                .filter(funcionario -> funcionario.getBeneficio() > 0 && funcionario.ehPeriodoDoContrato(ano, mes))
                .map(funcionario -> funcionario.getBeneficioMensal(ano, mes))
                .reduce(0f, Float::sum);
    }
    public Funcionario maiorSalarioMes(List<Funcionario> funcionarios, int ano, int mes) {
        return funcionarios.stream()
                .filter(funcionario -> funcionario.ehPeriodoDoContrato(ano, mes))
                .max((funcionario1, funcionario2) -> (int) (funcionario1.salarioComBeneficio(ano, mes)
                        - funcionario2.salarioComBeneficio(ano, mes)))
                .orElse(null);
    }

    public String maiorSalarioMesNome(List<Funcionario> funcionarios, int ano, int mes) {
        return maiorSalarioMes(funcionarios, ano, mes) != null ?
                maiorSalarioMes(funcionarios, ano, mes).getNome() : null;
    }

    public Vendedor vendedorComMaisVendas(List<Vendedor> vendedores, int ano, int mes) {
        return vendedores.stream()
                .filter(vendedor -> vendedor.ehPeriodoDoContrato(ano, mes))
                .max((vendedor1, vendedor2) -> (int) (vendedor1.totalVendasNoMes(ano, mes)
                                        - vendedor2.totalVendasNoMes(ano, mes)))
                .orElse(null);
    }
}


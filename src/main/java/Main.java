import Relatorio.Relatorio;
import Funcionarios.Funcionario;
import Funcionarios.Gerente;
import Funcionarios.Secretario;
import Funcionarios.Vendedor;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Criando Relatorio
        Relatorio relatorio =  new Relatorio();

        // Criando vendas1
        Map<LocalDate, Float> vendas1 = new HashMap<>();
        vendas1.put(LocalDate.of(2020, 1, 1), 5000.0f);
        vendas1.put(LocalDate.of(2020, 2, 1), 8500.0f);
        vendas1.put(LocalDate.of(2022, 3, 1), 5500.0f);

        // Criando vendas2
        Map<LocalDate, Float> vendas2 = new HashMap<>();
        vendas2.put(LocalDate.of(2022, 4, 1), 7000.0f);
        vendas2.put(LocalDate.of(2020, 2, 1), 8000.0f);
        vendas2.put(LocalDate.of(2022, 5, 1), 10000.0f);

        // Criando Lista Vendedor
        List<Funcionario> funcionarios = new ArrayList<>();

        // Criando Vendedor
        Vendedor vendedor1 = new Vendedor("David", LocalDate.of(2019, 8, 1),vendas1);
        Vendedor vendedor2 = new Vendedor("Joao", LocalDate.of(2020, 8, 1),vendas2);
        funcionarios.add(vendedor1);
        funcionarios.add(vendedor2);

        // Criando Secretario
        Secretario secretario1 = new Secretario("Alice", LocalDate.of(2015, 1, 1));
        Secretario secretario2 = new Secretario("Bob", LocalDate.of(2018, 6, 15));
        funcionarios.add(secretario1);
        funcionarios.add(secretario2);

        // Criando Gerente
        Gerente gerente1 = new Gerente("Eva", LocalDate.of(2022, 5, 5));
        Gerente gerente2 = new Gerente("Frank", LocalDate.of(2019, 8, 5));
        funcionarios.add(gerente1);
        funcionarios.add(gerente2);

        // Criando Lista de Vendedor
        List<Vendedor> vendedores = new ArrayList<>();
        vendedores.add(vendedor1);
        vendedores.add(vendedor2);

        // Um método que receba uma lista de funcionários, mês e ano e retorne o valor total
        //pago (salário e benefício) a esses funcionários no mês.
        System.out.println("Valor total Pago: " + relatorio.calcularTotalPago(funcionarios,2021, 8));

        //Um método que receba uma lista de funcionários, mês e ano e retorne o total pago
        //somente em salários no mês.
        System.out.println("Valor total somente em salários: " + relatorio.calcularSalarios(funcionarios,2021, 8));

        // Um método que receba uma lista somente com os funcionários que recebem
        //benefícios, mês e ano e retorne o total pago em benefícios no mês.
        System.out.println("Valor total pago em benefícios: " + relatorio.calcularBeneficiosTotal(funcionarios,2019, 6));

        //Um método que receba uma lista de funcionários, mês e ano e retorne o que
        //recebeu o valor mais alto no mês.
        System.out.println("funcionário que recebeu o valor mais alto no mês: " + relatorio.maiorSalarioMes(funcionarios,2020, 2).toString());

        //Um método que receba uma lista somente com os funcionários que recebem
        //benefícios, mês e ano e retorne o nome do funcionário que recebeu o valor mais
        //alto em benefícios no mês.
        System.out.println("Nome do funcionário que recebeu o valor mais alto no mês: " + relatorio.maiorSalarioMesNome(funcionarios,2015, 2));

        //Um método que receba uma lista de vendedores, mês e ano e retorne o que mais
        //vendeu no mês
        System.out.println("vendedor que mais vendeu no mês: " + relatorio.vendedorComMaisVendas(vendedores,2022,5));

    }
}

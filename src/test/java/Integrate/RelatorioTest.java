package Integrate;
import Funcionarios.Funcionario;
import Funcionarios.Gerente;
import Funcionarios.Secretario;
import Funcionarios.Vendedor;
import Relatorio.Relatorio;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class RelatorioTest {

    private Relatorio relatorio;
    private List<Funcionario> funcionarios = new ArrayList<>();
    private Map<LocalDate, Float> vendas1 = new HashMap<>();
    private Map<LocalDate, Float> vendas2 = new HashMap<>();

    // Criando Vendedor
    private Vendedor vendedor1 = new Vendedor("David", LocalDate.of(2019, 8, 1),vendas1);
    private Vendedor vendedor2 = new Vendedor("Joao", LocalDate.of(2020, 8, 1),vendas2);

    // Criando Secretario
    private Secretario secretario1 = new Secretario("Alice", LocalDate.of(2015, 1, 1));
    private Secretario secretario2 = new Secretario("Bob", LocalDate.of(2018, 6, 15));

    // Criando Gerente
    private Gerente gerente1 = new Gerente("Eva", LocalDate.of(2022, 5, 5));
    private Gerente gerente2 = new Gerente("Frank", LocalDate.of(2019, 8, 5));

    // Criando Lista de Vendedor
    private List<Vendedor> vendedores = new ArrayList<>();


    @BeforeAll
    public void up(){
        //Criando Relatorio
        relatorio =  new Relatorio();

        // Criando vendas1
        vendas1.put(LocalDate.of(2020, 1, 1), 5000.0f);
        vendas1.put(LocalDate.of(2020, 2, 1), 8500.0f);
        vendas1.put(LocalDate.of(2022, 3, 1), 5500.0f);

        // Criando vendas2
        vendas2.put(LocalDate.of(2022, 4, 1), 7000.0f);
        vendas2.put(LocalDate.of(2020, 2, 1), 8000.0f);
        vendas2.put(LocalDate.of(2022, 5, 1), 10000.0f);

        // Criando lista de funcionários
        funcionarios.add(vendedor1);
        funcionarios.add(vendedor2);
        funcionarios.add(secretario1);
        funcionarios.add(secretario2);
        funcionarios.add(gerente1);
        funcionarios.add(gerente2);
        vendedores.add(vendedor1);
        vendedores.add(vendedor2);

    }

    @Order(1)
    @Test
    public void calcularSalariosPagoTest(){
        assertEquals(88820f,relatorio.calcularTotalPago(funcionarios,2021, 8));
        assertEquals(78740f, relatorio.calcularTotalPago(funcionarios,2020,8));

    }
    @Order(2)
    @Test
    public void calcularSalariosPagoErrorTest(){
        assertEquals(0f,relatorio.calcularTotalPago(funcionarios,2010, 2));
        assertEquals(0f,relatorio.calcularTotalPago(funcionarios,2009, 6));
    }


    @Order(3)
    @Test
    public void calcularSalariosTest(){
        assertEquals(75400f,relatorio.calcularSalarios(funcionarios,2021, 8));
        assertEquals(104000f, relatorio.calcularSalarios(funcionarios,2022, 8));
    }

    @Order(4)
    @Test
    public void calcularSalariosErroTest(){
        assertEquals(0f,relatorio.calcularSalarios(funcionarios,2005, 2));
        assertEquals(0f,relatorio.calcularSalarios(funcionarios,2010, 6));
    }

    @Order(5)
    @Test
    public void calcularBeneficiosTotalTest(){
        assertEquals(13620f,relatorio.calcularBeneficiosTotal(funcionarios,2022, 2));
        assertEquals(3600f,relatorio.calcularBeneficiosTotal(funcionarios,2019, 6));
    }
    @Order(6)
    @Test
    public void calcularBeneficiosErrorTest(){
        assertEquals(0f,relatorio.calcularBeneficiosTotal(funcionarios,2001, 2));
        assertEquals(0f,relatorio.calcularBeneficiosTotal(funcionarios,2010, 6));
    }

    @Order(7)
    @Test
    public void maiorSalarioMesTest(){
        assertEquals("Frank",relatorio.maiorSalarioMes(funcionarios,2020, 2).getNome());
        assertEquals("Alice",relatorio.maiorSalarioMes(funcionarios,2016, 6).getNome());
    }

    @Order(8)
    @Test
    public void maiorSalarioMesErrorTest(){
        assertNull(relatorio.maiorSalarioMes(funcionarios,2012, 2));
        assertNull(relatorio.maiorSalarioMes(funcionarios,2014, 6));
    }

    @Order(9)
    @Test
    public void maiorSalarioNomeTest(){
        assertEquals("Alice",relatorio.maiorSalarioMesNome(funcionarios,2015, 2));
        assertEquals("Frank",relatorio.maiorSalarioMesNome(funcionarios,2025, 6));
    }
    @Order(10)
    @Test
    public void maiorSalarioNomeErrorTest(){
        assertNull(relatorio.maiorSalarioMesNome(funcionarios,2014, 5));
        assertNull(relatorio.maiorSalarioMesNome(funcionarios,2012, 6));
    }


    @Order(11)
    @Test
    public void vendedorMaisVendasTest(){
        assertEquals("Joao",relatorio.vendedorComMaisVendas(vendedores,2022,5).getNome());
        assertEquals("David",relatorio.vendedorComMaisVendas(vendedores,2020, 2).getNome());
    }

    @Order(12)
    @Test
    public void vendedorMaisVendasErrorTest(){
        assertNull(relatorio.vendedorComMaisVendas(vendedores,2013,5));
        assertNull(relatorio.vendedorComMaisVendas(vendedores,2014, 2));
    }

}

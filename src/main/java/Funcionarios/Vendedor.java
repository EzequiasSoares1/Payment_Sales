package Funcionarios;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
import java.util.Map;

@Setter
@Getter
public class Vendedor extends Funcionario{

    private Map<LocalDate, Float> vendaMensal;

    public Vendedor(String nome, LocalDate contratacao, Map<LocalDate, Float> vendaMensal){
        super(nome, contratacao, 12000F,30F, 1800F);
        this.vendaMensal = vendaMensal;
    }

    public Float totalVendasNoMes(int ano, int mes) {
        LocalDate dataPesquisa = LocalDate.of(ano, mes, 1);
        return vendaMensal.getOrDefault(dataPesquisa, 0.0f);
    }

}

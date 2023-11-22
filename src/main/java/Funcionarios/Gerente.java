package Funcionarios;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Setter
@Getter
public class Gerente extends Funcionario{
    public Gerente(String nome, LocalDate contratacao){
        super( nome, contratacao, 20000F,0F, 3000F);
    }
}

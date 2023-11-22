package Funcionarios;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Setter
@Getter
public class Secretario extends Funcionario{
    public Secretario(String nome, LocalDate contratacao){
        super( nome, contratacao, 7000F,20F, 1000F);
    }
}

package Funcionarios;
import lombok.Data;
import java.util.Date;
@Data
public abstract class Funcionario {
    private String nome;
    private Date contratação;
    private Float salario;
}

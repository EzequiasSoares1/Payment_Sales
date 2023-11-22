package Funcionarios;

import lombok.Data;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Data
public abstract class Funcionario {
    private String nome;
    private LocalDate contratacao;
    private Float salario;
    private Float beneficio;
    private Float acrescimoAnual;

    public Funcionario(String nome, LocalDate contratacao, Float salario, Float beneficio, Float acrescimoAnual) {
        this.nome = nome;
        this.contratacao = contratacao;
        this.salario = salario;
        this.beneficio = beneficio;
        this.acrescimoAnual = acrescimoAnual;
    }

    public long calcularAnosDeServico(int ano, int mes) {
        long anosDeServico = ChronoUnit.YEARS.between(contratacao,  LocalDate.of(ano, mes, 1));
        return anosDeServico == 0 ? 0: anosDeServico ;
    }

    public Float salarioSemBeneficio(int ano, int mes) {
        return salario + (acrescimoAnual * calcularAnosDeServico(ano, mes));
    }

    public Float salarioComBeneficio(int ano, int mes) {
        return salarioSemBeneficio(ano, mes) + getBeneficioMensal(ano, mes);
    }

    public boolean ehPeriodoDoContrato(int ano, int mes) {
        LocalDate dataVerificacao = LocalDate.of(ano, mes, 1);
        LocalDate inicioContrato = LocalDate.of(contratacao.getYear(), contratacao.getMonth(), 1);
        return !dataVerificacao.isBefore(inicioContrato);
    }

    public float getBeneficioMensal(int ano, int mes){
        return (beneficio / 100 * salarioSemBeneficio(ano, mes));
    }
}

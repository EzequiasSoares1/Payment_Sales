# Payment_Sales
Este projeto em Java foi feito para testar o meu conhecimento em orientação a objeto dentre outras habilidades.
O objetivo do programa é gerenciar informações sobre funcionários de uma empresa, incluindo cálculos de salários, benefícios, vendas e gerar alguns relatorios. Abaixo estão alguns detalhes sobre o projeto.

## Estrutura do Projeto
O projeto é composto por várias classes que representam diferentes tipos de funcionários:

**Funcionario:** Classe abstrata que define atributos e métodos comuns a todos os funcionários.
**Gerente:** Classe que representa um gerente, herda de Funcionario.
**Secretario:** Classe que representa um secretário, herda de Funcionario.
**Vendedor:** Classe que representa um vendedor, herda de Funcionario e possui um mapa de vendas mensais.
**Relatorio:** Classe responsável por gerar relatórios com base nas informações dos funcionários.

## Bibliotecas:
**Lombok:** Para redução de código.

**JUnit:** Para escrever e executar testes de integração.( Os testes estão no pacote `Test` )

## Funcionalidades Implementadas

1. **Calcular Total Pago (Salário e Benefício) a Funcionários no Mês:**
   - Recebe lista de funcionários, mês e ano.
   - Retorna valor total pago, considerando salários e benefícios, no mês.

2. **Calcular Total Pago Somente em Salários no Mês:**
   - Recebe lista de funcionários, mês e ano.
   - Retorna total pago somente em salários no mês.

3. **Calcular Total Pago em Benefícios para Funcionários que Recebem Benefícios:**
   - Recebe lista com funcionários que recebem benefícios, mês e ano.
   - Retorna total pago em benefícios no mês.

4. **Identificar Funcionário que Recebeu o Valor Mais Alto no Mês:**
   - Recebe lista de funcionários, mês e ano.
   - Retorna funcionário que recebeu valor mais alto (salário e benefício) no mês.

5. **Identificar Nome do Funcionário que Recebeu o Valor Mais Alto em Benefícios no Mês:**
   - Recebe lista com funcionários que recebem benefícios, mês e ano.
   - Retorna nome do funcionário que recebeu valor mais alto em benefícios no mês.

6. **Identificar Vendedor que Mais Vendeu no Mês:**
   - Recebe lista de vendedores, mês e ano.
   - Retorna vendedor que mais vendeu no mês.

## Como Utilizar

### Clone o Repositório:

```bash
git clone https://github.com/seu-usuario/nome-do-repositorio.git
```

### Importe o Projeto:
### Utilize os Métodos Implementados ou execulte o arquivo Main.java:





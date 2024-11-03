public class ContaEstudantil extends Conta {
    private double emprestimo;

    // Construtor padrão
    public ContaEstudantil() {
        super();
    }

    // Construtor com parâmetros
    public ContaEstudantil(String numero, double saldo, double emprestimo) {
        this.numero = numero;
        this.saldo = saldo;
        this.emprestimo = emprestimo;
    }

    // Métodos para manipular o empréstimo
    public void setEmprestimo(double emprestimo) {
        this.emprestimo = emprestimo;
    }

    public double getEmprestimo() {
        return emprestimo;
    }

    // Método para utilizar parte do empréstimo, se disponível
    public void usarEmprestimo(double valor) {
        if (valor <= emprestimo) {
            saldo += valor;
            emprestimo -= valor;
        } else {
            System.out.println("Valor de empréstimo insuficiente.");
        }
    }

    // Implementação do método creditar da classe abstrata Conta
    @Override
    public void creditar(double valor) {
        saldo += valor;
    }

    // Implementação do método debitar da classe abstrata Conta
    @Override
    public void debitar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}

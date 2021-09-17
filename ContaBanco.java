public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int nc) {
        this.numConta = nc;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double sal) {
        this.saldo = sal;
    }

    public boolean isStatus(boolean b) {
        return status;
    }

    public void setStatus(boolean sta) {
        this.status = sta;
    }

    public void abrirConta(String t) {
        setTipo(t);
        setStatus(true);
        if (t == "cc") {
            setSaldo(50); ;
        } else if (t == "cp") {
            setSaldo(150);
        }

    }

    public void fecharConta() {

        if (getSaldo() > 0) {
            System.out.println("Está conta possui dinheiro!");
        } else if (getSaldo() < 0) {
            System.out.println("Conta em débito");

        } else {
            System.out.println("Sua conta foi deletada com sucesso!!!");
            setStatus(false);
        }

    }

    public void depositar(float v) {

        if (isStatus(true)) {
            setSaldo(getSaldo() + v);
        } else {
            System.out.println("Conta nao existente");
        }

    }

    public void sacar(float v) {
        if (isStatus(true)) {
            if (getSaldo() < v) {
                System.out.println("Saldo insuficiente, seu saldo é de: " + getSaldo());
            } else {
                setSaldo(getSaldo() - v);
                System.out.println("Saque realizado com sucesso, seu saldo restante é de: " + getSaldo());
            }
        } else {
            System.out.println("Impossivel sacar");
        }
    }

    public void pagarMensal() {

        double val = 0;
        if (this.tipo == "cc") {
            val = 12;
        } else if (this.tipo == "cp") {
            val = 20;
        }

        if (isStatus(true)) {
            if (getSaldo() < val) {
                System.out.println("NÃO FOI POSSIVEL RELIZAR O PAGAMENTO, CONTA EM DÉBITO");

            } else {
               setSaldo(getSaldo() - val);
            }
        } else {
            System.out.println("Impossivel pagar!! Conta inexistente");
        }

    }

    public void mostrar() {
        if (isStatus(true) ) {
            System.out.println("O Número da sua conta é: " + this.getNumConta());
            System.out.println("O tipo da sua conta é: " + this.getTipo());
            System.out.println("O Titular da conta é: " + this.getDono());
            System.out.println("O Saldo total é de: R$" + this.getSaldo());
        } else {

            System.out.println("Não existe conta ainda.");

        }

    }
}


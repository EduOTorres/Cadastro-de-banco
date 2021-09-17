public class main {

    public static void main(String[] args) {
    ContaBanco u1 = new ContaBanco();
    u1.abrirConta("cp");
    u1.setDono("Eduardo Torres");
    u1.setNumConta(234563214);
    u1.depositar(1000);
    u1.pagarMensal();
    u1.sacar(0);
    u1.fecharConta();
    u1.mostrar();

    }

}

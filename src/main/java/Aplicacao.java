public class Aplicacao {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setNumero(123);
        conta.setSaldo(1000);
        conta.setLimite(3500);


        System.out.println(conta.getNumero());
        System.out.println(conta.getSaldo());
        System.out.println(conta.getLimite());

    }
}

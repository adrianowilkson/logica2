public class Conta {
    public int numero;
    public double saldo;
    public double limite;

    public void sacar(double valor) {
        if (saldo > (limite * -1)) {
            saldo = saldo - valor;
            System.out.println("Saque: " + valor);
        }else{
            System.out.println("Você estourou seu limite. Transação incompleta!");
            // Em vez de lançar uma exceção, preferi escrever na tela para o usuário saber o que aconteceu.
        }
    }

    public void depositar(double valor){
        saldo = saldo + valor;

    }

    public void transferir(double valor, Conta conta){
        saldo = saldo - valor;
        conta.saldo = conta.saldo + valor;

    }

    public void setLimite(double lim){
        this.limite = lim;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setNumero(int id){
        this.numero = id;
    }

    }

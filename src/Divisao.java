public class Divisao extends Operacao {
    @Override
    public int efetuarOperacao(int x, int y) {
        if(y==0 || x==0 ){
            System.out.println("Operação invalida(Divisão por 0)");
            return 0;
        }
        return x/y;
    }
}

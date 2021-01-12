public class Quadrado {
    public double lado;

    public double getLado (){
        validaTamanho(lado);
        return lado;
    }

    public void setLado(double lado){
        validaTamanho(lado);
        this.lado = lado;
    }

    private void validaTamanho(double tamanho){
        if (tamanho <= 0){
            throw new IllegalArgumentException("O tamanho precisa ser positivo");
        }


    }

    public double calcularArea(){
        return lado * lado;
    }

    public double calcularPerimetro(){
        return lado * 4;
    }

    public boolean podeConter(Quadrado q){
        if (q.lado <= lado){
            return true;
        }else{
            return false;
        }

    }
}

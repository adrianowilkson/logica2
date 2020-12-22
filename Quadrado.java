public class Quadrado {
    public double lado;

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

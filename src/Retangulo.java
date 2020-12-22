public class Retangulo {
    public double base;
    public double altura;

    public double calcularArea(){
        return base * altura;
    }

    public double calcularPerimetro(){
        return 2 * (base + altura);
    }

    public boolean podeConter(Retangulo r){
        if (r.base <= base & r.altura <= altura){
            return true;
        }else{
            return false;

        }
    }
}

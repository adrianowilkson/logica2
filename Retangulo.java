public class Retangulo {
    public double base;
    public double altura;

    public void setBase(double base){
        if (base <= 0){
            throw new IllegalArgumentException("A base tem que ser maior que 0.");
        }

        this.base = base;
    }

    public double getBase(){

        return base;
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("A altura tem que ser maior que 0.");
        }

        this.altura = altura;
    }

    public double getAltura(){

        return altura;
    }




    public double calcularArea() {
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

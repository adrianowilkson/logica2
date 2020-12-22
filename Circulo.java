public class Circulo {

    public double raio;

    public void setRaio(double raio){
        if (raio <= 0){
            throw new IllegalArgumentException("O raio tem que ser maior que 0.");
        }
        this.raio = raio;
    }

    public double calcularArea(){
        return 3.14 * raio * raio;
    }

    public double calcularPerimetro(){
        return 3.14 * raio * 2;
    }
}


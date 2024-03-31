package CarroSimples;

public class Carro {
    private String cor;
    private Motor motor;

    public Carro() {
        this.motor = new Motor();
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}

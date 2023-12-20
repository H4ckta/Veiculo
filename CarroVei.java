public class CarroVei implements Iveiculo{
    private float valorFinal;

    @Override
    public float acelerar(float kmVelocidade) {
        if (kmVelocidade > 531){
            System.out.println("NEM O CARRO MAIS RAPIDO DO MUNDO CHEGA A ISSO");
        }
        else {
            this.valorFinal = kmVelocidade;
            System.out.println("VELECODIADE CARRO: " + kmVelocidade + "km");
        }

        return valorFinal;
    }

    @Override
    public boolean frear(boolean decisao) {
        if (decisao == true){
            System.out.println("Carro freiado");
            valorFinal = 0;
        }
        else {
            System.out.println("Carro em andamento");
        }
        return decisao;
    }

    @Override
    public float obterVelocidade() {
        System.out.println("Velocidade Final Carro: " + valorFinal + "km");
        return valorFinal;
    }
}

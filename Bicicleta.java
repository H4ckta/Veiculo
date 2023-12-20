public class Bicicleta implements Iveiculo{
    private float valorFinal;

    @Override
    public float acelerar(float kmVelocidade) {
        if (kmVelocidade > 25){
            System.out.println("VOCÊ NÃO TEM SUPER VELOCIDADE VC É UM CICLISTA");
        }

        else{
            this.valorFinal = kmVelocidade;
            System.out.println("VELECODIADE BICICLETA:" + kmVelocidade + "km");
        }
        return valorFinal;
    }

    @Override
    public boolean frear(boolean decisao) {
        if (decisao == true){
            System.out.println("Bicicleta freiada");
            valorFinal = 0;
        }
        else {
            System.out.println("Bicicleta em Andamento em andamento");
        }
        return decisao;
    }

    @Override
    public float obterVelocidade() {
        System.out.println("Velocidade Final Bicicleta: " + valorFinal + "km");
        return valorFinal;
    }


}

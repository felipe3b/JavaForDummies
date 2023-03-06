public class Empregados {
    private String nome;
    private String cargo;

    public void setNome(String nomeIn){
        nome = nomeIn;
    }

    public String getNome(){
        return nome;
    }

    public void setCargo (String cargoIn){
        cargo = cargoIn;
    }

    public String getCargo(){
        return cargo;
    }

    public void preencherCheque(String valorPago){
        System.out.printf("Pague em nome de %s", nome);
        System.out.printf("(%s) ***$", cargo);
        System.out.println(valorPago);
    }

}

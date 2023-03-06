public class Conta {
    private String nome;
    private String endereco;
    private double saldo;

    public String getNome(){
        return nome;
    }

    public void setNome(String n){
        nome = n;
    }

    public void setEndereco(String e) {
        endereco = e;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setSaldo(double s){
        saldo = s;
    }

    public double getSaldo(){
        return saldo;
    }

    public void display(){
        System.out.print(nome);
        System.out.print("(");
        System.out.print(endereco);
        System.out.print(") tem $");
        System.out.println(saldo);
    }

    public double getJuros(double taxaPercentual){
        return saldo * taxaPercentual / 100;
    }

}

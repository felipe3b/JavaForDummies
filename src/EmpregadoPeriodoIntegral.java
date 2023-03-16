public class EmpregadoPeriodoIntegral  extends Empregado {
    private double salarioSemanal;
    private double deducaoBeneficios;

    public void setSalarioSemanal (double salarioSemanalIn){
        salarioSemanal = salarioSemanalIn;
    }

    public double getSalarioSemanal(){
        return salarioSemanal;
    }

    public void setDeducaoBeneficios(double benefDedIn){
        deducaoBeneficios = benefDedIn;
    }

    public double getDeducaoBeneficios(){
        return deducaoBeneficios;
    }

    public double calcValorPagamento(){
        return salarioSemanal - deducaoBeneficios;
    }
}

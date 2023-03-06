public class EmpregadoMeioPeriodo extends Empregados{
    private double taxaHora;

    public void setTaxaHora(double taxaIn){
        taxaHora = taxaIn;
    }

    public double getTaxaHora(){
        return taxaHora;
    }

    public double calcValorPagamento(int horas){
        return taxaHora * horas;
    }
}

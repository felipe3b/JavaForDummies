import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {


        Scanner diskScanner = new Scanner(new File("D:\\OneDrive\\Mobile\\projetos\\JavaForDummies\\out\\production\\JavaForDummies\\EmpregadosInfo.txt"));
        System.out.println("--------Pagamento Empregado--------");
        for (int empNum = 1; empNum <= 3; empNum++) {
            pagarUmEmpregado(diskScanner);

        }

        Conta felipe = new Conta();
        felipe.setNome("Felipe Soares");
        felipe.setEndereco("Olindo Artmann 73");
        felipe.setSaldo(85.20);

        System.out.println("--------Dados da conta--------");
        System.out.println("Nome : " + felipe.getNome());
        System.out.println("Endereco : " + felipe.getEndereco());
        System.out.println("Saldo : $" + felipe.getSaldo());

        System.out.println("--------Informações do Correntista--------");
        felipe.display();

        System.out.println("--------Taxa de Juros--------");
        double suaTaxaJuros = 7.00;
        double seuValorJuros = felipe.getJuros(suaTaxaJuros);
        System.out.printf("$%4.2f\n", seuValorJuros);
        System.out.printf("$%5.3f\n", seuValorJuros);

        System.out.println("--------Fazer Folha --------");

        System.out.println("--->Empregado Periodo Integral");
        EmpregadoPeriodoIntegral piEmpregado = new EmpregadoPeriodoIntegral();
        piEmpregado.setNome("Felipe Soares");
        piEmpregado.setCargo("Boss");
        piEmpregado.setSalarioSemanal(5000.00);
        piEmpregado.setDeducaoBeneficios(500.00);
        String valorPagtoPi = String.valueOf(piEmpregado.calcValorPagamento());
        piEmpregado.preencherCheque(valorPagtoPi);

        System.out.println("--->Empregado Meio Periodo");
        EmpregadoMeioPeriodo mpEmpregado = new EmpregadoMeioPeriodo();
        mpEmpregado.setNome("Isabela Baumgart");
        mpEmpregado.setCargo("Hipe");
        mpEmpregado.setTaxaHora(7.53);
        String valorPagtoMp = String.valueOf(mpEmpregado.calcValorPagamento(10));
        mpEmpregado.preencherCheque(valorPagtoMp);



    }

    private static void pagarUmEmpregado(Scanner diskScanner) {
        Empregados umEmpregado = new Empregados();
        umEmpregado.setNome(diskScanner.nextLine());
        umEmpregado.setCargo(diskScanner.nextLine());
        umEmpregado.preencherCheque(diskScanner.nextLine());
//        diskScanner.nextLine();
    }





}

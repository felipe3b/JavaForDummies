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

        System.out.println("--->Empregado Meio Periodo Dobro");
        MeioPeriodoHorasEmDobro mpDobro = new MeioPeriodoHorasEmDobro();
        mpDobro.setNome("Damaris Baumgart");
        mpDobro.setCargo("Administrador");
        mpDobro.setTaxaHora(15);
        String pgtoDobro = String.valueOf(mpDobro.calcValorPagamento(50));
        mpDobro.preencherCheque(pgtoDobro);

        System.out.println("--------Usando a Classe Temperatura--------");
        final String format = "%5.2f graus %s\n";
        Temperatura temp = new Temperatura();
        temp.setNumero(70.0);
        temp.setEscala(EscalaTemp.FAHRENHEIT);
        System.out.printf(format, temp.getNumero(), temp.getEscala());

        temp = new Temperatura(2.01);
        System.out.printf(format, temp.getNumero(), temp.getEscala());

        temp = new Temperatura(EscalaTemp.CELSIUS);
        System.out.printf(format, temp.getNumero(), temp.getEscala());

        temp = new Temperatura(2.73, EscalaTemp.KELVIN);
        System.out.printf(format, temp.getNumero(), temp.getEscala());

        System.out.println("--------Usando a Classe TemperaturaAgradavel--------");
        TemperaturaAgradavel tempAgradavel = new TemperaturaAgradavel();
        tempAgradavel.setNumero(40.0);
        tempAgradavel.setEscala(EscalaTemp.CELSIUS);
        tempAgradavel.display();

        tempAgradavel =  new TemperaturaAgradavel(32.0);
        tempAgradavel.display();

        tempAgradavel = new TemperaturaAgradavel(EscalaTemp.KELVIN);
        tempAgradavel.display();

        tempAgradavel =  new TemperaturaAgradavel(2.73, EscalaTemp.KELVIN);
        tempAgradavel.display();


    }

    private static void pagarUmEmpregado(Scanner diskScanner) {
        Empregado umEmpregado = new Empregado();
        umEmpregado.setNome(diskScanner.nextLine());
        umEmpregado.setCargo(diskScanner.nextLine());
        umEmpregado.preencherCheque(diskScanner.nextLine());
//        diskScanner.nextLine();
    }





}

package parte_01;

public class BalancoTrimestral
{
    public static void main(String[] args)
    {
        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;
        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;

        System.out.println("Gastos do trimestre: " + gastosTrimestre);
        System.out.println("Media dos gastos: " + (gastosTrimestre/3));
    }
}

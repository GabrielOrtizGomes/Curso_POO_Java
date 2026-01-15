package Section_8__IntroducaoPOO.src.Entities;

public class CurrencyConverter {
    static final double IOF =0.06;

    public static Double calculateAmountToPayInBrazilianReais(Double priceDollar, Double amountDollar){
        return ((amountDollar * IOF) + amountDollar) * priceDollar;
    }

    public static void printAmountToPayInBrazilianReais(Double amountPayInBrazilianReais){
        System.out.printf("Amount to be paid in reais = %.2f", amountPayInBrazilianReais);
    }
}

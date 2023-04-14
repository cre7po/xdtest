package ru.javacore;
import ru.javacore.Tester;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        double salaryInUsd = 3000;
        double exchangeRate = 0.85;

        double salaryInEuro = Tester.convertToEuro(salaryInUsd, exchangeRate);
        Tester tester1 = new Tester("Ivan", "Taraskevich",3,"A1",3400.2);   
        tester1.printInfo("школа");
        tester1.printInfo("колледж");
        System.out.println("ЗП в евро: " + salaryInEuro);

    }
}

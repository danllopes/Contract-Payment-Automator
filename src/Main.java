import domain.entities.Contract;
import domain.entities.Installment;
import services.ContractService;
import services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try (var sc = new Scanner(System.in)) {
            System.out.println("""

                Confira o enunciado completo no arquivo PDF
                localizado no pacote 'documentação'.
                """);

            System.out.println("Enter contract details:");

            System.out.print("Contract Number: ");
            int number = sc.nextInt();

            System.out.print("Date (dd/MM/yyyy): ");
            sc.nextLine();
            LocalDate date = LocalDate.parse(sc.nextLine().trim(), DATE_FORMATTER);

            System.out.print("Contract Value: ");
            double value = sc.nextDouble();

            var contract = new Contract(number, date, value);

            System.out.print("Number of Installments: ");
            int installments = sc.nextInt();

            var contractService = new  ContractService(new PaypalService());
            contractService.processContract(contract, installments);

            System.out.println("\nInstallments:");

            for (Installment installment : contract.getInstallments()) {
                System.out.println(installment);
            }
        } catch (RuntimeException ex) {
            System.out.println("\nUnexpected error: " + ex.getMessage());
        }
    }
}
package services;

import domain.entities.Contract;
import domain.entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private final PaymentService paymentService;

    public ContractService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processContract(Contract  contract, int months) {
        final double monthlyInstallmentBase = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);

            double interest = paymentService.interest(monthlyInstallmentBase, i);
            double fee = paymentService.paymentFee(monthlyInstallmentBase + interest);
            double value = monthlyInstallmentBase + interest + fee;

            contract.getInstallments().add(new Installment(dueDate, value));
        }
    }
}

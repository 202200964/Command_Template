package Strategy;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias de estratégias
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456");
        PaymentStrategy paypalPayment = new PayPalPayment("joao@example.com");

        // Criando o contexto e associando uma estratégia
        PaymentContext context = new PaymentContext();

        // Realizando o pagamento com cartão de crédito
        context.setPaymentStrategy(creditCardPayment);
        context.processPayment(100);

        // Trocando a estratégia e realizando o pagamento via PayPal
        context.setPaymentStrategy(paypalPayment);
        context.processPayment(50);
    }
}

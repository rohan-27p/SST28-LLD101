import java.util.*;

public class CafeteriaSystem {

    private final Map<String, MenuItem> menu =new LinkedHashMap<>();

    private final BillingCalculator calculator;
    private final InvoicePrinter printer;
    private final InvoiceRepository repo;
    private int invoiceSeq = 1000;
    public CafeteriaSystem() {
        this.calculator =new BillingCalculator(new DefaultTaxPolicy(),new DefaultDiscountPolicyResolver());
        this.printer = new InvoicePrinter();
        this.repo = new InMemoryInvoiceRepository();
    }

    public void addToMenu(MenuItem i) {
        menu.put(i.id, i);
    }

    public void checkout(String customerType,List<OrderLine> lines) {
        String invId = "INV-" + (++invoiceSeq);
        double subtotal = 0.0;
        List<String> printableLines =new ArrayList<>();

        for (OrderLine l : lines) {

            MenuItem item = menu.get(l.itemId);
            double lineTotal = item.price * l.qty;
            subtotal += lineTotal;

            printableLines.add(
                String.format("- %s x%d = %.2f",item.name,l.qty,lineTotal));
        }
        Bill bill = calculator.compute(customerType,subtotal,lines.size());

        String invoice =printer.print(invId,printableLines,bill);

        System.out.print(invoice);
        repo.save(invId, invoice);

        System.out.println("Saved invoice: "+ invId+ " (lines="+ repo.countLines(invId)+ ")");
    }
}
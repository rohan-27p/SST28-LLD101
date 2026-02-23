import java.util.*;

public class InvoicePrinter {

    public String print(String invId,
                        List<String> lines,
                        Bill bill) {

        StringBuilder out = new StringBuilder();

        out.append("Invoice# ").append(invId).append("\n");

        for (String l : lines)
            out.append(l).append("\n");

        out.append(String.format("Subtotal: %.2f\n",
                                 bill.subtotal));
        out.append(String.format("Tax(%.0f%%): %.2f\n",
                                 bill.taxPct,
                                 bill.tax));
        out.append(String.format("Discount: -%.2f\n",
                                 bill.discount));
        out.append(String.format("TOTAL: %.2f\n",
                                 bill.total));

        return out.toString();
    }
}
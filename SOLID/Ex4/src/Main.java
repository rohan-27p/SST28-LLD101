import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Hostel Fee Calculator ===");

        BookingRequest req =
            new BookingRequest(
                LegacyRoomTypes.DOUBLE,
                List.of(AddOn.LAUNDRY,
                        AddOn.MESS)
            );

        HostelFeeCalculator calc =
            new HostelFeeCalculator();

        FeeBreakup fee =
            calc.calculate(req);

        ReceiptPrinter.print(
            req,
            fee.monthly,
            fee.deposit
        );

        FakeBookingRepo repo =
            new FakeBookingRepo();

        repo.save(
            "H-7781",
            req,
            fee.monthly,
            fee.deposit
        );
    }
}
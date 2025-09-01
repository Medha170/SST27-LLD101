import com.example.orders.*;

import java.util.ArrayList;
import java.util.List;

public class TryIt {
    public static void main(String[] args) {
        // Build order lines immutably
        OrderLine l1 = new OrderLine.OrderLineBuilder()
                .setSku("A")
                .setQuantity(1)
                .setUnitPriceCents(200)
                .build();

        OrderLine l2 = new OrderLine.OrderLineBuilder()
                .setSku("B")
                .setQuantity(3)
                .setUnitPriceCents(100)
                .build();

        List<OrderLine> lines = new ArrayList<>();
        lines.add(l1);
        lines.add(l2);

        // Build order immutably
        Order o = new Order.OrderBuilder("o2", "a@b.com", lines)
                .setDiscountPercent(10)
                .setExpedited(true)
                .setNotes("Priority order")
                .build();

        System.out.println("Total before discount: " + o.totalBeforeDiscount());
        //l1.setQuantity(999);
        System.out.println("Total after discount:  " + o.totalAfterDiscount());

        System.out.println("=> In the solution, totals remain stable due to defensive copies and immutability.");
    }
}

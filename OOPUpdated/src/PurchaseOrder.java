import java.util.*;

public class PurchaseOrder {
	int poNumber;
	Date orderDate;
	Date shipDate;
	boolean isShipped() {
		return (new Date()).after(this.shipDate);
	}
	
}

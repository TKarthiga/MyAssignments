package weekone.daytwo;

public class Tab {

	private int tabPrice(int tabPrice) {
return tabPrice;

	}
	private String tabBrand(String brandName) {
		return brandName;

	}
	public static void main(String[] args) {
		Tab t = new Tab();
		String brand = t.tabBrand("Lenovo");
		int price = t.tabPrice(15269);
		System.out.println(brand);
		System.out.println(price);

	}

}

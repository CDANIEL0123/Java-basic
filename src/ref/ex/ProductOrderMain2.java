package ref.ex;
public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] products = new ProductOrder[3];

        ProductOrder product1 = CreateProduct("두부", 2000, 2);
        products[0] = product1;

        ProductOrder product2 = CreateProduct("김치", 3000, 1);
        products[1] = product2;

        ProductOrder product3 = CreateProduct("콜라", 1500, 2);
        products[2] = product3;

        PrintOrder(products);
        System.out.println("최종가격 : "+getTotalAmount(products));
    }

    public static ProductOrder CreateProduct(String productName, int price, int quantity) {
        ProductOrder product1 = new ProductOrder();
        product1.productName = productName;
        product1.price = price;
        product1.quantity = quantity;
        return product1;
    }

    public static void PrintOrder(ProductOrder[] products){
        for( ProductOrder product_one : products) {
            System.out.println("상품명 : " + product_one.productName);
            System.out.println("품가격 : " + product_one.price);
            System.out.println("품수량 : " + product_one.quantity);
        }
    }

    public static int getTotalAmount(ProductOrder[] products) {
        int total = 0;
        for (int i = 0; i < products.length; i++) {
            total += products[i].price * products[i].quantity;
        }
        return total;
    }
}
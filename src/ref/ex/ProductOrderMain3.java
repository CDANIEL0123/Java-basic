package ref.ex;
import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력할 주문 개수를 입력하세요 : ");
        int n = scanner.nextInt();
        scanner.nextLine(); //입력 버퍼를 비우기 위한 코드


        ProductOrder[] products = new ProductOrder[n];

        for (int i = 0; i < products.length; i++) {
            System.out.println((i+1) + "번째 주문 정보를 입력하세요");
            System.out.println("상품명 : ");
            String productName = scanner.nextLine();

            System.out.println("품가격 : ");
            int price = scanner.nextInt();
            scanner.nextLine();

            System.out.println("품수량 : ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            products[i] = CreateProduct(productName,price,quantity);
        }

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
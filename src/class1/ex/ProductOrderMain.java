package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] products = new ProductOrder[2];

        ProductOrder toubu = new ProductOrder();
        toubu.productName = "두부";
        toubu.price = 2000;
        toubu.quantity = 2;
        products[0] = toubu;

        ProductOrder kimchi = new ProductOrder();
        kimchi.productName = "김치";
        kimchi.price = 5000;
        kimchi.quantity = 1;
        products[1] = kimchi;

        int totalprice = 0;

        for (ProductOrder product : products) {
            System.out.println("상품명 : " +product.productName + "가격 : " + product.price + "수량 : " + product.price);
            totalprice += product.price * product.quantity;
        }
        System.out.println("전체가격 : " + totalprice);
    }
}
package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전 : a = " + a);
        changPrimitive(a);
        System.out.println("메서드 호출 후 : a = " + a);
    }
    //자바는 항상 변수의 값을 복사해서 대입한다!!
    static void changPrimitive(int x ) { // a 에있는 값 20을 x로 복사해서 x값 선언 => x = 10
        //이떄까지 변수 a,x 둘다 10을 가짐
        x = 20; //a 10, x = 20임
    } // 메소드 끝나면 x는 제거됨
}

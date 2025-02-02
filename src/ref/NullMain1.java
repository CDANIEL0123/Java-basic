package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("data = " + data);

        data = new Data(); // x001생성 및 할당 / value는 자동으로 0으로 초기화됨
        System.out.println("data = " + data);

        data = null; //x001을 다시 참조하지 않음, x001의 최후 : "GC" (Garbage Collection)가 자동으로 지워줌
        System.out.println("data = " + data);
    }
}

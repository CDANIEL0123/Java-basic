package ref;

public class initMain {
    public static void main(String[] args) {
        initData Data = new initData(); //new로 인스턴스 만들면 자바가 다 직접 초기화해줌
        System.out.println(Data.value1); // 지정해주지않아도 0 으로 초기화 되어있음
        System.out.println(Data.value2);
    }
}

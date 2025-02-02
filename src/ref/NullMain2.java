package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10; //NullPointException
        System.out.println(data.value);
        //지역변수의 경우 null문제 파악 어렵지 않음
        
        // 멤버변수의경우 null 문제 파악 어려움 (NullMain3.java)
    }
}

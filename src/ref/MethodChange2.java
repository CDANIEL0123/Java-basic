package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전 : DATAa = " + dataA.value);
        System.out.println(dataA);
        changPrimitive(dataA); //dataA 주소값(X001A) 전달
        System.out.println("메서드 호출 후 : DATAa = " + dataA.value);
    }
    //자바는 항상 변수의 값을 복사해서 대입한다!! 여기선 참조값!@
    static void changPrimitive(Data datax ) { // dataA에 있는 주소값(참조값)을 datax로 복사해서 x값 선언 => datax = x001a
        datax.value = 20; //dataA와 dataX가 같은 참조값(주소값)을 가지니 해당 주소로 접근해서 변경하면 dataA도 변경됨
        System.out.println(datax);
    } // 메소드 끝나면 x는 제거됨
}

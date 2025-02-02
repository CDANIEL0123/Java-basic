package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA; //dataB에 dataA의 주소값을 넣는것

        System.out.println("dataA 참조값 : " + dataA); //주소값
        System.out.println("dataB 참조값 : " + dataB); //주소값
        System.out.println("dataA value값 : " + dataA.value); //실제값
        System.out.println("dataB value값 : " + dataB.value); //실제값

        dataA.value = 20;
        System.out.println("dataA 참조값 : " + dataA); //주소값
        System.out.println("dataB 참조값 : " + dataB); //주소값
        System.out.println("dataA value값 : " + dataA.value); //실제값
        System.out.println("dataB value값 : " + dataB.value); //dataB.value 값도 바뀐다! 둘다같은 x001을 참조하기때문
        //실제 메모리에 있는 값은 dataA.value 값을 A와 B가 둘다 참조하는것임

        dataB.value = 30; //B를 바꿔도 A와 같은 주소를 참조하기에 둘다 변경이 맞음
        System.out.println("dataA 참조값 : " + dataA); //주소값
        System.out.println("dataB 참조값 : " + dataB); //주소값
        System.out.println("dataA value값 : " + dataA.value); //실제값
        System.out.println("dataB value값 : " + dataB.value);
    }
}

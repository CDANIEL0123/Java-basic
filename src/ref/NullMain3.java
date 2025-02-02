package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData(); //x001
        System.out.println(bigData.count); //기본형이기에 0으로 선언됨 x001.count = 0
        System.out.println(bigData.data); //참조형이기에 null로 선언됨 x001.data = null

        //NuillPointException
        System.out.println(bigData.data.value); //null.value가 되기에 nullpointexception 오류발생
    }
}

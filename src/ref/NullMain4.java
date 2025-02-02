package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData(); //x001\
        bigData.data = new Data(); //bigdata.data = null이기에 이를 방지하기위한 주소 선언해줌
        System.out.println(bigData.count); //기본형이기에 0으로 선언됨 x001.count = 0
        System.out.println(bigData.data); // x001.data = 주소존재

        //NuillPointException
        System.out.println(bigData.data.value); //null.value가 되기에 nullpointexception 오류발생
    }
}

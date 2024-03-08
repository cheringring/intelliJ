package ch09.like;

import ch08.msg.AppUI;
import ch08.msg.Message;

public class LikeManager {

    int dataIndex;
    LikeData[] likeDatas = new LikeData[5]; // 8바이트씩 5개
    // 40바이트 쓰임.

    public void addLikeData(int count, int heart) {
        var likeData = new LikeData();
        likeData.setCount(count);
        likeData.setHeart(heart);
        // 본인이 관리하기 위해서는 본인의 arr에 넣어줘야함.
        if (likeDatas.length > dataIndex) {
            likeDatas[dataIndex++] = likeData;
        }
    }


    public void addLikeData(LikeData likeData) {
        likeDatas[dataIndex] = likeData;
        likeDatas[dataIndex].setHeart(8080);
        // 다시 세팅했다고 가정

    }

    public void printLikeData() {
        for (var data : likeDatas) {
            if (data != null) data.printData();
        }
    }

    public void swapLikeData(LikeData data1,LikeData data2){
        // data1 과 data2의 값을 서로 swap 해보자 .

        var likeData= new LikeData();
        LikeData tmp = null;
//
//        tmp=data1;
//        data1= data2;
//        data2 = tmp;
//+++++++++++++++++++
//count= 2  heart= 1
//+++++++++++++++++++++
//count= 4  heart= 3
        // 안 바껴짐 => 스택에 있는 주소만 바뀌고 스택 메모리에는
        // 그대로  박혀서 값이 변경되지 않는다.

      //  data2.setHeart(777); // 이것만 출력할때는 data2의 하트에 그대로 박힌다.

        //객체를 서로 교환할때는 deep carpy를 해야한다.
        int tmpCount = data1.count;
        int tmpHeart = data1.heart;

        data1.count= data2.count;
        data1.heart= data2.heart;

        data2.count = tmpCount;
        data2.heart=tmpHeart;

        // 주소말고 값을 swap 한다.
        // 객체의 참조변수를 서로 swap 하면
        // 스택 메모리 주소만 바뀌기 때문에
        // 힙 영역에서는 안바뀌기 때문에 이렇게 직접해줘야한다.
    }
}

        class AppUITT {
            public static void main(String[] args) {

                var manager = new LikeManager();
                manager.addLikeData(1, 9);

                var likeData = new LikeData();
                likeData.setCount(4);
                likeData.setHeart(99);
                manager.addLikeData(likeData);
                System.out.println("==================");
                likeData.printData(); //count= 4  heart= 8080
                System.out.println("==================");
                manager.printLikeData(); // count= 1  heart= 9
                                                      // count= 4  heart= 8080
                System.out.println("+++++++++++++++++++");
                // swap 코드

                var like1 = new LikeData();
                like1.setHeart(1);
                like1.setCount(2);

                var like2  = new LikeData();
                like2.setHeart(3);
                like2.setCount(4);

                // data1, data2 의 참조변수를 like1, like2로 명명한다.
                manager.swapLikeData(like1,like2);
                like1.printData();
                System.out.println("+++++++++++++++++++++");
                like2.printData();


            }
        }





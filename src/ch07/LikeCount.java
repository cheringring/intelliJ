package ch07;


// 속성을 가지면 다 객체이다.


// 좋아요를 선택시 LikeCount 객체가 생성된다고 가정
public class LikeCount {
   static int count; // 인스턴스 변수
 // static int로 변경

    int myCount;


    // 생성자 함수 = 클래스 이름과 함수 이름이 똑같다.
    // 근데 return 타입이 없다.~
    public LikeCount() {
       LikeCount.count++;  //변경                         // 변경
        myCount= LikeCount.count;
        System.out.println("like count number: " + LikeCount.count);
      // 한번 어사인 되면 더이상 주소가 바뀌지 않는다.
    }
}


    // static 함수
  ///  public static int getCount() {
        //  return count;  이렇게 하면 count는 인스턴스변수여서 안된다.
        //  return new LikeCount().count; 정 쓰고 싶으면 이렇게 써야됨.
        // static에서 인스턴스 변수는 new로 객체를 만들어야 쓸 수 있음.
  //  }


    class AppUI {
        public static void main(String[] args) {

            // 이미 static으로 했기때문에 new로 할당할 필요가 없다.

            // 인스턴스 변수 likeCnt1,2  = 스택에 저장됨.
            var likeCnt1= new LikeCount(); // LikeCount 객체는 Heap
            var likeCnt2= new LikeCount(); // 메모리에 저장됨.
            System.out.println("========================");
            System.out.println("1번 사람:"+ LikeCount.count);
            System.out.println("2번 사람:"+ LikeCount.count);

    // 내가 좋아요 했을 당시의 카운트

            System.out.println("==========================");
            System.out.println("1번 사람:"+likeCnt1.myCount);
            System.out.println("2번 사람:"+ likeCnt2.myCount);

        }
    }


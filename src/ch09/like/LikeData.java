package ch09.like;

public class LikeData {
    int count ;
    int heart;

    public void setCount(int count){
        this.count = count;


    }
    public void setHeart(int heart){
        this.heart = heart;
        // this 는 setCount를 의미한다.

    }

    public void printData(){
        System.out.println("count= "+count+"  heart= "+heart);
    }
}

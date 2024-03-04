package ch01;

public class IntegerTest {
    public static void main (String[] args) {
        int i = 10;
        Integer wi = new Integer(20);
        System.out.println(i);
        System.out.println(wi);


        Integer autoBoxed = i;
        int unBoxed = wi;

        int sum = autoBoxed + unBoxed;
        System.out.println(sum);


        long l = 9;
        long lw = new Long(9);

        IntegerTest.typeChecker(i);

    }

  public static void typeChecker(Object object){
      System.out.println(object.getClass().getName());

        }


    }


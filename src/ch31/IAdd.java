package ch31;

public interface IAdd {
    int add(int x, int y);
}

class Main__{
    public static void main(String[] args) {
        IAdd iAdd = new IAdd() {
            @Override
            public int add(int x, int y) {
                return x*y ;
            }
        };
        iAdd.add(3,5);

        IAdd iAdd1Rambda = (x,y) -> x/y;
        var result = iAdd1Rambda.add(7,4);
        System.out.println(result);
    }

}
package ch09.shoppingMall;

class  Product {
    String name;
    String code;



    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public void printInfo(){
        System.out.println(name+":"+code);

    }

}

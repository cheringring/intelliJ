package ch09.shoppingMall;

class AppMall {
    public static void main(String[] args) {

        var kimchi = new Product();
        kimchi.setName("김치");
        kimchi.setCode("kin12392");

        var snack = new Product();
        snack.setCode("snack203013");
        snack.setName("과자");

        var warehouse = new WareHouse();
        warehouse.setAddr("부산");
        warehouse.addProduct(kimchi);
        warehouse.addProduct(snack);

        var company = new Company();
        company.setName("체은상사");
        company.setWareHouse(warehouse);

        //회원가입

        var customer= new Customer();
        customer.setName("체은");
        customer.setAddr("경산");

       var  isOrderOk = customer.orderNow(company,kimchi);
        if (isOrderOk){
            System.out.println("주문 완료, 감사합니다 \n 다음에 또 만나요!");
            warehouse.printInfo();
        }

        else System.out.println("시스템이 작동하지 않습니다.");
    }
}

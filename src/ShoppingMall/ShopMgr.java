package ShoppingMall;

public class ShopMgr {


    class RoyalCustomer {

        private int discount;
        private int bonus;


        private Customer customer;
        public RoyalCustomer(Customer customer){
            this.customer=customer;
        }

        public Customer getCustomer() {
            return customer;
        }

        public void setCustomer(Customer customer) {
            this.customer = customer;
        }

        public void BuyDiscount(Shop.Product product, double PdDiscount){
            int price = product.getPrice();
            PdDiscount = price- (price * 0.05);


            System.out.println(customer.getID()+"\n 구입한 상품: "+product.getName()+"\n 가격(-5%):  "+ PdDiscount+"원" );
        }

        public void addBonus(Shop.Product product,Grade grade, double PdBonus){
            int price = product.getPrice();
            double point = grade.getPoint();
            PdBonus =price+( price *0.05) ;
            System.out.println("포인트 적립은 "+PdBonus+"원 (충성 고객 우대+5%) 입니다.");

        }
    }


    class NormalCustomer{


        private int discount;
        private int plusBonus;

        private Customer customer;

        public NormalCustomer(Customer customer){
            this.customer=customer;
        }

        public Customer getCustomer() {
            return customer;
        }

        public void setCustomer(Customer customer) {
            this.customer = customer;
        }




    }


}

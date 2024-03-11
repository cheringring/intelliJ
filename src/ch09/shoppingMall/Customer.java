package ch09.shoppingMall;

public class Customer {

    String name;
    String addr;

    public boolean orderNow(Company company, Product product) {
        return company.reciveOrder(this,product);
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void setName(String name) {
        this.name= name;

    }
}



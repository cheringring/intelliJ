package ch09.shoppingMall;

class Company {
    String name;
    String addr;
    WareHouse wareHouse;


    public void setName(String name){
        this.name= name;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void setWareHouse(WareHouse wareHouse) {
        this.wareHouse= wareHouse;
    }

    public boolean reciveOrder(Customer customer, Product product){

        return wareHouse.shipProduct(customer,product);


    }
}

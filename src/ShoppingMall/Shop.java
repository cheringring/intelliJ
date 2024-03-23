package ShoppingMall;

public class Shop {
    String name;
    String addr;

    public Shop(String name){
        this(name,"null");
    }
    public Shop(String name,String addr){
        this.name= name;
        this.addr= addr;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    class Product {
        private int price;
        private String name;
        private String PdCode;


        public Product(String name,int price,String PdCode){
            this.name=name;
            this.price=price;
            this.PdCode=PdCode;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPdCode() {
            return PdCode;
        }

        public void setPdCode(String pdCode) {
            PdCode = pdCode;
        }
    }

}

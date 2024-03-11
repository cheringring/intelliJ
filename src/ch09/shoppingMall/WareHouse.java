package ch09.shoppingMall;

public class WareHouse {
    String addr;
    Product [] products = new Product[2];
    int productIdx;


    public void setAddr(String addr) {
        this.addr = addr;
    }



    public void addProduct(Product product) {
        if(products.length>productIdx){
            products[productIdx++] = product;
        }
    }


final int UN_KNOWN_PRODUCT= -1;
   int findProduct(String code) {

       for (var index=0; index < productIdx; index++) {
           if (products[index].code.equals(code))
               return index;
       }
       return UN_KNOWN_PRODUCT;
   }

   public boolean shipProduct(Customer customer,Product product) {

       //boolean isAvailable = findProduct(product.code);
       var findIndex = findProduct(product.code);
       if (findIndex > UN_KNOWN_PRODUCT) {
           System.out.println(customer.name + "에게" + product.name + "을 배송하였습니다.");
           removeProduct(findIndex);
           return true;
       }
       else System.out.println("상품이 없습니다.");
       return false;
       }
//
//        if(isAvailable) System.out.println(customer.name+"에게"
//                + product.name+"을 배송하였습니다.");
//        // product에 있는 애를 삭제해야한다
//
//        else System.out.println("배송에 실패하였습니다.");


        void removeProduct (int removeIndex) {
            Product[] newProducts = new Product[products.length - 1];
            for (int i = 0, j = 0; i < newProducts.length; i++) {
                if (i != removeIndex) newProducts[j++] = products[i];

            }
            products = newProducts;
        }


        public void printInfo() {
                for(var product : products) product.printInfo();
        }
        }
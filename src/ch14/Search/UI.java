package ch14.Search;

public class UI {
    public static void main(String[] args) {

        var service = new RepositoryService();
        service.addCustomer("toss@gmail.com");
        // service가 db가 add 가 됨.


        System.out.println(service.findCustomer("toss@gmail.com"));

        System.out.println(service.findCustomer("steve@gmail.com"));


    }
}

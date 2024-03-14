package ch14.Search;

import ch14.Search.Customer;

 class RepositoryService {

     public void addCustomer(String email, String name) {
         Repository.addCustomer(email, name);

     }

     public void addCustomer(String email) {
         Repository.addCustomer(email);

     }

     public Customer findCustomer(String email) {
         return Repository.findCustomer(email);

     }
 }

package ch19;


import java.util.Set;



// 이렇게 연관성이 있는거만. !
public class AddressBook {


    private int addressCount;
    private Set<Address> addresses;


    public int getAddressCount() {
        return addressCount;
    }

    public void setAddressCount(int addressCount) {
        this.addressCount = addressCount;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    public void setAddresses(String name, String phoneNumber) {
        addresses.add(new Address(name, phoneNumber));
    }


    // 중첩클래스 inner class
     private static class Address{

        String name;
        String phoneNumber;

        void setAdderssCount(){
           // addressCount = 9;
        }

        public Address(String name, String phoneNumber) {
            this.name= name;
            this.phoneNumber= phoneNumber;

             }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "name='" + name + '\'' +
                    ", phoneNumber='" + phoneNumber + '\'' +
                    '}';
        }

        //AddressBook.this.addressCount= 9;
     }



}

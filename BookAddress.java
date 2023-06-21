package com.bookaddress;
import java.util.ArrayList;
import java.util.List;
public class BookAddress {



        public String name;
        public String address;
        public String city;
        public String state;

        public BookAddress(String name, String address, String city, String state) {
            this.name = name;
            this.address = address;
            this.city = city;
            this.state = state;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "name='" + name + '\'' +
                    ", address='" + address + '\'' +
                    ", city='" + city + '\'' +
                    ", state='" + state + '\'' +
                    '}';
        }
    }

    class AddressBook{
        private List<BookAddress> addressList;

        public AddressBook(){
            addressList = new ArrayList<>();
        }
        public void addDetails(BookAddress address){
            addressList.add(address);
        }

        public List<BookAddress> getAddressList(){
            return addressList;
        }

        public static void main(String[] args) {
            BookAddress address1 = new BookAddress("Goutham","Banglore","bang","jhgfd");
            BookAddress address12 = new BookAddress("Roshan","Kolar","mano","jwerd");
            AddressBook addressBook = new AddressBook();
            addressBook.addDetails(address1);
            addressBook.addDetails(address12);
            List<BookAddress> addressList1 = addressBook.getAddressList();
            System.out.print(addressList1);
        }
    }

    


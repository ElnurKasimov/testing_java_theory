package SoftServe.Sprint3.Quiz10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;

public class AddressBook implements Iterable{
    private NameAddressPair[] addressBook;
    private int counter;

    public AddressBook(int capacity) {
        this.addressBook = new NameAddressPair[capacity];
    }

    public  boolean create(String firstName, String lastName, String address) {
        boolean isExist = false;
        if (size() == 0) {
            AddressBook.NameAddressPair.Person newPerson = new AddressBook.NameAddressPair.Person(firstName, lastName);
            AddressBook.NameAddressPair newPair = new AddressBook.NameAddressPair(newPerson, address);
            addressBook[counter] = newPair;
            counter++;
            if (counter==addressBook.length) {
                AddressBook.NameAddressPair[] temporary = addressBook;
                addressBook = Arrays.copyOf(temporary, size() * 2);
            }
            return true;
        } else {
            for (int i = 0; i < size(); i++) {
                if (addressBook[i].getPerson().firstName.equals(firstName) &&
                        addressBook[i].getPerson().lastName.equals(lastName)) isExist = true;
            }
            if (!isExist) {
                AddressBook.NameAddressPair.Person newPerson = new AddressBook.NameAddressPair.Person(firstName, lastName);
                AddressBook.NameAddressPair newPair = new AddressBook.NameAddressPair(newPerson, address);
                addressBook[counter] = newPair;
                counter++;
                if (counter == addressBook.length) {
                    AddressBook.NameAddressPair[] temporary = addressBook;
                    addressBook = Arrays.copyOf(temporary, size() * 2);
                }
                return true;
            }
        }
        return false;
    }

    public  String read(String firstName, String lastName) {
        for( int i = 0; i < size(); i++) {
            if (addressBook[i].getPerson().firstName.equals(firstName) &&
                    addressBook[i].getPerson().lastName.equals(lastName)) {
                return addressBook[i].getAddress();
            }
        }
        return null;
    }

    public  boolean update(String firstName, String lastName, String address) {
        for( int i = 0; i < size(); i++) {
            if (addressBook[i].getPerson().firstName.equals(firstName) &&
                    addressBook[i].getPerson().lastName.equals(lastName)) {
                addressBook[i] = new AddressBook.NameAddressPair(new NameAddressPair.Person(firstName, lastName), address);
                return true;
            }
        }
        return false;
    }

    public  boolean delete(String firstName, String lastName) {
        for( int i = 0; i < size(); i++) {
            if (addressBook[i].getPerson().firstName.equals(firstName) &&
                    addressBook[i].getPerson().lastName.equals(lastName)) {
                if (size() - 1 - i >= 0) System.arraycopy(addressBook, i + 1, addressBook, i, size() - 1 - i);
                addressBook[size()-1] = null;
                counter--;
                return true;
            }
        }
        return false;
    }

    public int size() {
        return counter;
    }

    public void sortedBy(SortOrder order) {
        if( order.name().equals("ASC") ) {
            Comparator<NameAddressPair> myCustomComparator = new  Comparator<>() {
                @Override
                public int compare (NameAddressPair  o1, NameAddressPair o2){
                    if (o1 == null && o2 == null) {
                        return 0;
                    } else if (o1 == null) {
                        return 1;
                    } else if (o2 == null) {
                        return 1;
                    } else {
                        if ( (o1.getPerson().firstName.compareTo(o2.getPerson().firstName)) > 0) return 1;
                        if ( (o1.getPerson().firstName.compareTo(o2.getPerson().firstName)) < 0) return -1;
                        if ( (o1.getPerson().lastName.compareTo(o2.getPerson().lastName)) > 0) return 1;
                        if ( (o1.getPerson().lastName.compareTo(o2.getPerson().lastName)) < 0) return -1;
                        return 0;
                    }
                }
            };
            Arrays.sort ( addressBook, myCustomComparator);
        } else {
            Comparator<NameAddressPair> myCustomComparator = new  Comparator<>() {
                @Override
                public int compare (NameAddressPair  o1, NameAddressPair o2){
                    if ( (o1.getPerson().firstName.compareTo(o2.getPerson().firstName)) > 0) return -1;
                    if ( (o1.getPerson().firstName.compareTo(o2.getPerson().firstName)) < 0) return 1;
                    if ( (o1.getPerson().lastName.compareTo(o2.getPerson().lastName)) > 0) return -1;
                    if ( (o1.getPerson().lastName.compareTo(o2.getPerson().lastName)) < 0) return 1;
                    return 0;
                }
            };
            Arrays.sort ( addressBook, 0, size()-1, myCustomComparator);

        }
    }

    public AddressBookIterator iterator() {
        return new AddressBookIterator();
    }

    private class AddressBookIterator  implements Iterator {
        private int counter=4 ;

        public boolean hasNext() {
            return counter < size();
        }
        public String next() {
            NameAddressPair returnedPair =  addressBook[counter];
            counter++;
            return "First name: " + returnedPair.person.firstName +
                    ", Last name: "  + returnedPair.person.lastName +
                    ", Address: " + returnedPair.address + ".";
        }
    }

    private static class NameAddressPair {
        private final Person person;
        private final String address;

        private NameAddressPair(Person person, String address) {
            this.person = person;
            this.address = address;
        }

        public Person getPerson() {return person;}

        public String getAddress() {return address;}



        private static class Person {
            private final String firstName;
            private final String lastName;

            private Person (String firstName, String lastName) {
                this.firstName = firstName;
                this.lastName = lastName;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Person person = (Person) o;
                return firstName.equals(person.firstName) && lastName.equals(person.lastName);
            }

            @Override
            public int hashCode() {
                return Objects.hash(firstName, lastName);
            }

            @Override
            public String toString() {
                return "Person{" +
                        "firstName='" + firstName + '\'' +
                        ", lastName='" + lastName + '\'' +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "{FirstName: " + person.firstName +
                    ", LastName: " + person.lastName +
                    ", Address='" + address + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook(4);
        addressBook.create("John", "Brown", "Address #1");
        addressBook.create("Susan", "Brown", "Address #4");
        addressBook.create("Karen", "Davis", "Address #2");
        addressBook.create("John", "Taylor", "Address #1");
        addressBook.sortedBy(SortOrder.ASC);


    }
}

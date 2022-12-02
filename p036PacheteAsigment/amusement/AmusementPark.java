package p036PacheteAsigment.amusement;

import p036PacheteAsigment.people.Person;

import java.util.ArrayList;

public class AmusementPark {
    ArrayList<Person> people = new ArrayList<>();

    public void greetCustomer(Person customer){
        System.out.println("Salut, "+customer);
    }
}

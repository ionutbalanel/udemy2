package p036PacheteAsigment.amusement;

import p036PacheteAsigment.people.Person;

public class DisneyLand extends AmusementPark{
    @Override
    public void greetCustomer(Person customer) {
        System.out.println("Bun venit la parcul de distractii DisneyLand");
        customer.saluta();
    }
}

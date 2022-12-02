package p040AbstractizareExercitii1;

public class SalesPerson {
    public MusicalInstrument sellInstrument(String instrumentDorit){
        if (instrumentDorit.equalsIgnoreCase("guitar")){
            return new Guitar();
        } else if (instrumentDorit.equalsIgnoreCase("piano")) {
            return new Piano();
        } else if (instrumentDorit.equalsIgnoreCase("saxophone")) {
            return new Saxophone();
        }else {
            System.out.println("Nu avem acest tip de instrument");
            return  null;
        }
    }
}

package p038IncapsulareGetterSiSetterExercitii.videoulAnterior;

public class Aplicatie {
    public static void main(String[] args) {


        User user = new User("abcdefg","passwordTest1234");
        System.out.println(user);

//        String usernameulUserului = user.getUsername();
//        user.setUsername("inv");
//        System.out.println(user);

//        user.setPassword("dfdgfgfdfgdgsdsdsds");
//        System.out.println(user);
        user.addProductToCart("Pantaloni");
        user.addProductToCart("Adidasi");
        user.addProductToCart("Geaca");

        System.out.println(user.getProductsInCart());
//        System.out.println();
//        for (String s : user.getProductsInCart()) {
//            System.out.println(s);
//        }

        user.removeProductFromCart("Geaca");

        System.out.println(user.getProductsInCart());



//        1.Modificați funcționalitate aplicației noastre
//        Parola trebuie de asemenea verificată.
//        Trebuie să conțină minim două cifre în structura ei.
//        Testați funcționalitatile
//
//        2.Modificați funcționalitatea aplicații noastre:
//        Parola trebuie de asemenea să fie din minim 5 cifre.
//        Testați funcționalitățile.
//
//        3.Modificați funcționalitatea aplicații noastre:
//        Userul va avea o listă de tip String, numită productsInCart.
//        Singura modalitate de a accesa lista respectivă va fi prin metodele addProductToCart(String product),
//        removeProductFromCart(String product) si printCart().
//        Testați funcționalitățile




    }
}

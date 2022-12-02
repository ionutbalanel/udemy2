package p020MostenirePartea2;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("454545112150554", 400);
        phone.call();
        phone.showDetails();

        Smartphone smartphone = new Smartphone("02454545545", 1000);
        smartphone.takeScreenShot();
        smartphone.showDetails();
        smartphone.call();
        smartphone.playVideo();
        smartphone.takePicture();

        Cellular cellular = new Cellular("07871521212", 1000);
        cellular.showDetails();
        cellular.call();
        cellular.playVideo();
        cellular.takePicture();

        DeskPhone deskPhone = new DeskPhone("04545424245", 250);
        deskPhone.showDetails();
        deskPhone.call();

        Samsung samsung = new Samsung("04545452121", 1200);
        samsung.takeScreenShot();
        samsung.showDetails();
        samsung.call();
        samsung.playVideo();
        samsung.takePicture();

        IPhone iPhone = new IPhone("0454545755454", 1500);
        iPhone.takeScreenShot();
        iPhone.showDetails();
        iPhone.call();
        iPhone.playVideo();
        iPhone.takePicture();

        Motorola motorola = new Motorola("0454575451212", 520, false);
        motorola.showDetails();
        motorola.call();
        motorola.playVideo();
        motorola.takePicture();
        motorola.closeClap();
        motorola.closeClap();
        motorola.closeClap();
        motorola.closeClap();

        Nokia nokia = new Nokia("045454554", 4100);
        nokia.showDetails();
        nokia.call();
        nokia.playVideo();
        nokia.takePicture();

        Panasonic panasonic = new Panasonic("021247575", 470);
        panasonic.showDetails();
        panasonic.call();
        panasonic.playPolytone();

        Cisco cisco = new Cisco("121214575055", 654);
        cisco.call();
        cisco.showDetails();
        cisco.sendFax();

//        1.Scrieți o superclasă Phone care să fie moștenită de următoarele clase: Smartphone,
//        Cellular și DeskPhone.


//        2.Scrieți în clasa Phone două câmpuri comune price și number, și metodele call()
//        si showDetails(). Aceasta din urmă să afișeze la consolă detalii despre telefon, folosind
//        câmpurile.


//        3.Scrie câte alte două clase care să moștenească copiii clasei Phone: Samsung, IPhone,
//        Nokia, Motorola, Panasonic și Cisco.

//        4.Scris metodele următoare în clasele corespunzătoare:takeScreenShot(), takePicture(),
//        playVideo(), closeClap(), playPolytone(), sendFax() si totodată moșteniți și
//        din clasele de mai sus. (Observați ce puteți mosteni si de unde).

    }
}

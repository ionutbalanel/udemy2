package p044InterfeteExercitii2.video2;

public class iPhone implements SmartphoneBehavior{
    @Override
    public void takeScreenshot() {
        System.out.println("Iphon-ul a facut un screenshot");
    }

    @Override
    public void downloadAppFromStore(String appName) {
        System.out.println("Iphon-ul a descarcat aplicatia "+appName+" din iStore");
    }

    @Override
    public void call(String telephoneNumber) {
        System.out.println("Iphon-ul a sunat numarul "+telephoneNumber);
    }

    @Override
    public void charge() {
        System.out.println("Iphon-ul este incarcat");
    }
}

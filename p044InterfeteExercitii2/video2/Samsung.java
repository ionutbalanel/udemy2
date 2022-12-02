package p044InterfeteExercitii2.video2;

public class Samsung implements SmartphoneBehavior{
    @Override
    public void takeScreenshot() {
        System.out.println("Samsung-ul a facut un screenshot");
    }

    @Override
    public void downloadAppFromStore(String appName) {
        System.out.println("Samsung-ul a descarcat aplicatia "+appName+" din gStore");
    }

    @Override
    public void call(String telephoneNumber) {
        System.out.println("Samsung-ul a sunat numarul "+telephoneNumber);
    }

    @Override
    public void charge() {
        System.out.println("Samsung-ul este incarcat");
    }
}

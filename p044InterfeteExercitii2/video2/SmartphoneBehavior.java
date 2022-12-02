package p044InterfeteExercitii2.video2;

public interface SmartphoneBehavior extends TelephoneBehavior{
    void takeScreenshot();
    void downloadAppFromStore(String appName);
}

package p014StaticVsNonStaticExercitii2;

public class ChromeTab {
    static String history = "";
    String currentSiteName;

    public void changeCurrentSite(String newSite) {
        System.out.println("Am schimbat siteul");
        currentSiteName = newSite;
        history += " " + newSite + " ";
    }
}

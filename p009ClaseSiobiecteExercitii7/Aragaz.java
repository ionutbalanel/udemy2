package p009ClaseSiobiecteExercitii7;

public class Aragaz {

    boolean isGasConnected;
    boolean eyeOneIsLit;
    boolean eyeTwoIsLit;
    boolean eyeThreeIsLit;
    boolean eyeFourIsLit;


    public void coupleGas() {
        if (isGasConnected) {
            System.out.println("Gazul este deja conectat");
        } else {
            isGasConnected = true;
            System.out.println("Gazul a fost conectat");
        }
    }

    public void decoupleGas() {
        if (isGasConnected) {
            isGasConnected = false;
            System.out.println("Gazul a fost decuplat");
        } else {
            System.out.println("Gazul deja este deconectat");
        }
    }

    public void pressFirstEyeButton() {
        if (eyeOneIsLit) {
            System.out.println("Ochiul 1 a fost stins");
            eyeOneIsLit = false;
        } else {
            if (isGasConnected){
                System.out.println("Ochiul 1 a fost Aprins");
                eyeOneIsLit = true;
                securityCheck();
            }else {
                System.out.println("Gazul nu este conectat.");
            }
        }
    }

    public void pressSecondEyeButton() {
        if (eyeTwoIsLit) {
            System.out.println("Ochiul 2 a fost stins");
            eyeTwoIsLit = false;
        } else {
            if (isGasConnected){
                System.out.println("Ochiul 2 a fost Aprins");
                eyeTwoIsLit = true;
                securityCheck();
            }else {
                System.out.println("Gazul nu este conectat.");
            }
        }

    }

    public void pressThirdEyeButton() {
        if (eyeThreeIsLit) {
            System.out.println("Ochiul 3 a fost stins");
            eyeThreeIsLit = false;
        } else {
            if (isGasConnected){
                System.out.println("Ochiul 3 a fost Aprins");
                eyeThreeIsLit = true;
                securityCheck();
            }else {
                System.out.println("Gazul nu este conectat.");
            }
        }
    }

    public void pressForthEyeButton() {
        if (eyeFourIsLit) {
            System.out.println("Ochiul 41 a fost stins");
            eyeFourIsLit = false;
        } else {
            if (isGasConnected){
                System.out.println("Ochiul 4 a fost Aprins");
                eyeFourIsLit = true;
                securityCheck();
            }else {
                System.out.println("Gazul nu este conectat.");
            }
        }
    }

    public void securityCheck() {
        if (eyeOneIsLit && eyeTwoIsLit && eyeThreeIsLit && eyeFourIsLit) {
            System.out.println("WARNING. Am stins aragazul si am decuplat gazul");
            eyeOneIsLit=false;
            eyeTwoIsLit=false;
            eyeThreeIsLit=false;
            eyeFourIsLit=false;
            decoupleGas();
        }
    }
}

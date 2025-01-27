public class Calculator {
    private String affichNbr = "0";
    private double firstOperation = 0.0;
    private double secondOperation = 0.0;
    public String operation = null;

    public double addition(double firstOperation, double secondOperation) {
        return firstOperation + secondOperation;
    }

    public double soustrac(double firstOperation, double secondOperation) {
        return firstOperation - secondOperation;
    }

    public double multi(double firstOperation, double secondOperation) {
        return firstOperation * secondOperation;
    }

    public double divise(double firstOperation, double secondOperation) {
        //Gestion des erreurs
        if (secondOperation == 0) {
            System.out.println("is NaN");
        }
        return firstOperation / secondOperation;
    }

    public double modulo(double firstOperation, double secondOperation) {
        //Gestion des erreurs
        if (firstOperation == 0 && secondOperation == 0) {
            System.out.println("is NaN");
        }
        return firstOperation % secondOperation;
    }

    // Calcule 2 nombres avec divers opérateurs tant qu'une opération est effectuée
    public String isEqual(String operation) {
        switch (operation) {
            case "addition":
                affichNbr = "" + addition(firstOperation, secondOperation);
                break;
            case "soustrac":
                affichNbr = "" + soustrac(firstOperation, secondOperation);
                break;
            case "multi":
                affichNbr = "" + multi(firstOperation, secondOperation);
                break;
            case "divise":
                affichNbr = "" + divise(firstOperation, secondOperation);
                break;
            case "modulo":
                affichNbr = "" + modulo(firstOperation, secondOperation);
                break;
            default:
                System.out.println("Erreur");
        }

        return affichNbr;
    }
}

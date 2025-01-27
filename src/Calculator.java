public class Calculator {
    private String affichNbr = "0";
    private String operation = null;
    private double firstOperation = 0.0;

    // MAJ la variable affichNbr pour afficher le chiffre saisi
    public String isDigit(int digit) {
        affichNbr = affichNbr.equals("0") ? Integer.toString(digit) : affichNbr + Integer.toString(digit);
        return affichNbr;
    }

    // Enregistre un 1er nombre (double) puis un opérateur
    public String isOperateur(String operator) {
        firstOperation = Double.parseDouble(affichNbr);
        affichNbr = "0";
        operation = operator;
        return affichNbr;
    }

    // Calcule 2 nombres avec divers opérateurs tant qu'une opération est effectuée
    public String isEqual() {
        double secondOperation = Double.parseDouble(affichNbr);
        switch (operation) {
            case "+":
                affichNbr = Double.toString(firstOperation + secondOperation);
                break;
            case "-":
                affichNbr = Double.toString(firstOperation - secondOperation);
                break;
            case "*":
                affichNbr = Double.toString(firstOperation * secondOperation);
                break;
            case "/":
                affichNbr = Double.toString(firstOperation / secondOperation);
                break;
            case "%":
                affichNbr = Double.toString(firstOperation % secondOperation);
                break;
            default:
                affichNbr = affichNbr;
                break;
        }
        operation = null;
        return affichNbr;
    }

    // Remet les premiers enregistrements à zéro
    public String isClear() {
        affichNbr = "0";
        firstOperation = 0.0;
        operation = null;
        return affichNbr;
    }
}

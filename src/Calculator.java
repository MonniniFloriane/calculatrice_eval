public class Calculator {
    private String affichNbr       = "0";
    private double firstOperation  = 0.0;
    private double secondOperation = 0.0;
    public String operation        = null;

    public double addition(double firstOperation, double secondOperation) {
        var addiction = firstOperation + secondOperation;
        return Math.round(addiction);
    }

    public double soustrac(double firstOperation, double secondOperation) {
        var soustrac = firstOperation - secondOperation;
        return Math.round(soustrac);
    }

    public double multi(double firstOperation, double secondOperation) {
        var multi = firstOperation * secondOperation;
        return Math.round(multi);
    }

    public double divise(double firstOperation, double secondOperation) {
        var divis = firstOperation / secondOperation;
        //Gestion des erreurs
        if (firstOperation == 0 && secondOperation == 0) {
            System.out.println("is NaN");
        } else {
            return Math.round(divis);
        }
        return Math.round(divis);
    }

    public double modulo(double firstOperation, double secondOperation) {
        var modulo = firstOperation % secondOperation;
        //Gestion des erreurs
        if (firstOperation == 0 && secondOperation == 0) {
            System.out.println("is NaN");
        } else {
            return Math.round(modulo);
        }

        return Math.round(modulo);
    }

    // Calcule 2 nombres avec divers opérateurs tant qu'une opération est effectuée
    public String isEqual(String operation) {
        if (operation == "+") {
            affichNbr = String.valueOf(addition(firstOperation, secondOperation));
        } else if (operation == "-") {
            affichNbr = String.valueOf(soustrac(firstOperation, secondOperation));
        } else if (operation == "*") {
            affichNbr = String.valueOf(soustrac(firstOperation, secondOperation));
        } else if (operation == "/") {
            affichNbr = String.valueOf(divise(firstOperation, secondOperation));
        } else if (operation == "%") {
            affichNbr = String.valueOf(modulo(firstOperation, secondOperation));
        } else {
            System.out.println("Error");
        }
        return operation;
    }
}

public class Calculator {
    private double firstOperation = 0.0;
    private double secondOperation = 0.0;

    public double addition(double firstOperation, double secondOperation) {
        var addiction = firstOperation + secondOperation;
        return addiction;
    }

    public double soustrac(double firstOperation, double secondOperation) {
        var soustrac = firstOperation - secondOperation;
        return soustrac;
    }

    public double multi(double firstOperation, double secondOperation) {
        var multi = firstOperation * secondOperation;
        return multi;
    }

    public double divise(double firstOperation, double secondOperation) {
        var divis = firstOperation / secondOperation;
        return divis;
    }

    public double modulo(double firstOperation, double secondOperation) {
        var modulo = firstOperation % secondOperation;
        return modulo;
    }
}

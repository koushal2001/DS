import CalculatorModule.CalculatorPOA;

class CalculatorImpl extends CalculatorPOA{
    CalculatorImpl(){
        super();
        System.out.println("Calculator Object Created\n");
    }

    public double add(double d1, double d2){
        return (d1+d2);
    }

    public double sub(double d1, double d2){
        return (d1-d2);
    }
}
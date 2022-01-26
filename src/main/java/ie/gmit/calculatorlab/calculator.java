package ie.gmit.calculatorlab;

public class calculator
{
    int firstNumber;
    int secondNumber;

    public calculator(int firstNumber, int secondNumber)
    {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int add()
    {
        int total = firstNumber + secondNumber;
        return total;
    }
}

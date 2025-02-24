package org.example;

public class Calculator<T extends Number>
{

    private T[] a;

    public Calculator(T[] a)
    {
        this.a = a;
    }

    public double average()
    {
        double sum = 0;

        double length = a.length;

        for(int i = 0; i < a.length; i++)
        {
            sum += a[i].doubleValue();
        }

        return sum / length;
    }
}


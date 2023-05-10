package com.example.oop9.lab4;

public class Main {
    public final static double t = 2.2, start = 0.2, finish = 2.0, step = 0.004;
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    private void run() {
        double[] x = madeArrayOfX(start,finish,step);
        double[] y = madeArrayOfY(x);
        int max = maxElement(y);
        int min = minElement(y);
        printMinMaxElement(max,min,x,y);
        printSumElement(y);
    }

    private void printSumElement(double[] y) {
        double s =sumElements(y);
        double a = arifSumElements(y);
        System.out.println("Сума: "+s);
        System.out.println("Середнє арифметичне: "+a);
    }
    public double tabulation(double x) {
        if(x<=0.9+1e-9) {
            return (Math.log(Math.pow(x+Math.pow(x,2),2)))/Math.sqrt(x+t);
        } else {
            double cos = Math.cos(x)+t*Math.pow(Math.sin(x),2);
            return cos;
        }
    }
    public int сountSteps(double start, double finish, double step) {
        return (int) Math.round((finish-start)/step)+1;
    }
    public double[] madeArrayOfX(double start, double finish, double step) {
        int size = сountSteps(start,finish,step);
        double[] array = new double[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = start + i * step;
        }
        return array;
    }
    public double[] madeArrayOfY(double[] arrayX) {
        double[] arrayY = new double[arrayX.length];
        for (int i = 0; i < arrayX.length; i++) {
            arrayY[i] = tabulation(arrayX[i]);
        }
        return arrayY;
    }

    public int minElement(double[] array) {
        double min = array[0];
        int minIndex = 0;
        for(int i = 1; i < array.length; ++i) {
            if(array[i] < min) {
                min = array[i];
                minIndex=i;
            }
        }
        return minIndex;
    }
    public int maxElement(double[] array) {
        double max = array[0];
        int maxIndex = 0;
        for(int i = 1; i < array.length; ++i) {
            if(array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    private void printMinMaxElement(int max, int min, double[] x, double[] y) {
        System.out.println("Максимальний: "+y[max] +" при "+x[max]+ "\nМінімальний: " +y[min]+" при "+x[min]);
    }
    public double sumElements(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    public double arifSumElements(double[] array) {
        return sumElements(array)/array.length;
    }

}
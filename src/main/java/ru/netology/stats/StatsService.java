package ru.netology.stats;

public class StatsService {
    public long sumArray(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public float averageAmountofSales(long[] sales) {

            float average = sumArray(sales)/sales.length;

        return average;

    }
    public long peakSales(long[] sales){
        int mont = 0;
        int n=0;
        long currentMax = sales[0];
        for (long sale : sales) {
            if (currentMax <= sale){
                currentMax = sale;
                n=mont;
            }
            mont++;
        }
        n++;
        return n;

    }
    public long declineSales(long[] sales){
        int mont = 0;
        int n=0;
        long currentMin = sales[0];
        for (long sale : sales) {
            if (currentMin > sale){
                currentMin = sale;
                n=mont;
            }
            mont++;
        }
        n++;
        return n;

    }
    public long belowAverage(long[] sales){
        int sumMont = 0;
        float arithmeticMean = sumArray(sales)/sales.length;
        for (long sale : sales) {
            if (arithmeticMean > sale){
                sumMont++;
            }
        }
        return sumMont;

    }
    public long aboveAverage(long[] sales){
        int sumMont = 0;
        float arithmeticMean = sumArray(sales)/sales.length;
        for (long sale : sales) {
            if (arithmeticMean < sale){
                sumMont++;
            }
        }
        return sumMont;

    }





}


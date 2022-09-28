package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales){
        int minMounth = 0;
        int mounth = 0;
        for (long sale : sales){
            if( sale <= sales[minMounth]){
                minMounth = mounth;
            }
            mounth = mounth + 1;
        }
        return minMounth + 1;
    }


    public int maxSales(long[] sales){
        int minMounth = 0;
        int mounth = 0;
        for (long sale : sales){
            if( sale >= sales[minMounth]){
                minMounth = mounth;
            }
            mounth = mounth + 1;
        }
        return minMounth + 1;
    }


    public long sumSales(long[] items){
        long result = 0;
        for (long item : items) {
            result += item;
        }
        return result;
    }

    public long average(long[] items){
        return sumSales(items)/ items.length;
    }

    public long mouthWithMoreThanAverage(long[] items){
        long average = average(items);

        int mouthCount = 0;
        for(long item : items){
            mouthCount++;
            if(item > average){
                mouthCount++;
            }
        }
        return mouthCount;
    }

    public long mouthWithLessAverage (long[] items){
        long average = average(items);

        int mouthCount = 0;
        for(long item : items){
            mouthCount++;
            if(item < average){
                mouthCount++;
            }
        }
        return mouthCount;
    }
}

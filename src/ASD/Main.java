package ASD;

public class Main {

    public static void main(String[] args){
        int[] num = { 6, 6, 5, 7, 9, 8, 10, 10, 9, 8 };
        sort(num,num.length);
        for (int h : num)
            System.out.print(h + " ");
    }

    public static void sort( int[] input,int n){
        int min=0,max=0;
        for (int i = 1; i < n; i++){
            if (input[i] > max)
                max = input[i];
            if (input[i] < min)
                min = input[i];
        }
        int range = max - min + 1;
        int[] count = new int[range];
        for (int i = 0; i < n; i++)
            count[input[i] - min]++;
        for (int i = 1; i < range; i++)
            count[i] += count[i - 1];
        int j = 0;
        for (int i = 0; i < range; i++)
            while (j < count[i])
                input[j++] = i + min;
    }
}

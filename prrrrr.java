import java.util.Arrays;
import java.util.Scanner;

public class prrrrr {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Myclass.single();
        System.out.println(Myclass.array + "\n");
        Myclass.qww();
    }
}

class Myclass1 extends Thread {

    Myclass1(String name) {
        super(name);
        start();
    }

    public float[] eee(float[] array, int number) {
        float[] output;
        output = array;
        int i = 0;
        while(i+1 < output.length) {
            output[i] = (float) (output[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + 1 / 2));
            i++;
        }
        return output;
    }
}

class Myclass {
    static final int size = 10000000;
    static final int half = size/2;
    static float[] array = new float[size];

    public static void single() {
        long time = System.currentTimeMillis();
        float[] arr = new float[size];
        Arrays.fill(arr, 1);
        int i = 0;
        while(i+1 < arr.length) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + 1 / 2));
            i++;
        }
        array = arr;
        System.out.println("время работы: " + (System.currentTimeMillis() - time));

    }

    public static void qww() {
        long time = System.currentTimeMillis();
        float[] arr = new float[size];
        Arrays.fill(arr, 1);
        float[] a1 = new float[half];
        float[] a2 = new float[half];
        System.arraycopy(arr, 0, a1, 0, half);
        System.arraycopy(arr, half, a2, 0, half);
        int i = 0;
        while(i+1 < a1.length) {
            a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + 1 / 2));
            i++;
        }
        Myclass1 second = new Myclass1("qwee");
        a2 = second.eee(a2, half);
        System.arraycopy(a1, 0, arr, 0, half);
        System.arraycopy(a2, 0, arr, half, half);
        System.out.println("время работы: " + (System.currentTimeMillis() - time));
        System.out.println(array);
    }
}
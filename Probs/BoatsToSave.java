package Probs;

public class BoatsToSave {
    static int boatsToSave(int[] arr, int limit) {
        int currCapacity = 0;
        int boatCounter = 0;
        int maxBoat = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (currCapacity <= limit) {
                boatCounter++;
                currCapacity += arr[i];

            } else {
                maxBoat = Math.max(boatCounter, maxBoat);
                currCapacity = arr[i];
                boatCounter = 0;
            }

        }
        return maxBoat;
    }

    public static void main(String[] args) {
        System.out.println(boatsToSave(new int[] { 3, 2, 2, 1 }, 3));
    }

}

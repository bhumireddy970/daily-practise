package com.src.arrays;

class ParkingSystem{
    int big;
    int small;
    int medium;

    public ParkingSystem(int big, int medium, int small){
        this.big = big;
        this.small = small;
        this.medium = medium;
    }
}

public class DesignParkingSystem {
    private int[] slots;
    public void ParkingSystem(int big, int medium, int small) {
        this.slots=new int[]{big,medium,small};
    }

    public boolean addCar(int carType) {
        if(slots[carType-1]>0)
        {
            slots[carType-1]--;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ParkingSystem parkingSystem = new ParkingSystem(1,1,1);
        DesignParkingSystem Dps=new DesignParkingSystem();
        Dps.ParkingSystem(1,1,1);
        System.out.println(Dps.addCar(1));
        System.out.println(Dps.addCar(2));
        System.out.println(Dps.addCar(3));
        System.out.println(Dps.addCar(1));
    }
}

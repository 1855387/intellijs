package com.nighthawk.intellijs;

public class FrogSimulation {
    private int goalDistance;
    private int maxHops;

//    constructor
    public FrogSimulation (int dist, int numHops){
        goalDistance = dist;
        maxHops = numHops;
    }
//    returns int for distance (in) when frog hops
    private int hopDistance(){
        return (int) (Math.random()*20 - 10);

    }
//   whether frog succesfully reached or passed the goal
    public boolean simulate(){
        int position = 0;

        for (int i = 0; i < maxHops; i++){
            position = position + hopDistance();
            if (position >= goalDistance){return true;}
            else if (position < 0){return false;}

    }
        return false;
    }

//    runs num simulations, returns proporiton of succesfull simulations
    public double runSimulations (int num){
        int counter = 0;

        for (int i = 0; i < num; i++){
            if(simulate() == true){
                counter++;
            }
        }

        return (double) counter/num;

    }


    public static void main(String[] args){
        FrogSimulation sim = new FrogSimulation(10, 5);
        System.out.println(sim.runSimulations(100));
    }

}

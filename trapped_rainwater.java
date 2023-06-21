// import javax.swing.plaf.synth.SynthSpinnerUI;

public class trapped_rainwater {
    public static void trappedRainwater(int arr[],int width) {
        int leftMax[] = new int[arr.length];
        int rightMax[] = new int[arr.length]; 
        int lftMax=Integer.MIN_VALUE;
        int rytMax=Integer.MIN_VALUE;
        int totalAmtWater = Integer.MIN_VALUE;
        int amtOfWater = 0;
        int trappedRainwater = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>lftMax){
                leftMax[i]= arr[i];
                lftMax=arr[i];
            }
            else{
                leftMax[i]=lftMax;
            }
            // System.out.println(leftMax[i]);
        }
        for(int j=arr.length-1;j>=0;j--){
            if(arr[j]>rytMax){
                rightMax[j]= arr[j];
                rytMax=arr[j];
            }
            else{
                rightMax[j]=rytMax;
            }
            // System.out.println(rightMax[j]);
        }
        for(int i=0;i<arr.length;i++){
            int waterLvl = Math.min(rightMax[i], leftMax[i]);
            trappedRainwater =  (waterLvl - arr[i])*width;
            System.out.println("Trapped rainwater for " + arr[i]+ " is = "+ trappedRainwater);
            amtOfWater = amtOfWater + trappedRainwater;
        }
        System.out.println("Total amount of water = "+amtOfWater);
        

    }
    public static void main(String[] args) {
        int arr[] = {4,2,0,6,3,2,5};
        int width =1;
        trappedRainwater(arr,width);
    }
}

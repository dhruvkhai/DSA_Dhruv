class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return  (arrivalTime+delayedTime) % 24;
    }

    public static void main(String[] args){
        int arrivalTime = 10;
        int delayedTime = 5;
        Solution solution = new Solution();
        System.out.println("output: " + solution.findDelayedArrivalTime(arrivalTime,  delayedTime));
        

         int arrivalTime2 = 13;
        int delayedTime2 = 11;
        // Solution solution = new Solution();
        System.out.println("output: " + solution.findDelayedArrivalTime(arrivalTime2,  delayedTime2));
    }
}
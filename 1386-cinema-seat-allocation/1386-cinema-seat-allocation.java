class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer,Set<Integer>> mp= new HashMap<>();

        for(int[] seats: reservedSeats){
            int row=seats[0];
            int col=seats[1];

            if(!mp.containsKey(row)){
                mp.put(row, new HashSet<>());
            }

            mp.get(row).add(col);
        }

        int ans= 2*n;

        for(int row:mp.keySet()){
            Set<Integer> resereved= mp.get(row);

            boolean left=!resereved.contains(2)&&
                         !resereved.contains(3)&&
                         !resereved.contains(4)&&
                         !resereved.contains(5);

            boolean middle=!resereved.contains(4)&&
                         !resereved.contains(5)&&
                         !resereved.contains(6)&&
                         !resereved.contains(7);
            boolean right=!resereved.contains(6)&&
                         !resereved.contains(7)&&
                         !resereved.contains(8)&&
                         !resereved.contains(9);


        if(left&& middle && right){

        }else if(left|| middle|| right){
            ans=ans-1;
        }else {
            ans=ans-2;
        }
        }
        return ans;
        
    }
}
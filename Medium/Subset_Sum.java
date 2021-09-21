class Subset_Sum {
/*
Find subsets whose sum is equal to given sum value
*/

    static void subsetSum(int n, int[] ar, int idx, ArrayList<Integer> arr, int sum) {

        if (sum == 0) {
            System.out.println(arr.toString());
            return;
        }

        if (idx == n) {
            return;
        }

        arr.add(ar[idx]);
        subsetSum(n, ar, idx + 1, arr, sum-ar[idx]);

        arr.remove(arr.size() - 1);
        subsetSum(n, ar, idx + 1, arr, sum);
    }
    
    public static void main(String[] args) throws IOException {

        int n = 6;
        int[] ar = {4, -2, 8, 13, 2, 3};
        int sum = 15;

        ArrayList<Integer> arr = new ArrayList<>();

        subsetSum(n, ar, 0, arr, sum);
    }

}
class SubSets {

    static void generateSubset(int n, int[] ar, int idx, ArrayList<Integer> arr) {
	
        if (idx == n) {
	    // Excluding null set
            if (arr.size() != 0) {
                System.out.println(arr.toString());
            }
            return;
        }

	// Pick the element
        arr.add(ar[idx]);
        subset(n, ar, idx + 1, arr);

	//Don't pick the element
        arr.remove(arr.size() - 1);
        subset(n, ar, idx + 1, arr);
    }

    public static void main(String[] args) {

        int n = 5;
        int[] ar = {81, 36, 9, 6, 1};

        ArrayList<Integer> arr = new ArrayList<>(); // to store temp subset elements

        generateSubset(n, ar, 0, arr);

    }


}
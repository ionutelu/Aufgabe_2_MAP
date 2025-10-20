public class Numerator {
    private int[] num;
    public Numerator(int[] num) {
        this.num = num.clone();
        mergeSort(this.num, 0, this.num.length - 1);
    }

    private void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Recursively sort both halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    private void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data
        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
        for (int j = 0; j < n2; j++) R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }


    public int[] getNum() {
        return num;
    }
    public void setNum(int[] num) {
        this.num = num;
    }

    public int biggestNumber() {
        return num[num.length - 1];
    }

    public int smallestNumber() {
        return num[0];
    }

    public int biggestSum(int n) {
        int biggest = 0;
        int index = this.num.length - 1;
        int counter = 1;
        while (counter < n){
            biggest += this.num[index--];
            counter++;
        }
        return biggest;

    }

    public int smallestSum(int n) {
        int smallest = 0;
        int index = 0;
        int counter = 1;
        while (counter < n){
            smallest += this.num[index++];
            counter++;
        }
        return smallest;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        Numerator numerator = new Numerator(numbers);
        System.out.println(numerator.biggestNumber());
        System.out.println(numerator.smallestNumber());
        System.out.println(numerator.smallestSum(17));
        System.out.println(numerator.biggestSum(13));
    }
}

public class Main {
    /*public static void main(String[] args) {
        int[] numberList = {3, 5, 7, 9, 12, 55};
        int largest = numberList[0];
        for (int i = 0; i < numberList.length; i++){
           if (numberList[i] > largest){
               largest = numberList[i];
           }
        }
        System.out.println(largest);
    }*/
    /*public static void main(String[] args) {
        int[] numberList = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (var i = 0; i < numberList.length; i++){
            if (numberList[i] == 1){
                System.out.println("one");
            } else if (numberList[i] == 2) {
                System.out.println("two");
            }else if (numberList[i] == 3) {
                System.out.println("three");
            }else if (numberList[i] == 4) {
                System.out.println("four");
            }else if (numberList[i] == 5) {
                System.out.println("five");
            }else if (numberList[i] == 6) {
                System.out.println("six");
            }else if (numberList[i] == 7) {
                System.out.println("seven");
            }else if (numberList[i] == 8) {
                System.out.println("eight");
            }else if (numberList[i] == 9) {
                System.out.println("nine");
            }else {
                System.out.println("Number not found ");
            };
        }
    };*/
    /*public static void main(String[] args) {
        int[] numberList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < numberList.length; i++){
           if (numberList[i] % 2 == 0 ){
               System.out.println("the number"+" "+numberList[i]+" "+"is odd!");
           }else {
               System.out.println("the number"+" "+numberList[i]+" "+"is even!");
           };
        }
    }*/
    public static void main(String[] args) {
        int[] numberList = {1, 200, 3, 49, 5, 6, 17, 8, 9, 10};
        int average = 0;
        for (int i = 0; i < numberList.length; i++){
           average += numberList[i]/numberList.length;
        }
        System.out.println(average);
    }
}


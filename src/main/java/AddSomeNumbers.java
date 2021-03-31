public class AddSomeNumbers {

    public int addTwoNumbers(int num1, int num2){
        return num1 + num2;
    }

    public static void main(String[] args) {
        AddSomeNumbers addSomeNumbers = new AddSomeNumbers();
        int result = addSomeNumbers.addTwoNumbers(12,20);
        int newNumbers = addSomeNumbers.addTwoNumbers(20,30);
        System.out.println(newNumbers);
    }
}

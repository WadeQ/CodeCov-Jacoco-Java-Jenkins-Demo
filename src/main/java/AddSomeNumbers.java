public class AddSomeNumbers {

    public static void main(String[] args) {
        AddSomeNumbers addSomeNumbers = new AddSomeNumbers();
        int sum = addSomeNumbers.addTwoNumbers(50,30);
        System.out.println(sum);
    }

    public int addTwoNumbers(int num1, int num2){
        return num1 + num2;
    }
}

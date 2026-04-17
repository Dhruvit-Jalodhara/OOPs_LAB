package LAB_09;

class ConvertThread extends Thread {
    String postfix;

    ConvertThread(String postfix) {
        this.postfix = postfix;
    }

    public void run() {
        java.util.Stack<String> stack = new java.util.Stack<>();

        for (char ch : postfix.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                stack.push(ch + "");
            } else {
                String b = stack.pop();
                String a = stack.pop();
                stack.push(a + ch + b);
            }
        }

        System.out.println("Infix: " + stack.pop());
    }
}

public class Q05 {
    public static void main(String[] args) {
        new ConvertThread("AB*CD/+").start();
    }
}

package LAB_07;


import java.util.Scanner;

enum Result {
    CORRECT, WRONG, UNANSWERED
}

class QuizEvaluator {
    char[] answer = {'C','B','B','D'};
    char[] submitted;
    Result[] results = new Result[4];

    int correct = 0;
    int wrong = 0;
    int unanswered = 0;

    QuizEvaluator(char[] submitted) {
        this.submitted = submitted;
    }

    void calculateResult() {
        for (int i = 0; i < 4; i++) {
            if (submitted[i] == 'X') {
                results[i] = Result.UNANSWERED;
                unanswered++;
            } else if (submitted[i] == answer[i]) {
                results[i] = Result.CORRECT;
                correct++;
            } else {
                results[i] = Result.WRONG;
                wrong++;
            }
        }
    }

    void printResult() {
        System.out.println("QUESTION\tSUBMITTED ANS\tCORRECT ANS\tRESULT");
        for (int i = 0; i < 4; i++) {
            System.out.println((i+1) + "\t\t" + submitted[i] + "\t\t" + answer[i] + "\t\t" + results[i]);
        }
        System.out.println("\nNo. of correct answers: " + correct);
        System.out.println("No. of wrong answers: " + wrong);
        System.out.println("No. of unanswered questions: " + unanswered);

        // Pass/fail logic
        if (correct >= 2)
            System.out.println("RESULT: PASS");
        else
            System.out.println("RESULT: FAIL");
    }
}

public class Q07 {
    public static void main(String[] args) {
        char[] arr = new char[4];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the answers (A,B,C,D,X) for questions 1 to 8:");
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.next().toUpperCase().charAt(0);
        }

        QuizEvaluator q1 = new QuizEvaluator(arr);
        q1.calculateResult();
        q1.printResult();

        sc.close();
    }
}

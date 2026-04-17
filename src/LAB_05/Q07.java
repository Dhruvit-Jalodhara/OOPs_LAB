package LAB_05;

public class Q07 {
    // Enum to represent result
    enum Result {
        CORRECT, WRONG, UNANSWERED
    }

    public static void main(String[] args) {

        // Correct answers
        char[] correct = {'C','A','B','D','B','C','C','A'};

        int correctCount = 0;
        int wrongCount = 0;
        int unansweredCount = 0;

        System.out.println("QUESTION\tSUBMITTED\tCORRECT\t\tRESULT");

        for(int i = 0; i < correct.length; i++) {

            char submitted = args[i].charAt(0);
            Result result;

            if(submitted == 'X') {
                result = Result.UNANSWERED;
                unansweredCount++;
            }
            else if(submitted == correct[i]) {
                result = Result.CORRECT;
                correctCount++;
            }
            else {
                result = Result.WRONG;
                wrongCount++;
            }

            System.out.println((i+1) + "\t\t\t" + submitted + "\t\t\t" + correct[i] + "\t\t\t" + result);
        }

        System.out.println();
        System.out.println("No. of correct answers: " + correctCount);
        System.out.println("No. of wrong answers: " + wrongCount);
        System.out.println("No. of questions unanswered: " + unansweredCount);

        if(correctCount >= 5)
            System.out.println("Result: PASS");
        else
            System.out.println("Result: FAIL");
    }
}

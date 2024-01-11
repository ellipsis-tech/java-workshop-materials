public class ExceptionPropagation {
    public static void main(String[] args) {
        higherSupport(); // boss delegate support function
    }

    public static void higherSupport() {
        try {
            basicSupport(); // delegate manual labour
        } catch (TechnicalDifficultyException e) {
            // SOLVE THE ISSUE - fix the tech issue
        }
    }

    public static void basicSupport() {
        try {
            customerCreatingProblem();
        } catch (BasicHelpNeededException e) {
            // SOLVE THE ISSUE - answer query
        }
    }

    public static void customerCreatingProblem() {
        throw new TechnicalDifficultyException();
    }
}

class BasicHelpNeededException extends RuntimeException {}
class TechnicalDifficultyException extends RuntimeException {}
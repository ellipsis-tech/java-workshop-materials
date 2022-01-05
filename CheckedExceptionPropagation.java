public class CheckedExceptionPropagation {
    public static void main(String[] args) throws BigException {
        higherSupport(); // boss delegate support function
    }

    public static void higherSupport() throws BigException {
        try {
            basicSupport(); 
        } catch (TechnicalException e) {
            // SOLVE THE ISSUE - fix the tech issue
        }
    }

    public static void basicSupport() throws TechnicalException, BigException {
        try {
            customerCreatingProblem();
        } catch (HelpNeededException e) {
            // SOLVE THE ISSUE - answer query
        }
    }

    public static void customerCreatingProblem() throws HelpNeededException, TechnicalException, BigException {
        throw new TechnicalException();
    }
}

class HelpNeededException extends Exception {} // Checked Exception
class TechnicalException extends Exception {} // Checked Exception
class BigException extends Exception {} // Checked Exception
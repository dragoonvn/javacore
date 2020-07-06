package activity52;

public class CheckResult {
    private int numberOfPass;
    private int numberOfFail;
    private String nameOfHighestStudent;

    public CheckResult(int numberOfPass, int numberOfFail, String nameOfHighestStudent) {
        this.numberOfPass = numberOfPass;
        this.numberOfFail = numberOfFail;
        this.nameOfHighestStudent = nameOfHighestStudent;
    }

    public int getNumberOfPass() {
        return numberOfPass;
    }

    public void setNumberOfPass(int numberOfPass) {
        this.numberOfPass = numberOfPass;
    }

    public int getNumberOfFail() {
        return numberOfFail;
    }

    public void setNumberOfFail(int numberOfFail) {
        this.numberOfFail = numberOfFail;
    }

    public String getNameOfHighestStudent() {
        return nameOfHighestStudent;
    }

    public void setNameOfHighestStudent(String nameOfHighestStudent) {
        this.nameOfHighestStudent = nameOfHighestStudent;
    }
}

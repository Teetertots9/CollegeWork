/*
 * SQT Lab 4
 */
package sqtlab4.grades;

/**
 *
 * @author kanolan
 */
public class Grades {
    private static final int EXAM_WEIGHTING = 60;
    private static final int CA_WEIGHTING = 40;
    
    private int examResult;
    private int caResult;
    
    public Grades(int examResult, int caResult){
        this.examResult = examResult;
        this.caResult = caResult;
    }
    
    public String calculateGradeCategory() {
        String grade = new String();

	if (this.examResult < 0 || this.examResult > 100 || caResult < 0 || caResult > 100) {
            grade = "Invalid input";
	} else if (this.examResult < 40 || caResult < 40) {
            grade = "Component Fail";
	} else {
            int combined = (EXAM_WEIGHTING * this.examResult + CA_WEIGHTING * caResult) / 100;
            if (combined < 60) {
                grade = "Fail";
            } else if (combined >= 60 && combined <= 80) {
		grade = "Pass";
            } else if (combined > 80 && combined <= 100) {
		grade = "Pass with distinction";
            }
	}
	return grade;  
    }
    
}

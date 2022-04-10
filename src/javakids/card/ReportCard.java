package javakids.card;

public class ReportCard {
	/* convertCard принимает один целочисленный агрумент
	 * - результат теста и возвращает символ A, B ,C или D
	 * в зависимости от аргумента
	 */
	public char convertGrades(int testResult) {
		char grade;
		if(testResult >= 90) {
			grade = 'A';
		} else if(testResult >=80 && testResult < 90) {
			grade = 'B';
		} else if(testResult >= 70 && testResult <80) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		return grade;
	}
	
	public static void main(String[] args) {
		ReportCard rc = new ReportCard();
		char yourGrade = rc.convertGrades(88);
		System.out.println("Первый тест вы сдали на " + yourGrade);
		yourGrade = rc.convertGrades(75);
		System.out.println("Второй тест вы сдали на " + yourGrade);
	}
}

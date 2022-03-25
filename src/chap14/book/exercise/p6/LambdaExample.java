package chap14.book.exercise.p6;

import java.util.function.ToIntFunction;

import chap14.book.exercise.p06.LambdaExample;
import chap14.book.exercise.p06.LambdaExample.Student;

public class LambdaExample {
	public static class Student {
		// 필드 생성
		private String name;
		private int englishScore;
		private int mathScore;
		
		
		// 생성자
		public Student(String name, int englishScore, int mathScore) {
			this.name = name;
			this.englishScore = englishScore;
			this.mathScore = mathScore;
		}
		
		// 메소드
		public String getName() {
			return name;
		}
		
		public int getEnglishScore() {
			return englishScore;
		}
		
		public int getMathScore() {
			return mathScore;
		}
		
	}
	
	private static Student[] students = {
		new Student("홍길동", 90, 96),
		new Student("신용권", 95, 93)
	};
	
	// avg() 메소드 작성
	public static double avg(ToIntFunction<Student> f) {
		double avg = 0.0;
		
		for(Student s : students) {
			avg += f.applyAsInt(s);
		}
		
		avg /= students.length;
		
		return avg;
 		
	}
	
	public static void main(String[] args) {
		// 책 예제 작성식
//		double englishAvg = avg(s -> s.getEnglishScore());
//		System.out.println("영어 평균 점수 : " + englishAvg);
//		double mathAvg = avg(s -> s.getMathScore());
//		System.out.println("수학 평균 점수 : " + mathAvg);
//		

		// 책 예제를 풀어씀
		double englishAvg = avg((Student s) -> {return s.getEnglishScore();});
		System.out.println("영어 평균 점수 : " + englishAvg);
		
//		double mathAvg = avg(s -> s.getMathScore());
		
		ToIntFunction<Student> a = new ToIntFunction<LambdaExample.Student>() {
			@Override
			public int applyAsInt(Student param) {
				return param.getMathScore();
			}
		};
		double mathAvg = avg(a);
		System.out.println("수학 평균 점수 : " + mathAvg);
		
	}
}
	
	


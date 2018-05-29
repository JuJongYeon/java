package java_example_180523;
//메소드 오버로딩 p.232
public class ch6_10_Calculator {
	//정사각형의 넓이를 구하는 메소드 면*2
	//메소드 이름 : areaRectangle

	//직사각형의 넓이를 구하는 메소드 가로*세로
	int width;
	int height;
	
	int areaRectangle(int width){
		this.width=width;
		int result = width*width;
		return result;
	}
	int areaRectangle(int width, int height){
		this.height=height;
		int result = width*height;
		return result;
	}
}
//main 클래스의 실행 내용
/*
 * 객체를 생성해서
 * 정사각형 넓이 구하는 메소드 호출하고 결과 출력
 * 직사각형 넓이 구하는 메소드 호출하고 결과 출력
 */

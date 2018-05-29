package java_example_180524;
//상수 선언
public class ch6_14_earth {
	static final double EARTH_RADIUS = 6400;
	//고정된(static final) 6400의 값 EARTH_RADIUS
	
	static final double EARTH_RADIUS_AREA;
	
	static {
		EARTH_RADIUS_AREA=4*Math.PI*EARTH_RADIUS*EARTH_RADIUS;
	}
}

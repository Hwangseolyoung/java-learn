package chap08.book.example.s080505;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
//		vehicle.checkFare(); // Vehicle에는 존재하지 않는 메소드
		
		Bus bus = (Bus) vehicle; // 강제 타입변환
		bus.run();
		bus.checkFare();
	}

}

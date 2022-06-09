package day5.interfaceExample;

public class MSExcel implements MSOffice{

	@Override
	public void start() {
		System.out.println("This is implemented in MS Excel");
		
	}

	@Override
	public void stop() {
		
		System.out.println("This is implemented in MS Excel");
		
	}

	@Override
	public void save() {
		
		System.out.println("This is implemented in MS Excel");
		
	}
	
	public void saveAs() {
		
	}

}

package factoryMethodPattern;

public class EmailLogger implements LoggerService{

	@Override
	public void Log() {
		System.out.println("Logged with EmailLogger");
		
	}

}

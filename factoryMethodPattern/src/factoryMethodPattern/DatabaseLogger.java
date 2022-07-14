package factoryMethodPattern;

public class DatabaseLogger implements LoggerService{

	@Override
	public void Log() {
		System.out.println("Logged with DatabaseLogger");
		
	}

}

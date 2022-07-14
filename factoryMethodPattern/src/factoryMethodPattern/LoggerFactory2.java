package factoryMethodPattern;

public class LoggerFactory2 implements LoggerFactoryService{

	@Override
	public LoggerService CreateLogger() {
		return new EmailLogger();
	}

}

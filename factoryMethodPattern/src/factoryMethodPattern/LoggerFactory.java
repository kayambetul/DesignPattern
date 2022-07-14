package factoryMethodPattern;

public class LoggerFactory implements LoggerFactoryService{
	
	//business to decide factory
	public LoggerService CreateLogger() {
		return new DatabaseLogger();
	}

}



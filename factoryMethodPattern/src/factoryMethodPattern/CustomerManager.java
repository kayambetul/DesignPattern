package factoryMethodPattern;

public class CustomerManager {
	
	LoggerFactoryService loggerFactoryService;
	
	
	public CustomerManager(LoggerFactoryService loggerFactoryService) {
		
		this.loggerFactoryService = loggerFactoryService;
	}


	public void Save() {
		System.out.println("Saved!");
		//LoggerService loggerService=new LoggerFactory().CreateLogger();
		LoggerService loggerService=loggerFactoryService.CreateLogger();
		loggerService.Log();
	}

}

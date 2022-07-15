package facadeDesignPattern;

public class CustomerManager implements CustomerService{

	private CrossCuttingConcernsFacade crossCuttingConcernsFacade;
	
	
	public CustomerManager() {
		
		crossCuttingConcernsFacade = new CrossCuttingConcernsFacade();
	}


	@Override
	public void save() {
		crossCuttingConcernsFacade.authorizeService.checkUser();
		crossCuttingConcernsFacade.cacheService.cache();
		crossCuttingConcernsFacade.logService.log();
		System.out.println("Saved");
		
		
	}

}

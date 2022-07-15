package facadeDesignPattern;

public class CrossCuttingConcernsFacade {
	public LogService logService;
	public CacheService cacheService;
	public AuthorizeService authorizeService;
	
	public CrossCuttingConcernsFacade() {
		logService =new LogManager();
		cacheService=new CacheManager();
		authorizeService=new AuthorizeManager();
	}
	
	

}
//Oluşturduğumuz soyut sınıfları kullanalım. Bu sınıftan çağırılan her işlem için o 
//an bellekte instance oluşturuluyor.
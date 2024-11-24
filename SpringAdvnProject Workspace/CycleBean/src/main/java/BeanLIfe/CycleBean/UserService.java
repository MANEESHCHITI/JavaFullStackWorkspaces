package BeanLIfe.CycleBean;

public class UserService {

	private UserRepository userRepository;
	
	
	public UserService() {
		System.out.println("instance created");
	}
	
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	
	
	
	
	
}

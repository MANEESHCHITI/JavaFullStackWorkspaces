package BeanLIfe.CycleBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class UserService implements BeanNameAware, ApplicationContextAware, InitializingBean, DisposableBean {

	private UserRepository userRepository;

	public UserService() {
		System.out.println("UserService instance created");
	}

	public void setUserRepository(UserRepository userRepository) {
		System.out.println("Dependency injected");
		this.userRepository = userRepository;
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("Bean name" + name);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("obj we are printing" + applicationContext);
	}

	@PostConstruct // we want dependency to add for this and also add context tag in bean
	public void initialize() {

		System.out.println("initialization through @PostConstruct");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("initializing with InitializingBean");
	}
	
	public void init() {
		System.out.println("initializing with init method");
	}
	
	@PreDestroy
	public void destroy01(){
		System.out.println("cleanup with @PreDistroy");
	}
	
	public void destroy02() {
		System.out.println("cleanup with destroy method");
	}

	@Override
	public void destroy() throws Exception {

		System.out.println("cleanup with disposable bean");
	}
//(Aware of it)The qualified names should give like package name 
//copty from class firstline and classname thats enough
//and in the bean in qualified name instead slash keep dot but whereas in applicationcontext keep slash 
//itself
/* in this starting i created maven project added two dependencies 
	 * in pom.xml and next the app.java has created itself in this i
	 *  wrote applicationcontext, i created bean under package and 
	 *  copy pasted in built code and i created UserService class in 
	 *  that i created userrepository variable for setter injection and i 
	 *  injected it by setter injection and 
	 * i created condtrucotr for object creation and dependency injextion 
	 * second step in life cycle and added bean
	 *  in for userservice and created aclass for dependency of userrepository 
	 *   implemented BeanNameAware for bean name and next
	 *  implemented  ApplicationContextAware for object printing of applicationcontext(hascode)
	 *   and these all methods have method to
	 *  implement because they are abstract methods and next i created custombeanprocessor
	 *   class in that i implemented beanpostprocessor it has two methods one is executed before
	 *    initialization and another is after initialization and i have copy pasted it from clicked
	 *     the implemented interface name and next i created @postConstruct annotation for initialization
	 *      so this i added postconstruct dependency from maven repository and also i wrote context tag in bean
	 *       ,next implemented InitializingBean for same initialization and,next i created method that is given
	 *        in the bean with init-method and next i used @predestroy for cleanup
	 *         and next i used disposablebean interface which gives destroy method unimplemented and next i wrote
	 *          a another method and given for bean with destroy method  to work destroy metod we should close context 
	 *          in applicationcontext if i used applicationcontext we cast whereas configurable application context 
	 *          we just close.
	 *        
	 *    */
	

}

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean2= (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());
        boolean comparison=bean==bean2;
        System.out.println(comparison);

        Cat cat= (Cat) applicationContext.getBean("cat");
        System.out.println(cat);
        Cat cat1= (Cat) applicationContext.getBean("cat");
        System.out.println(cat1);
        boolean comparison2=cat==cat1;
        System.out.println(comparison2);
    }
}
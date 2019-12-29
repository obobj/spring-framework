import app.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * spring-framework
 *
 * @author lx
 * @version V1.0
 * @date 2019/12/28
 * @email vinicolor.violet.end@gmail.com
 * Description:
 */
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
	}
}

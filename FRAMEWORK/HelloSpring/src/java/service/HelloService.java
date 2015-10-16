package service;

/**
 *
 * @author nbuser
 */
public class HelloService {

    public String sayHello(String name, String age, String hp, String addr) {
        return "Hello " + name + "\n Your age is " + age+"\n Alamat "+addr+"\nNomor"+hp;
    }
}
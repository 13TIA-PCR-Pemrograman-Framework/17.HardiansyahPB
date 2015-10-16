package controller;

/**
 *
 * @author nbuser
 */
public class Name {

    private String value, age, hp, addr;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    
    public void setHp(String hp){
        this.hp = hp;
    }
    public String getHp(){
        return hp;
    }
    
    public void setAddr (String addr){
        this.addr = addr;
    }
    
    public String getAddr(){
        return addr;
    }
}
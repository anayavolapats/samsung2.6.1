public class Employee extends Person {
    String company;
    public Employee(String name, int age, String company) {
        super(name, age);
        this.age = age;
        this.name = name;
        this.company = company;
    }
    @Override
    public String toString(){
        String str = name;
        String com = company;
        StringBuffer strBuffer = new StringBuffer(str);
        StringBuffer strBuffer2 = new StringBuffer(com);
        return("(" + strBuffer.toString() + ", " + age + ", " + strBuffer2.toString() + ")");
    }
    @Override
    public String work(){
        return "Manager";
    }
}

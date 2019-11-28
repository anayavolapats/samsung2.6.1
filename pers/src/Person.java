public class Person {
    public int age;
    public String name;
    public Person(String name, int age){
        this.age = age;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public String work(){
        return "None";
    }
    @Override
    public String toString(){
        String str = name;
        StringBuffer strBuffer = new StringBuffer(str);
        return("(" + strBuffer.toString() + ", " + age + ")");
    }


}

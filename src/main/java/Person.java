public class Person {
    int age;
    String name;

    public Person(int age, String name) {
        if (age < 0){
            this.age =0;
        }else {
            this.age = age;
        }
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age < 0){
            this.age =0;
        }else {
            this.age = age;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String reverseName(){
        StringBuilder stringBuilder = new StringBuilder(this.name);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
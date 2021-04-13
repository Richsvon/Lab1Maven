public class Person {
    int age;
    String name;
    //till privjet
    public Person(int age, String name) {
        if (age < 0){               // Alt 1: Om parametern age är mindre än noll, sätts åldern till noll
            this.age =0;
        }else {                     // Alt 2: Annars sätt åldern till den mottagna parametern age
            this.age = age;
        }
        this.name = name;           //Sätt namn till den mottagna parametern name
    }

    public int getAge() {           //Returnerar age
        return this.age;
    }

    public void setAge(int age) {
        if (age < 0){               // Alt 1: Om parametern age är mindre än noll, sätts åldern till noll
            this.age =0;
        }else {                     // Alt 2: Annars sätt åldern till den mottagna parametern age
            //this.age = age;
            this.age = age;
        }
    }

    public String getName() {       //returnerar name
        return this.name;
    }

    public void setName(String name) {  //Sätt objektets name till den mottagna variablen
        this.name = name;
    }

    public String reverseName(){
        StringBuilder stringBuilder = new StringBuilder(this.name); //Skapar ett stringbuilder objekt av objektets name
        stringBuilder.reverse();                                    //Använder inbyggd metod från stringbuilder som spegelvänder name
        return stringBuilder.toString();                          // returnerar det spegelvända namnet med hjälp av toString()
    }
}
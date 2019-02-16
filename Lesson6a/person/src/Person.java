 public class Person {
   private String name;
   private int age;
   private static int peopleCount;


    void introduceYourself() {
        System.out.println("Hi, my name is "
                + name + " and I'm " + age + " years old.");
    }
    public int getAge(){
       return age;
     }
     public void setAge(int age){
       if (age>0) {
           this.age = age;
       }
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }
 }

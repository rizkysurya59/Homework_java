class Academician{
    String name;
    int age;


    //constructur
    Academician(String paramName, int paramAge){
        this.name = paramName;
        this.age = paramAge;
    }

        // method
    void studentSubject(String subject, String name) {
            //this memakai value dalam kelas
            System.out.println("Hello " + name + ", My Name is " + this.name + ", My age is " + this.age + ", i like a " + subject);
        }

}
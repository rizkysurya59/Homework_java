class Student extends Academician {

    float grade;

    Student(String paramName, int paramAge,float grade) {
        super(paramName, paramAge);
        this.grade = grade;
        //TODO Auto-generated constructor stub
    }

    void studentSubject(String name, int age,String subject)
    {
        System.out.println("Namaku adalah" + name + "My age is" + age + "i like subject" + subject + " and i am a student");
    }

}

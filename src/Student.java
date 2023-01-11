public class Student {
    private int age;
    private String firstName;
    private String lastName;
    private Course course = new Course("", 0, 0);
    private int intelligence;
    private int confidence;
    private int networking;

    public Student(String firstName, String lastName, int age, Course course, int intelligence, int confidence, int networking) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.course = course;
        this.intelligence = intelligence;
        this.confidence = confidence;
        this.networking = networking;
    }

    public int getAge() {
        return this.age;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String getCourseName() {
        return this.course.getName();
    }
    public double getCourseTotalYears(){
        return this.course.getTotalYears();
    }
    public int getCourseRemainingPeriods(){
        return this.course.getRemainingPeriods();
    }

    public void lockCourse(){
        this.course.lock();
    }
    public void unlockCourse(){
        this.course.unlock();
    }

    public void beApprovedInPeriod(){
        if (this.course.getRemainingPeriods() > 0){
            this.course.setRemainingPeriods(this.course.getRemainingPeriods() - 1);
        }else {
            System.out.println(this.firstName + " " + this.lastName + " já concluiu o curso.");
        }
        if (this.course.getRemainingPeriods() == 0){
            this.course.finish();
        }
    }

    public void setCourse(Course course){
        if (this.course.getIsLocked()){
            this.course = course;
            return;
        }
        System.out.println("O curso só pode ser alterado se o anterior já estiver trancado.");
    }
    public int getIntelligence() {
        return this.intelligence;
    }
    public int getConfidence() {
        return this.confidence;
    }
    public int getNetworking() {
        return this.networking;
    }

    public void studySubject(){
        this.intelligence += 5;
        this.confidence += 10;
        System.out.println(this.firstName + " " + this.lastName + " está se sentindo mais preparado e muito mais confiante!");
    }

    public void chatAround(){
        this.networking += 10;
        System.out.println(this.firstName + " conversou com outros alunos da plataforma!");
    }
}

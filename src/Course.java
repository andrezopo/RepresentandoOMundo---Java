public class Course {
    private String name;
    private double totalYears;
    private int remainingPeriods;
    private boolean isLocked = false;
    private boolean isFinished = false;

    public Course(String name, double totalYears, int remainingPeriods){
        this.name = name;
        this.totalYears = totalYears;
        this.remainingPeriods = remainingPeriods;
    }

    public String getName(){
        return this.name;
    }
    public double getTotalYears(){
        return this.totalYears;
    }
    public int getRemainingPeriods(){
        return this.remainingPeriods;
    }

    public void setRemainingPeriods(int remainingPeriods){
        this.remainingPeriods = remainingPeriods;
    }

    public boolean getIsLocked(){
        return this.isLocked;
    }

    protected void lock(){
        if (isLocked){
            System.out.println("O curso já está trancado");
            return;
        }
        this.isLocked = true;
    }

    protected void unlock(){
        if (!isLocked){
            System.out.println("O curso já está destrancado");
            return;
        }
        this.isLocked = false;
    }
    protected void finish(){
        if (isFinished){
            System.out.println("O curso já está concluído");
            return;
        }
        this.isFinished = true;
    }

}

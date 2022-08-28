class ClassEmployee {
    public int full_time=2;
    public int part_time=1;
    public int emp_rate_per_hour;
    public int emphrs=0;
    public int empwage=0;
    ClassEmployee(int wage_per_hour){
        this.emp_rate_per_hour=wage_per_hour;
    }
    public int calc(){
        double empcheck =Math.floor(Math.random()*10)%3;
        if(empcheck==part_time) {
            emphrs = 4;
        }
        else if(empcheck==full_time) {
            emphrs = 8;
        }
        else{
            emphrs=0;
        }
        empwage=emphrs*emp_rate_per_hour;
        return empwage;
    }


}
class Main{
    public static void main(String[] args) {
        int wage_per_hour=20;
        ClassEmployee emp =new ClassEmployee(wage_per_hour);
        System.out.println("Total wages of employee is: " + emp.calc());

    }
}

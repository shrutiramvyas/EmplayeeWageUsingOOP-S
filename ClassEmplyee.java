class ClassEmployee {
    public int fullTime = 1;
    public int total_wage_hour = 0;
    int wage_hour=0;
    int working_hour=0;
    public int isPresent = (int) (Math.random() * 10 % 2);

    ClassEmployee(int wage_per_hour, int working_hour) {
        this.wage_hour = wage_per_hour;
        this.working_hour = working_hour;
    }

    public int calc() {
        if (isPresent == 1) {
            total_wage_hour = this.working_hour * this.wage_hour;
        }
        return total_wage_hour;
    }
}
class Main{
    public static void main(String[] args) {
        int wage_per_hour=20;
        int working_hour=8;
        ClassEmployee emp =new ClassEmployee(wage_per_hour,working_hour);
        System.out.println("Total wages of employee is: " + emp.calc());

    }
}

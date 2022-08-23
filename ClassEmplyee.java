class ClassEmployee {
    public int fullTime=1;
    public int empcheck = (int)(Math.random()*10%2);
    public String calc(){
        if ( empcheck == fullTime )
            return "Employee is Present";
        else
            return "Employee is Absent";
    }
}
class Main{
    public static void main(String[] args) {
        ClassEmployee emp =new ClassEmployee();
        System.out.println(emp.calc());
    }
}

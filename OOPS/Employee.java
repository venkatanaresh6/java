public class Employee extends Person {
    private String emp_name;
    private String emp_loc;
    public Employee(String name,String loc){
        super();
        this.emp_name=name;
        this.emp_loc=loc;
    }
    public int cal_sal(){
        return 0;
    }
}

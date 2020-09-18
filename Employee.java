public class Employee {
    String[] n = new String[]{"Robert","Sam","John"};
    int y[]= {1994,2000,1999};
    int s[]= {64,68,26};
    String[] a = new String[]{"WallsStreet","WallsStreet","WallsStreet"};


    public static void main(String[] args) {

        System.out.println("Name \t Year of Joining \t Salary \t Address");
        
        EmMethod();
    
    }
    public static void EmMethod(){
        Employee Name = new Employee();
        Employee Year = new Employee();
        Employee Salary = new Employee();
        Employee Address = new Employee();
        for(int i=0; i<3; i++){
            System.out.print(Name.n[i]+"\t \t");
            System.out.print(Year.y[i]+"\t     \t");
            System.out.print(Salary.s[i]+"\t \t");
            System.out.print(Address.a[i]);
            System.out.println();
        }  
    }
    
}


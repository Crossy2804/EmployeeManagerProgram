/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemangerprogram;

/**
 *This is a Employee Manager program under source control
 * @author 20002104
 */
public class EmployeeMangerProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manager emp1 = new Manager("Sophie", 428);
        //System.out.println(emp1.printDetails());
        
        Employee emp2 = new Employee("Georgia", 274);
        Employee emp3 = new Employee("Tara", 753);
        emp1.addEmployee(emp2);
        emp1.addEmployee(emp3);
        System.out.println(emp1.printDetails());
    }
    
}

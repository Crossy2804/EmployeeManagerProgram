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
        Employee empl = new Employee("Sophie", 428);
        System.out.println(empl.printDetails());
    }
    
}

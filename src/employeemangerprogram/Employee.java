/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemangerprogram;

/**
 *This is the Employee class that holds employee data
 * @author 20002104
 */
public class Employee {
    protected String name;
    protected int employeeNum;

    public Employee(String name, int employeeNum) {
        this.name = name;
        this.employeeNum = employeeNum;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(int employeeNum) {
        this.employeeNum = employeeNum;
    }
    
    public String printDetails(){
        return employeeNum + " " + name;
    }
}

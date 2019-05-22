/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentweek3;

/**
 *
 * @author DELLS
 */
public class Student {
    private int MaxCourse;
    private Boolean PartTime;
    
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setFirstName("john");
        s1.setID(4);
    }

    /**
     * @return the PartTime
     */
    public Boolean getPartTime() {
        return PartTime;
    }

    /**
     * @param PartTime the PartTime to set
     */
    public void setPartTime(Boolean PartTime) {
        this.PartTime = PartTime;
    }
}

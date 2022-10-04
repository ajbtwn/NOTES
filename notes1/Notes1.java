/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notes1;

/**
 *
 * @author TAU
 */
public class Notes1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //only one data type in one array
        //set amt memory consumed -- cant just inc/dec \ delete / use class
        String[] days = {"Sunday", "Monday"}
        System.out.println(days[0]);
        System.out.println(days.length);
        
        String[] months = new String[12];
        //null if print
        months[0] = "Jan";

        ArrayList<Item> itemList = new ArrayList();
        itemList.add(pen);
        System.out.println(Student.getStudent("Nathan").getGrade());
        
        //jave se 8 arrayList, random -- oracle (class documentation)
        
        //1 in project -- starting point
        new Student("Mark", 15);
        Student.getStudent(0).spend(200);
        Student josh = new Student("Josh", 16);
        /**mark.name = "Mark";
        mark.age = 16;
        mark.friendship = 0;
        mark.grade = 1.75;
        mark.money = 500;
        **/
        mark.bff = josh;
        System.out.println(mark.bff.money);
        
        Student josh = new Student();
        josh.name = "Josh";
        josh.age = 16;
        josh.friendship = 0;
        josh.grade = 1.75;
        josh.money = 500;
        
        mark.introduce();
        System.out.println(mark.getGrade());
        //up more formal way to get fields
        mark.study(3);
        System.out.println(mark.grade);
    }
    
}

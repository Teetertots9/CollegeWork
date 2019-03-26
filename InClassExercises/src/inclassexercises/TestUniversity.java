/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclassexercises;

/**
 *
 * @author x00139120
 */
public class TestUniversity {
    public static void main(String[] args) {
        int[] depIds = {1,2,3,4};
        String[] depNames = {"Computing","Business","Languages","Engineering"};
        
        University uni = new University("DCU", depIds, depNames);
        
        uni.showList();
        
        uni.changeDepName("Business", "Business & Marketing");
        System.out.println("");
        uni.showList();
    }
}

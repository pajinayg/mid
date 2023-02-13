/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 * @author srinivsi
 */
public class StausUser 
{
 /**  public void statusDetail(String code)
{
switch(code.toUpperCase())
        {
        case "ZERO": System.out.println("REJECTED");
        break;
        case "ONE": System.out.println("PENDING");
        break;
        case "TWO":
        System.out.println("PROCESSING");
        break;
        case "THREE": 
            System.out.println("APPROVED");
        break;
        default:
         System.out.println("NOT VALID CODE");
        break;
        }
}**/
    
    public StausUser(User_status us){}
    public enum User_status{REJECTED,PENDING,PROCESSING,APPROVED,NOTVALIDCODE};
    public User_status us;
    
     public void setUser_status(User_status us){
      this.us = us;
    }
    public User_status getUser_status(){
     return this.us;
    }
 
}

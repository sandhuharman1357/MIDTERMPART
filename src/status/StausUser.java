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
    public enum Harrmancode{ZERO,ONE,TWO,THREE,};
    
    private String harmancode;
    
   public void statusDetail(String code)
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
}

    /**
     * @return the harmancode
     */
    public String getHarmancode() {
        return harmancode;
    }

    /**
     * @param harmancode the harmancode to set
     */
    public void setHarmancode(String harmancode) {
        this.harmancode = harmancode;
    }
 
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewEvidence;

/**
 *
 * @author priya
 */
class User {
     private String Evidence_type,Evidence,Suspect,Note,Points;
     private int Caseid;
    public User(int Caseid,String Evidence_type,String Evidence,String Suspect,String Note,String Points)
    {
        this.Caseid=Caseid;
        this.Evidence_type=Evidence_type;
        this.Evidence=Evidence;
        this.Suspect=Suspect;
        this.Note=Note;
        this.Points=Points;
        
    }
    public int getCaseid(){
       return Caseid;
    }
    public String getEvidence_type(){
       return Evidence_type;
    }
    public String getEvidence(){
       return Evidence;
    }
    public String getSuspect(){
       return Suspect;
    }
    public String getNote(){
       return Note;
    }
    public String getPoints(){
       return Points;
    }
}

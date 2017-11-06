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
class User2 {
   private String Name,Contact,Relation,Note,Address;
     private int Caseid;
    public User2(int Caseid,String Name,String Contact,String Relation,String Note,String Points)
    {
        this.Caseid=Caseid;
        this.Name = Name;
        this.Contact=Contact;
        this.Relation=Relation;
        this.Note=Note;
        this.Address=Address;
        
    }
    public int getCaseid(){
       return Caseid;
    }
    public String getName(){
       return Name;
    }
    public String getContact(){
       return Contact;
    }
    public String getRelation(){
       return Relation;
    }
    public String getNote(){
       return Note;
    }
    public String getAddress(){
       return Address;
    } 
}

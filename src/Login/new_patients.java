/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

/**
 *
 * @author Shivam
 */
public class new_patients {
    private int ptid, ptage;
    private String ptname;
    
    public new_patients(int ptid, String ptname, int ptage) {
        this.ptid = ptid;
        this.ptage = ptage;
        this.ptname = ptname;
    }
    public int getid(){
        return ptid;
    }
    public String getname(){
        return ptname;
    }
    public int getage(){
        return ptage;
    }
}
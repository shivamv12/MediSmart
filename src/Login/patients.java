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
class patients {
    private int ptid, ptage, ptmob;
    private String ptname, ptgender, ptentry, ptstatus;
    
    public patients(int ptid, String ptname, int ptage, int ptmob, String ptgender, String ptentry, String ptstatus) {
        this.ptid = ptid;
        this.ptname = ptname;
        this.ptage = ptage;
        this.ptmob = ptmob;
        this.ptgender = ptgender;
        this.ptentry = ptentry;
        this.ptstatus = ptstatus;
    }
    public int getid() {
        return ptid;
    }
    public String getname() {
        return ptname;
    }
    public int getage() {
        return ptage;
    }
    public int getmob() {
        return ptmob;
    }
    public String getgender() {
        return ptgender;
    }
    public String getentry() {
        return ptentry;
    }
    public String getstatus() {
        return ptstatus;
    }
}
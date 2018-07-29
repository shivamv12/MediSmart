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
class user {
    private int uid;
    private String uname, umob, utype, ustatus;
    
    public user(int uid, String uname, String umob, String utype, String ustatus) {
        this.uid = uid;
        this.uname = uname;
        this.umob = umob;
        this.utype = utype;
        this.ustatus = ustatus;
    }
    public int getid() {
        return uid;
    }
    public String getname() {
        return uname;
    }
    public String getmob() {
        return umob;
    }
    public String gettype() {
        return utype;
    }
    public String getstatus() {
        return ustatus;
    }
}
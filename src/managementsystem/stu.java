/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managementsystem;

/**
 *
 * @author M.Awais Yousaf Butt
 */
class stu extends universityPersonal{
    private int session;

    public int getSession() {
        return session;
    }

    public String getName() {
        return Name;
    }

    public String getID() {
        return ID;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setSession(int session) {
        this.session = session;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    public String toString(){
    return " ";
    }
}

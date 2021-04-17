/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managementsystem;

import java.util.ArrayList;

/**
 *
 * @author M.Awais Yousaf Butt
 */
class Group {
    private String ID;
    private ArrayList group=new ArrayList<stu>();
    private project projectEvaluation;

    public String getID() {
        return ID;
    }

    public ArrayList getGroup() {
        return group;
    }

    public project getProjectEvaluation() {
        return projectEvaluation;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void addStudent(stu s){
        group.add(s);
    }

    public void setProjectEvaluation(project projectEvaluation) {
        this.projectEvaluation = projectEvaluation;
    }
    
    public String toString(){
        return "";
    }
}

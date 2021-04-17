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
class project {

    private String Title;
    private String Type;
    private String Description;
    private String Status;
    private ArrayList Advisor = new ArrayList<Ad>();
    private ArrayList Evaluation = new ArrayList<Evaluation>();

    public String getTitle() {
        return Title;
    }

    public String getType() {
        return Type;
    }

    public String getDescription() {
        return Description;
    }

    public String getStatus() {
        return Status;
    }

    public ArrayList getAdvisor() {
        return Advisor;
    }

    public ArrayList getEvaluation() {
        return Evaluation;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    public void addAdvisor(Ad a){
    Advisor.add(a);
    }
    public void addEvaluation(Evaluation e){
    Evaluation.add(e);
    }
}

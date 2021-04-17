/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managementsystem;

import java.util.Date;

/**
 *
 * @author M.Awais Yousaf Butt
 */
class Evaluation {
    private String Title;
    private String Task;
    private Date deadline;

    public String getTitle() {
        return Title;
    }

    public String getTask() {
        return Task;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public void setTask(String Task) {
        this.Task = Task;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }
    
    public String toString(){
        return "";
    }
}

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
class Managment {
    private ArrayList project=new ArrayList<project>();
    private ArrayList group=new ArrayList<Group>();
    private ArrayList student=new ArrayList<stu>();
    private ArrayList advisor=new ArrayList<Ad>();
    private ArrayList evaluations=new ArrayList<Evaluation>();
    public void addAdvisor(Ad a){
        advisor.add(a);
    }
    public void updateAdvisor(int id,Ad a){
       advisor.set(id, a);
    }
    public void deleteAdvisor(Ad a){
        advisor.remove(a);
    }
    public void addStudent(stu s){
        student.add(s);
    }
    public void deleteStudent(int s){
        student.remove(s);
    }
    public void addGroup(Group g){
        group.add(g);
    }
    public void updateGroup(int i,Group g){
    group.set(i, g);
    }
    public void addProject(project p){
        project.add(p);
    }
    public void deleteProject(int p){
        project.add(p);
    }
    public void addEvaluation(Evaluation e){
        evaluations.add(e);
    }
    public void deleteEvaluation(int e){
        evaluations.remove(e);
    }
    public void saveGroups(Group g){}
    public void saveEvaluations(Evaluation e){}
    public void saveProjects(project p){}
}


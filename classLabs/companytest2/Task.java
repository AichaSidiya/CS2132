package project;

import java.util.ArrayList;

public class Task extends Member {
    private int taskID;
    private String title;
    private String fromDate;
    private String toDate;
    private int project;
    private ArrayList<Integer> member;
    private ArrayList<Integer> resource;
    private String status;
    private static int count = 1;
    public Task() {
       member = new ArrayList<>();
       resource = new ArrayList<>();
       taskID = count;
       status = "start";
       count++;
    }


    public Task(String title, String fromDate, String toDate, int project, String status) {
        this.taskID = count;
        this.title = title;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.project = project;
        this.status = status;
        status = "start";
        count++;
    }


    public int getTaskID() {
        return taskID;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getFromDate() {
        return fromDate;
    }


    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }


    public String getToDate() {
        return toDate;
    }


    public void setToDate(String toDate) {
        this.toDate = toDate;
    }


    public int getProject() {
        return project;
    }


    public void setProject(int project) {
        this.project = project;
    }


    public ArrayList<Integer> getMember() {
        return member;
    }


    public void setMember(int member) {
        this.member.add(member);
    }


    public ArrayList<Integer> getResource() {
        return resource;
    }


    public void setResource(int resource) {
        this.resource.add(resource);
    }


    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }


    public int getCount() {
        return count;
    }
    
    @Override
    public String toString() {
        String str =  "Task ID: " + taskID 
                + "\nTitle: " + title 
                + "\nFrom: " + fromDate 
                + "\nto: " + toDate 
                + "\n Project ID: " + project
                + "\n Member ID: [";
        for(int i = 0; i<member.size(); i++){
            str += member.get(i) + " ";
        }
        str += "]\nResource ID: [";
        for(int i = 0; i<resource.size(); i++){
            str += resource.get(i) + " ";
        }
        str += "]\nStatus: " +status+ "\n";
        return str;
    }  
    
}

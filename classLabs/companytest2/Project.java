package project;

public class Project {
    private int projectID;
    private String projectName;
    private static int count = 1;
    public Project() {
        projectID = count;
        count++;
    }


    public Project(String projectName) {
        this.projectID = count;
        this.projectName = projectName;
        count++;
    }


    public void setProjectID(int ProjectID) {
        this.projectID = ProjectID;
    } 
    
    public int getProjectID() {
        return projectID;
    }
    
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }


    public String getProjectName() {
        return projectName;
    }



    public static int getCount() {
        return count;
    }
    
    @Override
    public String toString() {
        return "Project ID: " + projectID + "\nProject Name: " + projectName + "\n";
    }
}

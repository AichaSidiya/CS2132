package project;

public class Resource {
    int resourceID;
    String resouceName;
    private static int count = 1;
    public Resource() {
        resourceID = count;
        count++;
    }


    public Resource(String resouceName) {
        this.resourceID = count;
        this.resouceName = resouceName;
        count++;
    }


    
    public void serResourceID(int resourceID) {
    	this.resourceID = resourceID;
    } 
    
    
    public int getResourceID() {
        return resourceID;
    }


    
    public void setResouceName(String resouceName) {
        this.resouceName = resouceName;
    }  
    
    
    public String getResouceName() {
        return resouceName;
    }


    public static int getCount() {
        return count;
    }
    
    @Override
    public String toString() {
        return "Resource ID: " + resourceID + "\nResouce Name:" + resouceName + "\n";
    }   
    
}

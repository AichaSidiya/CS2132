package project;

import java.util.ArrayList;
import java.util.Scanner;

public class ProjectManagement {


    static Scanner reader = new Scanner(System.in);
    static ArrayList<Project> project = new ArrayList<>();
    static ArrayList<Member> member = new ArrayList<>();
    static ArrayList<Resource> resource = new ArrayList<>();
    static ArrayList<Task> task = new ArrayList<>();


    public static void addProject() {
        project.add(new Project());
        System.out.print("Enter project name: ");
        project.get(project.get(0).getCount() - 2).setProjectName(reader.nextLine());
        System.out.println("Project added.");
    }


    public static void editProject() {
        System.out.print("Enter ID of project you want to edit: ");
        int edit = Integer.parseInt(reader.nextLine());
        int flag = 0;
        int index = 0;
        for (int i = 0; i < project.size(); i++) {
            if (project.get(i) != null) {
                if (edit == project.get(i).getProjectID()) {
                    index = i;
                    flag = 1;
                    break;
                }
            }


        }
        if (flag == 1) {
            System.out.print("Enter new name of the project: ");
            project.get(index).setProjectName(reader.nextLine());
            System.out.println("Project successfully updated.");
        } else {
            System.out.println("Project does not exist.");
        }
    }


    public static void removeProject() {
        System.out.print("Enter ID of project you want to delete: ");
        int delete = Integer.parseInt(reader.nextLine());
        int flag = 0;
        for (int i = 0; i < project.size(); i++) {
            if (project.get(i) != null) {
                if (delete == project.get(i).getProjectID()) {
                    project.set(i, null);
                    flag = 1;
                    break;
                }
            }


        }
        if (flag == 1) {
            System.out.println("Project successfully deleted");
        } else {
            System.out.println("Project does not exist.");
        }
    }


    public static void displayProject() {
        for (int i = 0; i < project.size(); i++) {
            if (project.get(i) != null) {
                System.out.println(project.get(i).toString());
            }
        }
    }


    public static void addMember() {
    	Member m = new Member();
    	
    	System.out.print("Enter member name: ");
        m.setMemberName(reader.nextLine());
        System.out.print("Enter Email: ");
        m.setEmail(reader.nextLine());
        
        member.add(m);
        System.out.println("Member added.");
    }


    public static void editMember() {
        System.out.print("Enter ID of member you want to edit: ");
        int edit = Integer.parseInt(reader.nextLine());
        int flag = 0;
        int index = 0;
        for (int i = 0; i < member.size(); i++) {
            if (member.get(i) != null) {
                if (edit == member.get(i).getMemberID()) {
                    index = i;
                    flag = 1;
                    break;
                }
            }


        }
        if (flag == 1) {
            System.out.println("[1]Update Name");
            System.out.println("[2]Update Address");
            System.out.println("[3]Update Contact Information");
            System.out.println("[4]Update Email Address");
            System.out.print("What do you want to update: ");
            int choice = Integer.parseInt(reader.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Enter new name: ");
                    member.get(index).setMemberName(reader.nextLine());
                    break;
                case 2:
                    System.out.print("Enter new contact info: ");
                    member.get(index).setPhonenum(Integer.parseInt(reader.nextLine()));
                    break;
                case 3:
                    System.out.print("Enter new email address: ");
                    member.get(index).setEmail(reader.nextLine());
                    break;
                default:
                    System.out.println("You did not choose anything");
                    break;
            }
            System.out.println("Member successfully updated.");
        } else {
            System.out.println("Member does not exist.");
        }
    }


    public static void removeMember() {
        System.out.print("Enter ID of member you want to delete: ");
        int delete = Integer.parseInt(reader.nextLine());
        int flag = 0;
        for (int i = 0; i < member.size(); i++) {
            if (member.get(i) != null) {
                if (delete == member.get(i).getMemberID()) {
                    member.set(i, null);
                    flag = 1;
                    break;
                }
            }


        }
        if (flag == 1) {
            System.out.println("Member successfully deleted");
        } else {
            System.out.println("Member does not exist.");
        }
    }


    public static void displayMember() {
        for (int i = 0; i < member.size(); i++) {
            if (member.get(i) != null) {
                System.out.println(member.get(i).toString());
            }


        }
    }


    public static void addResource() {
        resource.add(new Resource());
        System.out.print("Enter Resource name: ");
        resource.get(resource.get(0).getCount() - 2).setResouceName(reader.nextLine());
        System.out.println("Resource added.");
    }


    public static void editResource() {
        System.out.print("Enter ID of resource you want to edit: ");
        int edit = Integer.parseInt(reader.nextLine());
        int flag = 0;
        int index = 0;
        for (int i = 0; i < resource.size(); i++) {
            if (resource.get(i) != null) {
                if (edit == resource.get(i).getResourceID()) {
                    index = i;
                    flag = 1;
                    break;
                }
            }


        }
        if (flag == 1) {
            System.out.print("Enter new name of the resource: ");
            resource.get(index).setResouceName(reader.nextLine());
            System.out.println("Resource successfully updated.");
        } else {
            System.out.println("Resource does not exist.");
        }
    }


    public static void removeResource() {
        System.out.print("Enter ID of resource you want to delete: ");
        int delete = Integer.parseInt(reader.nextLine());
        int flag = 0;
        for (int i = 0; i < resource.size(); i++) {
            if (resource.get(i) != null) {
                if (delete == resource.get(i).getResourceID()) {
                    resource.set(i, null);
                    flag = 1;
                    break;
                }
            }


        }
        if (flag == 1) {
            System.out.println("Resource successfully deleted.");
        } else {
            System.out.println("Resource does not exist.");
        }
    }


    public static void displayResource() {
        for (int i = 0; i < resource.size(); i++) {
            if (resource.get(i) != null) {
                System.out.println(resource.get(i).toString());
            }


        }
    }


    public static void addTask() {
        task.add(new Task());
        System.out.print("Enter task title: ");
        task.get(task.get(0).getCount() - 2).setTitle(reader.nextLine());
        System.out.print("Enter start date: ");
        task.get(task.get(0).getCount() - 2).setFromDate(reader.nextLine());
        System.out.print("Enter end date: ");
        task.get(task.get(0).getCount() - 2).setToDate(reader.nextLine());
        System.out.println("[List of Projects]");
        do {
            System.out.print("Enter the project ID you want the task to belong to: ");
            int projectID = Integer.parseInt(reader.nextLine());
            int flag = 0;
            for (int i = 0; i < project.size(); i++) {
                if (project.get(i) != null) {
                    if (project.get(i).getProjectID() == projectID) {
                        flag = 1;
                        break;
                    }
                }


            }
            if (flag == 1) {
                task.get(task.get(0).getCount() - 2).setProject(projectID);
                System.out.println("Task added to the project.");
                break;
            } else {
                System.out.println("The project doesn't exist.");
            }
        } while (true);


        System.out.println("Task added.");
    }


    public static void setTaskMember() {
        int index = 0;
        do {
            System.out.print("Enter the ID of task you want to set Members to: ");
            int taskID = Integer.parseInt(reader.nextLine());
            int flag = 0;
            index = 0;
            for (int i = 0; i < task.size(); i++) {
                if (task.get(i) != null) {
                    if (task.get(i).getTaskID() == taskID) {
                        index = i;
                        flag = 1;
                        break;
                    }
                }
            }
            if (flag == 1) {
                break;
            } else {
                System.out.println("The project doesn't exist.");
            }
        } while (true);


        System.out.print("Enter the ID of Member you want to add to the task: ");
        int memberID = Integer.parseInt(reader.nextLine());
        int flag = 0;
        for (int i = 0; i < member.size(); i++) {
            if (member.get(i) != null) {
                if (member.get(i).getMemberID() == memberID) {
    
                    flag = 1;
                    break;
                }
            }


        }
        if (flag == 1) {
            task.get(index).setMember(memberID);
            System.out.println("Member has been added to the task.");
        } else {
            System.out.println("The member doesn't exist.");
        }


    }


    public static void setTaskResource() {
        int index = 0;
        do {
            System.out.print("Enter the ID of task you want to set Resources to: ");
            int taskID = Integer.parseInt(reader.nextLine());
            int flag = 0;
            index = 0;
            for (int i = 0; i < task.size(); i++) {
                if (task.get(i) != null) {
                    if (task.get(i).getTaskID() == taskID) {
                        index = i;
                        flag = 1;
                        break;
                    }
                }
            }
            if (flag == 1) {
                break;
            } else {
                System.out.println("The project doesn't exist.");
            }
        } while (true);


        System.out.print("Enter the ID of a Resource you want to add to the task: ");
        int resourceID = Integer.parseInt(reader.nextLine());
        int flag = 0;
        for (int i = 0; i < resource.size(); i++) {
            if (resource.get(i) != null) {
                if (resource.get(i).resourceID == resourceID) {
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 1) {
            for (int i = 0; i < task.size(); i++) {
                if (task.get(i) != null) {
                    for (int j = 0; j < task.get(i).getResource().size(); j++) {
                        if (task.get(i).getResource().get(j) == resourceID) {
                            flag = 2;
                            break;
                        }
                        if (flag == 2) {
                            break;
                        }
                    }
                }
            }
            if (flag == 2) {
                System.out.println("Resource already allocated to another task. ");
            } else {
                task.get(index).setResource(resourceID);
                System.out.println("Resource has been added to the task.");


            }
        } else {
            System.out.println("The Resource doesn't exist.");
        }
    }


    public static void setTaskStatus() {
        System.out.print("Enter ID of task you want to edit: ");
        int taskID = Integer.parseInt(reader.nextLine());
        int flag = 0;
        int index = 0;
        for (int i = 0; i < task.size(); i++) {
            if (task.get(i) != null) {
                if (taskID == task.get(i).getTaskID()) {
                    index = i;
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 1) {
            System.out.print("Enter status of the task: ");
            task.get(index).setStatus(reader.nextLine());
            System.out.println("Task status successfully updated.");
        } else {
            System.out.println("Task does not exist.");
        }


    }


    public static void editTask() {
        System.out.print("Enter ID of task you want to edit: ");
        int edit = Integer.parseInt(reader.nextLine());
        int flag = 0;
        int index = 0;
        for (int i = 0; i < task.size(); i++) {
            if (task.get(i) != null) {
                if (edit == task.get(i).getTaskID()) {
                    index = i;
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 1) {
            System.out.println("[1]Update Title");
            System.out.println("[2]Update Start Date");
            System.out.println("[3]Update End Date");
            System.out.print("What do you want to update: ");
            int choice = Integer.parseInt(reader.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Enter new title: ");
                    task.get(index).setTitle(reader.nextLine());
                    break;
                case 2:
                    System.out.print("Enter new start date: ");
                    task.get(index).setFromDate(reader.nextLine());
                    break;
                case 3:
                    System.out.print("Enter new end date: ");
                    task.get(index).setToDate(reader.nextLine());
                    break;
                default:
                    System.out.println("You did not choose anything");
                    break;
            }
            System.out.println("Task successfully updated.");
        } else {
            System.out.println("Task does not exist.");
        }
    }


    public static void removeTask() {
        System.out.print("Enter ID of task you want to delete: ");
        int delete = Integer.parseInt(reader.nextLine());
        int flag = 0;
        for (int i = 0; i < task.size(); i++) {
            if (task.get(i) != null) {
                if (delete == task.get(i).getTaskID()) {
                    task.set(i, null);
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 1) {
            System.out.println("Task successfully deleted.");
        } else {
            System.out.println("Task does not exist.");
        }
    }


    public static void displayTask() {
        for (int i = 0; i < task.size(); i++) {
            if (task.get(i) != null) {
                System.out.println(task.get(i).toString());
            }
        }
    }


    public static void printDelayedTask() {
        for (int i = 0; i < task.size(); i++) {
            if (task.get(i) != null) {
                if (task.get(i).getStatus().equals("delayed")) {
                    System.out.println(task.get(i).toString());
                }
            }


        }
    }


    public static void Menu() {
        do {
            System.out.println("***Project Management System***");
            System.out.println("\t[1] Project Management");
            System.out.println("\t[2] Member Management");
            System.out.println("\t[3] Resource Management");
            System.out.println("\t[4] Task Management");
            System.out.println("\t[5] System Exit.");
            System.out.print("Choose an option: ");
            int option = Integer.parseInt(reader.nextLine());


            switch (option) {
                case 1:
                    do {
                        int flag = 0;
                        System.out.println("[Project Management]");
                        System.out.println("\t[1] Add Project");
                        System.out.println("\t[2] Edit Project");
                        System.out.println("\t[3] Remove Project");
                        System.out.println("\t[4] Display Project");
                        System.out.println("\t[5] Return to main screen.");
                        System.out.print("Enter choice: ");
                        int choice = Integer.parseInt(reader.nextLine());
                        switch (choice) {
                            case 1:
                                addProject();
                                break;
                            case 2:
                                editProject();
                                break;
                            case 3:
                                removeProject();
                                break;
                            case 4:
                                displayProject();
                                break;
                            case 5:
                                flag = 1;
                                break;
                        }
                        if (flag == 1) {
                            break;
                        }
                    } while (true);
                    break;
                case 2:
                    do {
                        int flag = 0;
                        System.out.println("[Member Management]");
                        System.out.println("\t[1] Add Member");
                        System.out.println("\t[2] Edit Member");
                        System.out.println("\t[3] Remove Member");
                        System.out.println("\t[4] Display Member");
                        System.out.println("\t[5] Return to main screen.");
                        System.out.print("Enter choice: ");
                        int choice = Integer.parseInt(reader.nextLine());
                        switch (choice) {
                            case 1:
                                addMember();
                                break;
                            case 2:
                                editMember();
                                break;
                            case 3:
                                removeMember();
                                break;
                            case 4:
                                displayMember();
                                break;
                            case 5:
                                flag = 1;
                        }
                        if (flag == 1) {
                            break;
                        }
                    } while (true);
                    break;
                case 3:
                    do {
                        int flag = 0;
                        System.out.println("[Resource Management]");
                        System.out.println("\t[1] Add Resource");
                        System.out.println("\t[2] Edit Resource");
                        System.out.println("\t[3] Remove Resource");
                        System.out.println("\t[4] Display Resource");
                        System.out.println("\t[5] Return to main screen.");
                        System.out.print("Enter choice: ");
                        int choice = Integer.parseInt(reader.nextLine());
                        switch (choice) {
                            case 1:
                                addResource();
                                break;
                            case 2:
                                editResource();
                                break;
                            case 3:
                                removeResource();
                                break;
                            case 4:
                                displayResource();
                                break;
                            case 5:
                                flag = 1;
                                break;
                        }
                        if (flag == 1) {
                            break;
                        }
                    } while (true);
                    break;
                case 4:
                    do {
                        int flag = 0;
                        System.out.println("[Task Management]");
                        System.out.println("\t[1] Add Task");
                        System.out.println("\t[2] Edit Task");
                        System.out.println("\t[3] Remove Task");
                        System.out.println("\t[4] Display Task");
                        System.out.println("\t[5] Add Task Members");
                        System.out.println("\t[6] Add Task Resources");
                        System.out.println("\t[7] Set Status of Task");
                        System.out.println("\t[8] Return to main screen.");
                        System.out.print("Enter choice: ");
                        int choice = Integer.parseInt(reader.nextLine());
                        switch (choice) {
                            case 1:
                                addTask();
                                break;
                            case 2:
                                editTask();
                                break;
                            case 3:
                                removeTask();
                                break;
                            case 4:
                                displayTask();
                                break;
                            case 5:
                                setTaskMember();
                                break;
                            case 6:
                                setTaskResource();
                                break;
                            case 7:
                                setTaskStatus();
                                break;
                            case 8:
                                flag = 1;
                                break;
                        }
                        if (flag == 1) {
                            break;
                        }
                    } while (true);
                    break;
                case 5:
                    System.exit(0);
            }


        } while (true);
    }


    public static void main(String[] args) {
        Menu();
    }
}

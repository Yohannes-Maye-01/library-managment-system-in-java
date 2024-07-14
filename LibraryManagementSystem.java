import java.util.ArrayList;
public class LibraryManagementSystem {
    private  static  String libraryName;
    private  static String place;
    private static ArrayList<Student> studentslist = new ArrayList<>();

    LibraryManagementSystem(){
        this.libraryName = "Jan-Moscove";
        this.place = "Bahir dar";
    }
    public  static ArrayList<Student> getStudentslist(){
        return  studentslist;
    }

    public static void addStudent(Student std){
        studentslist.add(std);
    }

    public static String getLabName(){
        return libraryName;
    }
    

}

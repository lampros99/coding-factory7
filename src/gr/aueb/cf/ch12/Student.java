package gr.aueb.cf.ch12;

/**
 * Data class.
 * POJO (Plain Old Java Object)
 * Java Bean.
 */
public class Student {
   private static int studentsCount = 0;

   private int id;
   private String fistname;
   private String lastname;

   static {
      studentsCount = 0;
   }

   public Student() { // Default Constructor
      studentsCount++;


   }

   public Student(int id, String firstname, String lastname){// Overloaded Constructor.
      this.id = id;
      this.fistname = firstname;
      this.lastname = lastname;
      studentsCount++;
   }

   public static int getStudentsCount(){
      return studentsCount;
   }


   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getFistname() {
      return fistname;
   }

   public void setFistname(String fistname) {
      this.fistname = fistname;
   }

   public String getLastname() {
      return lastname;
   }

   public void setLastname(String lastname) {
      this.lastname = lastname;
   }
}

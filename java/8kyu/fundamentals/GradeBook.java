// Kyu: 8
// Problem: Convert average score into letter grade
// Mapping: 90=A, 80=B, 70=C, 60=D, else=F

public class GrassHopper {
    public static char getGrade(int s1, int s2, int s3) {
      int average = (s1 + s2 + s3) / 3;  
      
      if(average >= 90) {
        return 'A';
      }else if(average >= 80) {
        return 'B';
      }else if(average >= 70) {
        return 'C';
      }else if(average >= 60) {
        return 'D';
      }else {
        return 'F';
      }
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int duration;
        
        while (true) {
            System.out.println("Name:");
            String tvProgramName = scanner.nextLine();
            
            if (tvProgramName.isEmpty()){
                break;
            }
            
            System.out.println("Duration:");
            duration = scanner.nextInt();
            scanner.nextLine();
            
            programs.add(new TelevisionProgram(tvProgramName, duration));
        }
        
        System.out.println("Program's maximum duration?");
        duration = scanner.nextInt();
        scanner.close();
        
        for (TelevisionProgram program : programs){
            if (program.getDuration() <= duration){
                System.out.println(program.toString());
            }
        }
    }
}

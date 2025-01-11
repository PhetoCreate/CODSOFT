import java.util.ArrayList;

public class App {
    
    public static void main(String[] args) throws Exception {

        String subject = ""; // declaring the types
        String mark = "";

        // Loop break
        Boolean stop = true;

        // Array of subjects and results
        ArrayList<String> subjectlist = new ArrayList<String>();
        ArrayList<Float> markList = new ArrayList<Float>();

        while (stop == true){

            subject = System.console().readLine("Please provide subject name: ");
            subjectlist.add(subject); // add string to array of subjects

            if (subject == ""){
                stop = false;
                break;
            }
            
            mark = System.console().readLine("Provide the result out of 100(in decimal form): ");
            if (mark != ""){
                Float markFloat = Float.parseFloat(mark); // convert the string to a float
                markList.add(markFloat);  // add float to an array
                System.err.println("");
            }

        }

        System.out.println(subjectlist);
        System.out.println(markList);

    }



    public static Float totalMarks(ArrayList<Float> markList){
        Float total = 0.0f;
        for (Float i : markList){
            total += i;
        }

        return total;

    }

    public static float AveragePercentage(int total, ArrayList<Float> markList){
        Float average = 0.0f;
        float arraylength = markList.size();
        average = total/arraylength;

        return average;

    }

    public static void GradeCalculation(){
        
    }

    public static void DisplayResults(){

    }
}

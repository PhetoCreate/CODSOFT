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

            try {
                mark = System.console().readLine(
                    "Provide the result out of 100(in decimal form): ");
                Float markFloat = Float.parseFloat(mark); // convert the string to a float
                markList.add(markFloat);  // add float to an array
                System.err.println("");
            } catch (Exception e) {
                // TODO: handle exception
                stop = false;
                break;
            }
        }

        System.out.println(subjectlist);
        System.out.println(markList);
        ArrayList<Integer> grades = GradeCalculation(markList);
        System.out.println(grades);
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

    public static ArrayList<Integer> GradeCalculation(ArrayList<Float> markList){
        ArrayList<Integer> gradeAssignment = new ArrayList<Integer>();

        for (Float i : markList){
            if (i >= 80.0f){
                gradeAssignment.add(7);
            }else if (i >= 70.0f & i < 80.0f){
                gradeAssignment.add(6);
            }else if (i >= 60.0f & i < 70.0f){
                gradeAssignment.add(5);
            }else if (i >= 50.0f & i < 60.0f){
                gradeAssignment.add(4);
            }else if (i >= 40.0f & i < 50.0f){
                gradeAssignment.add(3);
            }else if (i >= 30.0f & i < 40.0f){
                gradeAssignment.add(2);
            }else {
                gradeAssignment.add(1);
            }
        }
        return gradeAssignment;
    }

    public static void DisplayResults(ArrayList<String> subjectlist, ArrayList<Float> markList, ArrayList<Integer> grades){

    }
}

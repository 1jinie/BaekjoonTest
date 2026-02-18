import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] arg) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line, subject = "", gradeS = "";
        double point = 0;
        double grade = 0;
        double sumGP = 0;
        double sumP = 0;
        double GPA = 0;
        while((line = br.readLine()) != null){                                            // EOF
            StringTokenizer st = new StringTokenizer(line);
            subject = st.nextToken();
            point = Double.parseDouble(st.nextToken());
            gradeS = st.nextToken();                                                      // String type grade
            switch(gradeS){                                                               // int type grade by String type grade
                case "A+": grade = 4.5; break;
                case "A0": grade = 4.0; break;
                case "B+": grade = 3.5; break;
                case "B0": grade = 3.0; break;
                case "C+": grade = 2.5; break;
                case "C0": grade = 2.0; break;
                case "D+": grade = 1.5; break;
                case "D0": grade = 1.0; break;
                case "F": grade = 0; break;
                default: break;
            }
            if(gradeS.equals("P")){                                                        // If grade equals to "P", goes to first line at while
                continue;
            } else {                                                                       // If not "P"
                sumGP += grade * point;
                sumP += point;
                GPA = sumGP / sumP;
            }
        }
        System.out.printf("%f",GPA);
    }

}

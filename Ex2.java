import java.io.*;

class MarkList
{
    public static void main(String args[]) throws Exception
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Student Mark List");

        System.out.println("Enter Enrollment No:");
        String s1 = br.readLine();

        System.out.println("Enter Name:");
        String s2 = br.readLine();

        System.out.println("Enter Java Mark:");
        int m1 = Integer.parseInt(br.readLine());

        System.out.println("Enter CWS Mark:");
        int m2 = Integer.parseInt(br.readLine());

        System.out.println("Enter OS Mark:");
        int m3 = Integer.parseInt(br.readLine());

        int tot = m1 + m2 + m3;
        double avg = tot / 3.0;

        System.out.println("Total Mark: " + tot);
        System.out.println("Average Mark: " + avg);

        if (m1 >= 35 && m2 >= 35 && m3 >= 35)
            System.out.println("Result: Pass");
        else
            System.out.println("Result: Fail");

        if (tot >= 250)
            System.out.println("Grade: O");
        else if (tot >= 200)
            System.out.println("Grade: A+");
        else if (tot >= 150)
            System.out.println("Grade: A");
        else
            System.out.println("Grade: B");
    }
}

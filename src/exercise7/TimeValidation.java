package exercise7;

import java.util.Scanner;

public class TimeValidation {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter hours: ");
    int hours = input.nextInt();

    System.out.print("Enter minutes: ");
    int minutes = input.nextInt();

    boolean timeValid = false;
    timeValid = areHoursValid(hours);
    if (timeValid) {
      timeValid = areMinutesValid(minutes);
    }
    System.out.println("Time valid: " + timeValid);
  }

  public static boolean areHoursValid(int hours) {
    return hours < 24 && hours >= 0;
  }

  public static boolean areMinutesValid(int minutes) {
    return minutes < 60 && minutes >= 0;
  }
}

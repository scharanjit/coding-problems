package timeConversion;

public class TimeConversion {

  public static void main(String[] args) {
    System.out.println(convertTo24HoursFormat("8:23:59PM"));
  }

  private static String convertTo24HoursFormat(String s) {

    String[] str = s.split(":");
    int hour = Integer.parseInt(str[0]);
    String min = str[1];
    String secPeriod = str[2];
    String sec = str[2].substring(0,secPeriod.length()-2);
    String period = str[2].substring(secPeriod.length() -2, secPeriod.length());

    String newTimeInString = "";

    if((hour < 12) && period.equalsIgnoreCase("AM")) {
      newTimeInString = String.format("%02d", hour)+":" + min + ":" + sec;
    }else if ((hour < 12) && period.equalsIgnoreCase("PM")){
      newTimeInString =  12 +  hour+":" + min + ":" + sec;
    } else if ((hour == 12 ) && (period.equalsIgnoreCase("AM"))) {
      newTimeInString = "00"+":"+min+":"+sec;
    }else if ((hour == 12 ) && (period.equalsIgnoreCase("PM"))) {
      newTimeInString = hour+":"+min+":"+sec;
    }


    return newTimeInString;
  }

}

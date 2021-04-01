import java.io.IOException;

public class TimeConversion {
    static String timeConversion(String s) {

        String response = null;
        if(s.charAt(8) == 'P' || s.charAt(8) == 'p'){
            String con = s.substring(0,2);
            String rest = s.substring(2,8);
            int conv = Integer.parseInt(con);
            if(conv<12){
                conv = conv + 12;
            }

            String recon = String.valueOf(conv);
            response = recon.concat(rest);            
        } else if(s.charAt(8) == 'A' || s.charAt(8) == 'a'){
            String con = s.substring(0,2);
            String rest = s.substring(2,8);
            int conv = Integer.parseInt(con);
            if(conv==12){
                conv = 0;
            }
            String zero = "0";
            String recon = String.valueOf(conv);
            response =zero.concat(recon).concat(rest);

        } else {
            String rest = s.substring(0,8);
            response = rest;
        }
        return response;
    }

    public static void main(String[] args) throws IOException{

       // String s = "07:05:45PM"; // return 19:05:45
       // String s = "12:05:45AM"; // return 00:05:45
       // String s = "12:01:45PM"; // return 12:01:45
       // String s = "12:01:45AM"; // return 00:01:45
       // String s = "12:00:00AM"; // return 00:00:00
       // String s = "12:00:00PM"; // return 12:00:00
        String s = "06:40:03AM"; // return 06:40:03

        String result = timeConversion(s);

        System.out.println(result);
    }

}

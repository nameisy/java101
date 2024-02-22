import java.util.Scanner;

//The programme that finds horoscopes. It gives the horoscope name according to the given month and day.
public class ProgrammeThatFindsThePersonsHoroscope {
    public static void main(String[] args) {

        // Defining variables.
        int month,day;
        String horos = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        // It requests birth month and day information from the user.
        System.out.print("The month you were born: ");
        month = input.nextInt();

        System.out.print("The day you were born: ");
        day = input.nextInt();

        // Identification of the zodiac signs.
        switch (month) {
            case 1:
                if (day >= 1 && day <= 31) {
                    if (day < 21) {
                        horos = "Capricorn";
                    } else {
                        horos = "Aquarius";
                    }
                } else {
                    isError = true;
                }
                break;

            case 2:
                if (day >= 1 && day <= 29) {
                    if (day < 19) {
                        horos = "Aquarius";
                    } else {
                        horos = "Pisces";
                    }
                } else {
                    isError = true;
                }
                break;
            case 3:
                 if (day >= 1 && day <= 31) {
                     if (day < 20) {
                         horos = "Pisces";
                     } else {
                         horos = "Aries";
                     }
                 } else {
                         isError = true;
                 }
                 break;
            case 4:
                 if (day >= 1 && day <= 30) {
                    if (day < 20) {
                        horos = "Aries";
                    } else {
                        horos = "Taurus";
                    }
                 } else {
                        isError = true;
                 }
                 break;
            case 5:
                 if (day >= 1 && day <= 31) {
                    if (day < 21) {
                        horos = "Taurus";
                    } else {
                        horos = "Gemini";
                    }
                 } else {
                        isError = true;
                 }
                 break;
            case 6:
                 if (day >= 1 && day <= 30) {
                    if (day < 22) {
                        horos = "Gemini";
                    } else {
                        horos = "Cancer";
                    }
                 } else {
                        isError = true;
                 }
                 break;
            case 7: //
                 if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        horos = "Cancer";
                    } else {
                        horos = "leo Zodiac";
                    }
                 } else{
                        isError = true;
                 }
                 break;

            case 8:
                 if (day >= 1 && day <= 30) {
                    if (day < 22) {
                         horos = "leo Zodiac";
                    } else {
                         horos = "Virgo";
                    }
                 } else {
                         isError = true;
                 }
                 break;
            case 9:
                 if (day >= 1 && day <= 31) {
                    if (day < 22) {
                         horos = "Virgo";
                    } else {
                         horos = "Libra";
                    }
                 } else {
                         isError = true;
                 }
                 break;
            case 10:
                 if (day >= 1 && day <= 30) {
                    if (day < 21) {
                         horos = "Libra";
                    } else {
                         horos = "Scorpio";
                    }
                 } else {
                         isError = true;
                 }
                 break;
            case 11:
                 if (day >= 1 && day <= 31) {
                    if (day < 21) {
                         horos = "Scorpio";
                    } else {
                         horos = "Sagittarius";
                    }
                 } else {
                         isError = true;
                 }
                 break;
            case 12:
                 if (day >= 1 && day <= 30) {
                     if (day < 23) {
                         horos = "Sagittarius";
                     } else {
                         horos = "Capricorn";
                     }
                     } else{
                         isError = true;
                     }
                 break;
            default:
                isError = true;
        }
        if (isError) {
            System.out.println("You logged in incorrectly, try again.") ;
        }else {

            System.out.println("Hello, your zodiac sign: " + horos);
        }


    }
}

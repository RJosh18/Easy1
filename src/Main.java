public class Main {

        public static int lengthOfTheLastWord(String s) {

            s = s.trim();
            int Space = s.lastIndexOf(' ');
            //Here Space indicates the last space
            if (Space == -1) {
                return s.length();
            }
            else {
                return s.substring(Space+1).length();
            }
        }
    public static void main(String[] args) {
        String s = "Fly me to the moon";
        int length = lengthOfTheLastWord(s);
        System.out.println("Length of last word of the given string is:" + length);
    }
    }


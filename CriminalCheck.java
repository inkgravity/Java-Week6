public class CriminalCheck {
        public static boolean isCriminal( String name){
        return name.equals("Jack the Ripper");
    }

    public static void main (String[] args){

        boolean result;

        result = isCriminal ("Jack the Ripper");

        System.out.println(" is Jack the Ripper a criminal?" + result);
    }
}
    


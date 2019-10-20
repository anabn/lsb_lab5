package stegnography;


public class Main {

    public static void main(String[] args) {
        String message = Constants.MESSAGE;
        String path = Constants.PATH_ORIGIN;
        String pathHidden = Constants.PATH_HIDDEN;

        boolean isSucc = ImageSteganography.toImg(message, path);
        System.out.println("Saving data into image");
        System.out.println("Do we have the positive result? - " + isSucc);

        System.out.println("The length of our message : [ " + message.length() + " ] ");
        String text = ImageSteganography.fromImg(pathHidden);
        System.out.println("Decoded text from message : \n\t" + text);


    }
}

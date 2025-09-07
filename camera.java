package camera;

public class camera {
    public void takePicture(String mode){
        System.out.println("Taking pic in"+mode+"mode");
    }
    public void takePicture(int resolution){
System.out.println("Taking pic in"+ resolution+"megapixel");


    }
    public void takePicture(String mode ,int resolution){
        System.out.println("taking a "+ resolution+"megapixels picture in"+ mode + "mode.");
        
    }
}

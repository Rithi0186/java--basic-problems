package camera;

public class Main {
    public static void main(String[] args) {
        camera myfavCamera=new camera();
        myfavCamera.takePicture("portrait");
        myfavCamera.takePicture(12);
        myfavCamera.takePicture("landscape", 23);
    }
    
}

import controller.RawatJalanController;
import models.RawatJalanModels;

public class App {
    public static void main(String[] args) {
        RawatJalanModels.dataAdmin();
//        RawatJalanModels.dataKamar();
        RawatJalanController objRawat = new RawatJalanController();
        objRawat.menu();
    }
}
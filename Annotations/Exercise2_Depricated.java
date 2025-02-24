package Annotations;
class LegacyAPI {

    @Deprecated(since = "1.8", forRemoval = true)
    public void oldFeature() {
        System.out.println("please use newFeature() instead of this...");
    }
    public void newFeature() {
        System.out.println("good, you are using newFeature().....");
    }
}
public class Exercise2_Depricated {
    public static void main(String[] args) {
        LegacyAPI ver = new LegacyAPI();
        ver.oldFeature();// when you using old version....
        ver.newFeature();// when you using new version....
    }
}
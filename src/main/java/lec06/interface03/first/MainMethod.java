package lec06.interface03.first;

public class MainMethod {

    public static void main(String[] args) {

        SampleClass sampleClass = new SampleClass();

        sampleClass.abstractMethod();
        sampleClass.defaultMethod();
        sampleClass.callPrivateMethodInmDefaultMethod();
        sampleClass.interfaceMethod();

        String strOsName = sampleClass.OS_NAME;
        String strDownloadPaht = sampleClass.DOWNLOAD_PATH;

        System.out.println(strOsName);
        System.out.println(strDownloadPaht);

        SampleInterface.sampleFirst sampleFirst = new SampleInterface.sampleFirst();
        int sampleCount = sampleFirst.sampleCount;
        System.out.println("sampleCount : " + sampleCount);

        SampleInterface.D create = SampleInterface.D.CREATE;
        SampleInterface.D read = SampleInterface.D.READ;
        SampleInterface.D update = SampleInterface.D.UPDATE;
        SampleInterface.D delete = SampleInterface.D.DELETE;

        System.out.println(create);
        System.out.println(read);
        System.out.println(update);
        System.out.println(delete);
    }
}

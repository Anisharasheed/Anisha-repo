package Task1;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        String myFile = "data.txt";
        File file = new File(myFile);
        File directory = new File("./");

        FileHandler.ensureFileExists(file);
        FileHandler.verifyPath(myFile);
        FileHandler.checkAccess(myFile);

        FileInfo.displayPath(file);
        FileInfo.identifyFileType(myFile);
        FileInfo.retrieveLastModified(myFile);
        FileInfo.calculateFileSize(myFile);

        FileFilter.displayFiles(directory);
        FileFilter.filterFilesByExtension(directory, "log");

        FileReaderUtil.loadFileToByteArray(myFile);
        FileReaderUtil.processFileLineByLine(myFile);
        FileReaderUtil.fetchCompleteFile(myFile);

        UserInputHandler.getInputFromUser();
    }
}

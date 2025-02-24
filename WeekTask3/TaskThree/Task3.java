package Task1;
import java.io.File;
import java.util.Arrays;
import java.util.Optional;

public class FileFilter {
    public static void displayFiles(File dir) {
        Optional.ofNullable(dir.list()).ifPresent(list -> Arrays.stream(list).forEach(System.out::println));
    }

    public static void filterFilesByExtension(File dir, String ext) {
        Optional.ofNullable(dir.listFiles((d, name) -> name.endsWith("." + ext)))
                .ifPresent(list -> Arrays.stream(list).map(File::getName).forEach(System.out::println));
    }
}

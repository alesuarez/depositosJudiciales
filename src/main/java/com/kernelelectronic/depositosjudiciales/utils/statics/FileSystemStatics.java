package com.kernelelectronic.depositosjudiciales.utils.statics;

import java.io.File;
import java.nio.file.CopyOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.Files;

public class FileSystemStatics {

    public static boolean restoreFileFromBackup(String backupFileName, String oldFileName){

        File fileOld = new File(oldFileName);
        Path backupFilePath = Paths.get(backupFileName);
        Path newFilePath = Paths.get(oldFileName);

        try {
            fileOld.delete();

            CopyOption[] options = new CopyOption[]{
                    StandardCopyOption.REPLACE_EXISTING,
                    StandardCopyOption.COPY_ATTRIBUTES
            };
            Files.copy(backupFilePath, newFilePath, options);
        } catch (Exception e){
            System.out.println("Algo salio mal al renombrar o crear backup");
            return false;
        }
        return true;
    }
}

import programFiles.CText;
import programFiles.Options;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Demeter {

    static CText ctxt;

    //final String outputDir = ctxt.getOptions().getScratchDir().getAbsolutePath();  // Train wreck
    //final String outputDir = ctxt.options.scratchDir.absolutePath;  // Public variables and no methods.
    static Options opts = ctxt.getOptions();

    static File scratchDir = opts.getScratchDir();

    static final String outputDir = scratchDir.getAbsolutePath();





    // Hiding structure
    public static void hidingStructure() throws FileNotFoundException {
        ctxt.getScratchDirectoryOption().getAbsolutePath();

        String className = null;
        String outFile = outputDir + "/" + className.replace('.', '/') + ".class";

        FileOutputStream fout = new FileOutputStream(outFile);

        BufferedOutputStream bos = new BufferedOutputStream(fout);

        String classFileName = "Point.java";
        BufferedOutputStream bufferedOutputStream = ctxt.createScratchFileStream(classFileName);
    }
}
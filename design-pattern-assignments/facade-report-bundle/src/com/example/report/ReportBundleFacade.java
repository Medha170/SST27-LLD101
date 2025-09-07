package com.example.report;

import java.nio.file.Path;
import java.util.Map;

public class ReportBundleFacade {
    Path export(Map<String, Object> data, Path outDir, String baseName){
        JsonWriter jw = new JsonWriter();
        Zipper z = new Zipper();
        AuditLog log = new AuditLog();
        Path json = jw.write(data, outDir, baseName);
        Path zip = z.zip(json, outDir.resolve(baseName + ".zip"));
        log.log("exported " + zip);
        return zip;
    }
}

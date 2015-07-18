package org.kallithea.ldap.sync.cmd;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.converters.FileConverter;
import java.io.File;

/**
 * Command line arguments descriptor
 *
 * @author Michal Hlavac <hlavki@hlavki.eu>
 */
public final class MainCmdArgs {

    @Parameter(names = {"--dry"}, description = "Dry run")
    private boolean dryRun = false;
    @Parameter(names = {"-c", "--config"}, converter = FileConverter.class, description = "XML Configuration file")
    private File config = new File("conf/ldap-sync.properties");
    @Parameter(names = "--help", help = true, description = "Show this help.")
    private boolean usage;

    public MainCmdArgs() {
    }

    public boolean isDryRun() {
        return dryRun;
    }

    public File getConfig() {
        return config;
    }

    public boolean isUsage() {
        return usage;
    }

}

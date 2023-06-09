package com.ramussoft.common;

public class Metadata {

    private static final String APPLICATION_NAME = "Ramus";

    private static final String APPLICATION_VERSION = "2.0.2";

    private static final String FILE_PREFERED_MINIMUM_VERSION = "2.0";

    private static final String FILE_OPEN_MINIMUM_VERSION = "2.0";

    public static final boolean DEBUG = true;

    public static final boolean CORPORATE = true;

    @SuppressWarnings("unused")
    public static final boolean EDUCATIONAL = false && !CORPORATE;

    public static final boolean DEMO = !EDUCATIONAL && !CORPORATE;

    public static final boolean CLIENT = false;

    public static final boolean LOCAL_VERSION_DISABLE = false;

    public static boolean DEMO_REGISTERED = !DEMO;

    public static String REGISTERED_FOR = null;

    public static boolean HIDE_SPLASH;

    /**
     * @return the APPLICATION_NAME
     */
    public static String getApplicationName() {
        String applicationName = System
                .getProperty("user.ramus.application.name");
        if (applicationName == null)
            applicationName = APPLICATION_NAME;
        if (EDUCATIONAL)
            applicationName += " Educational";
        return applicationName;
    }

    /**
     * @return the aPPLICATION_VERSION
     */
    public static String getApplicationVersion() {
        String version = System.getProperty("user.ramus.application.version");
        if (version == null)
            return APPLICATION_VERSION;
        return version;
    }

    /**
     * @return the fILE_OPEN_MINIMUM_VERSION
     */
    public static String getFileOpenMinimumVersion() {
        String version = System.getProperty("user.ramus.file.version");
        if (version == null)
            return FILE_OPEN_MINIMUM_VERSION;
        return version;
    }

    public static String getFilePreferedMinimumVersion() {
        return FILE_PREFERED_MINIMUM_VERSION;
    }

}

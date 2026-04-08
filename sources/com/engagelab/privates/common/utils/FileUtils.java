package com.engagelab.privates.common.utils;

import android.content.Context;
import android.text.TextUtils;
import com.engagelab.privates.common.log.MTCommonLog;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class FileUtils {
    private static final String TAG = "FileUtils";

    /* JADX INFO: renamed from: com.engagelab.privates.common.utils.FileUtils$a */
    /* JADX INFO: compiled from: Proguard */
    public static class C2496a implements Comparator<File> {
        /* JADX INFO: renamed from: a */
        public int m13122a(File file, File file2) {
            if (file.lastModified() > file2.lastModified()) {
                return -1;
            }
            return file.lastModified() < file2.lastModified() ? 1 : 0;
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(File file, File file2) {
            return m13122a(file, file2);
        }
    }

    /* JADX INFO: renamed from: com.engagelab.privates.common.utils.FileUtils$b */
    /* JADX INFO: compiled from: Proguard */
    public static class C2497b implements Comparator<File> {
        /* JADX INFO: renamed from: a */
        public int m13123a(File file, File file2) {
            long jLastModified = file.lastModified() - file2.lastModified();
            if (jLastModified < 0) {
                return -1;
            }
            return jLastModified > 0 ? 1 : 0;
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(File file, File file2) {
            return m13123a(file, file2);
        }
    }

    public static void createFileIfNeed(File file) {
        if (file == null || file.exists()) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        try {
            file.createNewFile();
        } catch (Throwable unused) {
        }
    }

    public static boolean createHtmlFile(String str, String str2) {
        MTCommonLog.m13010d(TAG, "action:createHtmlFile - filePath:" + str + ", content:" + str2);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        return save(str, str2);
    }

    public static boolean createImgFile(String str, byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return false;
        }
        return save(str, bArr);
    }

    public static void deleteCacheFileMaximum(String str, int i) {
        File[] fileArrListFiles;
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            File file = new File(str);
            if (file.exists() && !file.isFile() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length != 0) {
                MTCommonLog.m13010d(TAG, "cacheFiles.length " + fileArrListFiles.length);
                if (fileArrListFiles.length <= i) {
                    return;
                }
                List listAsList = Arrays.asList(fileArrListFiles);
                Collections.sort(listAsList, new C2497b());
                for (int i2 = 0; i2 < listAsList.size() - i; i2++) {
                    File file2 = (File) listAsList.get(i2);
                    if (file2.exists()) {
                        MTCommonLog.m13010d(TAG, "Delete cacheFile " + file2.getAbsolutePath());
                        deleteDirectory(file2);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean deleteDirectory(File file) {
        try {
            if (!file.exists()) {
                return false;
            }
            if (file.isFile()) {
                return file.delete();
            }
            String[] list = file.list();
            if (list != null) {
                for (String str : list) {
                    File file2 = new File(file, str);
                    if (file2.isDirectory()) {
                        deleteDirectory(file2);
                    } else {
                        file2.delete();
                    }
                }
            }
            return file.delete();
        } catch (Exception unused) {
            MTCommonLog.m13011e(TAG, "Delete dir error");
            return false;
        }
    }

    private static void deleteOldDir(Context context, String str, int i, File file) {
        File[] fileArrListFiles;
        if (file == null) {
            file = inFiles(context, str);
        }
        if (file != null && file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length > i) {
            Arrays.sort(fileArrListFiles, new C2496a());
            deleteDirectory(fileArrListFiles[fileArrListFiles.length - 1]);
        }
    }

    public static String getStorageDir(Context context, String str) {
        try {
            File fileInFiles = inFiles(context, str);
            if (fileInFiles == null) {
                MTCommonLog.m13013w(TAG, str + " can't be null");
                return "";
            }
            if (fileInFiles.isFile()) {
                fileInFiles.delete();
            }
            if (!fileInFiles.exists()) {
                fileInFiles.mkdirs();
            }
            return fileInFiles.getAbsolutePath() + File.separator;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static File inFiles(Context context, String str) {
        File filesDir;
        if (context != null && (filesDir = context.getFilesDir()) != null) {
            return new File(filesDir, str);
        }
        MTCommonLog.m13013w(TAG, "can't get file :" + str);
        return null;
    }

    public static boolean isFileExist(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return new File(str).exists();
        } catch (Throwable th) {
            MTCommonLog.m13013w(TAG, "FileUtils e:" + th);
            return false;
        }
    }

    public static Object readObject(File file) throws Throwable {
        ObjectInputStream objectInputStream = null;
        if (file == null || !file.exists() || file.isDirectory()) {
            return null;
        }
        try {
            ObjectInputStream objectInputStream2 = new ObjectInputStream(new FileInputStream(file));
            try {
                Object object = objectInputStream2.readObject();
                Utils.closeQuietly(objectInputStream2);
                return object;
            } catch (Throwable th) {
                th = th;
                objectInputStream = objectInputStream2;
                Utils.closeQuietly(objectInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean save(String str, String str2) {
        byte[] bytes;
        if (str2 != null) {
            try {
                bytes = str2.getBytes("UTF-8");
            } catch (Exception e) {
                MTCommonLog.m13013w(TAG, "getBytes exception:" + e);
                return false;
            }
        } else {
            bytes = null;
        }
        return save(str, bytes);
    }

    public static boolean saveObject(File file, Object obj) {
        ObjectOutputStream objectOutputStream;
        if (file == null || file.isDirectory()) {
            MTCommonLog.m13013w(TAG, "file should not be null or a directory");
            return false;
        }
        try {
            createFileIfNeed(file);
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            try {
                objectOutputStream.writeObject(obj);
                Utils.closeQuietly(objectOutputStream);
                return true;
            } catch (Throwable th) {
                th = th;
                try {
                    MTCommonLog.m13013w(TAG, "save to file exception:" + th + " path = " + file.getAbsolutePath());
                    return false;
                } finally {
                    Utils.closeQuietly(objectOutputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream = null;
        }
    }

    private static boolean save(String str, byte[] bArr) throws Throwable {
        FileOutputStream fileOutputStream;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                File file = new File(str);
                createFileIfNeed(file);
                fileOutputStream = new FileOutputStream(file);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileOutputStream.write(bArr);
            Utils.closeQuietly(fileOutputStream);
            return true;
        } catch (Exception e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            MTCommonLog.m13013w(TAG, "save to file exception:" + e + " path = " + str);
            Utils.closeQuietly(fileOutputStream2);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            Utils.closeQuietly(fileOutputStream2);
            throw th;
        }
    }
}

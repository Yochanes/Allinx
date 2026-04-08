package com.exchange.allin.utils.devicelibrary.utils;

import android.os.Environment;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class FileUtils {
    static {
        File rootDirectory;
        File externalStorageDirectory;
        String absolutePath = "";
        if ("mounted".equals(Environment.getExternalStorageState()) && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            absolutePath = externalStorageDirectory.getAbsolutePath();
        }
        if (!TextUtils.isEmpty(absolutePath) || (rootDirectory = Environment.getRootDirectory()) == null) {
            return;
        }
        rootDirectory.getAbsolutePath();
    }
}

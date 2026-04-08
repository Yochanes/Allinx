package com.google.android.material.color;

import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.work.impl.utils.AbstractC2335a;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@RequiresApi
final class ColorResourcesLoaderCreator {
    private static final String TAG = "ColorResLoaderCreator";

    private ColorResourcesLoaderCreator() {
    }

    @Nullable
    public static ResourcesLoader create(@NonNull Context context, @NonNull Map<Integer, Integer> map) throws Throwable {
        FileDescriptor fileDescriptorM12303l;
        try {
            byte[] bArrCreate = ColorResourcesTableCreator.create(context, map);
            Log.i(TAG, "Table created, length: " + bArrCreate.length);
            if (bArrCreate.length != 0) {
                try {
                    fileDescriptorM12303l = AbstractC2335a.m12303l();
                    try {
                        if (fileDescriptorM12303l != null) {
                            FileOutputStream fileOutputStream = new FileOutputStream(fileDescriptorM12303l);
                            try {
                                fileOutputStream.write(bArrCreate);
                                ParcelFileDescriptor parcelFileDescriptorDup = ParcelFileDescriptor.dup(fileDescriptorM12303l);
                                try {
                                    AbstractC2335a.m12306o();
                                    ResourcesLoader resourcesLoaderM12296e = AbstractC2335a.m12296e();
                                    AbstractC2335a.m12308q(resourcesLoaderM12296e, AbstractC2335a.m12297f(parcelFileDescriptorDup));
                                    if (parcelFileDescriptorDup != null) {
                                        parcelFileDescriptorDup.close();
                                    }
                                    fileOutputStream.close();
                                    Os.close(fileDescriptorM12303l);
                                    return resourcesLoaderM12296e;
                                } finally {
                                }
                            } finally {
                            }
                        }
                        Log.w(TAG, "Cannot create memory file descriptor.");
                        if (fileDescriptorM12303l != null) {
                            Os.close(fileDescriptorM12303l);
                            return null;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (fileDescriptorM12303l != null) {
                            Os.close(fileDescriptorM12303l);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileDescriptorM12303l = null;
                }
            }
            return null;
        } catch (Exception e) {
            Log.e(TAG, "Failed to create the ColorResourcesTableCreator.", e);
            return null;
        }
    }
}

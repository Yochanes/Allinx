package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.RestrictTo;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class TypefaceCompatUtil {
    /* JADX INFO: renamed from: a */
    public static void m7601a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m7602b(File file, Resources resources, int i) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i);
            try {
                boolean zM7603c = m7603c(inputStreamOpenRawResource, file);
                m7601a(inputStreamOpenRawResource);
                return zM7603c;
            } catch (Throwable th) {
                th = th;
                m7601a(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m7603c(InputStream inputStream, File file) throws Throwable {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[UserMetadata.MAX_ATTRIBUTE_SIZE];
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    m7601a(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, i);
            }
        } catch (IOException e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            m7601a(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            m7601a(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public static File m7604d(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static MappedByteBuffer m7605e(Context context, Uri uri) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        try {
            parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                parcelFileDescriptorOpenFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                parcelFileDescriptorOpenFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }
}

package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.activity.RunnableC0048g;
import androidx.annotation.RestrictTo;
import androidx.profileinstaller.ProfileInstaller;
import com.google.android.gms.common.ConnectionResult;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;
import me.jessyan.retrofiturlmanager.BuildConfig;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class DeviceProfileWriter {

    /* JADX INFO: renamed from: a */
    public final Executor f31472a;

    /* JADX INFO: renamed from: b */
    public final ProfileInstaller.DiagnosticsCallback f31473b;

    /* JADX INFO: renamed from: c */
    public final byte[] f31474c;

    /* JADX INFO: renamed from: d */
    public final File f31475d;

    /* JADX INFO: renamed from: e */
    public final String f31476e;

    /* JADX INFO: renamed from: f */
    public boolean f31477f = false;

    /* JADX INFO: renamed from: g */
    public DexProfileData[] f31478g;

    /* JADX INFO: renamed from: h */
    public byte[] f31479h;

    public DeviceProfileWriter(AssetManager assetManager, Executor executor, ProfileInstaller.DiagnosticsCallback diagnosticsCallback, String str, File file) {
        byte[] bArr;
        this.f31472a = executor;
        this.f31473b = diagnosticsCallback;
        this.f31476e = str;
        this.f31475d = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                case BuildConfig.VERSION_CODE /* 25 */:
                    bArr = ProfileVersion.f31510e;
                    break;
                case 26:
                    bArr = ProfileVersion.f31509d;
                    break;
                case 27:
                    bArr = ProfileVersion.f31508c;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = ProfileVersion.f31507b;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = ProfileVersion.f31506a;
        }
        this.f31474c = bArr;
    }

    /* JADX INFO: renamed from: a */
    public final FileInputStream m11491a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f31473b.mo11500b();
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11492b(int i, Serializable serializable) {
        this.f31472a.execute(new RunnableC0048g(this, i, 3, serializable));
    }
}

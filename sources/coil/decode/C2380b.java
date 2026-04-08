package coil.decode;

import android.content.Context;
import android.graphics.Bitmap;
import coil.util.Utils;
import java.io.File;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: coil.decode.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2380b implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33535a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f33536b;

    public /* synthetic */ C2380b(Context context, int i) {
        this.f33535a = i;
        this.f33536b = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Context context = this.f33536b;
        switch (this.f33535a) {
            case 0:
                Bitmap.Config[] configArr = Utils.f33996a;
                File cacheDir = context.getCacheDir();
                if (cacheDir == null) {
                    throw new IllegalStateException("cacheDir == null");
                }
                cacheDir.mkdirs();
                return cacheDir;
            default:
                Bitmap.Config[] configArr2 = Utils.f33996a;
                File cacheDir2 = context.getCacheDir();
                if (cacheDir2 == null) {
                    throw new IllegalStateException("cacheDir == null");
                }
                cacheDir2.mkdirs();
                return cacheDir2;
        }
    }
}

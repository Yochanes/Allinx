package androidx.camera.core.impl.utils;

import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class ExifTag {

    /* JADX INFO: renamed from: a */
    public final int f2889a;

    /* JADX INFO: renamed from: b */
    public final String f2890b;

    /* JADX INFO: renamed from: c */
    public final int f2891c;

    /* JADX INFO: renamed from: d */
    public final int f2892d;

    public ExifTag(String str, int i, int i2) {
        this.f2890b = str;
        this.f2889a = i;
        this.f2891c = i2;
        this.f2892d = -1;
    }

    public ExifTag(int i, int i2, int i3, String str) {
        this.f2890b = str;
        this.f2889a = i;
        this.f2891c = i2;
        this.f2892d = i3;
    }
}

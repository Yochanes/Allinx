package androidx.core.os;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.RequiresApi;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class BundleCompat {

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api33Impl {
        /* JADX INFO: renamed from: a */
        public static Object m7639a(Bundle bundle, String str, Class cls) {
            return bundle.getParcelable(str, cls);
        }

        /* JADX INFO: renamed from: b */
        public static Object[] m7640b(Bundle bundle, String str, Class cls) {
            return bundle.getParcelableArray(str, cls);
        }

        /* JADX INFO: renamed from: c */
        public static ArrayList m7641c(Bundle bundle, String str, Class cls) {
            return bundle.getParcelableArrayList(str, cls);
        }

        /* JADX INFO: renamed from: d */
        public static Serializable m7642d(Bundle bundle, String str, Class cls) {
            return bundle.getSerializable(str, cls);
        }

        /* JADX INFO: renamed from: e */
        public static SparseArray m7643e(Bundle bundle, String str, Class cls) {
            return bundle.getSparseParcelableArray(str, cls);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Object m7634a(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api33Impl.m7639a(bundle, str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static Parcelable[] m7635b(Bundle bundle, String str, Class cls) {
        return Build.VERSION.SDK_INT >= 34 ? (Parcelable[]) Api33Impl.m7640b(bundle, str, cls) : bundle.getParcelableArray(str);
    }

    /* JADX INFO: renamed from: c */
    public static ArrayList m7636c(Bundle bundle, String str, Class cls) {
        return Build.VERSION.SDK_INT >= 34 ? Api33Impl.m7641c(bundle, str, cls) : bundle.getParcelableArrayList(str);
    }

    /* JADX INFO: renamed from: d */
    public static Serializable m7637d(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api33Impl.m7642d(bundle, str, cls);
        }
        Serializable serializable = bundle.getSerializable(str);
        if (cls.isInstance(serializable)) {
            return serializable;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static SparseArray m7638e(Bundle bundle, String str, Class cls) {
        return Build.VERSION.SDK_INT >= 34 ? Api33Impl.m7643e(bundle, str, cls) : bundle.getSparseParcelableArray(str);
    }
}

package androidx.recyclerview.widget;

import androidx.recyclerview.widget.ThreadUtil;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class AsyncListUtil<T> {

    /* JADX INFO: renamed from: androidx.recyclerview.widget.AsyncListUtil$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C21121 implements ThreadUtil.MainThreadCallback<T> {
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.AsyncListUtil$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C21132 implements ThreadUtil.BackgroundCallback<T> {
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class DataCallback<T> {
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class ViewCallback {
    }
}

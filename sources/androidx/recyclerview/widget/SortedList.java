package androidx.recyclerview.widget;

import java.util.Comparator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class SortedList<T> {

    /* JADX INFO: compiled from: Proguard */
    public static class BatchedCallback<T2> extends Callback<T2> {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class Callback<T2> implements Comparator<T2>, ListUpdateCallback {
    }
}

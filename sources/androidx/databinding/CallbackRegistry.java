package androidx.databinding;

import java.util.ArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class CallbackRegistry<C, T, A> implements Cloneable {

    /* JADX INFO: renamed from: a */
    public ArrayList f23654a;

    /* JADX INFO: renamed from: b */
    public long f23655b;

    /* JADX INFO: renamed from: c */
    public long[] f23656c;

    /* JADX INFO: compiled from: Proguard */
    public static abstract class NotifierCallback<C, T, A> {
    }

    public final Object clone() {
        CallbackRegistry callbackRegistry;
        CloneNotSupportedException e;
        int i;
        synchronized (this) {
            try {
                callbackRegistry = (CallbackRegistry) super.clone();
            } catch (CloneNotSupportedException e2) {
                callbackRegistry = null;
                e = e2;
            }
            try {
                callbackRegistry.f23655b = 0L;
                callbackRegistry.f23656c = null;
                callbackRegistry.f23654a = new ArrayList();
                int size = this.f23654a.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (i2 >= 64) {
                        long[] jArr = this.f23656c;
                        if (jArr != null && (i2 / 64) - 1 < jArr.length) {
                            if (((1 << (i2 % 64)) & jArr[i]) != 0) {
                            }
                        }
                        callbackRegistry.f23654a.add(this.f23654a.get(i2));
                    } else if (((1 << i2) & this.f23655b) == 0) {
                        callbackRegistry.f23654a.add(this.f23654a.get(i2));
                    }
                }
            } catch (CloneNotSupportedException e3) {
                e = e3;
                e.printStackTrace();
            }
        }
        return callbackRegistry;
    }
}

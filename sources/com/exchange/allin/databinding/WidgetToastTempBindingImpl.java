package com.exchange.allin.databinding;

import android.util.SparseIntArray;
import com.exchange.allin.R;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class WidgetToastTempBindingImpl extends WidgetToastTempBinding {

    /* JADX INFO: renamed from: g */
    public long f35319g;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(R.id.imageView, 1);
        sparseIntArray.put(R.id.textView, 2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: a */
    public final void mo8239a() {
        synchronized (this) {
            this.f35319g = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public final boolean mo8240b() {
        synchronized (this) {
            try {
                return this.f35319g != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

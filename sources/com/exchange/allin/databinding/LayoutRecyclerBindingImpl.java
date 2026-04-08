package com.exchange.allin.databinding;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class LayoutRecyclerBindingImpl extends LayoutRecyclerBinding {

    /* JADX INFO: renamed from: g */
    public long f35318g;

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: a */
    public final void mo8239a() {
        synchronized (this) {
            this.f35318g = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public final boolean mo8240b() {
        synchronized (this) {
            try {
                return this.f35318g != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

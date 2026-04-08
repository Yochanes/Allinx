package androidx.activity.compose;

import androidx.activity.BackEventCompat;
import androidx.activity.OnBackPressedCallback;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/activity/compose/PredictiveBackHandlerCallback;", "Landroidx/activity/OnBackPressedCallback;", "activity-compose_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
final class PredictiveBackHandlerCallback extends OnBackPressedCallback {

    /* JADX INFO: renamed from: d */
    public CoroutineScope f167d;

    /* JADX INFO: renamed from: e */
    public Function2 f168e;

    /* JADX INFO: renamed from: f */
    public OnBackInstance f169f;

    /* JADX INFO: renamed from: g */
    public boolean f170g;

    @Override // androidx.activity.OnBackPressedCallback
    /* JADX INFO: renamed from: a */
    public final void mo160a() {
        OnBackInstance onBackInstance = this.f169f;
        if (onBackInstance != null) {
            onBackInstance.m181a();
        }
        OnBackInstance onBackInstance2 = this.f169f;
        if (onBackInstance2 != null) {
            onBackInstance2.f158a = false;
        }
        this.f170g = false;
    }

    @Override // androidx.activity.OnBackPressedCallback
    /* JADX INFO: renamed from: b */
    public final void mo161b() {
        OnBackInstance onBackInstance = this.f169f;
        if (onBackInstance != null && !onBackInstance.f158a) {
            onBackInstance.m181a();
            this.f169f = null;
        }
        if (this.f169f == null) {
            this.f169f = new OnBackInstance(this.f167d, false, this.f168e, this);
        }
        OnBackInstance onBackInstance2 = this.f169f;
        if (onBackInstance2 != null) {
            onBackInstance2.f159b.mo11412b(null);
        }
        OnBackInstance onBackInstance3 = this.f169f;
        if (onBackInstance3 != null) {
            onBackInstance3.f158a = false;
        }
        this.f170g = false;
    }

    @Override // androidx.activity.OnBackPressedCallback
    /* JADX INFO: renamed from: c */
    public final void mo162c(BackEventCompat backEventCompat) {
        super.mo162c(backEventCompat);
        OnBackInstance onBackInstance = this.f169f;
        if (onBackInstance != null) {
            onBackInstance.f159b.mo11414v(backEventCompat);
        }
    }

    @Override // androidx.activity.OnBackPressedCallback
    /* JADX INFO: renamed from: d */
    public final void mo163d(BackEventCompat backEventCompat) {
        super.mo163d(backEventCompat);
        OnBackInstance onBackInstance = this.f169f;
        if (onBackInstance != null) {
            onBackInstance.m181a();
        }
        if (this.f90a) {
            this.f169f = new OnBackInstance(this.f167d, true, this.f168e, this);
        }
        this.f170g = true;
    }
}

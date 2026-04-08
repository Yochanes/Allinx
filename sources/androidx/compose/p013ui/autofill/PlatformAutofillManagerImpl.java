package androidx.compose.p013ui.autofill;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import p003C.AbstractC0011b;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@RequiresApi
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/autofill/PlatformAutofillManagerImpl;", "Landroidx/compose/ui/autofill/PlatformAutofillManager;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class PlatformAutofillManagerImpl implements PlatformAutofillManager {

    /* JADX INFO: renamed from: a */
    public final AutofillManager f17308a;

    public PlatformAutofillManagerImpl(AutofillManager autofillManager) {
        this.f17308a = autofillManager;
    }

    /* JADX INFO: renamed from: a */
    public final void m4882a(View view, int i, boolean z2) {
        if (Build.VERSION.SDK_INT >= 27) {
            AbstractC0011b.m36e(this.f17308a, view, i, z2);
        }
    }
}

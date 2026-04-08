package androidx.compose.p013ui.platform;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/platform/AndroidUriHandler;", "Landroidx/compose/ui/platform/UriHandler;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class AndroidUriHandler implements UriHandler {

    /* JADX INFO: renamed from: a */
    public final Context f19308a;

    public AndroidUriHandler(Context context) {
        this.f19308a = context;
    }

    @Override // androidx.compose.p013ui.platform.UriHandler
    /* JADX INFO: renamed from: a */
    public final void mo6096a(String str) {
        try {
            this.f19308a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException e) {
            throw new IllegalArgumentException(AbstractC1313i.m6244a('.', "Can't open ", str), e);
        }
    }
}

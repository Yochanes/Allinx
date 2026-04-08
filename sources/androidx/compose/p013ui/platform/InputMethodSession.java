package androidx.compose.p013ui.platform;

import androidx.compose.p013ui.node.WeakReference;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/platform/InputMethodSession;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class InputMethodSession {

    /* JADX INFO: renamed from: a */
    public final PlatformTextInputMethodRequest f19446a;

    /* JADX INFO: renamed from: b */
    public final Function0 f19447b;

    /* JADX INFO: renamed from: c */
    public final Object f19448c = new Object();

    /* JADX INFO: renamed from: d */
    public final MutableVector f19449d = new MutableVector(new WeakReference[16], 0);

    /* JADX INFO: renamed from: e */
    public boolean f19450e;

    public InputMethodSession(PlatformTextInputMethodRequest platformTextInputMethodRequest, Function0 function0) {
        this.f19446a = platformTextInputMethodRequest;
        this.f19447b = function0;
    }
}

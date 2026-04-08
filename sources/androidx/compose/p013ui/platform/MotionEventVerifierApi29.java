package androidx.compose.p013ui.platform;

import android.view.MotionEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p013ui.graphics.layer.AbstractC1226a;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@Metadata(m18301d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m18302d2 = {"Landroidx/compose/ui/platform/MotionEventVerifierApi29;", "", "Landroid/view/MotionEvent;", "event", "", FirebaseAnalytics.Param.INDEX, "", "a", "(Landroid/view/MotionEvent;I)Z", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class MotionEventVerifierApi29 {

    /* JADX INFO: renamed from: a */
    public static final MotionEventVerifierApi29 f19469a = new MotionEventVerifierApi29();

    @DoNotInline
    /* JADX INFO: renamed from: a */
    public final boolean m6157a(@NotNull MotionEvent event, int index) {
        return (Float.floatToRawIntBits(AbstractC1226a.m5445a(event, index)) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(AbstractC1226a.m5470z(event, index)) & Integer.MAX_VALUE) < 2139095040;
    }
}

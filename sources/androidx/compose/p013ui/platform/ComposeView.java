package androidx.compose.p013ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\t\u001a\u00020\u00062\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\nR*\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8\u0014@RX\u0094\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m18302d2 = {"Landroidx/compose/ui/platform/ComposeView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", FirebaseAnalytics.Param.CONTENT, "setContent", "(Lkotlin/jvm/functions/Function2;)V", "", "<set-?>", "b", "Z", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "getShouldCreateCompositionOnAttachedToWindow$annotations", "()V", "shouldCreateCompositionOnAttachedToWindow", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class ComposeView extends AbstractComposeView {

    /* JADX INFO: renamed from: a */
    public final MutableState f19348a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean shouldCreateCompositionOnAttachedToWindow;

    @JvmOverloads
    public ComposeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // androidx.compose.p013ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        composer.mo4221N(420213850);
        Function2 function2 = (Function2) ((SnapshotMutableStateImpl) this.f19348a).getF20325a();
        if (function2 == null) {
            composer.mo4221N(358356153);
        } else {
            composer.mo4221N(150107208);
            function2.invoke(composer, 0);
        }
        composer.mo4213F();
        composer.mo4213F();
    }

    @Override // android.view.ViewGroup, android.view.View
    @NotNull
    public CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.platform.ComposeView";
    }

    @Override // androidx.compose.p013ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @ComposableInferredTarget
    public final void setContent(@NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        this.shouldCreateCompositionOnAttachedToWindow = true;
        ((SnapshotMutableStateImpl) this.f19348a).setValue(content);
        if (isAttachedToWindow()) {
            createComposition();
        }
    }

    public ComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.f19348a = SnapshotStateKt.m4525g(null);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}

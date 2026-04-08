package io.intercom.android.sdk.p032m5.components;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.p013ui.platform.AbstractComposeView;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.exchange.allin.C2519a;
import io.intercom.android.sdk.models.AttributeType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010!\u001a\u00020\u0014H\u0017¢\u0006\u0002\u0010\"R+\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R7\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R/\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u0012\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006#"}, m18302d2 = {"Lio/intercom/android/sdk/m5/components/IntercomPrimaryButton;", "Landroidx/compose/ui/platform/AbstractComposeView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "<set-?>", "", AttributeType.TEXT, "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "text$delegate", "Landroidx/compose/runtime/MutableState;", "Lkotlin/Function0;", "", "onClick", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "setOnClick", "(Lkotlin/jvm/functions/Function0;)V", "onClick$delegate", "trailingIconId", "getTrailingIconId", "()Ljava/lang/Integer;", "setTrailingIconId", "(Ljava/lang/Integer;)V", "trailingIconId$delegate", "Content", "(Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class IntercomPrimaryButton extends AbstractComposeView {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: onClick$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState onClick;

    /* JADX INFO: renamed from: text$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState text;

    /* JADX INFO: renamed from: trailingIconId$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState trailingIconId;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntercomPrimaryButton(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.m18599g(context, "context");
    }

    private static final Unit Content$lambda$1(IntercomPrimaryButton tmp0_rcvr, int i, Composer composer, int i2) {
        Intrinsics.m18599g(tmp0_rcvr, "$tmp0_rcvr");
        tmp0_rcvr.Content(composer, RecomposeScopeImplKt.m4417a(i | 1));
        return Unit.f51459a;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Unit m15610d() {
        return onClick_delegate$lambda$0();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Unit m15611e(IntercomPrimaryButton intercomPrimaryButton, int i, Composer composer, int i2) {
        return Content$lambda$1(intercomPrimaryButton, i, composer, i2);
    }

    private static final Unit onClick_delegate$lambda$0() {
        return Unit.f51459a;
    }

    @Override // androidx.compose.p013ui.platform.AbstractComposeView
    @ComposableTarget
    @Composable
    public void Content(@Nullable Composer composer, int i) {
        int i2;
        ComposerImpl composerImplMo4239q = composer.mo4239q(346924157);
        if ((i & 14) == 0) {
            i2 = (composerImplMo4239q.mo4220M(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerImplMo4239q.mo4242t()) {
            composerImplMo4239q.mo4246x();
        } else {
            IntercomPrimaryButtonKt.IntercomPrimaryButton(getText(), null, getTrailingIconId(), getOnClick(), composerImplMo4239q, 0, 2);
        }
        RecomposeScopeImpl recomposeScopeImplM4267Y = composerImplMo4239q.m4267Y();
        if (recomposeScopeImplM4267Y != null) {
            recomposeScopeImplM4267Y.f16451d = new C2519a(i, 9, this);
        }
    }

    @NotNull
    public final Function0<Unit> getOnClick() {
        return (Function0) this.onClick.getF20325a();
    }

    @NotNull
    public final String getText() {
        return (String) this.text.getF20325a();
    }

    @Nullable
    public final Integer getTrailingIconId() {
        return (Integer) this.trailingIconId.getF20325a();
    }

    public final void setOnClick(@NotNull Function0<Unit> function0) {
        Intrinsics.m18599g(function0, "<set-?>");
        this.onClick.setValue(function0);
    }

    public final void setText(@NotNull String str) {
        Intrinsics.m18599g(str, "<set-?>");
        this.text.setValue(str);
    }

    public final void setTrailingIconId(@Nullable Integer num) {
        this.trailingIconId.setValue(num);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntercomPrimaryButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.m18599g(context, "context");
    }

    public /* synthetic */ IntercomPrimaryButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntercomPrimaryButton(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.m18599g(context, "context");
        this.text = SnapshotStateKt.m4525g("");
        this.onClick = SnapshotStateKt.m4525g(new C5284d(24));
        this.trailingIconId = SnapshotStateKt.m4525g(null);
    }
}

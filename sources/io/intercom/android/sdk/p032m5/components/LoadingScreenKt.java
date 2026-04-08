package io.intercom.android.sdk.p032m5.components;

import android.content.Context;
import androidx.annotation.DrawableRes;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.facebook.shimmer.ShimmerFrameLayout;
import io.intercom.android.sdk.p041ui.IntercomPreviews;
import io.intercom.android.sdk.p041ui.theme.IntercomTheme;
import io.intercom.android.sdk.p041ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.survey.p038ui.components.LoadingComponentKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a!\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, m18302d2 = {"LoadingScreen", "", "modifier", "Landroidx/compose/ui/Modifier;", "shimmerDrawable", "", "(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;II)V", "LoadingScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class LoadingScreenKt {
    @ComposableTarget
    @Composable
    public static final void LoadingScreen(@Nullable Modifier modifier, @DrawableRes int i, @Nullable Composer composer, int i2, int i3) {
        int i4;
        ComposerImpl composerImplMo4239q = composer.mo4239q(-1767045234);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerImplMo4239q.mo4220M(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= composerImplMo4239q.mo4232j(i) ? 32 : 16;
        }
        if ((i4 & 91) == 18 && composerImplMo4239q.mo4242t()) {
            composerImplMo4239q.mo4246x();
        } else {
            if (i5 != 0) {
                modifier = Modifier.Companion.f17180a;
            }
            long jM22693getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(composerImplMo4239q, IntercomTheme.$stable).m22693getPrimaryText0d7_KjU();
            Modifier modifierThen = modifier.then(SizeKt.f6568c);
            composerImplMo4239q.mo4221N(1035114321);
            boolean zMo4233k = ((i4 & 112) == 32) | composerImplMo4239q.mo4233k(jM22693getPrimaryText0d7_KjU);
            Object objMo4229g = composerImplMo4239q.mo4229g();
            if (zMo4233k || objMo4229g == Composer.Companion.f16228a) {
                objMo4229g = new C5297q(jM22693getPrimaryText0d7_KjU, i);
                composerImplMo4239q.mo4214G(objMo4229g);
            }
            composerImplMo4239q.m4265W(false);
            AndroidView_androidKt.m6706a((Function1) objMo4229g, modifierThen, null, composerImplMo4239q, 0, 4);
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl recomposeScopeImplM4267Y = composerImplMo4239q.m4267Y();
        if (recomposeScopeImplM4267Y != null) {
            recomposeScopeImplM4267Y.f16451d = new C5298r(modifier2, i, i2, i3, 0);
        }
    }

    private static final ShimmerFrameLayout LoadingScreen$lambda$2$lambda$1(long j, int i, Context context) {
        Intrinsics.m18599g(context, "context");
        ShimmerFrameLayout shimmerFrameLayoutBuildLoadingContainer = LoadingComponentKt.buildLoadingContainer(context);
        shimmerFrameLayoutBuildLoadingContainer.addView(LoadingComponentKt.m22449buildLoadingContentbw27NRU(context, j, i));
        return shimmerFrameLayoutBuildLoadingContainer;
    }

    private static final Unit LoadingScreen$lambda$3(Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        LoadingScreen(modifier, i, composer, RecomposeScopeImplKt.m4417a(i2 | 1), i3);
        return Unit.f51459a;
    }

    @ComposableTarget
    @IntercomPreviews
    @Composable
    public static final void LoadingScreenPreview(@Nullable Composer composer, int i) {
        ComposerImpl composerImplMo4239q = composer.mo4239q(-1596356708);
        if (i == 0 && composerImplMo4239q.mo4242t()) {
            composerImplMo4239q.mo4246x();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$LoadingScreenKt.INSTANCE.m22142getLambda1$intercom_sdk_base_release(), composerImplMo4239q, 3072, 7);
        }
        RecomposeScopeImpl recomposeScopeImplM4267Y = composerImplMo4239q.m4267Y();
        if (recomposeScopeImplM4267Y != null) {
            recomposeScopeImplM4267Y.f16451d = new C5291k(i, 6);
        }
    }

    private static final Unit LoadingScreenPreview$lambda$4(int i, Composer composer, int i2) {
        LoadingScreenPreview(composer, RecomposeScopeImplKt.m4417a(i | 1));
        return Unit.f51459a;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Unit m15617a(int i, Composer composer, int i2) {
        return LoadingScreenPreview$lambda$4(i, composer, i2);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ ShimmerFrameLayout m15618b(long j, int i, Context context) {
        return LoadingScreen$lambda$2$lambda$1(j, i, context);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Unit m15619c(Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        return LoadingScreen$lambda$3(modifier, i, i2, i3, composer, i4);
    }
}

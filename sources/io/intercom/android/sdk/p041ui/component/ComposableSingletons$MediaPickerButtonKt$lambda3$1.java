package io.intercom.android.sdk.p041ui.component;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import io.intercom.android.sdk.p041ui.component.MediaPickerButtonCTAStyle;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.intercom.android.sdk.ui.component.ComposableSingletons$MediaPickerButtonKt$lambda-3$1, reason: invalid class name */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class ComposableSingletons$MediaPickerButtonKt$lambda3$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$MediaPickerButtonKt$lambda3$1 INSTANCE = new ComposableSingletons$MediaPickerButtonKt$lambda3$1();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Unit m16693a(List list) {
        return invoke$lambda$0(list);
    }

    private static final Unit invoke$lambda$0(List it) {
        Intrinsics.m18599g(it, "it");
        return Unit.f51459a;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.f51459a;
    }

    @ComposableTarget
    @Composable
    public final void invoke(Composer composer, int i) {
        if ((i & 11) == 2 && composer.mo4242t()) {
            composer.mo4246x();
        } else {
            MediaPickerButtonKt.MediaPickerButton(1, null, null, null, new C5807b(), new MediaPickerButtonCTAStyle.TextButton("Open Picker"), null, ComposableSingletons$MediaPickerButtonKt.INSTANCE.m22564getLambda2$intercom_sdk_ui_release(), composer, 12607494, 78);
        }
    }
}

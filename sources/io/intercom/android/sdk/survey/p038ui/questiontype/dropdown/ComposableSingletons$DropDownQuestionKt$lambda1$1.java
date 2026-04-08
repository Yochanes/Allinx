package io.intercom.android.sdk.survey.p038ui.questiontype.dropdown;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.dropdown.ComposableSingletons$DropDownQuestionKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class ComposableSingletons$DropDownQuestionKt$lambda1$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$DropDownQuestionKt$lambda1$1 INSTANCE = new ComposableSingletons$DropDownQuestionKt$lambda1$1();

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.f51459a;
    }

    @Composable
    public final void invoke(Composer composer, int i) {
        if ((i & 11) == 2 && composer.mo4242t()) {
            composer.mo4246x();
        }
    }
}

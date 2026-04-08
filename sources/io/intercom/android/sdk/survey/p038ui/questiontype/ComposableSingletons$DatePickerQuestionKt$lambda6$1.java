package io.intercom.android.sdk.survey.p038ui.questiontype;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.p038ui.models.Answer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.ComposableSingletons$DatePickerQuestionKt$lambda-6$1, reason: invalid class name */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class ComposableSingletons$DatePickerQuestionKt$lambda6$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$DatePickerQuestionKt$lambda6$1 INSTANCE = new ComposableSingletons$DatePickerQuestionKt$lambda6$1();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Unit m16434a(Answer answer) {
        return invoke$lambda$0(answer);
    }

    private static final Unit invoke$lambda$0(Answer it) {
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
            DatePickerQuestionKt.DatePickerQuestion(null, new SurveyData.Step.Question.DatePickerQuestionModel("123", CollectionsKt.m18413N(new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText("Choose date")), true), null, new C5718a(), null, composer, 3072, 21);
        }
    }
}

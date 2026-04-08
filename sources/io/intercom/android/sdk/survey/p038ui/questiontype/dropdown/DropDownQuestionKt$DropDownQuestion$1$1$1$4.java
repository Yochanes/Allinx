package io.intercom.android.sdk.survey.p038ui.questiontype.dropdown;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.p013ui.focus.FocusManager;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.p038ui.models.Answer;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class DropDownQuestionKt$DropDownQuestion$1$1$1$4 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ SurveyData.Step.Question.DropDownQuestionModel $dropDownQuestionModel;
    final /* synthetic */ MutableState<Boolean> $expanded$delegate;
    final /* synthetic */ FocusManager $focusManager;
    final /* synthetic */ Function1<Answer, Unit> $onAnswer;

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.dropdown.DropDownQuestionKt$DropDownQuestion$1$1$1$4$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m18302d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
    @DebugMetadata(m18558c = "io.intercom.android.sdk.survey.ui.questiontype.dropdown.DropDownQuestionKt$DropDownQuestion$1$1$1$4$1", m18559f = "DropDownQuestion.kt", m18560l = {}, m18561m = "invokeSuspend")
    public static final class C57291 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FocusManager $focusManager;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C57291(FocusManager focusManager, Continuation<? super C57291> continuation) {
            super(2, continuation);
            this.$focusManager = focusManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C57291(this.$focusManager, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((CoroutineScope) obj, (Continuation<? super Unit>) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(obj);
            this.$focusManager.mo4975s(false);
            return Unit.f51459a;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C57291) create(coroutineScope, continuation)).invokeSuspend(Unit.f51459a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DropDownQuestionKt$DropDownQuestion$1$1$1$4(SurveyData.Step.Question.DropDownQuestionModel dropDownQuestionModel, FocusManager focusManager, Function1<? super Answer, Unit> function1, MutableState<Boolean> mutableState) {
        this.$dropDownQuestionModel = dropDownQuestionModel;
        this.$focusManager = focusManager;
        this.$onAnswer = function1;
        this.$expanded$delegate = mutableState;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Unit m16488a(MutableState mutableState, Function1 function1, String str) {
        return invoke$lambda$2$lambda$1$lambda$0(function1, str, mutableState);
    }

    private static final Unit invoke$lambda$2$lambda$1$lambda$0(Function1 onAnswer, String optionText, MutableState expanded$delegate) {
        Intrinsics.m18599g(onAnswer, "$onAnswer");
        Intrinsics.m18599g(optionText, "$optionText");
        Intrinsics.m18599g(expanded$delegate, "$expanded$delegate");
        onAnswer.invoke(new Answer.SingleAnswer(optionText));
        DropDownQuestionKt.access$DropDownQuestion$lambda$2(expanded$delegate, false);
        return Unit.f51459a;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f51459a;
    }

    @ComposableTarget
    @Composable
    public final void invoke(ColumnScope DropdownMenu, Composer composer, int i) {
        Composer composer2 = composer;
        Intrinsics.m18599g(DropdownMenu, "$this$DropdownMenu");
        if ((i & 81) == 16 && composer.mo4242t()) {
            composer.mo4246x();
            return;
        }
        EffectsKt.m4372e(composer, "", new C57291(this.$focusManager, null));
        List<String> options = this.$dropDownQuestionModel.getOptions();
        Function1<Answer, Unit> function1 = this.$onAnswer;
        MutableState<Boolean> mutableState = this.$expanded$delegate;
        int i2 = 0;
        for (Object obj : options) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.m18455s0();
                throw null;
            }
            String str = (String) obj;
            ComposableLambdaImpl composableLambdaImplM4735c = ComposableLambdaKt.m4735c(-864903633, composer, new DropDownQuestionKt$DropDownQuestion$1$1$1$4$2$1(str));
            composer.mo4221N(55713486);
            boolean zMo4220M = composer.mo4220M(function1) | composer.mo4220M(str);
            Object objMo4229g = composer.mo4229g();
            if (zMo4220M || objMo4229g == Composer.Companion.f16228a) {
                objMo4229g = new C5731b(mutableState, function1, str);
                composer.mo4214G(objMo4229g);
            }
            composer.mo4213F();
            AndroidMenu_androidKt.m3864b(composableLambdaImplM4735c, (Function0) objMo4229g, null, false, null, null, composer2, 6);
            composer2 = composer;
            i2 = i3;
        }
    }
}

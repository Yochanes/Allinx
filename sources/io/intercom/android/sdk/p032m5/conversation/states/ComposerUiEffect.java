package io.intercom.android.sdk.p032m5.conversation.states;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ComposerUiEffect;", "", "<init>", "()V", "ReportAiAnswer", "Lio/intercom/android/sdk/m5/conversation/states/ComposerUiEffect$ReportAiAnswer;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public abstract class ComposerUiEffect {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ComposerUiEffect$ReportAiAnswer;", "Lio/intercom/android/sdk/m5/conversation/states/ComposerUiEffect;", "<init>", "()V", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class ReportAiAnswer extends ComposerUiEffect {
        public static final int $stable = 0;

        @NotNull
        public static final ReportAiAnswer INSTANCE = new ReportAiAnswer();

        private ReportAiAnswer() {
            super(null);
        }
    }

    public /* synthetic */ ComposerUiEffect(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ComposerUiEffect() {
    }
}

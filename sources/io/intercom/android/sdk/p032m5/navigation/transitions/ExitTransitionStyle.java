package io.intercom.android.sdk.p032m5.navigation.transitions;

import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\t\u001a\u0004\u0018\u00010\nH&j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\u000b"}, m18302d2 = {"Lio/intercom/android/sdk/m5/navigation/transitions/ExitTransitionStyle;", "", "<init>", "(Ljava/lang/String;I)V", "SLIDE_DOWN", "SLIDE_OUT_RIGHT", "SLIDE_OUT_LEFT", "NONE", "NULL", "transition", "Landroidx/compose/animation/ExitTransition;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public abstract class ExitTransitionStyle {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ExitTransitionStyle[] $VALUES;
    public static final ExitTransitionStyle SLIDE_DOWN = new SLIDE_DOWN("SLIDE_DOWN", 0);
    public static final ExitTransitionStyle SLIDE_OUT_RIGHT = new SLIDE_OUT_RIGHT("SLIDE_OUT_RIGHT", 1);
    public static final ExitTransitionStyle SLIDE_OUT_LEFT = new SLIDE_OUT_LEFT("SLIDE_OUT_LEFT", 2);
    public static final ExitTransitionStyle NONE = new NONE("NONE", 3);
    public static final ExitTransitionStyle NULL = new NULL("NULL", 4);

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m18302d2 = {"io/intercom/android/sdk/m5/navigation/transitions/ExitTransitionStyle.NONE", "Lio/intercom/android/sdk/m5/navigation/transitions/ExitTransitionStyle;", "transition", "Landroidx/compose/animation/ExitTransition;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class NONE extends ExitTransitionStyle {
        public NONE(String str, int i) {
            super(str, i, null);
        }

        @Override // io.intercom.android.sdk.p032m5.navigation.transitions.ExitTransitionStyle
        @NotNull
        public ExitTransition transition() {
            ExitTransition exitTransition = ExitTransition.f4198a;
            return ExitTransition.f4198a;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\u0004"}, m18302d2 = {"io/intercom/android/sdk/m5/navigation/transitions/ExitTransitionStyle.NULL", "Lio/intercom/android/sdk/m5/navigation/transitions/ExitTransitionStyle;", "transition", "Landroidx/compose/animation/ExitTransition;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class NULL extends ExitTransitionStyle {
        public NULL(String str, int i) {
            super(str, i, null);
        }

        @Override // io.intercom.android.sdk.p032m5.navigation.transitions.ExitTransitionStyle
        @Nullable
        public ExitTransition transition() {
            return null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m18302d2 = {"io/intercom/android/sdk/m5/navigation/transitions/ExitTransitionStyle.SLIDE_OUT_LEFT", "Lio/intercom/android/sdk/m5/navigation/transitions/ExitTransitionStyle;", "transition", "Landroidx/compose/animation/ExitTransition;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class SLIDE_OUT_LEFT extends ExitTransitionStyle {
        public SLIDE_OUT_LEFT(String str, int i) {
            super(str, i, null);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ int m16294a(int i) {
            return transition$lambda$0(i);
        }

        private static final int transition$lambda$0(int i) {
            return -i;
        }

        @Override // io.intercom.android.sdk.p032m5.navigation.transitions.ExitTransitionStyle
        @NotNull
        public ExitTransition transition() {
            return EnterExitTransitionKt.m2194o(AnimationSpecKt.m2277d(0, 0, null, 7), new C5606a(4));
        }
    }

    private static final /* synthetic */ ExitTransitionStyle[] $values() {
        return new ExitTransitionStyle[]{SLIDE_DOWN, SLIDE_OUT_RIGHT, SLIDE_OUT_LEFT, NONE, NULL};
    }

    static {
        ExitTransitionStyle[] exitTransitionStyleArr$values = $values();
        $VALUES = exitTransitionStyleArr$values;
        $ENTRIES = EnumEntriesKt.m18563a(exitTransitionStyleArr$values);
    }

    public /* synthetic */ ExitTransitionStyle(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    @NotNull
    public static EnumEntries<ExitTransitionStyle> getEntries() {
        return $ENTRIES;
    }

    public static ExitTransitionStyle valueOf(String str) {
        return (ExitTransitionStyle) Enum.valueOf(ExitTransitionStyle.class, str);
    }

    public static ExitTransitionStyle[] values() {
        return (ExitTransitionStyle[]) $VALUES.clone();
    }

    @Nullable
    public abstract ExitTransition transition();

    private ExitTransitionStyle(String str, int i) {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m18302d2 = {"io/intercom/android/sdk/m5/navigation/transitions/ExitTransitionStyle.SLIDE_DOWN", "Lio/intercom/android/sdk/m5/navigation/transitions/ExitTransitionStyle;", "transition", "Landroidx/compose/animation/ExitTransition;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class SLIDE_DOWN extends ExitTransitionStyle {
        public SLIDE_DOWN(String str, int i) {
            super(str, i, null);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ int m16293a(int i) {
            return transition$lambda$0(i);
        }

        @Override // io.intercom.android.sdk.p032m5.navigation.transitions.ExitTransitionStyle
        @NotNull
        public ExitTransition transition() {
            return EnterExitTransitionKt.m2195p(AnimationSpecKt.m2277d(0, 0, null, 7), new C5606a(3));
        }

        private static final int transition$lambda$0(int i) {
            return i;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m18302d2 = {"io/intercom/android/sdk/m5/navigation/transitions/ExitTransitionStyle.SLIDE_OUT_RIGHT", "Lio/intercom/android/sdk/m5/navigation/transitions/ExitTransitionStyle;", "transition", "Landroidx/compose/animation/ExitTransition;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class SLIDE_OUT_RIGHT extends ExitTransitionStyle {
        public SLIDE_OUT_RIGHT(String str, int i) {
            super(str, i, null);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ int m16295a(int i) {
            return transition$lambda$0(i);
        }

        @Override // io.intercom.android.sdk.p032m5.navigation.transitions.ExitTransitionStyle
        @NotNull
        public ExitTransition transition() {
            return EnterExitTransitionKt.m2194o(AnimationSpecKt.m2277d(0, 0, null, 7), new C5606a(5));
        }

        private static final int transition$lambda$0(int i) {
            return i;
        }
    }
}

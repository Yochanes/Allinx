package io.intercom.android.sdk.p032m5.navigation.transitions;

import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
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
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\t\u001a\u0004\u0018\u00010\nH&j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\u000b"}, m18302d2 = {"Lio/intercom/android/sdk/m5/navigation/transitions/EnterTransitionStyle;", "", "<init>", "(Ljava/lang/String;I)V", "SLIDE_UP", "SLIDE_IN_LEFT", "SLIDE_IN_RIGHT", "NONE", "NULL", "transition", "Landroidx/compose/animation/EnterTransition;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public abstract class EnterTransitionStyle {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnterTransitionStyle[] $VALUES;
    public static final EnterTransitionStyle SLIDE_UP = new SLIDE_UP("SLIDE_UP", 0);
    public static final EnterTransitionStyle SLIDE_IN_LEFT = new SLIDE_IN_LEFT("SLIDE_IN_LEFT", 1);
    public static final EnterTransitionStyle SLIDE_IN_RIGHT = new SLIDE_IN_RIGHT("SLIDE_IN_RIGHT", 2);
    public static final EnterTransitionStyle NONE = new NONE("NONE", 3);
    public static final EnterTransitionStyle NULL = new NULL("NULL", 4);

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m18302d2 = {"io/intercom/android/sdk/m5/navigation/transitions/EnterTransitionStyle.NONE", "Lio/intercom/android/sdk/m5/navigation/transitions/EnterTransitionStyle;", "transition", "Landroidx/compose/animation/EnterTransition;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class NONE extends EnterTransitionStyle {
        public NONE(String str, int i) {
            super(str, i, null);
        }

        @Override // io.intercom.android.sdk.p032m5.navigation.transitions.EnterTransitionStyle
        @NotNull
        public EnterTransition transition() {
            EnterTransition enterTransition = EnterTransition.f4196a;
            return EnterTransition.f4196a;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\u0004"}, m18302d2 = {"io/intercom/android/sdk/m5/navigation/transitions/EnterTransitionStyle.NULL", "Lio/intercom/android/sdk/m5/navigation/transitions/EnterTransitionStyle;", "transition", "Landroidx/compose/animation/EnterTransition;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class NULL extends EnterTransitionStyle {
        public NULL(String str, int i) {
            super(str, i, null);
        }

        @Override // io.intercom.android.sdk.p032m5.navigation.transitions.EnterTransitionStyle
        @Nullable
        public EnterTransition transition() {
            return null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m18302d2 = {"io/intercom/android/sdk/m5/navigation/transitions/EnterTransitionStyle.SLIDE_IN_RIGHT", "Lio/intercom/android/sdk/m5/navigation/transitions/EnterTransitionStyle;", "transition", "Landroidx/compose/animation/EnterTransition;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class SLIDE_IN_RIGHT extends EnterTransitionStyle {
        public SLIDE_IN_RIGHT(String str, int i) {
            super(str, i, null);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ int m16291a(int i) {
            return transition$lambda$0(i);
        }

        private static final int transition$lambda$0(int i) {
            return -i;
        }

        @Override // io.intercom.android.sdk.p032m5.navigation.transitions.EnterTransitionStyle
        @NotNull
        public EnterTransition transition() {
            return EnterExitTransitionKt.m2191l(AnimationSpecKt.m2277d(0, 0, null, 7), new C5606a(1));
        }
    }

    private static final /* synthetic */ EnterTransitionStyle[] $values() {
        return new EnterTransitionStyle[]{SLIDE_UP, SLIDE_IN_LEFT, SLIDE_IN_RIGHT, NONE, NULL};
    }

    static {
        EnterTransitionStyle[] enterTransitionStyleArr$values = $values();
        $VALUES = enterTransitionStyleArr$values;
        $ENTRIES = EnumEntriesKt.m18563a(enterTransitionStyleArr$values);
    }

    public /* synthetic */ EnterTransitionStyle(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    @NotNull
    public static EnumEntries<EnterTransitionStyle> getEntries() {
        return $ENTRIES;
    }

    public static EnterTransitionStyle valueOf(String str) {
        return (EnterTransitionStyle) Enum.valueOf(EnterTransitionStyle.class, str);
    }

    public static EnterTransitionStyle[] values() {
        return (EnterTransitionStyle[]) $VALUES.clone();
    }

    @Nullable
    public abstract EnterTransition transition();

    private EnterTransitionStyle(String str, int i) {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m18302d2 = {"io/intercom/android/sdk/m5/navigation/transitions/EnterTransitionStyle.SLIDE_IN_LEFT", "Lio/intercom/android/sdk/m5/navigation/transitions/EnterTransitionStyle;", "transition", "Landroidx/compose/animation/EnterTransition;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class SLIDE_IN_LEFT extends EnterTransitionStyle {
        public SLIDE_IN_LEFT(String str, int i) {
            super(str, i, null);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ int m16290a(int i) {
            return transition$lambda$0(i);
        }

        @Override // io.intercom.android.sdk.p032m5.navigation.transitions.EnterTransitionStyle
        @NotNull
        public EnterTransition transition() {
            return EnterExitTransitionKt.m2191l(AnimationSpecKt.m2277d(0, 0, null, 7), new C5606a(0));
        }

        private static final int transition$lambda$0(int i) {
            return i;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m18302d2 = {"io/intercom/android/sdk/m5/navigation/transitions/EnterTransitionStyle.SLIDE_UP", "Lio/intercom/android/sdk/m5/navigation/transitions/EnterTransitionStyle;", "transition", "Landroidx/compose/animation/EnterTransition;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class SLIDE_UP extends EnterTransitionStyle {
        public SLIDE_UP(String str, int i) {
            super(str, i, null);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ int m16292a(int i) {
            return transition$lambda$0(i);
        }

        @Override // io.intercom.android.sdk.p032m5.navigation.transitions.EnterTransitionStyle
        @NotNull
        public EnterTransition transition() {
            return EnterExitTransitionKt.m2192m(AnimationSpecKt.m2277d(0, 0, null, 7), new C5606a(2));
        }

        private static final int transition$lambda$0(int i) {
            return i;
        }
    }
}

package androidx.camera.core.impl;

import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class CameraCaptureMetaData {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class AeState {

        /* JADX INFO: renamed from: a */
        public static final AeState f2603a;

        /* JADX INFO: renamed from: b */
        public static final AeState f2604b;

        /* JADX INFO: renamed from: c */
        public static final AeState f2605c;

        /* JADX INFO: renamed from: d */
        public static final AeState f2606d;

        /* JADX INFO: renamed from: f */
        public static final AeState f2607f;

        /* JADX INFO: renamed from: g */
        public static final AeState f2608g;

        /* JADX INFO: renamed from: i */
        public static final /* synthetic */ AeState[] f2609i;

        static {
            AeState aeState = new AeState("UNKNOWN", 0);
            f2603a = aeState;
            AeState aeState2 = new AeState("INACTIVE", 1);
            f2604b = aeState2;
            AeState aeState3 = new AeState("SEARCHING", 2);
            f2605c = aeState3;
            AeState aeState4 = new AeState("FLASH_REQUIRED", 3);
            f2606d = aeState4;
            AeState aeState5 = new AeState("CONVERGED", 4);
            f2607f = aeState5;
            AeState aeState6 = new AeState("LOCKED", 5);
            f2608g = aeState6;
            f2609i = new AeState[]{aeState, aeState2, aeState3, aeState4, aeState5, aeState6};
        }

        public static AeState valueOf(String str) {
            return (AeState) Enum.valueOf(AeState.class, str);
        }

        public static AeState[] values() {
            return (AeState[]) f2609i.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class AfMode {

        /* JADX INFO: renamed from: a */
        public static final AfMode f2610a;

        /* JADX INFO: renamed from: b */
        public static final AfMode f2611b;

        /* JADX INFO: renamed from: c */
        public static final AfMode f2612c;

        /* JADX INFO: renamed from: d */
        public static final AfMode f2613d;

        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ AfMode[] f2614f;

        static {
            AfMode afMode = new AfMode("UNKNOWN", 0);
            f2610a = afMode;
            AfMode afMode2 = new AfMode("OFF", 1);
            f2611b = afMode2;
            AfMode afMode3 = new AfMode("ON_MANUAL_AUTO", 2);
            f2612c = afMode3;
            AfMode afMode4 = new AfMode("ON_CONTINUOUS_AUTO", 3);
            f2613d = afMode4;
            f2614f = new AfMode[]{afMode, afMode2, afMode3, afMode4};
        }

        public static AfMode valueOf(String str) {
            return (AfMode) Enum.valueOf(AfMode.class, str);
        }

        public static AfMode[] values() {
            return (AfMode[]) f2614f.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class AfState {

        /* JADX INFO: renamed from: a */
        public static final AfState f2615a;

        /* JADX INFO: renamed from: b */
        public static final AfState f2616b;

        /* JADX INFO: renamed from: c */
        public static final AfState f2617c;

        /* JADX INFO: renamed from: d */
        public static final AfState f2618d;

        /* JADX INFO: renamed from: f */
        public static final AfState f2619f;

        /* JADX INFO: renamed from: g */
        public static final AfState f2620g;

        /* JADX INFO: renamed from: i */
        public static final AfState f2621i;

        /* JADX INFO: renamed from: j */
        public static final /* synthetic */ AfState[] f2622j;

        static {
            AfState afState = new AfState("UNKNOWN", 0);
            f2615a = afState;
            AfState afState2 = new AfState("INACTIVE", 1);
            f2616b = afState2;
            AfState afState3 = new AfState("SCANNING", 2);
            f2617c = afState3;
            AfState afState4 = new AfState("PASSIVE_FOCUSED", 3);
            f2618d = afState4;
            AfState afState5 = new AfState("PASSIVE_NOT_FOCUSED", 4);
            f2619f = afState5;
            AfState afState6 = new AfState("LOCKED_FOCUSED", 5);
            f2620g = afState6;
            AfState afState7 = new AfState("LOCKED_NOT_FOCUSED", 6);
            f2621i = afState7;
            f2622j = new AfState[]{afState, afState2, afState3, afState4, afState5, afState6, afState7};
        }

        public static AfState valueOf(String str) {
            return (AfState) Enum.valueOf(AfState.class, str);
        }

        public static AfState[] values() {
            return (AfState[]) f2622j.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class AwbState {

        /* JADX INFO: renamed from: a */
        public static final AwbState f2623a;

        /* JADX INFO: renamed from: b */
        public static final AwbState f2624b;

        /* JADX INFO: renamed from: c */
        public static final AwbState f2625c;

        /* JADX INFO: renamed from: d */
        public static final AwbState f2626d;

        /* JADX INFO: renamed from: f */
        public static final AwbState f2627f;

        /* JADX INFO: renamed from: g */
        public static final /* synthetic */ AwbState[] f2628g;

        static {
            AwbState awbState = new AwbState("UNKNOWN", 0);
            f2623a = awbState;
            AwbState awbState2 = new AwbState("INACTIVE", 1);
            f2624b = awbState2;
            AwbState awbState3 = new AwbState("METERING", 2);
            f2625c = awbState3;
            AwbState awbState4 = new AwbState("CONVERGED", 3);
            f2626d = awbState4;
            AwbState awbState5 = new AwbState("LOCKED", 4);
            f2627f = awbState5;
            f2628g = new AwbState[]{awbState, awbState2, awbState3, awbState4, awbState5};
        }

        public static AwbState valueOf(String str) {
            return (AwbState) Enum.valueOf(AwbState.class, str);
        }

        public static AwbState[] values() {
            return (AwbState[]) f2628g.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class FlashState {

        /* JADX INFO: renamed from: a */
        public static final FlashState f2629a;

        /* JADX INFO: renamed from: b */
        public static final FlashState f2630b;

        /* JADX INFO: renamed from: c */
        public static final FlashState f2631c;

        /* JADX INFO: renamed from: d */
        public static final FlashState f2632d;

        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ FlashState[] f2633f;

        static {
            FlashState flashState = new FlashState("UNKNOWN", 0);
            f2629a = flashState;
            FlashState flashState2 = new FlashState("NONE", 1);
            f2630b = flashState2;
            FlashState flashState3 = new FlashState("READY", 2);
            f2631c = flashState3;
            FlashState flashState4 = new FlashState("FIRED", 3);
            f2632d = flashState4;
            f2633f = new FlashState[]{flashState, flashState2, flashState3, flashState4};
        }

        public static FlashState valueOf(String str) {
            return (FlashState) Enum.valueOf(FlashState.class, str);
        }

        public static FlashState[] values() {
            return (FlashState[]) f2633f.clone();
        }
    }
}

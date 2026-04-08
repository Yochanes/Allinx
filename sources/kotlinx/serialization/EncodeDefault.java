package kotlinx.serialization;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.MustBeDocumented;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Method from annotation default annotation not found: mode */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Target({})
@kotlin.annotation.Target
@Retention(RetentionPolicy.RUNTIME)
@MustBeDocumented
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m18302d2 = {"Lkotlinx/serialization/EncodeDefault;", "", "Lkotlinx/serialization/EncodeDefault$Mode;", "mode", "<init>", "(Lkotlinx/serialization/EncodeDefault$Mode;)V", "Mode", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@ExperimentalSerializationApi
@Documented
public @interface EncodeDefault {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/EncodeDefault$Mode;", "", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    @ExperimentalSerializationApi
    public static final class Mode {

        /* JADX INFO: renamed from: a */
        public static final Mode f56583a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ Mode[] f56584b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumEntries f56585c;

        static {
            Mode mode = new Mode("ALWAYS", 0);
            f56583a = mode;
            Mode[] modeArr = {mode, new Mode("NEVER", 1)};
            f56584b = modeArr;
            f56585c = EnumEntriesKt.m18563a(modeArr);
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) f56584b.clone();
        }
    }
}

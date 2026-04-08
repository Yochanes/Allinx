package kotlin;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Method from annotation default annotation not found: level */
/* JADX WARN: Method from annotation default annotation not found: message */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.ANNOTATION_TYPE})
@SinceKotlin
@Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\bB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m18302d2 = {"Lkotlin/RequiresOptIn;", "", "", "message", "Lkotlin/RequiresOptIn$Level;", FirebaseAnalytics.Param.LEVEL, "<init>", "(Ljava/lang/String;Lkotlin/RequiresOptIn$Level;)V", "Level", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@kotlin.annotation.Target
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention
public @interface RequiresOptIn {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/RequiresOptIn$Level;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Level {

        /* JADX INFO: renamed from: a */
        public static final Level f51428a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ Level[] f51429b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumEntries f51430c;

        static {
            Level level = new Level("WARNING", 0);
            Level level2 = new Level("ERROR", 1);
            f51428a = level2;
            Level[] levelArr = {level, level2};
            f51429b = levelArr;
            f51430c = EnumEntriesKt.m18563a(levelArr);
        }

        public static Level valueOf(String str) {
            return (Level) Enum.valueOf(Level.class, str);
        }

        public static Level[] values() {
            return (Level[]) f51429b.clone();
        }
    }
}
